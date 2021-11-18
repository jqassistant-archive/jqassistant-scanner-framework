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
 * public static class StatementExpressionContext extends ParserRuleContext {
 *
 *     public AssignmentContext assignment() {
 *         return getRuleContext(AssignmentContext.class, 0);
 *     }
 *
 *     public PreIncrementExpressionContext preIncrementExpression() {
 *         return getRuleContext(PreIncrementExpressionContext.class, 0);
 *     }
 *
 *     public PreDecrementExpressionContext preDecrementExpression() {
 *         return getRuleContext(PreDecrementExpressionContext.class, 0);
 *     }
 *
 *     public PostIncrementExpressionContext postIncrementExpression() {
 *         return getRuleContext(PostIncrementExpressionContext.class, 0);
 *     }
 *
 *     public PostDecrementExpressionContext postDecrementExpression() {
 *         return getRuleContext(PostDecrementExpressionContext.class, 0);
 *     }
 *
 *     public MethodInvocationContext methodInvocation() {
 *         return getRuleContext(MethodInvocationContext.class, 0);
 *     }
 *
 *     public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
 *         return getRuleContext(ClassInstanceCreationExpressionContext.class, 0);
 *     }
 *
 *     public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_statementExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterStatementExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitStatementExpression(this);
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
@Label("StatementExpression")
public interface StatementExpression extends JavaGenAST {

    @Relation("HAS_ASSIGNMENT")
    Assignment getAssignment();

    void setAssignment(Assignment setAssignment);

    @Relation("HAS_PRE_INCREMENT_EXPRESSION")
    PreIncrementExpression getPreIncrementExpression();

    void setPreIncrementExpression(PreIncrementExpression setPreIncrementExpression);

    @Relation("HAS_PRE_DECREMENT_EXPRESSION")
    PreDecrementExpression getPreDecrementExpression();

    void setPreDecrementExpression(PreDecrementExpression setPreDecrementExpression);

    @Relation("HAS_POST_INCREMENT_EXPRESSION")
    PostIncrementExpression getPostIncrementExpression();

    void setPostIncrementExpression(PostIncrementExpression setPostIncrementExpression);

    @Relation("HAS_POST_DECREMENT_EXPRESSION")
    PostDecrementExpression getPostDecrementExpression();

    void setPostDecrementExpression(PostDecrementExpression setPostDecrementExpression);

    @Relation("HAS_METHOD_INVOCATION")
    MethodInvocation getMethodInvocation();

    void setMethodInvocation(MethodInvocation setMethodInvocation);

    @Relation("HAS_CLASS_INSTANCE_CREATION_EXPRESSION")
    ClassInstanceCreationExpression getClassInstanceCreationExpression();

    void setClassInstanceCreationExpression(ClassInstanceCreationExpression setClassInstanceCreationExpression);
}
