//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE constantExpression (BLOCK (ALT expression)))
 * </pre>
 *
 * <pre>
 * constantExpression
 * 	:	expression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4227-4233
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#constantExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConstantExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("ConstantExpression")
public interface ConstantExpression extends JavaGen {

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);
}