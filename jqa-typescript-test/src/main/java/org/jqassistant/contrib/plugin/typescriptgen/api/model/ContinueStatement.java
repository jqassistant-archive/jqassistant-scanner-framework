//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE continueStatement (BLOCK (ALT Continue (? (BLOCK (ALT {this.notLineTerminator()}? Identifier))) eos)))
 * </pre>
 *
 * <pre>
 * continueStatement
 *     : Continue ({this.notLineTerminator()}? Identifier)? eos
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1715-1730
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#continueStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ContinueStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ContinueStatement")
public interface ContinueStatement extends TypeScriptGen {

    @Relation("HAS_CONTINUE")
    TerminalNodeStrings getContinue();

    void setContinue(TerminalNodeStrings setContinue);

    // optional: ?
    // unhandled AST type: 59 - list: false : {this.notLineTerminator()}?
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled ast: Eos
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
