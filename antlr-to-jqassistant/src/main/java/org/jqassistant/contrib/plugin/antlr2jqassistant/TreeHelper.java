package org.jqassistant.contrib.plugin.antlr2jqassistant;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;

import javax.annotation.Generated;

public class TreeHelper {
    public final static String QUOTES = "\"";

    public static void addGeneratedAnnotation(ClassOrInterfaceDeclaration declaration, String source) {
        NormalAnnotationExpr metadataAnnotation = declaration.addAndGetAnnotation(Generated.class);
        metadataAnnotation.addPair("\n\tvalue", QUOTES + source + QUOTES);
    }

}
