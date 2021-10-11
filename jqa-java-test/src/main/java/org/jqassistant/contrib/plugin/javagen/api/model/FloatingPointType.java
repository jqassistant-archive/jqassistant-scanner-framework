//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class FloatingPointTypeContext extends ParserRuleContext {
 *
 *     public TerminalNode FLOAT() {
 *         return getToken(Java8Parser.FLOAT, 0);
 *     }
 *
 *     public TerminalNode DOUBLE() {
 *         return getToken(Java8Parser.DOUBLE, 0);
 *     }
 *
 *     public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_floatingPointType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterFloatingPointType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitFloatingPointType(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FloatingPointTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FloatingPointType")
public interface FloatingPointType extends JavaGen {

    @Relation("HAS_F_L_O_A_T")
    TerminalNodeStrings getFLOAT();

    void setFLOAT(TerminalNodeStrings setFLOAT);

    @Relation("HAS_D_O_U_B_L_E")
    TerminalNodeStrings getDOUBLE();

    void setDOUBLE(TerminalNodeStrings setDOUBLE);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
