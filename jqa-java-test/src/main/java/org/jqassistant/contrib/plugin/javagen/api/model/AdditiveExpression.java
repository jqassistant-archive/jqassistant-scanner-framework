//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AdditiveExpression")
public interface AdditiveExpression extends JavaGen {

    @Relation("HAS_MULTIPLICATIVE_EXPRESSION")
    MultiplicativeExpression getMultiplicativeExpression();

    void setMultiplicativeExpression(MultiplicativeExpression setMultiplicativeExpression);

    @Relation("HAS_ADDITIVE_EXPRESSION")
    AdditiveExpression getAdditiveExpression();

    void setAdditiveExpression(AdditiveExpression setAdditiveExpression);

    // unhandled TerminalAST token: '+'
    // unhandled TerminalAST token: '-'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
