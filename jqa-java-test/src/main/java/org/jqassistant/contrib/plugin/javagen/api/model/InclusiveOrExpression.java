//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class InclusiveOrExpressionContext extends ParserRuleContext {
 *
 *     public ExclusiveOrExpressionContext exclusiveOrExpression() {
 *         return getRuleContext(ExclusiveOrExpressionContext.class, 0);
 *     }
 *
 *     public InclusiveOrExpressionContext inclusiveOrExpression() {
 *         return getRuleContext(InclusiveOrExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode BITOR() {
 *         return getToken(Java8Parser.BITOR, 0);
 *     }
 *
 *     public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_inclusiveOrExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterInclusiveOrExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitInclusiveOrExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InclusiveOrExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InclusiveOrExpression")
public interface InclusiveOrExpression extends JavaGen {

    @Relation("HAS_EXCLUSIVE_OR_EXPRESSION")
    ExclusiveOrExpression getExclusiveOrExpression();

    void setExclusiveOrExpression(ExclusiveOrExpression setExclusiveOrExpression);

    @Relation("HAS_INCLUSIVE_OR_EXPRESSION")
    InclusiveOrExpression getInclusiveOrExpression();

    void setInclusiveOrExpression(InclusiveOrExpression setInclusiveOrExpression);

    @Relation("HAS_B_I_T_O_R")
    TerminalNodeStrings getBITOR();

    void setBITOR(TerminalNodeStrings setBITOR);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
