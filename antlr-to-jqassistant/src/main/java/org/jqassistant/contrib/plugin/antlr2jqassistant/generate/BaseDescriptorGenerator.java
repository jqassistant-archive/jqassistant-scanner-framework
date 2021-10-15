package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import com.buschmais.xo.api.annotation.Abstract;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import lombok.Getter;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

@Getter
public class BaseDescriptorGenerator {
    private final GenerationConfig config;
    private final String           packageName;
    private final FormattedName    entryNode;
    private final FormattedName    pluginName;
    public        String           BASE_DESCRIPTOR_NAME; //TODO: naming
    public        String           BASE_FILE_DESCRIPTOR_NAME;

    public BaseDescriptorGenerator(GenerationConfig config) {
        this.config = config;
        this.packageName = config.getApiPackage();
        this.pluginName = new FormattedName(config.getPluginId());
        this.entryNode = new FormattedName(config.getEntryNode());
        BASE_DESCRIPTOR_NAME = pluginName.getName();
        BASE_FILE_DESCRIPTOR_NAME = pluginName.getName() + "FileDescriptor";
    }

    public Map<FormattedName, CompilationUnit> generate() {
        System.out.println(new Date() + " Starting Base Descriptor Model Generation");
        Map<FormattedName, CompilationUnit> interfaces = new TreeMap<>();

        CompilationUnit baseDescriptor = getBaseDescriptor();
        interfaces.put(new FormattedName(BASE_DESCRIPTOR_NAME), baseDescriptor);

        CompilationUnit baseFileDescriptor = getBaseFileDescriptor();
        interfaces.put(new FormattedName(BASE_FILE_DESCRIPTOR_NAME), baseFileDescriptor);

        System.out.println(new Date() + " Generation Done!");
        return interfaces;
    }

    private CompilationUnit getBaseDescriptor() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(config.getApiPackage());

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(pluginName.getName())
                .addExtendedType(Descriptor.class);
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addAnnotation(Abstract.class);
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, pluginName.asUpperCamelWithQuotes());

        return compilationUnit;
    }

    private CompilationUnit getBaseFileDescriptor() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);

        compilationUnit.addImport(BASE_DESCRIPTOR_NAME);
        compilationUnit.addImport(config.getModelPackage() + "." + entryNode.getName());

        FormattedName name = new FormattedName(BASE_FILE_DESCRIPTOR_NAME);

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(name.getName())
                .addExtendedType(BASE_DESCRIPTOR_NAME)
                .addExtendedType(FileDescriptor.class);
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, name.asUpperCamelWithQuotes());

        ApiModelGenerator.createGetterAndSetter(interfaceDeclaration, entryNode, entryNode.getName());

        return compilationUnit;
    }
}