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
 * public static class TypeBodyContext extends ParserRuleContext {
 *
 *     public TypeMemberListContext typeMemberList() {
 *         return getRuleContext(TypeMemberListContext.class, 0);
 *     }
 *
 *     public TerminalNode SemiColon() {
 *         return getToken(TypeScriptParser.SemiColon, 0);
 *     }
 *
 *     public TerminalNode Comma() {
 *         return getToken(TypeScriptParser.Comma, 0);
 *     }
 *
 *     public TypeBodyContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeBody;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTypeBody(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTypeBody(this);
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
@Label("TypeBody")
public interface TypeBody extends TypeScriptGen {

    @Relation("HAS_TYPE_MEMBER_LIST")
    TypeMemberList getTypeMemberList();

    void setTypeMemberList(TypeMemberList setTypeMemberList);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_COMMA")
    TerminalNodeStrings getComma();

    void setComma(TerminalNodeStrings setComma);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
