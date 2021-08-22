//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE identifierName (BLOCK (ALT Identifier) (ALT reservedWord)))
 * </pre>
 *
 * <pre>
 * identifierName
 *     : Identifier
 *     | reservedWord
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3523-3533
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#identifierName()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IdentifierNameMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IdentifierName")
public interface IdentifierName extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_RESERVED_WORD")
    ReservedWord getReservedWord();

    void setReservedWord(ReservedWord setReservedWord);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
