//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE indexMemberDeclaration (BLOCK (ALT indexSignature SemiColon)))
 * </pre>
 *
 * <pre>
 * indexMemberDeclaration
 *     : indexSignature SemiColon
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2169-2177
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#indexMemberDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IndexMemberDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IndexMemberDeclaration")
public interface IndexMemberDeclaration extends TypeScriptGen {

    @Relation("HAS_INDEX_SIGNATURE")
    IndexSignature getIndexSignature();

    void setIndexSignature(IndexSignature setIndexSignature);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
