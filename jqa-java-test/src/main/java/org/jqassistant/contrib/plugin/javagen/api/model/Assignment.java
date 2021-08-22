//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE assignment (BLOCK (ALT leftHandSide assignmentOperator expression)))
 * </pre>
 *
 * <pre>
 * assignment
 * 	:	leftHandSide assignmentOperator expression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4323-4333
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#assignment()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AssignmentMapper
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
