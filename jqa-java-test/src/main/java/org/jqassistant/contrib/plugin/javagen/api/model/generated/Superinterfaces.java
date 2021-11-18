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
 * public static class SuperinterfacesContext extends ParserRuleContext {
 *
 *     public TerminalNode IMPLEMENTS() {
 *         return getToken(Java8Parser.IMPLEMENTS, 0);
 *     }
 *
 *     public InterfaceTypeListContext interfaceTypeList() {
 *         return getRuleContext(InterfaceTypeListContext.class, 0);
 *     }
 *
 *     public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_superinterfaces;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterSuperinterfaces(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitSuperinterfaces(this);
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
@Label("Superinterfaces")
public interface Superinterfaces extends JavaGenAST {

    @Relation("HAS_IMPLEMENTS")
    TerminalNodeStrings getIMPLEMENTS();

    void setIMPLEMENTS(TerminalNodeStrings setIMPLEMENTS);

    @Relation("HAS_INTERFACE_TYPE_LIST")
    InterfaceTypeList getInterfaceTypeList();

    void setInterfaceTypeList(InterfaceTypeList setInterfaceTypeList);
}
