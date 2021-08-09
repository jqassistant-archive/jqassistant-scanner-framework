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
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("MultiplicativeExpression")
public interface MultiplicativeExpression extends JavaGen {

    // unhandled TerminalAST token: '*'
    @Relation("HAS_UNARY_EXPRESSION")
    List<UnaryExpression> getUnaryExpressions();

    void setUnaryExpressions(List<UnaryExpression> setUnaryExpressions);

    @Relation("HAS_MULTIPLICATIVE_EXPRESSION")
    List<MultiplicativeExpression> getMultiplicativeExpressions();

    void setMultiplicativeExpressions(List<MultiplicativeExpression> setMultiplicativeExpressions);
    // unhandled TerminalAST token: '/'
    // unhandled TerminalAST token: '%'
}
