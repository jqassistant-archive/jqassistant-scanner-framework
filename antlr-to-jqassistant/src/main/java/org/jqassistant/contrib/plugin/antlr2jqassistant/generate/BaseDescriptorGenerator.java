package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import com.buschmais.xo.api.annotation.Abstract;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.google.common.base.CaseFormat;
import org.jqassistant.contrib.plugin.antlr2jqassistant.Main;

import javax.annotation.Generated;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class BaseDescriptorGenerator {
    public final String QUOTES = "\"";
    public final String GET = "get";
    public final String SET = "set";
    public final String HAS = "HAS_";

    public final String packageName;
    private final String entryNode;
    public String BASE_DESCRIPTOR_NAME = "Descriptor";
    public String BASE_FILE_DESCRIPTOR_NAME = "FileDescriptor";

    public BaseDescriptorGenerator(String packageName, String entryNode) {
        this.packageName = packageName;
        this.entryNode = entryNode;
    }

    private void addGeneratedAnnotation(ClassOrInterfaceDeclaration declaration) {
        NormalAnnotationExpr metadataAnnotation = declaration.addAndGetAnnotation(Generated.class);
        metadataAnnotation.addPair("\n\tvalue", QUOTES + this.getClass().getName() + QUOTES);
        metadataAnnotation.addPair("\n\tdate", QUOTES + new Date() + QUOTES + "\n");
    }

    public Map<String, CompilationUnit> generate() {
        System.out.println(new Date() + " Starting Base Descriptor Model Generation");
        Map<String, CompilationUnit> interfaces = new TreeMap<>();

        CompilationUnit baseDescriptor = getBaseDescriptor();
        interfaces.put(BASE_DESCRIPTOR_NAME, baseDescriptor);

        CompilationUnit baseFileDescriptor = getBaseFileDescriptor();
        interfaces.put(BASE_FILE_DESCRIPTOR_NAME, baseFileDescriptor);

        System.out.println(new Date() + " Generation Done!");
        return interfaces;
    }

    private CompilationUnit getBaseDescriptor() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);

        String name = Main.id;
        BASE_DESCRIPTOR_NAME = name;
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        String nameString = QUOTES + nameUpperCamel + QUOTES;

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(name)
                .addExtendedType(Descriptor.class);
        addGeneratedAnnotation(interfaceDeclaration);
        interfaceDeclaration.addAnnotation(Abstract.class);
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, nameString);

        return compilationUnit;
    }

    private CompilationUnit getBaseFileDescriptor() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);

        compilationUnit.addImport(BASE_DESCRIPTOR_NAME);
        compilationUnit.addImport(Main.modelPackage + "." + entryNode);

        String name = Main.id + BASE_FILE_DESCRIPTOR_NAME;
        BASE_FILE_DESCRIPTOR_NAME = name;
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        String nameString = QUOTES + nameUpperCamel + QUOTES;

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(name)
                .addExtendedType(BASE_DESCRIPTOR_NAME)
                .addExtendedType(FileDescriptor.class);
        addGeneratedAnnotation(interfaceDeclaration);
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, nameString);

        ApiModelGenerator.createGetterAndSetter(interfaceDeclaration, entryNode, entryNode);


        return compilationUnit;
    }
}