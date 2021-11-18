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
 * public static class TypeMemberListContext extends ParserRuleContext {
 *
 *     public List<TypeMemberContext> typeMember() {
 *         return getRuleContexts(TypeMemberContext.class);
 *     }
 *
 *     public TypeMemberContext typeMember(int i) {
 *         return getRuleContext(TypeMemberContext.class, i);
 *     }
 *
 *     public List<TerminalNode> SemiColon() {
 *         return getTokens(TypeScriptParser.SemiColon);
 *     }
 *
 *     public TerminalNode SemiColon(int i) {
 *         return getToken(TypeScriptParser.SemiColon, i);
 *     }
 *
 *     public List<TerminalNode> Comma() {
 *         return getTokens(TypeScriptParser.Comma);
 *     }
 *
 *     public TerminalNode Comma(int i) {
 *         return getToken(TypeScriptParser.Comma, i);
 *     }
 *
 *     public TypeMemberListContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeMemberList;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTypeMemberList(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTypeMemberList(this);
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
@Label("TypeMemberList")
public interface TypeMemberList extends TypeScriptGen {

    @Relation("HAS_TYPE_MEMBER")
    List<TypeMember> getTypeMember();

    void setTypeMember(List<TypeMember> setTypeMember);

    @Relation("HAS_SEMI_COLON")
    List<TerminalNodeStrings> getSemiColon();

    void setSemiColon(List<TerminalNodeStrings> setSemiColon);

    @Relation("HAS_COMMA")
    List<TerminalNodeStrings> getComma();

    void setComma(List<TerminalNodeStrings> setComma);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
