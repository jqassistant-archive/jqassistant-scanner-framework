//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE postIncrementExpression_lf_postfixExpression (BLOCK (ALT '++')))
 * </pre>
 *
 * <pre>
 * postIncrementExpression_lf_postfixExpression
 * 	:	'++'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4780-4786
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#postIncrementExpression_lf_postfixExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PostIncrementExpression_lf_postfixExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PostIncrementExpression_lf_postfixExpression")
public interface PostIncrementExpression_lf_postfixExpression extends JavaGen {

    // unhandled TerminalAST token: '++'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
