//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE identifierOrKeyWord (BLOCK (ALT Identifier) (ALT TypeAlias) (ALT Require)))
 * </pre>
 *
 * <pre>
 * identifierOrKeyWord
 *     : Identifier
 *     | TypeAlias
 *     | Require
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3535-3549
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#identifierOrKeyWord()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IdentifierOrKeyWordMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IdentifierOrKeyWord")
public interface IdentifierOrKeyWord extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_TYPE_ALIAS")
    TerminalNodeStrings getTypeAlias();

    void setTypeAlias(TerminalNodeStrings setTypeAlias);

    @Relation("HAS_REQUIRE")
    TerminalNodeStrings getRequire();

    void setRequire(TerminalNodeStrings setRequire);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
