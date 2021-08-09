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
 * (RULE unaryExpression (BLOCK (ALT preIncrementExpression) (ALT preDecrementExpression) (ALT '+' unaryExpression) (ALT '-' unaryExpression) (ALT unaryExpressionNotPlusMinus)))
 * </pre>
 *
 * <pre>
 * unaryExpression
 * 	:	preIncrementExpression
 * 	|	preDecrementExpression
 * 	|	'+' unaryExpression
 * 	|	'-' unaryExpression
 * 	|	unaryExpressionNotPlusMinus
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4671-4697
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unaryExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnaryExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("UnaryExpression")
public interface UnaryExpression extends JavaGen {

    @Relation("HAS_PRE_INCREMENT_EXPRESSION")
    PreIncrementExpression getPreIncrementExpression();

    void setPreIncrementExpression(PreIncrementExpression preIncrementExpression);

    @Relation("HAS_PRE_DECREMENT_EXPRESSION")
    PreDecrementExpression getPreDecrementExpression();

    void setPreDecrementExpression(PreDecrementExpression preDecrementExpression);

    // unhandled TerminalAST token: '+'
    // unhandled TerminalAST token: '-'
    @Relation("HAS_UNARY_EXPRESSION")
    List<UnaryExpression> getUnaryExpressions();

    void setUnaryExpressions(List<UnaryExpression> setUnaryExpressions);

    @Relation("HAS_UNARY_EXPRESSION_NOT_PLUS_MINUS")
    UnaryExpressionNotPlusMinus getUnaryExpressionNotPlusMinus();

    void setUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinus unaryExpressionNotPlusMinus);
}