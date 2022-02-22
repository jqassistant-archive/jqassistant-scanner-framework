package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.TypeParameter;
import lombok.AllArgsConstructor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.ModelDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.*;
import java.util.stream.Collectors;

import static org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName.QUOTES;

@AllArgsConstructor
public final class MapperGenerator {
    private final GenerationConfig config;
    private final BaseDescriptorGenerator baseDescriptorGenerator;
    private final Map<FormattedName, ModelDto> apiModelCompilationUnitMap;

    public Map<FormattedName, ModelDto> generate() {
        TreeMap<FormattedName, ModelDto> compilationUnitMap = new TreeMap<>();
        compilationUnitMap.putAll(generateDescriptorFactory());
        compilationUnitMap.putAll(generateMapperConfig());
        compilationUnitMap.putAll(generateSingleMapperFromApiModel());
        return compilationUnitMap;
    }

    private Map<FormattedName, ModelDto> generateDescriptorFactory() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(config.getPaths().getMapperPackage());
        compilationUnit.addImport(baseDescriptorGenerator.getPackageName() + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME.getName());

        FormattedName name = new FormattedName("DescriptorFactory");
        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addClass(name.getName());

        NodeList<ClassOrInterfaceType> typeBound = new NodeList<>(new ClassOrInterfaceType().setName(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME.getName()));

        MethodDeclaration createDescriptorMethod = classDeclaration
                .addMethod("createDescriptor", Modifier.Keyword.PUBLIC, Modifier.Keyword.STATIC)
                .setType("T")
                .setTypeParameters(new NodeList<>(new TypeParameter("T", typeBound)));

        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());

        addScannerContext(createDescriptorMethod);
        createDescriptorMethod
                .addAndGetParameter("Class<T>", "entityClass")
                .addAnnotation(TargetType.class);

        createDescriptorMethod.setBody(
                new BlockStmt()
                        .addStatement(
                                new ReturnStmt("scannerContext.getStore().create(entityClass)")
                        )
        );

        return Collections.singletonMap(name, new ModelDto(compilationUnit));
    }

    private Map<FormattedName, ModelDto> generateMapperConfig() {
        System.out.println(new Date() + " Starting Mapper Config Generation");

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(config.getPaths().getMapperPackage());

        compilationUnit.addImport("org.mapstruct.*");
        compilationUnit.addImport(FileResource.class);
        compilationUnit.addImport(ParserRuleContext.class);

        FormattedName commonMappingConfig = new FormattedName("CommonMappingConfig");

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(commonMappingConfig.getName());
        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());

        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(MapperConfig.class);
        mapperConfigAnnotation.addPair("uses", "DescriptorFactory.class");
        mapperConfigAnnotation.addPair("unmappedTargetPolicy", "ReportingPolicy.ERROR"); //HINT: more lenient rule is also possible: ReportingPolicy.WARN
        mapperConfigAnnotation.addPair("nullValueCheckStrategy", "NullValueCheckStrategy.ON_IMPLICIT_CONVERSION");
        mapperConfigAnnotation.addPair("mappingInheritanceStrategy", "MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG");

        MethodDeclaration mapRoot = classDeclaration.addMethod("map").removeBody();
        mapRoot.setType(baseDescriptorGenerator.getPackageName() + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME.getName());
        addFileResource(mapRoot);
        addScannerContext(mapRoot);
        mapRoot.addParameter(ParserRuleContext.class, "parserContext");

        addIgnoreMappings(mapRoot);
        mapRoot.addAndGetAnnotation(Mapping.class)
                .addPair("target", "\"sourceCode\"")
                .addPair("ignore", "true");

        return Collections.singletonMap(commonMappingConfig, new ModelDto(compilationUnit));
    }

    private Map<FormattedName, ModelDto> generateSingleMapperFromApiModel() {
        System.out.println(new Date() + " Starting Single Mapper Generation");

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(config.getPaths().getMapperPackage());

        compilationUnit.addImport(config.getPaths().getAntlrPackage() + "." + config.getParserName() + "Parser");
        compilationUnit.addImport(config.getPaths().getApiPackage() + ".*");
        compilationUnit.addImport(config.getPaths().getModelPackage() + ".*");
        compilationUnit.addImport("org.mapstruct.*");
        compilationUnit.addImport("org.slf4j.*");
        compilationUnit.addImport(Mappers.class);
        compilationUnit.addImport(FileResource.class);
        compilationUnit.addImport(ParserRuleContext.class);
        compilationUnit.addImport(org.antlr.v4.runtime.misc.Interval.class);

        FormattedName mainMapper = new FormattedName("MainMapper");

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(mainMapper.getName());
        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());
        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(Mapper.class);
        mapperConfigAnnotation.addPair("config", "CommonMappingConfig.class");
        addMapperStaticInstance(classDeclaration, mainMapper);
        addLoggerStaticInstance(classDeclaration, mainMapper);

        addAfterMappingStrategyForMetadata(classDeclaration);

        addTerminalNodeMapping(classDeclaration);

        for (Map.Entry<FormattedName, ModelDto> entry : apiModelCompilationUnitMap.entrySet()) {
            FormattedName modelName = entry.getKey();
            String parserName = config.getParserName() + "Parser";
            String parserContextName = parserName + "." + FormattedName.asUpperCamel(modelName.getOriginal());

            if (!modelName.getName().equalsIgnoreCase(ApiModelGenerator.TERMINAL_NODE_CLASS)) {
                MethodDeclaration mapMethodDeclaration = classDeclaration.addMethod("map").removeBody();
                mapMethodDeclaration.setType(modelName.getName());
                addFileResource(mapMethodDeclaration);
                addScannerContext(mapMethodDeclaration);
                mapMethodDeclaration.addParameter(parserContextName, "parserContext");

                if (entry.getValue().getExplicitNameMapping().size() > 0) {
                    for (FormattedName mapping : entry.getValue().getExplicitNameMapping()) {
                        mapMethodDeclaration.addAndGetAnnotation(Mapping.class)
                                .addPair("target", mapping.asLowerCamelWithQuotes())
                                .addPair("expression", QUOTES + "java(map(item, scannerContext, parserContext." + mapping.getOriginal() + "()))" + QUOTES);
                    }
                }
                List<FormattedName> downcastMappings = apiModelCompilationUnitMap.entrySet().stream()
                        .filter(e -> e.getValue().getExtendsModel() != null && e.getValue().getExtendsModel().getName().equals(modelName.getName()))
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
                for (FormattedName toDowncast : downcastMappings) {
                    mapMethodDeclaration.addAndGetAnnotation(SubclassMapping.class)
                            .addPair("target", toDowncast.getName() + ".class")
                            .addPair("source", parserName + "." + toDowncast.getOriginal() + ".class");
                }
            }
        }

        System.out.println(new Date() + " Generation Done!");
        return Collections.singletonMap(mainMapper, new ModelDto(compilationUnit));
    }

    private void addTerminalNodeMapping(ClassOrInterfaceDeclaration classDeclaration) {
        MethodDeclaration mapTerminalNode = classDeclaration
                .addMethod("map")
                .setDefault(true)
                .setType(ApiModelGenerator.TERMINAL_NODE_CLASS);
        addFileResource(mapTerminalNode);
        addScannerContext(mapTerminalNode);
        mapTerminalNode
                .addParameter(TerminalNode.class, "terminalNode");
        mapTerminalNode.setBody(new BlockStmt().addStatement(
                new ReturnStmt("map(scannerContext, terminalNode == null ? null : terminalNode.getSymbol())")
        ));

        MethodDeclaration mapToken = classDeclaration
                .addMethod("map")
                .removeBody()
                .setType(ApiModelGenerator.TERMINAL_NODE_CLASS);
        addScannerContext(mapToken);
        mapToken
                .addParameter(Token.class, "symbol");
        addIgnoreMappings(mapToken);
        mapToken.addAndGetAnnotation(Mapping.class)
                .addPair("target", "\"sourceCode\"")
                .addPair("source", "\"text\"");
    }

    private void addAfterMappingStrategyForMetadata(ClassOrInterfaceDeclaration classDeclaration) {
        MethodDeclaration mapFileName = classDeclaration
                .addMethod("mapBaseDescriptor")
                .setDefault(true);
        mapFileName.addAnnotation(AfterMapping.class);
        addFileResource(mapFileName);
        mapFileName.addAndGetParameter(ParserRuleContext.class, "parserContext");
        mapFileName.addAndGetParameter(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME.getName(), "target")
                .addAnnotation(MappingTarget.class);

        mapFileName.setBody(new BlockStmt()
                .addStatement(new TryStmt()
                        .setTryBlock(new BlockStmt()
                                .addStatement(StaticJavaParser.parseStatement("target.setFileName(item.getFile().getAbsolutePath());"))
                                .addStatement(StaticJavaParser.parseStatement("target.setSourceCode(parserContext.exception != null ? parserContext.exception.toString() : parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex())));"))
                                .addStatement(StaticJavaParser.parseStatement("target.setSourcePosition(parserContext.getStart().getLine() + \":\" + (parserContext.getStart().getCharPositionInLine() + 1) + \" to \" + parserContext.getStop().getLine() + \":\" + (parserContext.getStop().getCharPositionInLine() + 1));"))
                        )
                        .setCatchClauses(new NodeList<>(
                                new CatchClause()
                                        .setParameter(new Parameter().setName("ex").setType(Exception.class))
                                        .setBody(new BlockStmt().addStatement(
                                                StaticJavaParser.parseStatement("LOGGER.error(" + QUOTES + "mapBaseDescriptor ERROR: " + QUOTES + " + ex.getMessage());"))
                                        )
                                )
                        )
                )
        );
    }

    private void addFileResource(MethodDeclaration mapMethodDeclaration) {
        mapMethodDeclaration
                .addAndGetParameter(FileResource.class, "item")
                .addAnnotation(Context.class);
    }

    private void addScannerContext(MethodDeclaration mapMethodDeclaration) {
        mapMethodDeclaration
                .addAndGetParameter(ScannerContext.class, "scannerContext")
                .addAnnotation(Context.class);
    }

    private void addIgnoreMappings(MethodDeclaration methodDeclaration) {
        methodDeclaration.addAndGetAnnotation(Mapping.class)
                .addPair("target", "\"fileName\"")
                .addPair("ignore", "true");
        methodDeclaration.addAndGetAnnotation(Mapping.class)
                .addPair("target", "\"sourcePosition\"")
                .addPair("ignore", "true");
    }

    private void addMapperStaticInstance(ClassOrInterfaceDeclaration classDeclaration, FormattedName name) {
        FieldDeclaration fieldDeclaration = classDeclaration
                .addField(name.getName(), "INSTANCE")
                .addModifier(Modifier.Keyword.PUBLIC)
                .addModifier(Modifier.Keyword.STATIC)
                .addModifier(Modifier.Keyword.FINAL);
        fieldDeclaration.getVariable(0).setInitializer("Mappers.getMapper(" + name + ".class)");
    }

    private void addLoggerStaticInstance(ClassOrInterfaceDeclaration classDeclaration, FormattedName name) {
        FieldDeclaration fieldDeclaration = classDeclaration
                .addField("Logger", "LOGGER")
                .addModifier(Modifier.Keyword.PUBLIC)
                .addModifier(Modifier.Keyword.STATIC)
                .addModifier(Modifier.Keyword.FINAL);
        fieldDeclaration.getVariable(0).setInitializer("LoggerFactory.getLogger(" + name + ".class)");
    }

}