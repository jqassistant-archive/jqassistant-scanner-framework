//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class NamespaceDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode Namespace() {
 *         return getToken(TypeScriptParser.Namespace, 0);
 *     }
 *
 *     public NamespaceNameContext namespaceName() {
 *         return getRuleContext(NamespaceNameContext.class, 0);
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
 *     public StatementListContext statementList() {
 *         return getRuleContext(StatementListContext.class, 0);
 *     }
 *
 *     public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_namespaceDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterNamespaceDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitNamespaceDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.NamespaceDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("NamespaceDeclaration")
public interface NamespaceDeclaration extends TypeScriptGen {

    @Relation("HAS_NAMESPACE")
    TerminalNodeStrings getNamespace();

    void setNamespace(TerminalNodeStrings setNamespace);

    @Relation("HAS_NAMESPACE_NAME")
    NamespaceName getNamespaceName();

    void setNamespaceName(NamespaceName setNamespaceName);

    @Relation("HAS_OPEN_BRACE")
    TerminalNodeStrings getOpenBrace();

    void setOpenBrace(TerminalNodeStrings setOpenBrace);

    @Relation("HAS_CLOSE_BRACE")
    TerminalNodeStrings getCloseBrace();

    void setCloseBrace(TerminalNodeStrings setCloseBrace);

    @Relation("HAS_STATEMENT_LIST")
    StatementList getStatementList();

    void setStatementList(StatementList setStatementList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
