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
 * public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
 *
 *     public TerminalNode INC() {
 *         return getToken(Java8Parser.INC, 0);
 *     }
 *
 *     public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_postIncrementExpression_lf_postfixExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPostIncrementExpression_lf_postfixExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPostIncrementExpression_lf_postfixExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PostIncrementExpression_lf_postfixExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PostIncrementExpression_lf_postfixExpression")
public interface PostIncrementExpression_lf_postfixExpression extends JavaGen {

    @Relation("HAS_I_N_C")
    TerminalNodeStrings getINC();

    void setINC(TerminalNodeStrings setINC);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
