//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class EnumBodyContext extends ParserRuleContext {
 *
 *     public TerminalNode LBRACE() {
 *         return getToken(Java8Parser.LBRACE, 0);
 *     }
 *
 *     public TerminalNode RBRACE() {
 *         return getToken(Java8Parser.RBRACE, 0);
 *     }
 *
 *     public EnumConstantListContext enumConstantList() {
 *         return getRuleContext(EnumConstantListContext.class, 0);
 *     }
 *
 *     public TerminalNode COMMA() {
 *         return getToken(Java8Parser.COMMA, 0);
 *     }
 *
 *     public EnumBodyDeclarationsContext enumBodyDeclarations() {
 *         return getRuleContext(EnumBodyDeclarationsContext.class, 0);
 *     }
 *
 *     public EnumBodyContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_enumBody;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterEnumBody(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitEnumBody(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnumBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumBody")
public interface EnumBody extends JavaGen {

    @Relation("HAS_L_B_R_A_C_E")
    TerminalNodeStrings getLBRACE();

    void setLBRACE(TerminalNodeStrings setLBRACE);

    @Relation("HAS_R_B_R_A_C_E")
    TerminalNodeStrings getRBRACE();

    void setRBRACE(TerminalNodeStrings setRBRACE);

    @Relation("HAS_ENUM_CONSTANT_LIST")
    EnumConstantList getEnumConstantList();

    void setEnumConstantList(EnumConstantList setEnumConstantList);

    @Relation("HAS_C_O_M_M_A")
    TerminalNodeStrings getCOMMA();

    void setCOMMA(TerminalNodeStrings setCOMMA);

    @Relation("HAS_ENUM_BODY_DECLARATIONS")
    EnumBodyDeclarations getEnumBodyDeclarations();

    void setEnumBodyDeclarations(EnumBodyDeclarations setEnumBodyDeclarations);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
