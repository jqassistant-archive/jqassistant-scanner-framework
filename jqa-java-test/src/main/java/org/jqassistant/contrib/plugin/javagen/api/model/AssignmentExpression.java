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
 * public static class AssignmentExpressionContext extends ParserRuleContext {
 *
 *     public ConditionalExpressionContext conditionalExpression() {
 *         return getRuleContext(ConditionalExpressionContext.class, 0);
 *     }
 *
 *     public AssignmentContext assignment() {
 *         return getRuleContext(AssignmentContext.class, 0);
 *     }
 *
 *     public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_assignmentExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAssignmentExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAssignmentExpression(this);
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
@Label("AssignmentExpression")
public interface AssignmentExpression extends JavaGen {

    @Relation("HAS_CONDITIONAL_EXPRESSION")
    ConditionalExpression getConditionalExpression();

    void setConditionalExpression(ConditionalExpression setConditionalExpression);

    @Relation("HAS_ASSIGNMENT")
    Assignment getAssignment();

    void setAssignment(Assignment setAssignment);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
