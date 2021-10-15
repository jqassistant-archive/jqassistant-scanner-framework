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
 * public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
 *
 *     public TerminalNode DEC() {
 *         return getToken(Java8Parser.DEC, 0);
 *     }
 *
 *     public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_postDecrementExpression_lf_postfixExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPostDecrementExpression_lf_postfixExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPostDecrementExpression_lf_postfixExpression(this);
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
@Label("PostDecrementExpression_lf_postfixExpression")
public interface PostDecrementExpression_lf_postfixExpression extends JavaGen {

    @Relation("HAS_DEC")
    TerminalNodeStrings getDEC();

    void setDEC(TerminalNodeStrings setDEC);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
