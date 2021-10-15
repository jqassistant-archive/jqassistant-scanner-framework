package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.TypeParameter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.TargetType;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class MapperGenerator {
    public final String QUOTES = "\"";
    public final String GET = "get";
    public final String SET = "set";
    public final String                   HAS = "HAS_";
    public final String                   mapperPackage;
    private      GenerationConfig config;
    private final BaseDescriptorGenerator baseDescriptorGenerator;
    private Map<FormattedName, CompilationUnit> apiModelCompilationUnitMap;

    public MapperGenerator(GenerationConfig config, BaseDescriptorGenerator baseDescriptorGenerator,
            Map<FormattedName, CompilationUnit> apiModelCompilationUnitMap) {

        this.mapperPackage = config.getMapperPackage();
        this.config = config;
        this.baseDescriptorGenerator = baseDescriptorGenerator;
        this.apiModelCompilationUnitMap = apiModelCompilationUnitMap;
    }

    public Map<FormattedName, CompilationUnit> generate() {
        TreeMap<FormattedName, CompilationUnit> compilationUnitMap = new TreeMap<>();
        compilationUnitMap.putAll(generateSingleMapperFromApiModel());
        compilationUnitMap.putAll(generateDescriptorFactory());
        return compilationUnitMap;
    }

    private static FormattedName getMapperName(String modelName) {
        return new FormattedName(modelName + "Mapper");
    }

    private Map<FormattedName, CompilationUnit> generateSingleMapperFromApiModel() {
        System.out.println(new Date() + " Starting Single Mapper Generation");

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(mapperPackage);

        compilationUnit.addImport(config.getAntlrPackage() + "." + config.getParserName() + "Parser");
        compilationUnit.addImport(Mappers.class);
        compilationUnit.addImport(NullValueCheckStrategy.class);

        FormattedName mainMapper = getMapperName("Main");

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(mainMapper.getName());
        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());
        addStaticInstance(classDeclaration, mainMapper);

        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(Mapper.class);
        mapperConfigAnnotation.addPair("uses", "DescriptorFactory.class");
        mapperConfigAnnotation.addPair("nullValueCheckStrategy", "NullValueCheckStrategy.ON_IMPLICIT_CONVERSION");

        for (Map.Entry<FormattedName, CompilationUnit> entry : apiModelCompilationUnitMap.entrySet()) {
            FormattedName modelName = entry.getKey();
            if (!modelName.getName().equalsIgnoreCase(ApiModelGenerator.TERMINAL_NODE_CLASS)) {
                compilationUnit.addImport(config.getModelPackage() + "." + modelName);
                MethodDeclaration mapMethodDeclaration = classDeclaration.addMethod("map").removeBody();
                mapMethodDeclaration.setType(modelName.getName());
                mapMethodDeclaration
                        .addAndGetParameter(ScannerContext.class, "scannerContext")
                        .addAnnotation(Context.class);
                mapMethodDeclaration.addParameter(config.getParserName() + "Parser." + modelName.asUpperCamel(), "parserContext");
            }
        }

        MethodDeclaration mapMethodDeclaration = classDeclaration
                .addMethod("map")
                .setDefault(true)
                .setType(ApiModelGenerator.TERMINAL_NODE_CLASS);
        mapMethodDeclaration.addAndGetParameter(ScannerContext.class, "scannerContext")
                .addAnnotation(Context.class);
        mapMethodDeclaration
                .addParameter(TerminalNode.class, "terminalNode");

        mapMethodDeclaration.setBody(new BlockStmt().addStatement(
                new ReturnStmt("map(scannerContext, terminalNode == null ? null : terminalNode.getSymbol())")
        ));

        MethodDeclaration mapMethodDeclaration2 = classDeclaration
                .addMethod("map")
                .removeBody()
                .setType(ApiModelGenerator.TERMINAL_NODE_CLASS);
        mapMethodDeclaration2.addAndGetParameter(ScannerContext.class, "scannerContext")
                .addAnnotation(Context.class);
        mapMethodDeclaration2
                .addParameter(Token.class, "symbol");

        classDeclaration
                .addMethod("map")
                .removeBody()
                .setType(String.class)
                .addParameter(CharStream.class, "value");

        System.out.println(new Date() + " Generation Done!");
        return Collections.singletonMap(mainMapper, compilationUnit);
    }

    private Map<FormattedName, CompilationUnit> generateDescriptorFactory() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(mapperPackage);
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