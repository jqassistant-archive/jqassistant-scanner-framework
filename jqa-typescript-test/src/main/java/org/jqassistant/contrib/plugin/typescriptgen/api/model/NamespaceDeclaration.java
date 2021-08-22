//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE namespaceDeclaration (BLOCK (ALT Namespace namespaceName '{' (? (BLOCK (ALT statementList))) '}')))
 * </pre>
 *
 * <pre>
 * namespaceDeclaration
 *     : Namespace namespaceName '{' statementList? '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1015-1030
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#namespaceDeclaration()
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

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_STATEMENT_LIST")
    StatementList getStatementList();

    void setStatementList(StatementList setStatementList);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
