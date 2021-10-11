//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;
import java.util.List;

/**
 * Generated from Parser:
 * <pre>
 * public static class EnumDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode ENUM() {
 *         return getToken(Java8Parser.ENUM, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
 *     }
 *
 *     public EnumBodyContext enumBody() {
 *         return getRuleContext(EnumBodyContext.class, 0);
 *     }
 *
 *     public List<ClassModifierContext> classModifier() {
 *         return getRuleContexts(ClassModifierContext.class);
 *     }
 *
 *     public ClassModifierContext classModifier(int i) {
 *         return getRuleContext(ClassModifierContext.class, i);
 *     }
 *
 *     public SuperinterfacesContext superinterfaces() {
 *         return getRuleContext(SuperinterfacesContext.class, 0);
 *     }
 *
 *     public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_enumDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterEnumDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitEnumDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnumDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumDeclaration")
public interface EnumDeclaration extends JavaGen {

    @Relation("HAS_E_N_U_M")
    TerminalNodeStrings getENUM();

    void setENUM(TerminalNodeStrings setENUM);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_ENUM_BODY")
    EnumBody getEnumBody();

    void setEnumBody(EnumBody setEnumBody);

    @Relation("HAS_CLASS_MODIFIER")
    List<ClassModifier> getClassModifier();

    void setClassModifier(List<ClassModifier> setClassModifier);

    @Relation("HAS_SUPERINTERFACES")
    Superinterfaces getSuperinterfaces();

    void setSuperinterfaces(Superinterfaces setSuperinterfaces);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
