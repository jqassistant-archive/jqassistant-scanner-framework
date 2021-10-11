//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class ExtendsInterfacesContext extends ParserRuleContext {
 *
 *     public TerminalNode EXTENDS() {
 *         return getToken(Java8Parser.EXTENDS, 0);
 *     }
 *
 *     public InterfaceTypeListContext interfaceTypeList() {
 *         return getRuleContext(InterfaceTypeListContext.class, 0);
 *     }
 *
 *     public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_extendsInterfaces;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterExtendsInterfaces(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitExtendsInterfaces(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExtendsInterfacesMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExtendsInterfaces")
public interface ExtendsInterfaces extends JavaGen {

    @Relation("HAS_E_X_T_E_N_D_S")
    TerminalNodeStrings getEXTENDS();

    void setEXTENDS(TerminalNodeStrings setEXTENDS);

    @Relation("HAS_INTERFACE_TYPE_LIST")
    InterfaceTypeList getInterfaceTypeList();

    void setInterfaceTypeList(InterfaceTypeList setInterfaceTypeList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
