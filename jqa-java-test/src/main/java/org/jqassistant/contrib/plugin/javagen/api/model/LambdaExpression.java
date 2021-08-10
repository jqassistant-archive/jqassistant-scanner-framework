//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE lambdaExpression (BLOCK (ALT lambdaParameters '->' lambdaBody)))
 * </pre>
 *
 * <pre>
 * lambdaExpression
 * 	:	lambdaParameters '->' lambdaBody
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4247-4257
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#lambdaExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LambdaExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("LambdaExpression")
public interface LambdaExpression extends JavaGen {

    @Relation("HAS_LAMBDA_PARAMETERS")
    LambdaParameters getLambdaParameters();

    void setLambdaParameters(LambdaParameters lambdaParameters);

    // unhandled TerminalAST token: '->'
    @Relation("HAS_LAMBDA_BODY")
    LambdaBody getLambdaBody();

    void setLambdaBody(LambdaBody lambdaBody);
}
