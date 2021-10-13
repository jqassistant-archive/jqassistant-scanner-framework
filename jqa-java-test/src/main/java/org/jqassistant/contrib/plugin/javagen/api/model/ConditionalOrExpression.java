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
 * public static class ConditionalOrExpressionContext extends ParserRuleContext {
 *
 *     public ConditionalAndExpressionContext conditionalAndExpression() {
 *         return getRuleContext(ConditionalAndExpressionContext.class, 0);
 *     }
 *
 *     public ConditionalOrExpressionContext conditionalOrExpression() {
 *         return getRuleContext(ConditionalOrExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode OR() {
 *         return getToken(Java8Parser.OR, 0);
 *     }
 *
 *     public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_conditionalOrExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterConditionalOrExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitConditionalOrExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConditionalOrExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConditionalOrExpression")
public interface ConditionalOrExpression extends JavaGen {

    @Relation("HAS_CONDITIONAL_AND_EXPRESSION")
    ConditionalAndExpression getConditionalAndExpression();

    void setConditionalAndExpression(ConditionalAndExpression setConditionalAndExpression);

    @Relation("HAS_CONDITIONAL_OR_EXPRESSION")
    ConditionalOrExpression getConditionalOrExpression();

    void setConditionalOrExpression(ConditionalOrExpression setConditionalOrExpression);

    @Relation("HAS_O_R")
    TerminalNodeStrings getOR();

    void setOR(TerminalNodeStrings setOR);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
