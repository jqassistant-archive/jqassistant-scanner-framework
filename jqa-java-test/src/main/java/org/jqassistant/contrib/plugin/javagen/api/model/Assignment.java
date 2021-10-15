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
 * public static class AssignmentContext extends ParserRuleContext {
 *
 *     public LeftHandSideContext leftHandSide() {
 *         return getRuleContext(LeftHandSideContext.class, 0);
 *     }
 *
 *     public AssignmentOperatorContext assignmentOperator() {
 *         return getRuleContext(AssignmentOperatorContext.class, 0);
 *     }
 *
 *     public ExpressionContext expression() {
 *         return getRuleContext(ExpressionContext.class, 0);
 *     }
 *
 *     public AssignmentContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_assignment;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAssignment(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAssignment(this);
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
@Label("Assignment")
public interface Assignment extends JavaGen {

    @Relation("HAS_LEFT_HAND_SIDE")
    LeftHandSide getLeftHandSide();

    void setLeftHandSide(LeftHandSide setLeftHandSide);

    @Relation("HAS_ASSIGNMENT_OPERATOR")
    AssignmentOperator getAssignmentOperator();

    void setAssignmentOperator(AssignmentOperator setAssignmentOperator);

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
