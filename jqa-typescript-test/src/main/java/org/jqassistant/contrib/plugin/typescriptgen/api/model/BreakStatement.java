//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE breakStatement (BLOCK (ALT Break (? (BLOCK (ALT {this.notLineTerminator()}? Identifier))) eos)))
 * </pre>
 *
 * <pre>
 * breakStatement
 *     : Break ({this.notLineTerminator()}? Identifier)? eos
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1732-1747
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#breakStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.BreakStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("BreakStatement")
public interface BreakStatement extends TypeScriptGen {

    @Relation("HAS_BREAK")
    TerminalNodeStrings getBreakDescriptor();

    void setBreak(TerminalNodeStrings setBreak);

    // optional: ?
    // unhandled AST type: 59 - list: false : {this.notLineTerminator()}?
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled ast: eos
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
