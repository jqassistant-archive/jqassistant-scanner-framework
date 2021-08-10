//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE multiplicativeExpression (BLOCK (ALT unaryExpression) (ALT multiplicativeExpression '*' unaryExpression) (ALT multiplicativeExpression '/' unaryExpression) (ALT multiplicativeExpression '%' unaryExpression)))
 * </pre>
 *
 * <pre>
 * multiplicativeExpression
 * 	:	unaryExpression
 * 	|	multiplicativeExpression '*' unaryExpression
 * 	|	multiplicativeExpression '/' unaryExpression
 * 	|	multiplicativeExpression '%' unaryExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4639-4669
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#multiplicativeExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MultiplicativeExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("MultiplicativeExpression")
public interface MultiplicativeExpression extends JavaGen {

    @Relation("HAS_UNARY_EXPRESSION")
    UnaryExpression getUnaryExpression();

    void setUnaryExpression(UnaryExpression unaryExpression);

    @Relation("HAS_MULTIPLICATIVE_EXPRESSION")
    MultiplicativeExpression getMultiplicativeExpression();

    void setMultiplicativeExpression(MultiplicativeExpression multiplicativeExpression);
    // unhandled TerminalAST token: '*'
    // unhandled TerminalAST token: '/'
    // unhandled TerminalAST token: '%'
}
