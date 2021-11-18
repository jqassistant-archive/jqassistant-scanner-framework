//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class AnnotationTypeBodyContext extends ParserRuleContext {
 *
 *     public TerminalNode LBRACE() {
 *         return getToken(Java8Parser.LBRACE, 0);
 *     }
 *
 *     public TerminalNode RBRACE() {
 *         return getToken(Java8Parser.RBRACE, 0);
 *     }
 *
 *     public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
 *         return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
 *     }
 *
 *     public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
 *         return getRuleContext(AnnotationTypeMemberDeclarationContext.class, i);
 *     }
 *
 *     public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_annotationTypeBody;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAnnotationTypeBody(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAnnotationTypeBody(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AnnotationTypeBody")
public interface AnnotationTypeBody extends JavaGenAST {

    @Relation("HAS_LBRACE")
    TerminalNodeStrings getLBRACE();

    void setLBRACE(TerminalNodeStrings setLBRACE);

    @Relation("HAS_RBRACE")
    TerminalNodeStrings getRBRACE();

    void setRBRACE(TerminalNodeStrings setRBRACE);

    @Relation("HAS_ANNOTATION_TYPE_MEMBER_DECLARATION")
    List<AnnotationTypeMemberDeclaration> getAnnotationTypeMemberDeclaration();

    void setAnnotationTypeMemberDeclaration(List<AnnotationTypeMemberDeclaration> setAnnotationTypeMemberDeclaration);
}
