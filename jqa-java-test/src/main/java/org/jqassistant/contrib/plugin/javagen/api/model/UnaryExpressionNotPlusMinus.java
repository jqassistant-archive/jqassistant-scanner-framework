//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE unaryExpressionNotPlusMinus (BLOCK (ALT postfixExpression) (ALT '~' unaryExpression) (ALT '!' unaryExpression) (ALT castExpression)))
 * </pre>
 *
 * <pre>
 * unaryExpressionNotPlusMinus
 * 	:	postfixExpression
 * 	|	'~' unaryExpression
 * 	|	'!' unaryExpression
 * 	|	castExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4719-4741
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unaryExpressionNotPlusMinus()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnaryExpressionNotPlusMinusMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnaryExpressionNotPlusMinus")
public interface UnaryExpressionNotPlusMinus extends JavaGen {

    @Relation("HAS_POSTFIX_EXPRESSION")
    PostfixExpression getPostfixExpression();

    void setPostfixExpression(PostfixExpression setPostfixExpression);

    // unhandled TerminalAST token: '~'
    @Relation("HAS_UNARY_EXPRESSION")
    UnaryExpression getUnaryExpression();

    void setUnaryExpression(UnaryExpression setUnaryExpression);

    // unhandled TerminalAST token: '!'
    @Relation("HAS_CAST_EXPRESSION")
    CastExpression getCastExpression();

    void setCastExpression(CastExpression setCastExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
