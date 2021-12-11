package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import com.buschmais.xo.api.annotation.Abstract;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import lombok.Getter;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.base.BaseGenerator;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.ModelDto;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

@Getter
public class BaseDescriptorGenerator extends BaseGenerator {
    private final FormattedName    entryNode;
    private final FormattedName    pluginName;
    public        FormattedName    BASE_DESCRIPTOR_NAME; //TODO: naming
    public        FormattedName    BASE_FILE_DESCRIPTOR_NAME;

    public BaseDescriptorGenerator(GenerationConfig config) {
        super(config.getPaths().getApiPackage(), config);
        this.pluginName = new FormattedName(config.getPluginId());
        this.entryNode = new FormattedName(config.getEntryNode());
        BASE_DESCRIPTOR_NAME = new FormattedName(pluginName.getName() + "AST");
        BASE_FILE_DESCRIPTOR_NAME = new FormattedName(pluginName.getName() + "FileDescriptor");
    }

    public Map<FormattedName, ModelDto> generate() {
        System.out.println(new Date() + " Starting Base Descriptor Model Generation");
        Map<FormattedName, ModelDto> interfaces = new TreeMap<>();

        CompilationUnit baseDescriptor = getBaseDescriptor();
        interfaces.put(BASE_DESCRIPTOR_NAME, new ModelDto(baseDescriptor));

        CompilationUnit baseFileDescriptor = getBaseFileDescriptor();
        interfaces.put(BASE_FILE_DESCRIPTOR_NAME, new ModelDto(baseFileDescriptor));

        System.out.println(new Date() + " Generation Done!");
        return interfaces;
    }

    private CompilationUnit getBaseDescriptor() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(getConfig().getPaths().getApiPackage());

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(BASE_DESCRIPTOR_NAME.getName())
                .addExtendedType(Descriptor.class);
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addAnnotation(Abstract.class);
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, BASE_DESCRIPTOR_NAME.asUpperCamelWithQuotes());

        createGetterAndSetter(interfaceDeclaration, new FormattedName("FileName"), "String");
        createGetterAndSetter(interfaceDeclaration, new FormattedName("SourceCode"), "String");

        return compilationUnit;
    }

    private CompilationUnit getBaseFileDescriptor() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(getPackageName());

        compilationUnit.addImport(BASE_FILE_DESCRIPTOR_NAME.getName());
        compilationUnit.addImport(getConfig().getPaths().getModelPackage() + "." + entryNode.getName());

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(BASE_FILE_DESCRIPTOR_NAME.getName())
                .addExtendedType(BASE_DESCRIPTOR_NAME.getName())
                .addExtendedType(FileDescriptor.class);
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, BASE_FILE_DESCRIPTOR_NAME.asUpperCamelWithQuotes());

        ApiModelGenerator.createGetterAndSetter(interfaceDeclaration, entryNode, entryNode.getName());

        return compilationUnit;
    }
}