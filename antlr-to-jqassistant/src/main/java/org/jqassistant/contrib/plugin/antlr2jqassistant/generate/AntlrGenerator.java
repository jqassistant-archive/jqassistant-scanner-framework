package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.antlr.v4.tool.ast.GrammarAST;
import org.antlr.v4.tool.ast.GrammarRootAST;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.ModelDto;
import org.snt.inmemantlr.GenericParser;
import org.snt.inmemantlr.listener.DefaultTreeListener;
import org.snt.inmemantlr.tool.InmemantlrTool;
import org.snt.inmemantlr.utils.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AntlrGenerator {
    private final GenerationConfig config;
    private final Set<String>      gcontent = new HashSet<>();
    private final InmemantlrTool inmemantlrTool = new InmemantlrTool();

    public AntlrGenerator(GenerationConfig config) throws FileNotFoundException {
        this.config = config;
        for (File f : config.getGrammarFiles()) {
            if (!f.exists() || !f.canRead()) {
                throw new FileNotFoundException("file " + f.getAbsolutePath() + " does not exist or is not readable");
            }
            gcontent.add(FileUtils.loadFileContent(f.getAbsolutePath()));
        }
    }

    public GrammarRootAST getAst() {
        return inmemantlrTool
                .sortGrammarByTokenVocab(gcontent)
                .stream()
                .filter(grammarRootAST -> grammarRootAST.getGrammarName().contains("Parser"))
                .findFirst().orElseThrow();
    }

    public GrammarAST getRulesAst() {
        return ((List<GrammarAST>) getAst().getChildren())
                .stream()
                .filter(grammarRootAST -> grammarRootAST.getText().equals("RULES"))
                .findFirst().orElseThrow();
    }

    public GenericParser getGenericParser() {
        try {
            GenericParser gp = new GenericParser(config.getGrammarFilesArray());
            if (config.getGrammarDependencies().size() > 0) {
                gp.addUtilityJavaFiles(config.getGrammarDependenciesArray());
            }

            DefaultTreeListener t = new DefaultTreeListener();
            gp.setListener(t);
            gp.compile();

            return gp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Map<FormattedName, ModelDto> getPreparedGrammarDependencies() {
        Map<FormattedName, ModelDto> map = new TreeMap<>();
        JavaParser javaParser = new JavaParser();

        if (config.getGrammarDependencies().size() > 0) {
            config.getGrammarDependencies().forEach(file -> {
                try {
                    CompilationUnit compilationUnit = javaParser.parse(file).getResult().orElseThrow();
                    compilationUnit.setPackageDeclaration(config.getPaths().getProjectPackage() + ".antlr4");
                    map.put(new FormattedName(file.getName()), new ModelDto(compilationUnit));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            });
        }
        return map;
    }
}