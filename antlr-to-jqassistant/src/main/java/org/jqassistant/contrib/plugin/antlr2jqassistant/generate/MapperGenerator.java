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
import org.jqassistant.contrib.plugin.antlr2jqassistant.Main;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.*;

public class MapperGenerator {
    public final String QUOTES = "\"";
    public final String GET = "get";
    public final String SET = "set";
    public final String HAS = "HAS_";
    public final String packageName;
    private final BaseDescriptorGenerator baseDescriptorGenerator;

    public MapperGenerator(String packageName, BaseDescriptorGenerator baseDescriptorGenerator) {
        this.packageName = packageName;
        this.baseDescriptorGenerator = baseDescriptorGenerator;
    }

    public static AstName getMapperName(String modelName) {
        return new AstName(modelName + "Mapper");
    }

    public Map<AstName, CompilationUnit> generateFromApiModel(Map<AstName, CompilationUnit> apiModelCompilationUnitMap) {
        System.out.println(new Date() + " Starting Mapper Generation");
        Map<AstName, CompilationUnit> mapperCompilationUnitMap = new TreeMap<>();

//        for (Map.Entry<String, CompilationUnit> entry : apiModelCompilationUnitMap.entrySet()) {
//            mapperCompilationUnitMap.putAll(generateModelToContextMapper(entry.getKey(), entry.getValue()));
//        }
        mapperCompilationUnitMap.putAll(generateDescriptorFactory());
//        mapperCompilationUnitMap.putAll(generateTerminalNodeMapper());
//        mapperCompilationUnitMap.putAll(generateMapperConfig(mapperCompilationUnitMap));

        System.out.println(new Date() + " Generation Done!");
        return mapperCompilationUnitMap;
    }

    public Map<AstName, CompilationUnit> generateSingleMapperFromApiModel(Map<AstName, CompilationUnit> apiModelCompilationUnitMap) {
        System.out.println(new Date() + " Starting Single Mapper Generation");

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);

        compilationUnit.addImport(Main.antlrPackage + "." + Main.parserName + "Parser");
        compilationUnit.addImport(Mappers.class);
        compilationUnit.addImport(NullValueCheckStrategy.class);

        AstName mainMapper = getMapperName("Main");

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(mainMapper.getName());
        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());
        addStaticInstance(classDeclaration, mainMapper);

        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(Mapper.class);
        mapperConfigAnnotation.addPair("uses", "DescriptorFactory.class");
        mapperConfigAnnotation.addPair("nullValueCheckStrategy", "NullValueCheckStrategy.ON_IMPLICIT_CONVERSION");

        for (Map.Entry<AstName, CompilationUnit> entry : apiModelCompilationUnitMap.entrySet()) {
            AstName modelName = entry.getKey();
            if (!modelName.getName().equalsIgnoreCase(ApiModelGenerator.TERMINAL_NODE_CLASS)) {
                compilationUnit.addImport(Main.modelPackage + "." + modelName);
                MethodDeclaration mapMethodDeclaration = classDeclaration.addMethod("map").removeBody();
                mapMethodDeclaration.setType(modelName.getName());
                mapMethodDeclaration
                        .addAndGetParameter(ScannerContext.class, "scannerContext")
                        .addAnnotation(Context.class);
                mapMethodDeclaration
                        .addParameter(Main.parserName + "Parser." + modelName.asUpperCamel(modelName.getOriginal()) + "Context", "parserContext");
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

    private Map<String, CompilationUnit> generateMapperConfig(Map<String, CompilationUnit> mapperCompilationUnitMap) {
        Map<String, CompilationUnit> classes = new HashMap<>();

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(MapperConfig.class);
        mapperCompilationUnitMap.keySet().forEach(s -> compilationUnit.addImport(packageName + "." + s));

        String name = "MapperConfiguration";

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addClass(name);
        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());

        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(MapperConfig.class);
//        mapperConfigAnnotation.addPair("\n\tnullValuePropertyMappingStrategy", "NullValuePropertyMappingStrategy.IGNORE");
//        mapperConfigAnnotation.addPair("\n\tnullValueCheckStrategy", "NullValueCheckStrategy.ALWAYS");
        mapperConfigAnnotation
                .addPair("\n\tuses",
                        "{\n\t\t"
                                + String.join(".class,\n\t\t", mapperCompilationUnitMap.keySet())
                                + ".class\n\t}\n");

        classes.put(name, compilationUnit);
        return classes;
    }


    private Map<AstName, CompilationUnit> generateDescriptorFactory() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(baseDescriptorGenerator.packageName + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);

        AstName name = new AstName("DescriptorFactory");
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

    private Map<AstName, CompilationUnit> generateModelToContextMapper(String modelName, CompilationUnit apiModel) {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);

        compilationUnit.addImport(Main.modelPackage + "." + modelName);
        compilationUnit.addImport(Main.antlrPackage + "." + Main.parserName + "Parser");
        compilationUnit.addImport("org.mapstruct.factory.Mappers");
//        compilationUnit.addImport("org.jqassistant.contrib.plugin.javagen.util.CycleAvoidingMappingContext");

        AstName name = getMapperName(modelName);

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(name.getName());
        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());
        addStaticInstance(classDeclaration, name);

        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(Mapper.class);
        mapperConfigAnnotation.addPair("config", "MapperConfiguration.class");

        MethodDeclaration mapMethodDeclaration = classDeclaration.addMethod("map").removeBody();
        mapMethodDeclaration.setType(modelName);
        mapMethodDeclaration
                .addAndGetParameter(ScannerContext.class, "scannerContext")
                .addAnnotation(Context.class);
        mapMethodDeclaration
                .addParameter(Main.parserName + "Parser." + modelName + "Context", "parserContext");
//        mapMethodDeclaration
//                .addAndGetParameter("CycleAvoidingMappingContext", "mappingContext")
//                .addAnnotation(Context.class);

        return Collections.singletonMap(name, compilationUnit);
    }

    private void addStaticInstance(ClassOrInterfaceDeclaration classDeclaration, AstName name) {
        FieldDeclaration fieldDeclaration = classDeclaration
                .addField(name.getName(), "INSTANCE")
                .addModifier(Modifier.Keyword.PUBLIC)
                .addModifier(Modifier.Keyword.STATIC);
        fieldDeclaration.getVariable(0).setInitializer("Mappers.getMapper(" + name + ".class)");
    }

    private Map<AstName, ? extends CompilationUnit> generateTerminalNodeMapper() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);

        compilationUnit.addImport("org.mapstruct.factory.Mappers");

        String modelName = ApiModelGenerator.TERMINAL_NODE_CLASS;
        AstName mapperName = getMapperName(modelName);

        compilationUnit.addImport(TerminalNode.class);
        compilationUnit.addImport(Main.modelPackage + "." + modelName);

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(mapperName.getName());
        TreeHelper.addGeneratedAnnotation(classDeclaration, this.getClass().getName());
        addStaticInstance(classDeclaration, mapperName);

        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(Mapper.class);
        mapperConfigAnnotation.addPair("config", "MapperConfiguration.class");

        MethodDeclaration mapMethodDeclaration = classDeclaration
                .addMethod("map")
                .setDefault(true)
                .setType(modelName);
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
                .setType(modelName);
        mapMethodDeclaration2.addAndGetParameter(ScannerContext.class, "scannerContext")
                .addAnnotation(Context.class);
        mapMethodDeclaration2
                .addParameter(Token.class, "symbol");

        classDeclaration
                .addMethod("map")
                .removeBody()
                .setType(String.class)
                .addParameter(CharStream.class, "value");


        return Collections.singletonMap(mapperName, compilationUnit);
    }

}