package org.jqassistant.contrib.plugin.antlr2jqassistant.model;

import com.github.javaparser.ast.expr.SimpleName;
import com.google.common.base.CaseFormat;
import lombok.Data;
import org.antlr.v4.tool.ast.GrammarAST;
import org.antlr.v4.tool.ast.RuleAST;
import org.apache.commons.lang3.StringUtils;

import javax.lang.model.SourceVersion;

@Data
public class FormattedName implements Comparable<FormattedName> {
    public final static String QUOTES = "\"";
    public final static String GET    = "get";
    public final static String SET    = "set";
    public final static String HAS    = "HAS_";

    private final String original;
    private final String name;

    public FormattedName(SimpleName originalSimpleName) {
        this.original = originalSimpleName.getIdentifier();
        this.name = getCleanNameFor(original);
    }

    public FormattedName(RuleAST ast) {
        this.original = ast.getRuleName();
        this.name = getCleanNameFor(original);
    }

    public FormattedName(GrammarAST ast) {
        this.original = ast.getText();
        this.name = getCleanNameFor(original);
    }

    public FormattedName(String name) {
        this.original = name;
        this.name = getCleanNameFor(original);
    }

    public String withQuotes() {
        return QUOTES + name + QUOTES;
    }

    private String getCleanNameFor(String name) {
        String cleanName = name.replace("Context", "");
        return asUpperCamel(name.equals("class") ? "clazz" : cleanName);
    }

    public String asUpperCamelWithQuotes() {
        return QUOTES + asUpperCamel() + QUOTES;
    }

    public String asUpperCamel() {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, getName());
    }

    public static String asUpperCamel(String text) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, text);
    }

    public String asUpperUnderscore() {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name);
    }

    public String getRelationNameWithQuotes() {
        String relationship = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, StringUtils.isAllUpperCase(original) ? original.toLowerCase() : original);
        relationship = StringUtils.strip(relationship, "_");
        return QUOTES + HAS + relationship + QUOTES;
    }

    public String asLowerCase() {
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
    public int compareTo(FormattedName o) {
        return this.getName().compareTo(o.getName());
    }
}
