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
 * public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode INTERFACE() {
 *         return getToken(Java8Parser.INTERFACE, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
 *     }
 *
 *     public InterfaceBodyContext interfaceBody() {
 *         return getRuleContext(InterfaceBodyContext.class, 0);
 *     }
 *
 *     public List<InterfaceModifierContext> interfaceModifier() {
 *         return getRuleContexts(InterfaceModifierContext.class);
 *     }
 *
 *     public InterfaceModifierContext interfaceModifier(int i) {
 *         return getRuleContext(InterfaceModifierContext.class, i);
 *     }
 *
 *     public TypeParametersContext typeParameters() {
 *         return getRuleContext(TypeParametersContext.class, 0);
 *     }
 *
 *     public ExtendsInterfacesContext extendsInterfaces() {
 *         return getRuleContext(ExtendsInterfacesContext.class, 0);
 *     }
 *
 *     public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_normalInterfaceDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterNormalInterfaceDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitNormalInterfaceDeclaration(this);
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
@Label("NormalInterfaceDeclaration")
public interface NormalInterfaceDeclaration extends JavaGenAST {

    @Relation("HAS_INTERFACE")
    TerminalNodeStrings getINTERFACE();

    void setINTERFACE(TerminalNodeStrings setINTERFACE);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_INTERFACE_BODY")
    InterfaceBody getInterfaceBody();

    void setInterfaceBody(InterfaceBody setInterfaceBody);

    @Relation("HAS_INTERFACE_MODIFIER")
    List<InterfaceModifier> getInterfaceModifier();

    void setInterfaceModifier(List<InterfaceModifier> setInterfaceModifier);

    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_EXTENDS_INTERFACES")
    ExtendsInterfaces getExtendsInterfaces();

    void setExtendsInterfaces(ExtendsInterfaces setExtendsInterfaces);
}
