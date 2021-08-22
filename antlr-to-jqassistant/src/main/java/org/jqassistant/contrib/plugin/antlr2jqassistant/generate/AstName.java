package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.google.common.base.CaseFormat;
import lombok.Data;
import org.antlr.v4.tool.ast.GrammarAST;
import org.antlr.v4.tool.ast.RuleAST;
import org.apache.commons.lang3.StringUtils;

import javax.lang.model.SourceVersion;

@Data
public class AstName implements Comparable<AstName> {
    public final static String QUOTES = "\"";
    public final static String GET = "get";
    public final static String SET = "set";
    public final static String HAS = "HAS_";

    private final String original;
    private final String name;

    public AstName(RuleAST ast) {
        this.original = ast.getRuleName();
        this.name = getCleanName(original);
    }
    public AstName(GrammarAST ast) {
        this.original = ast.getText();
        this.name = getCleanName(original);
    }
    public AstName(String name) {
        this.original = name;
        this.name = getCleanName(original);
    }

    public String withQuotes() {
        return QUOTES + name + QUOTES;
    }

    public String getCleanName(String name) {
        return asUpperCamel(name.equalsIgnoreCase("class") ? "clazz" : name);
    }

    public String asUpperCamel(String text) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, text);
    }

    public String asUpperUnderscore() {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name);
    }

    public String getRelationNameWithQuotes() {
        String relationship = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, original);
        relationship = StringUtils.strip(relationship, "_");
        return QUOTES + HAS + relationship + QUOTES;
    }

    public String toLowerCase() {
        return name.toLowerCase();
    }

    private static Boolean isReserved(String word) {
        return SourceVersion.isKeyword(word) || SourceVersion.isKeyword(word.toLowerCase());
    }

    public String getGetterName() {
        return GET + name;
    }
    public String getSetterName() {
        return SET + name;
    }



    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(AstName o) {
        return this.getName().compareTo(o.getName());
    }
}
