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
 * public static class ConditionalExpressionContext extends ParserRuleContext {
 *
 *     public ConditionalOrExpressionContext conditionalOrExpression() {
 *         return getRuleContext(ConditionalOrExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode QUESTION() {
 *         return getToken(Java8Parser.QUESTION, 0);
 *     }
 *
 *     public ExpressionContext expression() {
 *         return getRuleContext(ExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode COLON() {
 *         return getToken(Java8Parser.COLON, 0);
 *     }
 *
 *     public ConditionalExpressionContext conditionalExpression() {
 *         return getRuleContext(ConditionalExpressionContext.class, 0);
 *     }
 *
 *     public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_conditionalExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterConditionalExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitConditionalExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConditionalExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConditionalExpression")
public interface ConditionalExpression extends JavaGen {

    @Relation("HAS_CONDITIONAL_OR_EXPRESSION")
    ConditionalOrExpression getConditionalOrExpression();

    void setConditionalOrExpression(ConditionalOrExpression setConditionalOrExpression);

    @Relation("HAS_Q_U_E_S_T_I_O_N")
    TerminalNodeStrings getQUESTION();

    void setQUESTION(TerminalNodeStrings setQUESTION);

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    @Relation("HAS_C_O_L_O_N")
    TerminalNodeStrings getCOLON();

    void setCOLON(TerminalNodeStrings setCOLON);

    @Relation("HAS_CONDITIONAL_EXPRESSION")
    ConditionalExpression getConditionalExpression();

    void setConditionalExpression(ConditionalExpression setConditionalExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
