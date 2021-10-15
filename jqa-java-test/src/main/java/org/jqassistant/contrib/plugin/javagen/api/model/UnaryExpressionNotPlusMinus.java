//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
 *
 *     public PostfixExpressionContext postfixExpression() {
 *         return getRuleContext(PostfixExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode TILDE() {
 *         return getToken(Java8Parser.TILDE, 0);
 *     }
 *
 *     public UnaryExpressionContext unaryExpression() {
 *         return getRuleContext(UnaryExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode BANG() {
 *         return getToken(Java8Parser.BANG, 0);
 *     }
 *
 *     public CastExpressionContext castExpression() {
 *         return getRuleContext(CastExpressionContext.class, 0);
 *     }
 *
 *     public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_unaryExpressionNotPlusMinus;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterUnaryExpressionNotPlusMinus(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitUnaryExpressionNotPlusMinus(this);
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
@Label("UnaryExpressionNotPlusMinus")
public interface UnaryExpressionNotPlusMinus extends JavaGen {

    @Relation("HAS_POSTFIX_EXPRESSION")
    PostfixExpression getPostfixExpression();

    void setPostfixExpression(PostfixExpression setPostfixExpression);

    @Relation("HAS_TILDE")
    TerminalNodeStrings getTILDE();

    void setTILDE(TerminalNodeStrings setTILDE);

    @Relation("HAS_UNARY_EXPRESSION")
    UnaryExpression getUnaryExpression();

    void setUnaryExpression(UnaryExpression setUnaryExpression);

    @Relation("HAS_BANG")
    TerminalNodeStrings getBANG();

    void setBANG(TerminalNodeStrings setBANG);

    @Relation("HAS_CAST_EXPRESSION")
    CastExpression getCastExpression();

    void setCastExpression(CastExpression setCastExpression);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
