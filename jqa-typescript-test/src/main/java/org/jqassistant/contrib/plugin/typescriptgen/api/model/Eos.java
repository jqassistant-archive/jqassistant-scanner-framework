//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE eos (BLOCK (ALT SemiColon) (ALT EOF) (ALT {this.lineTerminatorAhead()}?) (ALT {this.closeBrace()}?)))
 * </pre>
 *
 * <pre>
 * eos
 *     : SemiColon
 *     | EOF
 *     | {this.lineTerminatorAhead()}?
 *     | {this.closeBrace()}?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3791-3809
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#eos()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.EosMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Eos")
public interface Eos extends TypeScriptGen {

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_E_O_F")
    TerminalNodeStrings getEOF();

    void setEOF(TerminalNodeStrings setEOF);

    // unhandled AST type: 59 - list: false : {this.lineTerminatorAhead()}?
    // unhandled AST type: 59 - list: false : {this.closeBrace()}?
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
