//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class InterfaceBodyContext extends ParserRuleContext {
 *
 *     public TerminalNode LBRACE() {
 *         return getToken(Java8Parser.LBRACE, 0);
 *     }
 *
 *     public TerminalNode RBRACE() {
 *         return getToken(Java8Parser.RBRACE, 0);
 *     }
 *
 *     public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
 *         return getRuleContexts(InterfaceMemberDeclarationContext.class);
 *     }
 *
 *     public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
 *         return getRuleContext(InterfaceMemberDeclarationContext.class, i);
 *     }
 *
 *     public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_interfaceBody;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterInterfaceBody(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitInterfaceBody(this);
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
@Label("InterfaceBody")
public interface InterfaceBody extends JavaGen {

    @Relation("HAS_LBRACE")
    TerminalNodeStrings getLBRACE();

    void setLBRACE(TerminalNodeStrings setLBRACE);

    @Relation("HAS_RBRACE")
    TerminalNodeStrings getRBRACE();

    void setRBRACE(TerminalNodeStrings setRBRACE);

    @Relation("HAS_INTERFACE_MEMBER_DECLARATION")
    List<InterfaceMemberDeclaration> getInterfaceMemberDeclaration();

    void setInterfaceMemberDeclaration(List<InterfaceMemberDeclaration> setInterfaceMemberDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
