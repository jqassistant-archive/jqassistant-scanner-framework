//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class UnannPrimitiveTypeContext extends ParserRuleContext {
 *
 *     public NumericTypeContext numericType() {
 *         return getRuleContext(NumericTypeContext.class, 0);
 *     }
 *
 *     public TerminalNode BOOLEAN() {
 *         return getToken(Java8Parser.BOOLEAN, 0);
 *     }
 *
 *     public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_unannPrimitiveType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterUnannPrimitiveType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitUnannPrimitiveType(this);
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
@Label("UnannPrimitiveType")
public interface UnannPrimitiveType extends JavaGenAST {

    @Relation("HAS_NUMERIC_TYPE")
    NumericType getNumericType();

    void setNumericType(NumericType setNumericType);

    @Relation("HAS_BOOLEAN")
    TerminalNodeStrings getBOOLEAN();

    void setBOOLEAN(TerminalNodeStrings setBOOLEAN);
}
