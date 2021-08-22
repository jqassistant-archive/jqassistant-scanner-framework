package org.jqassistant.contrib.plugin.antlr2jqassistant;

import com.github.javaparser.ast.CompilationUnit;
import org.antlr.v4.tool.ast.GrammarAST;
import org.apache.maven.model.Model;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.*;
import org.jqassistant.schema.plugin.v1.JqassistantPlugin;
import org.snt.inmemantlr.exceptions.CompilationException;
import org.snt.inmemantlr.exceptions.IllegalWorkflowException;
import org.snt.inmemantlr.exceptions.ParsingException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
//    public static final String id = "JavaGen";
//    public static final String parserName = "Java8";
//    public static final String source = "antlr-to-jqassistant/";
//    public static final String destination = "jqa-java-test/";
//    public final static String entryNode = "CompilationUnit"; //TODO: HOW CAN THIS BE DYNAMICALLY DETERMINED?!?!?!

    public static final String id = "TypeScriptGen";
    public static final String parserName = "TypeScript";
    public static final String source = "antlr-to-jqassistant/";
    public static final String destination = "jqa-typescript-test/";
    public final static String entryNode = "Program";

    public static void main(String[] args) {
        try {
            new Main();
        } catch (FileNotFoundException | CompilationException | ParsingException | IllegalWorkflowException e) {
            e.printStackTrace();
        }
    }

    public static final String rootPackage = "org.jqassistant.contrib.plugin." + id.toLowerCase();
    public static final String antlrPackage = rootPackage + ".antlr4";
    public static final String apiPackage = rootPackage + ".api";
    public static final String modelPackage = apiPackage + ".model";
    public static final String mapperPackage = rootPackage + ".util.mapper";

    public static File[] files = {
            new File(source + "src/main/resources/" + parserName + "Lexer.g4"),
            new File(source + "src/main/resources/" + parserName + "Parser.g4")
    };

    public Main() throws FileNotFoundException, CompilationException, ParsingException, IllegalWorkflowException {
        ScannerGenerator scannerGenerator = new ScannerGenerator(files);
        GrammarAST rulesAst = scannerGenerator.getRulesAst();

        BaseDescriptorGenerator baseDescriptorGenerator = new BaseDescriptorGenerator(apiPackage, entryNode);
        Map<AstName, CompilationUnit> baseDescriptors = baseDescriptorGenerator.generate();
        FileOperations.writeToFiles(id, apiPackage, baseDescriptors);

        ApiModelGenerator apiModelGenerator = new ApiModelGenerator(modelPackage, baseDescriptorGenerator);
        Map<AstName, CompilationUnit> apiModelCompilationUnitMap = apiModelGenerator.generateFromRules(rulesAst);
        FileOperations.writeToFiles(id, modelPackage, apiModelCompilationUnitMap);
//        FileOperations.writeToFile("Model.java", modelPackage, apiModelCompilationUnitMap);

        MapperGenerator mapperGenerator = new MapperGenerator(mapperPackage, baseDescriptorGenerator);

        Map<AstName, CompilationUnit> singleMapperCompilationUnitMap = mapperGenerator.generateSingleMapperFromApiModel(apiModelCompilationUnitMap);
        FileOperations.writeToFile("MainMapper.java", mapperPackage, singleMapperCompilationUnitMap);

        Map<AstName, CompilationUnit> mapperCompilationUnitMap = mapperGenerator.generateFromApiModel(apiModelCompilationUnitMap);
        FileOperations.writeToFiles(id, mapperPackage, mapperCompilationUnitMap);

        Map<AstName, CompilationUnit> allModels = new LinkedHashMap<>();
        allModels.putAll(baseDescriptors);
        allModels.putAll(apiModelCompilationUnitMap);
        JqassistantPlugin jqassistantPlugin = JqassistantPluginGenerator.generatePlugin(new AstName(id), allModels);
        FileOperations.writeToFile(jqassistantPlugin);

        Model mavenProject = MavenProjectGenerator.generateMavenProject(id);
        FileOperations.writeToFile(mavenProject);
    }

}