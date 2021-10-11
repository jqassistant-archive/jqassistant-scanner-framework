package org.jqassistant.contrib.plugin.antlr2jqassistant;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.google.common.base.CaseFormat;
import org.antlr.runtime.tree.Tree;
import org.antlr.v4.tool.ast.GrammarAST;
import org.antlr.v4.tool.ast.GrammarRootAST;
import org.antlr.v4.tool.ast.RuleRefAST;
import org.antlr.v4.tool.ast.TerminalAST;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator;

import javax.annotation.Generated;
import java.io.File;
import java.util.List;

public class TreeHelper {
    public final static String QUOTES = "\"";

    public static void addGeneratedAnnotation(ClassOrInterfaceDeclaration declaration, String source) {
        NormalAnnotationExpr metadataAnnotation = declaration.addAndGetAnnotation(Generated.class);
        metadataAnnotation.addPair("\n\tvalue", QUOTES + source + QUOTES);
//        metadataAnnotation.addPair("\n\tdate", QUOTES + new Date() + QUOTES + "\n");
    }

    public static GrammarRootAST getRoot(Tree ast) {
        if (ast.getParent() == null) {
            if (ast instanceof GrammarRootAST) {
                return (GrammarRootAST) ast;
            }
            return null;
        }
        return getRoot(ast.getParent());
    }

    public static GrammarAST getRuleRefAst(GrammarAST ast) {
        List<GrammarAST> children = (List<GrammarAST>) ast.getChildren();
        if (children == null) {
            return ast;
        }

        for (GrammarAST child : children) {
            if (child instanceof RuleRefAST) {
                return child;
            }

            GrammarAST ruleRefAst = getRuleRefAst(child);
            if (ruleRefAst != null) {
                return ruleRefAst;
            }
        }

        return null;
    }

    public static List<GrammarAST> findChildren(GrammarAST ast) {
        List<GrammarAST> children = (List<GrammarAST>) ast.getChildren();
        if (children == null) {
            return null;
        }

        for (GrammarAST child : children) {
            if (child instanceof RuleRefAST || child instanceof TerminalAST) {
                return children;
            }

            List<GrammarAST> kids = findChildren(child);
            if (kids != null) {
                return kids;
            }
        }

        return null;
    }

    public static Comment generateComment(ClassOrInterfaceDeclaration clazz) {
        String name = clazz.getNameAsString();
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);

        StringBuilder comment = new StringBuilder()
                .append("\nGenerated from Parser:")
                .append("\n<pre>\n")
                .append(clazz.toString())
                .append("\n</pre>\n")
                .append("\n\n")
                .append("Source Grammar(s): ")
                .append("\n");
        for (File file: Main.files) {
            comment.append("@see ").append(file.toString()).append("\n");
        }
        comment.append("@see ").append(Main.mapperPackage).append(".").append(MapperGenerator.getMapperName(nameUpperCamel));

        return new JavadocComment(comment.toString());
    }

}
