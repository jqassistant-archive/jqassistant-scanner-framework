//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class LambdaExpressionContext extends ParserRuleContext {
 *
 *     public LambdaParametersContext lambdaParameters() {
 *         return getRuleContext(LambdaParametersContext.class, 0);
 *     }
 *
 *     public TerminalNode ARROW() {
 *         return getToken(Java8Parser.ARROW, 0);
 *     }
 *
 *     public LambdaBodyContext lambdaBody() {
 *         return getRuleContext(LambdaBodyContext.class, 0);
 *     }
 *
 *     public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_lambdaExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterLambdaExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitLambdaExpression(this);
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
@Label("LambdaExpression")
public interface LambdaExpression extends JavaGenAST {

    @Relation("HAS_LAMBDA_PARAMETERS")
    LambdaParameters getLambdaParameters();

    void setLambdaParameters(LambdaParameters setLambdaParameters);

    @Relation("HAS_ARROW")
    TerminalNodeStrings getARROW();

    void setARROW(TerminalNodeStrings setARROW);

    @Relation("HAS_LAMBDA_BODY")
    LambdaBody getLambdaBody();

    void setLambdaBody(LambdaBody setLambdaBody);
}
