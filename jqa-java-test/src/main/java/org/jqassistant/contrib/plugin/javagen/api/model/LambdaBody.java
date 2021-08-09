//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE lambdaBody (BLOCK (ALT expression) (ALT block)))
 * </pre>
 *
 * <pre>
 * lambdaBody
 * 	:	expression
 * 	|	block
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4299-4309
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#lambdaBody()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LambdaBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("LambdaBody")
public interface LambdaBody extends JavaGen {

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block block);
}
