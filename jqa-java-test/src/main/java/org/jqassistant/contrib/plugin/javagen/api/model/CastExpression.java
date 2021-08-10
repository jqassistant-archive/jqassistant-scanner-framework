//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE castExpression (BLOCK (ALT '(' primitiveType ')' unaryExpression) (ALT '(' referenceType (* (BLOCK (ALT additionalBound))) ')' unaryExpressionNotPlusMinus) (ALT '(' referenceType (* (BLOCK (ALT additionalBound))) ')' lambdaExpression)))
 * </pre>
 *
 * <pre>
 * castExpression
 * 	:	'(' primitiveType ')' unaryExpression
 * 	|	'(' referenceType additionalBound* ')' unaryExpressionNotPlusMinus
 * 	|	'(' referenceType additionalBound* ')' lambdaExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4806-4844
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#castExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.CastExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("CastExpression")
public interface CastExpression extends JavaGen {

    // unhandled TerminalAST token: '('
    @Relation("HAS_PRIMITIVE_TYPE")
    PrimitiveType getPrimitiveType();

    void setPrimitiveType(PrimitiveType primitiveType);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_UNARY_EXPRESSION")
    UnaryExpression getUnaryExpression();

    void setUnaryExpression(UnaryExpression unaryExpression);

    // unhandled TerminalAST token: '('
    @Relation("HAS_REFERENCE_TYPE")
    ReferenceType getReferenceType();

    void setReferenceType(ReferenceType referenceType);

    @Relation("HAS_ADDITIONAL_BOUND")
    List<AdditionalBound> getAdditionalBound();

    void setAdditionalBound(List<AdditionalBound> setAdditionalBound);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_UNARY_EXPRESSION_NOT_PLUS_MINUS")
    UnaryExpressionNotPlusMinus getUnaryExpressionNotPlusMinus();

    void setUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinus unaryExpressionNotPlusMinus);

    // unhandled TerminalAST token: '('
    // unhandled TerminalAST token: ')'
    @Relation("HAS_LAMBDA_EXPRESSION")
    LambdaExpression getLambdaExpression();

    void setLambdaExpression(LambdaExpression lambdaExpression);
}
