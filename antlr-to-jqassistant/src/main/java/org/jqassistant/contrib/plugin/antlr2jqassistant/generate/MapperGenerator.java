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
import lombok.SneakyThrows;
import org.antlr.v4.runtime.CharStream;
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

import static org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName.QUOTES;

public record MapperGenerator(GenerationConfig config,
                              BaseDescriptorGenerator baseDescriptorGenerator,
                              Map<FormattedName, ModelDto> apiModelCompilationUnitMap) {

    public Map<FormattedName, ModelDto> generate() {
        TreeMap<FormattedName, ModelDto> compilationUnitMap = new TreeMap<>();
        compilationUnitMap.putAll(generateDescriptorFactory());
        compilationUnitMap.putAll(generateSingleMapperFromApiModel());
        return compilationUnitMap;
    }

    private Map<FormattedName, ModelDto> generateSingleMapperFromApiModel() {
        System.out.println(new Date() + " Starting Single Mapper Generation");

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(config.getPaths().getMapperPackage());

        compilationUnit.addImport(config.getPaths().getAntlrPackage() + "." + config.getParserName() + "Parser");
        compilationUnit.addImport(config.getPaths().getApiPackage() + ".*");
        compilationUnit.addImport(config.getPaths().getModelPackage() + ".*");
        compilationUnit.addImport("org.mapstruct.*");
        compilationUnit.addImport(Mappers.class);
        compilationUnit.addImport(FileResource.class);
        compilationUnit.addImport(ParserRuleContext.class);
        compilationUnit.addImport(org.antlr.v4.runtime.misc.Interval.class);

        FormattedName mainMapper = new FormattedName("MainMapper");

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(mainMapper.getName());
        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());
        addStaticInstance(classDeclaration, mainMapper);

        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(Mapper.class);
        mapperConfigAnnotation.addPair("uses", "DescriptorFactory.class");
        mapperConfigAnnotation.addPair("unmappedTargetPolicy", "ReportingPolicy.ERROR");
        mapperConfigAnnotation.addPair("nullValueCheckStrategy", "NullValueCheckStrategy.ON_IMPLICIT_CONVERSION");

        MethodDeclaration mapFileName = classDeclaration
                .addMethod("mapFileName")
                .setDefault(true);
        mapFileName.addAndGetParameter(FileResource.class, "item")
                .addAnnotation(Context.class);
        mapFileName.addAndGetParameter(baseDescriptorGenerator.getPackageName() + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME.getName(), "target")
                .addAnnotation(MappingTarget.class);
        mapFileName.setBody(new BlockStmt()
                .addStatement(StaticJavaParser.parseStatement("target.setFileName(item.getFile().getAbsolutePath());")));
        mapFileName.addAnnotation(AfterMapping.class);
        mapFileName.addAnnotation(SneakyThrows.class);

        MethodDeclaration mapSourceCode = classDeclaration
                .addMethod("mapSourceCode")
                .setDefault(true)
                .setType(String.class);
        mapSourceCode
                .addParameter(ParserRuleContext.class, "parserContext");

        BlockStmt getSource = new BlockStmt().addStatement(new ReturnStmt("parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex()))"));
        mapSourceCode.setBody(new BlockStmt()
                .addStatement(new TryStmt()
                        .setTryBlock(getSource)
                        .setCatchClauses(new NodeList<>(
                                new CatchClause()
                                        .setParameter(new Parameter().setName("ex").setType(Exception.class))
                                        .setBody(new BlockStmt().addStatement(
                                                new ReturnStmt(QUOTES + "mapSourceCode ERROR: " + QUOTES + " + ex.getMessage()")))))));
//        mapSourceCode.setBody(new BlockStmt()
//                .addStatement(StaticJavaParser.parseStatement("String code = parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex()));"))
//                .addStatement(
//                    new ReturnStmt("code.indexOf(\"\\n\") == -1 ? code : code.substring(0, code.indexOf(\"\\n\"))")));
        mapSourceCode.addAndGetAnnotation(Named.class).addPair("value", "\"mapSourceCode\"");

        MethodDeclaration mapTerminalNode = classDeclaration
                .addMethod("map")
                .setDefault(true)
                .setType(ApiModelGenerator.TERMINAL_NODE_CLASS);
        mapTerminalNode
                .addAndGetParameter(FileResource.class, "item")
                .addAnnotation(Context.class);
        mapTerminalNode
                .addAndGetParameter(ScannerContext.class, "scannerContext")
                .addAnnotation(Context.class);
        mapTerminalNode
                .addParameter(TerminalNode.class, "terminalNode");
        mapTerminalNode.setBody(new BlockStmt().addStatement(
                new ReturnStmt("map(scannerContext, terminalNode == null ? null : terminalNode.getSymbol())")
        ));

        MethodDeclaration mapToken = classDeclaration
                .addMethod("map")
                .removeBody()
                .setType(ApiModelGenerator.TERMINAL_NODE_CLASS);
        mapToken.addAndGetParameter(ScannerContext.class, "scannerContext")
                .addAnnotation(Context.class);
        mapToken
                .addParameter(Token.class, "symbol");
        mapToken.addAndGetAnnotation(Mapping.class)
                .addPair("target", "\"fileName\"")
                .addPair("ignore", "true");
        mapToken.addAndGetAnnotation(Mapping.class)
                .addPair("target", "\"sourceCode\"")
                .addPair("ignore", "true");

        classDeclaration
                .addMethod("map")
                .removeBody()
                .setType(String.class)
                .addParameter(CharStream.class, "value");

        for (Map.Entry<FormattedName, ModelDto> entry : apiModelCompilationUnitMap.entrySet()) {
            FormattedName modelName = entry.getKey();
            String parserName = config.getParserName() + "Parser";
            String parserContextName = parserName + "." + FormattedName.asUpperCamel(modelName.getOriginal());

            if (!modelName.getName().equalsIgnoreCase(ApiModelGenerator.TERMINAL_NODE_CLASS)) {
                MethodDeclaration mapMethodDeclaration = classDeclaration.addMethod("map").removeBody();
                mapMethodDeclaration.setType(modelName.getName());
                mapMethodDeclaration
                        .addAndGetParameter(FileResource.class, "item")
                        .addAnnotation(Context.class);
                mapMethodDeclaration
                        .addAndGetParameter(ScannerContext.class, "scannerContext")
                        .addAnnotation(Context.class);
                mapMethodDeclaration.addParameter(parserContextName, "parserContext");
                mapMethodDeclaration.addAndGetAnnotation(Mapping.class)
                        .addPair("target", "\"fileName\"")
                        .addPair("ignore", "true");
                mapMethodDeclaration.addAndGetAnnotation(Mapping.class)
                        .addPair("target", "\"sourceCode\"")
                        .addPair("source", "\".\"")
                        .addPair("qualifiedByName", "\"mapSourceCode\"");
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
                        .toList();
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

        createDescriptorMethod
                .addAndGetParameter(ScannerContext.class, "scannerContext")
                .addAnnotation(Context.class);
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

    private void addStaticInstance(ClassOrInterfaceDeclaration classDeclaration, FormattedName name) {
        FieldDeclaration fieldDeclaration = classDeclaration
                .addField(name.getName(), "INSTANCE")
                .addModifier(Modifier.Keyword.PUBLIC)
                .addModifier(Modifier.Keyword.STATIC);
        fieldDeclaration.getVariable(0).setInitializer("Mappers.getMapper(" + name + ".class)");
    }

}