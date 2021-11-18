//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class EnumBodyContext extends ParserRuleContext {
 *
 *     public EnumMemberListContext enumMemberList() {
 *         return getRuleContext(EnumMemberListContext.class, 0);
 *     }
 *
 *     public TerminalNode Comma() {
 *         return getToken(TypeScriptParser.Comma, 0);
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
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterEnumBody(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitEnumBody(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumBody")
public interface EnumBody extends TypeScriptGen {

    @Relation("HAS_ENUM_MEMBER_LIST")
    EnumMemberList getEnumMemberList();

    void setEnumMemberList(EnumMemberList setEnumMemberList);

    @Relation("HAS_COMMA")
    TerminalNodeStrings getComma();

    void setComma(TerminalNodeStrings setComma);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
