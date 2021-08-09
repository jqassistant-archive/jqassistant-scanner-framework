package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import org.antlr.v4.tool.ast.GrammarAST;
import org.antlr.v4.tool.ast.GrammarRootAST;
import org.snt.inmemantlr.tool.InmemantlrTool;
import org.snt.inmemantlr.utils.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ScannerGenerator {
    private final Set<String> gcontent = new HashSet<>();
    private final InmemantlrTool inmemantlrTool = new InmemantlrTool();

    public ScannerGenerator(File[] files) throws FileNotFoundException {
        for (File f : files) {
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


}