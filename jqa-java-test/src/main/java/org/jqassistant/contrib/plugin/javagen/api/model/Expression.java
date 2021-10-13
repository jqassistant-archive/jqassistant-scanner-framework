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
 * public static class ExpressionContext extends ParserRuleContext {
 *
 *     public LambdaExpressionContext lambdaExpression() {
 *         return getRuleContext(LambdaExpressionContext.class, 0);
 *     }
 *
 *     public AssignmentExpressionContext assignmentExpression() {
 *         return getRuleContext(AssignmentExpressionContext.class, 0);
 *     }
 *
 *     public ExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_expression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Expression")
public interface Expression extends JavaGen {

    @Relation("HAS_LAMBDA_EXPRESSION")
    LambdaExpression getLambdaExpression();

    void setLambdaExpression(LambdaExpression setLambdaExpression);

    @Relation("HAS_ASSIGNMENT_EXPRESSION")
    AssignmentExpression getAssignmentExpression();

    void setAssignmentExpression(AssignmentExpression setAssignmentExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
