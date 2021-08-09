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
 * (RULE additiveExpression (BLOCK (ALT multiplicativeExpression) (ALT additiveExpression '+' multiplicativeExpression) (ALT additiveExpression '-' multiplicativeExpression)))
 * </pre>
 *
 * <pre>
 * additiveExpression
 * 	:	multiplicativeExpression
 * 	|	additiveExpression '+' multiplicativeExpression
 * 	|	additiveExpression '-' multiplicativeExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4615-4637
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#additiveExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AdditiveExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("AdditiveExpression")
public interface AdditiveExpression extends JavaGen {

    // unhandled TerminalAST token: '+'
    @Relation("HAS_MULTIPLICATIVE_EXPRESSION")
    List<MultiplicativeExpression> getMultiplicativeExpressions();

    void setMultiplicativeExpressions(List<MultiplicativeExpression> setMultiplicativeExpressions);

    @Relation("HAS_ADDITIVE_EXPRESSION")
    List<AdditiveExpression> getAdditiveExpressions();

    void setAdditiveExpressions(List<AdditiveExpression> setAdditiveExpressions);
    // unhandled TerminalAST token: '-'
}
