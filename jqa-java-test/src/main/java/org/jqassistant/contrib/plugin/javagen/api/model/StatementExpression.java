//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("StatementExpression")
public interface StatementExpression extends JavaGen {

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

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
