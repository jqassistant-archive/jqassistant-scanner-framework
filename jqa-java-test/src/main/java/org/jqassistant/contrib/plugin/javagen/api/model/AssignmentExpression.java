//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE assignmentExpression (BLOCK (ALT conditionalExpression) (ALT assignment)))
 * </pre>
 *
 * <pre>
 * assignmentExpression
 * 	:	conditionalExpression
 * 	|	assignment
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4311-4321
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#assignmentExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AssignmentExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("AssignmentExpression")
public interface AssignmentExpression extends JavaGen {

    @Relation("HAS_CONDITIONAL_EXPRESSION")
    ConditionalExpression getConditionalExpression();

    void setConditionalExpression(ConditionalExpression conditionalExpression);

    @Relation("HAS_ASSIGNMENT")
    Assignment getAssignment();

    void setAssignment(Assignment assignment);
}
