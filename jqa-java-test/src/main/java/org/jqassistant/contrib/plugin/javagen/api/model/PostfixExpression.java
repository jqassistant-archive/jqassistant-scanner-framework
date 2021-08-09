//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE postfixExpression (BLOCK (ALT (BLOCK (ALT primary) (ALT expressionName)) (* (BLOCK (ALT postIncrementExpression_lf_postfixExpression) (ALT postDecrementExpression_lf_postfixExpression))))))
 * </pre>
 *
 * <pre>
 * postfixExpression
 * 	:	(	primary
 * 		|	expressionName
 * 		)
 * 		(	postIncrementExpression_lf_postfixExpression
 * 		|	postDecrementExpression_lf_postfixExpression
 * 		)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4743-4768
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#postfixExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PostfixExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("PostfixExpression")
public interface PostfixExpression extends JavaGen {

    @Relation("HAS_PRIMARY")
    Primary getPrimary();

    void setPrimary(Primary primary);

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName expressionName);

    @Relation("HAS_POST_INCREMENT_EXPRESSION_LF_POSTFIX_EXPRESSION")
    List<PostIncrementExpression_lf_postfixExpression> getPostIncrementExpression_lf_postfixExpressions();

    void setPostIncrementExpression_lf_postfixExpressions(List<PostIncrementExpression_lf_postfixExpression> setPostIncrementExpression_lf_postfixExpressions);
}