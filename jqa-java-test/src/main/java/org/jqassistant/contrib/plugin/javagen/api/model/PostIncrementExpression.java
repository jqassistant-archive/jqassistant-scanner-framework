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
 * public static class PostIncrementExpressionContext extends ParserRuleContext {
 *
 *     public PostfixExpressionContext postfixExpression() {
 *         return getRuleContext(PostfixExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode INC() {
 *         return getToken(Java8Parser.INC, 0);
 *     }
 *
 *     public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_postIncrementExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPostIncrementExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPostIncrementExpression(this);
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
@Label("PostIncrementExpression")
public interface PostIncrementExpression extends JavaGen {

    @Relation("HAS_POSTFIX_EXPRESSION")
    PostfixExpression getPostfixExpression();

    void setPostfixExpression(PostfixExpression setPostfixExpression);

    @Relation("HAS_INC")
    TerminalNodeStrings getINC();

    void setINC(TerminalNodeStrings setINC);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
