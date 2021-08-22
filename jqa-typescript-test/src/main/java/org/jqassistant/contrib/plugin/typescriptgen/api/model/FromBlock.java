//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE fromBlock (BLOCK (ALT (BLOCK (ALT Multiply) (ALT multipleImportStatement)) (? (BLOCK (ALT As identifierName))) From StringLiteral eos)))
 * </pre>
 *
 * <pre>
 * fromBlock
 *     : (Multiply | multipleImportStatement) (As identifierName)? From StringLiteral eos
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1336-1361
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#fromBlock()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FromBlockMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FromBlock")
public interface FromBlock extends TypeScriptGen {

    @Relation("HAS_MULTIPLY")
    TerminalNodeStrings getMultiply();

    void setMultiply(TerminalNodeStrings setMultiply);

    @Relation("HAS_MULTIPLE_IMPORT_STATEMENT")
    MultipleImportStatement getMultipleImportStatement();

    void setMultipleImportStatement(MultipleImportStatement setMultipleImportStatement);

    // optional: ?
    @Relation("HAS_AS")
    TerminalNodeStrings getAs();

    void setAs(TerminalNodeStrings setAs);

    @Relation("HAS_IDENTIFIER_NAME")
    IdentifierName getIdentifierName();

    void setIdentifierName(IdentifierName setIdentifierName);

    @Relation("HAS_FROM")
    TerminalNodeStrings getFrom();

    void setFrom(TerminalNodeStrings setFrom);

    @Relation("HAS_STRING_LITERAL")
    TerminalNodeStrings getStringLiteral();

    void setStringLiteral(TerminalNodeStrings setStringLiteral);

    // unhandled ast: Eos
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
