package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.github.javaparser.ast.CompilationUnit;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.jqassistant.schema.plugin.v1.ClassListType;
import org.jqassistant.schema.plugin.v1.IdClassListType;
import org.jqassistant.schema.plugin.v1.IdClassType;
import org.jqassistant.schema.plugin.v1.JqassistantPlugin;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JqassistantPluginGenerator {


    public static JqassistantPlugin generatePlugin(GenerationConfig config, Map<FormattedName, CompilationUnit> compilationUnitMap) {
        JqassistantPlugin jqassistantPlugin = new JqassistantPlugin();
        FormattedName name = new FormattedName(config.getParserName());

        jqassistantPlugin.setName(name.getName());
        jqassistantPlugin.setId("jqa.plugin.generated." + name.asLowerCase());
        jqassistantPlugin.setDescription("Provides a generated scanner for " + name + ".");
        jqassistantPlugin.setModel(generateModel(compilationUnitMap));
        jqassistantPlugin.setScanner(generateScanner(config));

        return jqassistantPlugin;
    }

    private static IdClassListType generateScanner(GenerationConfig config) {
        IdClassListType idClassListType = new IdClassListType();
        List<IdClassType> clazz = idClassListType.getClazz();

        IdClassType idClassType = new IdClassType();
        idClassType.setValue(config.getPaths().getProjectPackage() + ".impl.scanner." + config.getPluginId() + "FileScannerPlugin");
        clazz.add(idClassType);

        return idClassListType;
    }

    private static ClassListType generateModel(Map<FormattedName, CompilationUnit> compilationUnitMap) {
        ClassListType classListType = new ClassListType();
        List<String> clazz = classListType.getClazz();

        clazz.addAll(compilationUnitMap.entrySet()
                .stream()
                .map(stringCompilationUnitEntry ->
                        stringCompilationUnitEntry.getValue().getPackageDeclaration().orElseThrow().getName().asString() + "." + stringCompilationUnitEntry.getKey())
                .collect(Collectors.toList()));

        return classListType;
    }


}