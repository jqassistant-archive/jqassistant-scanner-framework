//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;
import java.util.List;

/**
 * Generated from Parser:
 * <pre>
 * public static class TypeQueryExpressionContext extends ParserRuleContext {
 *
 *     public TerminalNode Identifier() {
 *         return getToken(TypeScriptParser.Identifier, 0);
 *     }
 *
 *     public List<IdentifierNameContext> identifierName() {
 *         return getRuleContexts(IdentifierNameContext.class);
 *     }
 *
 *     public IdentifierNameContext identifierName(int i) {
 *         return getRuleContext(IdentifierNameContext.class, i);
 *     }
 *
 *     public List<TerminalNode> Dot() {
 *         return getTokens(TypeScriptParser.Dot);
 *     }
 *
 *     public TerminalNode Dot(int i) {
 *         return getToken(TypeScriptParser.Dot, i);
 *     }
 *
 *     public TypeQueryExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeQueryExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTypeQueryExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTypeQueryExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeQueryExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeQueryExpression")
public interface TypeQueryExpression extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_IDENTIFIER_NAME")
    List<IdentifierName> getIdentifierName();

    void setIdentifierName(List<IdentifierName> setIdentifierName);

    @Relation("HAS_DOT")
    List<TerminalNodeStrings> getDot();

    void setDot(List<TerminalNodeStrings> setDot);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
