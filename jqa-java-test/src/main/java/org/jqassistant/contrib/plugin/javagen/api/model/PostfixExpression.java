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
 * public static class PostfixExpressionContext extends ParserRuleContext {
 *
 *     public PrimaryContext primary() {
 *         return getRuleContext(PrimaryContext.class, 0);
 *     }
 *
 *     public ExpressionNameContext expressionName() {
 *         return getRuleContext(ExpressionNameContext.class, 0);
 *     }
 *
 *     public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
 *         return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
 *     }
 *
 *     public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
 *         return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class, i);
 *     }
 *
 *     public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
 *         return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
 *     }
 *
 *     public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
 *         return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class, i);
 *     }
 *
 *     public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_postfixExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPostfixExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPostfixExpression(this);
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
@Label("PostfixExpression")
public interface PostfixExpression extends JavaGen {

    @Relation("HAS_PRIMARY")
    Primary getPrimary();

    void setPrimary(Primary setPrimary);

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName setExpressionName);

    @Relation("HAS_POST_INCREMENT_EXPRESSION_LF_POSTFIX_EXPRESSION")
    List<PostIncrementExpression_lf_postfixExpression> getPostIncrementExpression_lf_postfixExpression();

    void setPostIncrementExpression_lf_postfixExpression(List<PostIncrementExpression_lf_postfixExpression> setPostIncrementExpression_lf_postfixExpression);

    @Relation("HAS_POST_DECREMENT_EXPRESSION_LF_POSTFIX_EXPRESSION")
    List<PostDecrementExpression_lf_postfixExpression> getPostDecrementExpression_lf_postfixExpression();

    void setPostDecrementExpression_lf_postfixExpression(List<PostDecrementExpression_lf_postfixExpression> setPostDecrementExpression_lf_postfixExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
