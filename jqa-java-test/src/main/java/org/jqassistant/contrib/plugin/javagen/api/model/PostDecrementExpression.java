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
 * public static class PostDecrementExpressionContext extends ParserRuleContext {
 *
 *     public PostfixExpressionContext postfixExpression() {
 *         return getRuleContext(PostfixExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode DEC() {
 *         return getToken(Java8Parser.DEC, 0);
 *     }
 *
 *     public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_postDecrementExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPostDecrementExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPostDecrementExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PostDecrementExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PostDecrementExpression")
public interface PostDecrementExpression extends JavaGen {

    @Relation("HAS_POSTFIX_EXPRESSION")
    PostfixExpression getPostfixExpression();

    void setPostfixExpression(PostfixExpression setPostfixExpression);

    @Relation("HAS_D_E_C")
    TerminalNodeStrings getDEC();

    void setDEC(TerminalNodeStrings setDEC);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
