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


    public static JqassistantPlugin generatePlugin(AstName name, Map<AstName, CompilationUnit> compilationUnitMap) {
        JqassistantPlugin jqassistantPlugin = new JqassistantPlugin();

        jqassistantPlugin.setName(name.getName());
        jqassistantPlugin.setId("jqa.plugin.generated." + name.toLowerCase());
        jqassistantPlugin.setDescription("Provides a generated scanner for " + name + ".");
        jqassistantPlugin.setModel(generateModel(compilationUnitMap));
//        jqassistantPlugin.setScope(generateScope(name, compilationUnitMap));
        jqassistantPlugin.setScanner(generateScanner(name, compilationUnitMap));

        return jqassistantPlugin;
    }

    private static ClassListType generateScope(String name, Map<String, CompilationUnit> compilationUnitMap) {
        ClassListType classListType = new ClassListType();
        List<String> clazz = classListType.getClazz();
        clazz.add("org.jqassistant.contrib.plugin." + name.toLowerCase() + ".api.scanner." + name + "Scope");
        return classListType;
    }

    private static IdClassListType generateScanner(AstName name, Map<AstName, CompilationUnit> compilationUnitMap) {
        IdClassListType idClassListType = new IdClassListType();
        List<IdClassType> clazz = idClassListType.getClazz();

        IdClassType idClassType = new IdClassType();
        idClassType.setValue("org.jqassistant.contrib.plugin." + name.toLowerCase() + ".impl.scanner." + Main.id + "FileScannerPlugin");
        clazz.add(idClassType);

        return idClassListType;
    }

    private static ClassListType generateModel(Map<AstName, CompilationUnit> compilationUnitMap) {
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