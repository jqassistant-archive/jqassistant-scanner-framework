package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.TypeParameter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public record MapperGenerator(GenerationConfig config,
                              BaseDescriptorGenerator baseDescriptorGenerator,
                              Map<FormattedName, CompilationUnit> apiModelCompilationUnitMap) {

    public Map<FormattedName, CompilationUnit> generate() {
        TreeMap<FormattedName, CompilationUnit> compilationUnitMap = new TreeMap<>();
        compilationUnitMap.putAll(generateDescriptorFactory());
        compilationUnitMap.putAll(generateSingleMapperFromApiModel());
        return compilationUnitMap;
    }

    private Map<FormattedName, CompilationUnit> generateSingleMapperFromApiModel() {
        System.out.println(new Date() + " Starting Single Mapper Generation");

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(config.getPaths().getMapperPackage());

        compilationUnit.addImport(config.getPaths().getAntlrPackage() + "." + config.getParserName() + "Parser");
        compilationUnit.addImport("org.mapstruct.*");
        compilationUnit.addImport(Mappers.class);
        compilationUnit.addImport(ParserRuleContext.class);
        compilationUnit.addImport(org.antlr.v4.runtime.misc.Interval.class);
        compilationUnit.addImport(config.getPaths().getModelPackage() + ".*");

        FormattedName mainMapper = new FormattedName("MainMapper");

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(mainMapper.getName());
        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());
        addStaticInstance(classDeclaration, mainMapper);

        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(Mapper.class);
        mapperConfigAnnotation.addPair("uses", "DescriptorFactory.class");
        mapperConfigAnnotation.addPair("unmappedTargetPolicy", "ReportingPolicy.ERROR");
        mapperConfigAnnotation.addPair("nullValueCheckStrategy", "NullValueCheckStrategy.ON_IMPLICIT_CONVERSION");

        MethodDeclaration mapSourceCode = classDeclaration
                .addMethod("mapSourceCode")
                .setDefault(true)
                .setType(String.class);
        mapSourceCode
                .addParameter(ParserRuleContext.class, "parserContext");
        mapSourceCode.setBody(new BlockStmt()
                .addStatement(StaticJavaParser.parseStatement("String code = parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex()));"))
                .addStatement(
                    new ReturnStmt("code.indexOf(\"\\n\") == -1 ? code : code.substring(0, code.indexOf(\"\\n\"))")));
        mapSourceCode.addAndGetAnnotation(Named.class).addPair("value", "\"mapSourceCode\"");

        MethodDeclaration mapTerminalNode = classDeclaration
                .addMethod("map")
                .setDefault(true)
                .setType(ApiModelGenerator.TERMINAL_NODE_CLASS);
        mapTerminalNode.addAndGetParameter(ScannerContext.class, "scannerContext")
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

        classDeclaration
                .addMethod("map")
                .removeBody()
                .setType(String.class)
                .addParameter(CharStream.class, "value");

        for (Map.Entry<FormattedName, CompilationUnit> entry : apiModelCompilationUnitMap.entrySet()) {
            FormattedName modelName = entry.getKey();
            if (!modelName.getName().equalsIgnoreCase(ApiModelGenerator.TERMINAL_NODE_CLASS)) {
                MethodDeclaration mapMethodDeclaration = classDeclaration.addMethod("map").removeBody();
                mapMethodDeclaration.setType(modelName.getName());
                mapMethodDeclaration
                        .addAndGetParameter(ScannerContext.class, "scannerContext")
                        .addAnnotation(Context.class);
                mapMethodDeclaration.addParameter(config.getParserName() + "Parser." + FormattedName.asUpperCamel(modelName.getOriginal()), "parserContext");
                mapMethodDeclaration.addAndGetAnnotation(Mapping.class)
                        .addPair("target", "\"sourceCode\"")
                        .addPair("source", "\".\"")
                        .addPair("qualifiedByName", "\"mapSourceCode\"");
            }
        }

//        parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex()))

        System.out.println(new Date() + " Generation Done!");
        return Collections.singletonMap(mainMapper, compilationUnit);
    }

    private Map<FormattedName, CompilationUnit> generateDescriptorFactory() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(config.getPaths().getMapperPackage());
        compilationUnit.addImport(baseDescriptorGenerator.getPackageName() + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);

        FormattedName name = new FormattedName("DescriptorFactory");
        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addClass(name.getName());

        NodeList<ClassOrInterfaceType> typeBound = new NodeList<>(new ClassOrInterfaceType().setName(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME));

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

        return Collections.singletonMap(name, compilationUnit);
    }

    private void addStaticInstance(ClassOrInterfaceDeclaration classDeclaration, FormattedName name) {
        FieldDeclaration fieldDeclaration = classDeclaration
                .addField(name.getName(), "INSTANCE")
                .addModifier(Modifier.Keyword.PUBLIC)
                .addModifier(Modifier.Keyword.STATIC);
        fieldDeclaration.getVariable(0).setInitializer("Mappers.getMapper(" + name + ".class)");
    }

}