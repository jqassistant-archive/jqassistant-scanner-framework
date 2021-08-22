//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeAliasDeclaration (BLOCK (ALT 'type' Identifier (? (BLOCK (ALT typeParameters))) '=' type_ SemiColon)))
 * </pre>
 *
 * <pre>
 * typeAliasDeclaration
 *     : 'type' Identifier typeParameters? '=' type_ SemiColon
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:843-860
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeAliasDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeAliasDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeAliasDeclaration")
public interface TypeAliasDeclaration extends TypeScriptGen {

    // unhandled TerminalAST token: 'type'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // optional: ?
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    // unhandled TerminalAST token: '='
    @Relation("HAS_TYPE")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
