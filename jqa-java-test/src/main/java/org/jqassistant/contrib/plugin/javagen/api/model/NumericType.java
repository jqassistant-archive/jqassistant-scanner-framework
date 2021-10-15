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
 * public static class NumericTypeContext extends ParserRuleContext {
 *
 *     public IntegralTypeContext integralType() {
 *         return getRuleContext(IntegralTypeContext.class, 0);
 *     }
 *
 *     public FloatingPointTypeContext floatingPointType() {
 *         return getRuleContext(FloatingPointTypeContext.class, 0);
 *     }
 *
 *     public NumericTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_numericType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterNumericType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitNumericType(this);
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
@Label("NumericType")
public interface NumericType extends JavaGen {

    @Relation("HAS_INTEGRAL_TYPE")
    IntegralType getIntegralType();

    void setIntegralType(IntegralType setIntegralType);

    @Relation("HAS_FLOATING_POINT_TYPE")
    FloatingPointType getFloatingPointType();

    void setFloatingPointType(FloatingPointType setFloatingPointType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
