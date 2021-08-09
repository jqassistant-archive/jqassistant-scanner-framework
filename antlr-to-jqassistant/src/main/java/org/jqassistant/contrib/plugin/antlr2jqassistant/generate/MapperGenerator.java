package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.TypeParameter;
import com.google.common.base.CaseFormat;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jqassistant.contrib.plugin.antlr2jqassistant.Main;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.TargetType;

import javax.annotation.Generated;
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

    private void addGeneratedAnnotation(ClassOrInterfaceDeclaration declaration) {
        NormalAnnotationExpr metadataAnnotation = declaration.addAndGetAnnotation(Generated.class);
        metadataAnnotation.addPair("\n\tvalue", QUOTES + this.getClass().getName() + QUOTES);
        metadataAnnotation.addPair("\n\tdate", QUOTES + new Date() + QUOTES + "\n");
    }

    public static String getMapperName(String modelName) {
        return modelName + "Mapper";
    }

    public Map<String, CompilationUnit> generateFromApiModel(Map<String, CompilationUnit> apiModelCompilationUnitMap) {
        System.out.println(new Date() + " Starting Mapper Generation");
        Map<String, CompilationUnit> mapperCompilationUnitMap = new TreeMap<>();

        for (Map.Entry<String, CompilationUnit> entry : apiModelCompilationUnitMap.entrySet()) {
            mapperCompilationUnitMap.putAll(generateModelToContextMapper(entry.getKey(), entry.getValue()));
        }
        mapperCompilationUnitMap.putAll(generateTerminalNodeMapper());
        mapperCompilationUnitMap.putAll(generateDescriptorFactory());
        mapperCompilationUnitMap.putAll(generateMapperConfig(mapperCompilationUnitMap));

        System.out.println(new Date() + " Generation Done!");
        return mapperCompilationUnitMap;
    }

    private Map<String, CompilationUnit> generateMapperConfig(Map<String, CompilationUnit> mapperCompilationUnitMap) {
        Map<String, CompilationUnit> classes = new HashMap<>();

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(MapperConfig.class);
        mapperCompilationUnitMap.keySet().forEach(s -> compilationUnit.addImport(packageName + "." + s));

        String name = "MapperConfiguration";

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addClass(name);
        addGeneratedAnnotation(classDeclaration);

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


    private Map<String, CompilationUnit> generateDescriptorFactory() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(baseDescriptorGenerator.packageName + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);

        String name = "DescriptorFactory";
        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addClass(name);

        NodeList<ClassOrInterfaceType> typeBound = new NodeList<>(new ClassOrInterfaceType().setName(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME));

        MethodDeclaration createDescriptorMethod = classDeclaration
                .addMethod("createDescriptor", Modifier.Keyword.PUBLIC)
                .setType("T")
                .setTypeParameters(new NodeList<>(new TypeParameter("T", typeBound)));

        addGeneratedAnnotation(classDeclaration);

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

    private Map<String, CompilationUnit> generateModelToContextMapper(String modelName, CompilationUnit apiModel) {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);

        compilationUnit.addImport(Main.modelPackage + "." + modelName);
        compilationUnit.addImport(Main.antlrPackage + "." + Main.parserName + "Parser");

        String name = getMapperName(modelName);
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(name);
        addGeneratedAnnotation(classDeclaration);

        NormalAnnotationExpr mapperConfigAnnotation = classDeclaration.addAndGetAnnotation(Mapper.class);
        mapperConfigAnnotation.addPair("config", "MapperConfiguration.class");

        MethodDeclaration mapMethodDeclaration = classDeclaration.addMethod("map").removeBody();
        mapMethodDeclaration.setType(modelName);
        mapMethodDeclaration
                .addAndGetParameter(ScannerContext.class, "scannerContext")
                .addAnnotation(Context.class);
        mapMethodDeclaration
                .addParameter(Main.parserName + "Parser." + modelName + "Context", "parserContext");

        return Collections.singletonMap(nameUpperCamel, compilationUnit);
    }

    private Map<String,? extends CompilationUnit> generateTerminalNodeMapper() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);

        String modelName = ApiModelGenerator.TERMINAL_NODE;
        String name = getMapperName(modelName);
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);

        compilationUnit.addImport(TerminalNode.class);
        compilationUnit.addImport(Main.modelPackage + "." + modelName);

        ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addInterface(name);
        addGeneratedAnnotation(classDeclaration);

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
                new ReturnStmt("map(scannerContext, terminalNode.getSymbol())")
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


        return Collections.singletonMap(nameUpperCamel, compilationUnit);
    }

}