//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class CastExpressionContext extends ParserRuleContext {
 *
 *     public TerminalNode LPAREN() {
 *         return getToken(Java8Parser.LPAREN, 0);
 *     }
 *
 *     public PrimitiveTypeContext primitiveType() {
 *         return getRuleContext(PrimitiveTypeContext.class, 0);
 *     }
 *
 *     public TerminalNode RPAREN() {
 *         return getToken(Java8Parser.RPAREN, 0);
 *     }
 *
 *     public UnaryExpressionContext unaryExpression() {
 *         return getRuleContext(UnaryExpressionContext.class, 0);
 *     }
 *
 *     public ReferenceTypeContext referenceType() {
 *         return getRuleContext(ReferenceTypeContext.class, 0);
 *     }
 *
 *     public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
 *         return getRuleContext(UnaryExpressionNotPlusMinusContext.class, 0);
 *     }
 *
 *     public List<AdditionalBoundContext> additionalBound() {
 *         return getRuleContexts(AdditionalBoundContext.class);
 *     }
 *
 *     public AdditionalBoundContext additionalBound(int i) {
 *         return getRuleContext(AdditionalBoundContext.class, i);
 *     }
 *
 *     public LambdaExpressionContext lambdaExpression() {
 *         return getRuleContext(LambdaExpressionContext.class, 0);
 *     }
 *
 *     public CastExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_castExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterCastExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitCastExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CastExpression")
public interface CastExpression extends JavaGen {

    @Relation("HAS_LPAREN")
    TerminalNodeStrings getLPAREN();

    void setLPAREN(TerminalNodeStrings setLPAREN);

    @Relation("HAS_PRIMITIVE_TYPE")
    PrimitiveType getPrimitiveType();

    void setPrimitiveType(PrimitiveType setPrimitiveType);

    @Relation("HAS_RPAREN")
    TerminalNodeStrings getRPAREN();

    void setRPAREN(TerminalNodeStrings setRPAREN);

    @Relation("HAS_UNARY_EXPRESSION")
    UnaryExpression getUnaryExpression();

    void setUnaryExpression(UnaryExpression setUnaryExpression);

    @Relation("HAS_REFERENCE_TYPE")
    ReferenceType getReferenceType();

    void setReferenceType(ReferenceType setReferenceType);

    @Relation("HAS_UNARY_EXPRESSION_NOT_PLUS_MINUS")
    UnaryExpressionNotPlusMinus getUnaryExpressionNotPlusMinus();

    void setUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinus setUnaryExpressionNotPlusMinus);

    @Relation("HAS_ADDITIONAL_BOUND")
    List<AdditionalBound> getAdditionalBound();

    void setAdditionalBound(List<AdditionalBound> setAdditionalBound);

    @Relation("HAS_LAMBDA_EXPRESSION")
    LambdaExpression getLambdaExpression();

    void setLambdaExpression(LambdaExpression setLambdaExpression);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
