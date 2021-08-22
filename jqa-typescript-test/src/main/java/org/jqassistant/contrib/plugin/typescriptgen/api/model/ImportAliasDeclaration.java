//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE importAliasDeclaration (BLOCK (ALT Identifier '=' namespaceName SemiColon)))
 * </pre>
 *
 * <pre>
 * importAliasDeclaration
 *     : Identifier '=' namespaceName SemiColon
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1048-1060
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#importAliasDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ImportAliasDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ImportAliasDeclaration")
public interface ImportAliasDeclaration extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: '='
    @Relation("HAS_NAMESPACE_NAME")
    NamespaceName getNamespaceName();

    void setNamespaceName(NamespaceName setNamespaceName);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
