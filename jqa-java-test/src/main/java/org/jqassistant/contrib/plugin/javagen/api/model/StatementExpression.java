//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE statementExpression (BLOCK (ALT assignment) (ALT preIncrementExpression) (ALT preDecrementExpression) (ALT postIncrementExpression) (ALT postDecrementExpression) (ALT methodInvocation) (ALT classInstanceCreationExpression)))
 * </pre>
 *
 * <pre>
 * statementExpression
 * 	:	assignment
 * 	|	preIncrementExpression
 * 	|	preDecrementExpression
 * 	|	postIncrementExpression
 * 	|	postDecrementExpression
 * 	|	methodInvocation
 * 	|	classInstanceCreationExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2334-2364
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#statementExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.StatementExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("StatementExpression")
public interface StatementExpression extends JavaGen {

    @Relation("HAS_ASSIGNMENT")
    Assignment getAssignment();

    void setAssignment(Assignment assignment);

    @Relation("HAS_PRE_INCREMENT_EXPRESSION")
    PreIncrementExpression getPreIncrementExpression();

    void setPreIncrementExpression(PreIncrementExpression preIncrementExpression);

    @Relation("HAS_PRE_DECREMENT_EXPRESSION")
    PreDecrementExpression getPreDecrementExpression();

    void setPreDecrementExpression(PreDecrementExpression preDecrementExpression);

    @Relation("HAS_POST_INCREMENT_EXPRESSION")
    PostIncrementExpression getPostIncrementExpression();

    void setPostIncrementExpression(PostIncrementExpression postIncrementExpression);

    @Relation("HAS_POST_DECREMENT_EXPRESSION")
    PostDecrementExpression getPostDecrementExpression();

    void setPostDecrementExpression(PostDecrementExpression postDecrementExpression);

    @Relation("HAS_METHOD_INVOCATION")
    MethodInvocation getMethodInvocation();

    void setMethodInvocation(MethodInvocation methodInvocation);

    @Relation("HAS_CLASS_INSTANCE_CREATION_EXPRESSION")
    ClassInstanceCreationExpression getClassInstanceCreationExpression();

    void setClassInstanceCreationExpression(ClassInstanceCreationExpression classInstanceCreationExpression);
}