package org.jqassistant.contrib.plugin.antlr2jqassistant;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.google.common.base.CaseFormat;
import org.antlr.runtime.tree.Tree;
import org.antlr.v4.tool.ast.*;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator;

import javax.annotation.Generated;
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

    public static Comment generateComment(RuleAST ast) {
        String name = ast.getRuleName();
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);

        StringBuilder comment = new StringBuilder()
                .append("\nGenerated from AST:")
                .append("\n<pre>\n")
                .append(ast.toStringTree())
                .append("\n</pre>\n")
                .append("\n\n");

        GrammarRootAST root = getRoot(ast);
        if (root == null) {
            return new JavadocComment(comment.toString());
        }
        return new JavadocComment(comment
                .append("\n<pre>\n")
                .append(root.tokenStream.toString(ast.getTokenStartIndex(), ast.getTokenStopIndex()))
                .append("\n</pre>\n")
                .append("\n")
                .append("Source Grammar: ")
                .append("<a href=\"../").append(root.fileName).append(".g4\">") //TODO: replace link
                .append(root.fileName).append(".g4").append("</a>")
                .append(":")
                .append(ast.getTokenStartIndex()).append("-").append(ast.getTokenStopIndex()).append("\n")
//                .append("Generated Parser: ").append("{@link ").append(root.fileName).append("#").append(ast.getRuleName()).append("()} ").append("\n")
                .append("@see ").append(Main.antlrPackage).append(".").append(root.fileName).append("#").append(name).append("()")
                .append("\n")
                .append("@see ").append(Main.mapperPackage).append(".").append(MapperGenerator.getMapperName(nameUpperCamel))
                .toString());
    }

//    public static <T extends GrammarAST> T getFirstChildOfInstance(GrammarAST ast, Class<T> clazz) {
//        List<GrammarAST> children = (List<GrammarAST>) ast.getChildren();
//        if (children == null) {
//            return (clazz) ast;
//        }
//
//        for (GrammarAST child : children) {
//            if (child != null && child instanceof T) {
//                return (clazz) child;
//            }
//
//            T ruleRefAst = getFirstChildOfInstance(child, clazz);
//            if (ruleRefAst != null) {
//                return ruleRefAst;
//            }
//        }
//
//        return null;
//    }
}
