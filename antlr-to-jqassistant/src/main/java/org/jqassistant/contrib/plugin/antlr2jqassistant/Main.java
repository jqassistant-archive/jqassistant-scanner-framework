package org.jqassistant.contrib.plugin.antlr2jqassistant;

import com.github.javaparser.ast.CompilationUnit;
import org.apache.maven.model.Model;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.BaseDescriptorGenerator;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.JqassistantPluginGenerator;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MavenProjectGenerator;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ScannerGenerator;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.jqassistant.schema.plugin.v1.JqassistantPlugin;
import org.snt.inmemantlr.GenericParser;
import org.snt.inmemantlr.exceptions.CompilationException;
import org.snt.inmemantlr.exceptions.IllegalWorkflowException;
import org.snt.inmemantlr.exceptions.ParsingException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static final GenerationConfig CONFIG_JAVA = GenerationConfig.builder()
            .pluginId("JavaGen")
            .parserName("Java8")
            .sourceFolder("antlr-to-jqassistant/")
            .destinationFolder("jqa-java-test/")
            .entryNode("CompilationUnit") //TODO: Consider finding "unused" parser rules that contain EOF
            .grammarFiles(Arrays.asList(
                    new File("antlr-to-jqassistant/src/main/resources/Java8Lexer.g4"),
                    new File("antlr-to-jqassistant/src/main/resources/Java8Parser.g4")
            ))
            .build();

    public static final GenerationConfig CONFIG_TYPESCRIPT = GenerationConfig.builder()
            .pluginId("TypeScriptGen")
            .parserName("TypeScript")
            .sourceFolder("antlr-to-jqassistant/")
            .destinationFolder("jqa-typescript-test/")
            .entryNode("Program")
            .grammarFiles(Arrays.asList(
                new File("antlr-to-jqassistant/src/main/resources/TypeScriptLexer.g4"),
                new File("antlr-to-jqassistant/src/main/resources/TypeScriptParser.g4")
            ))
            .grammarDependencies(Arrays.asList(
                new File("antlr-to-jqassistant/src/main/resources/TypeScriptLexerBase.java"),
                new File("antlr-to-jqassistant/src/main/resources/TypeScriptParserBase.java")
            ))
            .build();

    public static final GenerationConfig CONFIG = CONFIG_JAVA;

    public static void main(String[] args) {
        try {
            new Main();
        } catch (FileNotFoundException | CompilationException | ParsingException | IllegalWorkflowException e) {
            e.printStackTrace();
        }
    }

    public Main() throws FileNotFoundException, CompilationException, ParsingException, IllegalWorkflowException {
        FileOperations fileOperations = new FileOperations(CONFIG);
        ScannerGenerator scannerGenerator = new ScannerGenerator(CONFIG);
        GenericParser genericParser = scannerGenerator.getGenericParser();

        genericParser.writeAntlrAritfactsTo(CONFIG.getGrammarDestination());
        BaseDescriptorGenerator baseDescriptorGenerator = new BaseDescriptorGenerator(CONFIG);
        Map<FormattedName, CompilationUnit> baseDescriptors = baseDescriptorGenerator.generate();
        fileOperations.writeToFiles(CONFIG.getApiDestination(), baseDescriptors);

        ApiModelGenerator antlrParserApiModelGenerator = new ApiModelGenerator(CONFIG, genericParser, baseDescriptorGenerator);
        Map<FormattedName, CompilationUnit> apiModelCompilationUnitMap = antlrParserApiModelGenerator.generate();
        fileOperations.writeToFiles(CONFIG.getModelDestination(), apiModelCompilationUnitMap);

        MapperGenerator mapperGenerator = new MapperGenerator(CONFIG, baseDescriptorGenerator, apiModelCompilationUnitMap);
        Map<FormattedName, CompilationUnit> mapperCompilationUnitMap = mapperGenerator.generate();
        fileOperations.writeToFiles(CONFIG.getMapperDestination(), mapperCompilationUnitMap);

        Map<FormattedName, CompilationUnit> allModels = new LinkedHashMap<>();
        allModels.putAll(baseDescriptors);
        allModels.putAll(apiModelCompilationUnitMap);
        JqassistantPlugin jqassistantPlugin = JqassistantPluginGenerator.generatePlugin(CONFIG, allModels);
        fileOperations.writeToFile(jqassistantPlugin);

        Model mavenProject = MavenProjectGenerator.generateMavenProject(CONFIG.getPluginId());
        fileOperations.writeToFile(mavenProject);
    }

}