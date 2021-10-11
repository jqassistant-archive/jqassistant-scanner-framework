package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;
import org.snt.inmemantlr.GenericParser;
import org.snt.inmemantlr.memobjects.MemorySource;

import java.util.*;
import java.util.stream.Collectors;

public class ApiModelGenerator {
    public final static String TERMINAL_NODE_CLASS = "TerminalNodeStrings";

    private final GenericParser genericParser;
    private final String packageName;
    private final BaseDescriptorGenerator baseDescriptorGenerator;
    Map<String, MemorySource> antlrSources = new TreeMap<>();
    MemorySource antlrParser;

    public ApiModelGenerator(GenericParser genericParser, String modelPackage, BaseDescriptorGenerator baseDescriptorGenerator) {
        this.genericParser = genericParser;
        this.packageName = modelPackage;
        this.baseDescriptorGenerator = baseDescriptorGenerator;

        genericParser.getAllCompiledObjects().forEach(tuple -> antlrSources.put(tuple.getClassName(), tuple.getSource()));
        antlrParser = antlrSources.keySet().stream()
                .filter(cname -> cname.endsWith("Parser")).findAny()
                .map(antlrSources::get).orElseThrow();
    }

    public CompilationUnit getCompilationUnit() {
        JavaParser javaParser = new JavaParser();
        return javaParser.parse(antlrParser.openInputStream()).getResult().orElseThrow();
    }

    public Map<CleanName, CompilationUnit> generate() {
        CompilationUnit compilationUnit = getCompilationUnit();
        ClassOrInterfaceDeclaration parser = compilationUnit.getClassByName(antlrParser.getClassName()).orElseThrow();
        List<ClassOrInterfaceDeclaration> classes = getContextClasses(parser);

        Map<CleanName, CompilationUnit> list = new TreeMap<>(getTerminalNode());
        classes.forEach(clazz -> list.putAll(generateInterface(clazz)));
        return list;
    }

    private List<ClassOrInterfaceDeclaration> getContextClasses(ClassOrInterfaceDeclaration parser) {
        List<ClassOrInterfaceDeclaration> classes = new ArrayList<>();
        for (Node node : parser.getChildNodes()) {
            if (node instanceof ClassOrInterfaceDeclaration) {
                NodeList<ClassOrInterfaceType> extendedTypes = ((ClassOrInterfaceDeclaration) node).getExtendedTypes();
                if (extendedTypes.getFirst().isPresent() && extendedTypes.getFirst().get().getName().getIdentifier().equals("ParserRuleContext")) {
                    classes.add((ClassOrInterfaceDeclaration) node);
                }
            }
        }
        return classes;
    }

    private Map<CleanName, CompilationUnit> getTerminalNode() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(baseDescriptorGenerator.packageName + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);

        CleanName name = new CleanName(TERMINAL_NODE_CLASS);

//        compilationUnit.addOrphanComment(new JavadocComment("@see org.antlr.v4.runtime.tree.TerminalNode\n" + "@see " + Main.mapperPackage + "." + MapperGenerator.getMapperName(name.getName())));

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(name.getName())
                .addExtendedType(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, name.withQuotes());

        createGetterAndSetter(interfaceDeclaration, new CleanName("Text"), "String");
        createGetterAndSetter(interfaceDeclaration, new CleanName("Type"), "String");
        createGetterAndSetter(interfaceDeclaration, new CleanName("Line"), "String");
        createGetterAndSetter(interfaceDeclaration, new CleanName("CharPositionInLine"), "String");
        createGetterAndSetter(interfaceDeclaration, new CleanName("TokenIndex"), "String");
        createGetterAndSetter(interfaceDeclaration, new CleanName("StartIndex"), "String");
        createGetterAndSetter(interfaceDeclaration, new CleanName("StopIndex"), "String");

        Map<CleanName, CompilationUnit> map = new TreeMap<>();
        map.put(name, compilationUnit);
        return map;
    }

    private Map<CleanName, CompilationUnit> generateInterface(ClassOrInterfaceDeclaration clazz) {
        CleanName name = new CleanName(clazz.getName());

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(baseDescriptorGenerator.packageName + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);
        compilationUnit.addOrphanComment(TreeHelper.generateComment(clazz));
        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(name.getName())
                .addExtendedType(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, name.withQuotes());
        interfaceDeclaration.tryAddImportToParentCompilationUnit(List.class);


        List<MethodDeclaration> childContexts = clazz.getChildNodes().stream()
                .filter(child -> child instanceof MethodDeclaration)
                .map(MethodDeclaration.class::cast)
                .filter(methodDeclaration -> methodDeclaration.getAnnotations().isEmpty() && methodDeclaration.getParameters().isEmpty())
                .collect(Collectors.toList());

        childContexts.forEach(methodDeclaration -> {
            CleanName childName = new CleanName(methodDeclaration.getName());
            String type = methodDeclaration.getType().toString();
            if (type.equals("TerminalNode")) {
                createGetterAndSetter(interfaceDeclaration, childName, "TerminalNodeStrings");
            } else if (type.equals("List<TerminalNode>")) {
                createGetterAndSetter(interfaceDeclaration, childName, "List<TerminalNodeStrings>");
            } else {
                createGetterAndSetter(interfaceDeclaration, childName, type);
            }
        });

        createGetterAndSetter(interfaceDeclaration, new CleanName("Text"), "String");
        return Collections.singletonMap(name, compilationUnit);
    }

    public static void createGetterAndSetter(ClassOrInterfaceDeclaration interfaceDeclaration, CleanName
            name, String type){

        interfaceDeclaration.addMethod(name.getGetterName())
                .removeBody()
                .setType(new CleanName(type).getName())
                .addSingleMemberAnnotation(Relation.class, name.getRelationNameWithQuotes());
        interfaceDeclaration.addMethod(name.getSetterName())
                .removeBody()
                .addParameter(new CleanName(type).getName(), name.getSetterName());
    }

}
