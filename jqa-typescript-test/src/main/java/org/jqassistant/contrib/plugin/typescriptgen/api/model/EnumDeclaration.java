//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class EnumDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode Enum() {
 *         return getToken(TypeScriptParser.Enum, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(TypeScriptParser.Identifier, 0);
 *     }
 *
 *     public TerminalNode OpenBrace() {
 *         return getToken(TypeScriptParser.OpenBrace, 0);
 *     }
 *
 *     public TerminalNode CloseBrace() {
 *         return getToken(TypeScriptParser.CloseBrace, 0);
 *     }
 *
 *     public TerminalNode Const() {
 *         return getToken(TypeScriptParser.Const, 0);
 *     }
 *
 *     public EnumBodyContext enumBody() {
 *         return getRuleContext(EnumBodyContext.class, 0);
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
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterEnumDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitEnumDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.EnumDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumDeclaration")
public interface EnumDeclaration extends TypeScriptGen {

    @Relation("HAS_ENUM")
    TerminalNodeStrings getEnum();

    void setEnum(TerminalNodeStrings setEnum);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_OPEN_BRACE")
    TerminalNodeStrings getOpenBrace();

    void setOpenBrace(TerminalNodeStrings setOpenBrace);

    @Relation("HAS_CLOSE_BRACE")
    TerminalNodeStrings getCloseBrace();

    void setCloseBrace(TerminalNodeStrings setCloseBrace);

    @Relation("HAS_CONST")
    TerminalNodeStrings getConst();

    void setConst(TerminalNodeStrings setConst);

    @Relation("HAS_ENUM_BODY")
    EnumBody getEnumBody();

    void setEnumBody(EnumBody setEnumBody);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
