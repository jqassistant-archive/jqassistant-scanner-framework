//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class UnaryExpressionContext extends ParserRuleContext {
 *
 *     public PreIncrementExpressionContext preIncrementExpression() {
 *         return getRuleContext(PreIncrementExpressionContext.class, 0);
 *     }
 *
 *     public PreDecrementExpressionContext preDecrementExpression() {
 *         return getRuleContext(PreDecrementExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode ADD() {
 *         return getToken(Java8Parser.ADD, 0);
 *     }
 *
 *     public UnaryExpressionContext unaryExpression() {
 *         return getRuleContext(UnaryExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode SUB() {
 *         return getToken(Java8Parser.SUB, 0);
 *     }
 *
 *     public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
 *         return getRuleContext(UnaryExpressionNotPlusMinusContext.class, 0);
 *     }
 *
 *     public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_unaryExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterUnaryExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitUnaryExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnaryExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnaryExpression")
public interface UnaryExpression extends JavaGen {

    @Relation("HAS_PRE_INCREMENT_EXPRESSION")
    PreIncrementExpression getPreIncrementExpression();

    void setPreIncrementExpression(PreIncrementExpression setPreIncrementExpression);

    @Relation("HAS_PRE_DECREMENT_EXPRESSION")
    PreDecrementExpression getPreDecrementExpression();

    void setPreDecrementExpression(PreDecrementExpression setPreDecrementExpression);

    @Relation("HAS_A_D_D")
    TerminalNodeStrings getADD();

    void setADD(TerminalNodeStrings setADD);

    @Relation("HAS_UNARY_EXPRESSION")
    UnaryExpression getUnaryExpression();

    void setUnaryExpression(UnaryExpression setUnaryExpression);

    @Relation("HAS_S_U_B")
    TerminalNodeStrings getSUB();

    void setSUB(TerminalNodeStrings setSUB);

    @Relation("HAS_UNARY_EXPRESSION_NOT_PLUS_MINUS")
    UnaryExpressionNotPlusMinus getUnaryExpressionNotPlusMinus();

    void setUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinus setUnaryExpressionNotPlusMinus);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
