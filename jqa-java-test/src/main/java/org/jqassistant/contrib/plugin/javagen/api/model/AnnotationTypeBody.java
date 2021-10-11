//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;
import java.util.List;

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
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationTypeBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AnnotationTypeBody")
public interface AnnotationTypeBody extends JavaGen {

    @Relation("HAS_L_B_R_A_C_E")
    TerminalNodeStrings getLBRACE();

    void setLBRACE(TerminalNodeStrings setLBRACE);

    @Relation("HAS_R_B_R_A_C_E")
    TerminalNodeStrings getRBRACE();

    void setRBRACE(TerminalNodeStrings setRBRACE);

    @Relation("HAS_ANNOTATION_TYPE_MEMBER_DECLARATION")
    List<AnnotationTypeMemberDeclaration> getAnnotationTypeMemberDeclaration();

    void setAnnotationTypeMemberDeclaration(List<AnnotationTypeMemberDeclaration> setAnnotationTypeMemberDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
