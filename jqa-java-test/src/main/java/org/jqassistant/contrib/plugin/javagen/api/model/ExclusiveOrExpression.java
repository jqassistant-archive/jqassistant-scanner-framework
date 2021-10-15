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
 * public static class ExclusiveOrExpressionContext extends ParserRuleContext {
 *
 *     public AndExpressionContext andExpression() {
 *         return getRuleContext(AndExpressionContext.class, 0);
 *     }
 *
 *     public ExclusiveOrExpressionContext exclusiveOrExpression() {
 *         return getRuleContext(ExclusiveOrExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode CARET() {
 *         return getToken(Java8Parser.CARET, 0);
 *     }
 *
 *     public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_exclusiveOrExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterExclusiveOrExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitExclusiveOrExpression(this);
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
@Label("ExclusiveOrExpression")
public interface ExclusiveOrExpression extends JavaGen {

    @Relation("HAS_AND_EXPRESSION")
    AndExpression getAndExpression();

    void setAndExpression(AndExpression setAndExpression);

    @Relation("HAS_EXCLUSIVE_OR_EXPRESSION")
    ExclusiveOrExpression getExclusiveOrExpression();

    void setExclusiveOrExpression(ExclusiveOrExpression setExclusiveOrExpression);

    @Relation("HAS_CARET")
    TerminalNodeStrings getCARET();

    void setCARET(TerminalNodeStrings setCARET);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
