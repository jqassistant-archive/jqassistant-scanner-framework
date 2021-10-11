//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class DefaultValueContext extends ParserRuleContext {
 *
 *     public TerminalNode DEFAULT() {
 *         return getToken(Java8Parser.DEFAULT, 0);
 *     }
 *
 *     public ElementValueContext elementValue() {
 *         return getRuleContext(ElementValueContext.class, 0);
 *     }
 *
 *     public DefaultValueContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_defaultValue;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterDefaultValue(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitDefaultValue(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.DefaultValueMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("DefaultValue")
public interface DefaultValue extends JavaGen {

    @Relation("HAS_D_E_F_A_U_L_T")
    TerminalNodeStrings getDEFAULT();

    void setDEFAULT(TerminalNodeStrings setDEFAULT);

    @Relation("HAS_ELEMENT_VALUE")
    ElementValue getElementValue();

    void setElementValue(ElementValue setElementValue);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
