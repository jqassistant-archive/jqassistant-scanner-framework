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
 * public static class ConditionalAndExpressionContext extends ParserRuleContext {
 *
 *     public InclusiveOrExpressionContext inclusiveOrExpression() {
 *         return getRuleContext(InclusiveOrExpressionContext.class, 0);
 *     }
 *
 *     public ConditionalAndExpressionContext conditionalAndExpression() {
 *         return getRuleContext(ConditionalAndExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode AND() {
 *         return getToken(Java8Parser.AND, 0);
 *     }
 *
 *     public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_conditionalAndExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterConditionalAndExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitConditionalAndExpression(this);
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
@Label("ConditionalAndExpression")
public interface ConditionalAndExpression extends JavaGen {

    @Relation("HAS_INCLUSIVE_OR_EXPRESSION")
    InclusiveOrExpression getInclusiveOrExpression();

    void setInclusiveOrExpression(InclusiveOrExpression setInclusiveOrExpression);

    @Relation("HAS_CONDITIONAL_AND_EXPRESSION")
    ConditionalAndExpression getConditionalAndExpression();

    void setConditionalAndExpression(ConditionalAndExpression setConditionalAndExpression);

    @Relation("HAS_AND")
    TerminalNodeStrings getAND();

    void setAND(TerminalNodeStrings setAND);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
