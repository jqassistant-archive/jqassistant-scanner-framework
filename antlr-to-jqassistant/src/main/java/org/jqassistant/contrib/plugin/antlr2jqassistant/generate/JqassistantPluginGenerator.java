package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.github.javaparser.ast.CompilationUnit;
import org.jqassistant.contrib.plugin.antlr2jqassistant.Main;
import org.jqassistant.schema.plugin.v1.ClassListType;
import org.jqassistant.schema.plugin.v1.IdClassListType;
import org.jqassistant.schema.plugin.v1.IdClassType;
import org.jqassistant.schema.plugin.v1.JqassistantPlugin;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JqassistantPluginGenerator {


    public static JqassistantPlugin generatePlugin(String name, Map<String, CompilationUnit> stringCompilationUnitMap) {
        JqassistantPlugin jqassistantPlugin = new JqassistantPlugin();

        jqassistantPlugin.setName(name);
        jqassistantPlugin.setId("jqa.plugin.generated." + name.toLowerCase());
        jqassistantPlugin.setDescription("Provides a generated scanner for " + name + ".");
        jqassistantPlugin.setModel(generateModel(stringCompilationUnitMap));
        jqassistantPlugin.setScope(generateScope(name, stringCompilationUnitMap));
        jqassistantPlugin.setScanner(generateScanner(name, stringCompilationUnitMap));

        return jqassistantPlugin;
    }

    private static ClassListType generateScope(String name, Map<String, CompilationUnit> stringCompilationUnitMap) {
        ClassListType classListType = new ClassListType();
        List<String> clazz = classListType.getClazz();
        clazz.add("org.jqassistant.contrib.plugin." + name.toLowerCase() + ".api.scanner." + name + "Scope");
        return classListType;
    }

    private static IdClassListType generateScanner(String name, Map<String, CompilationUnit> stringCompilationUnitMap) {
        IdClassListType idClassListType = new IdClassListType();
        List<IdClassType> clazz = idClassListType.getClazz();

        IdClassType idClassType = new IdClassType();
        idClassType.setValue("org.jqassistant.contrib.plugin." + name.toLowerCase() + ".impl.scanner." + Main.id + "FileScannerPlugin");
        clazz.add(idClassType);

        return idClassListType;
    }

    private static ClassListType generateModel(Map<String, CompilationUnit> stringCompilationUnitMap) {
        ClassListType classListType = new ClassListType();
        List<String> clazz = classListType.getClazz();

        clazz.addAll(stringCompilationUnitMap.entrySet()
                .stream()
                .map(stringCompilationUnitEntry ->
                        stringCompilationUnitEntry.getValue().getPackageDeclaration().orElseThrow().getName().asString() + "." + stringCompilationUnitEntry.getKey())
                .collect(Collectors.toList()));

        return classListType;
    }


}