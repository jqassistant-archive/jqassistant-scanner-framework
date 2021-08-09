//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE expression (BLOCK (ALT lambdaExpression) (ALT assignmentExpression)))
 * </pre>
 *
 * <pre>
 * expression
 * 	:	lambdaExpression
 * 	|	assignmentExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4235-4245
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#expression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("Expression")
public interface Expression extends JavaGen {

    @Relation("HAS_LAMBDA_EXPRESSION")
    LambdaExpression getLambdaExpression();

    void setLambdaExpression(LambdaExpression lambdaExpression);

    @Relation("HAS_ASSIGNMENT_EXPRESSION")
    AssignmentExpression getAssignmentExpression();

    void setAssignmentExpression(AssignmentExpression assignmentExpression);
}