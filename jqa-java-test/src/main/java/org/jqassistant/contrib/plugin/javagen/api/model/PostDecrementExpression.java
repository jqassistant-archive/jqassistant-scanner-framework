//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE postDecrementExpression (BLOCK (ALT postfixExpression '--')))
 * </pre>
 *
 * <pre>
 * postDecrementExpression
 * 	:	postfixExpression '--'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4788-4796
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#postDecrementExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PostDecrementExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("PostDecrementExpression")
public interface PostDecrementExpression extends JavaGen {

    @Relation("HAS_POSTFIX_EXPRESSION")
    PostfixExpression getPostfixExpression();

    void setPostfixExpression(PostfixExpression postfixExpression);
    // unhandled TerminalAST token: '--'
}
