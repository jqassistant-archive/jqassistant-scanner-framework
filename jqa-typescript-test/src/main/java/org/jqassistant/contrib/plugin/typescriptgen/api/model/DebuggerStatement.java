//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE debuggerStatement (BLOCK (ALT Debugger eos)))
 * </pre>
 *
 * <pre>
 * debuggerStatement
 *     : Debugger eos
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1946-1954
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#debuggerStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.DebuggerStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("DebuggerStatement")
public interface DebuggerStatement extends TypeScriptGen {

    @Relation("HAS_DEBUGGER")
    TerminalNodeStrings getDebugger();

    void setDebugger(TerminalNodeStrings setDebugger);

    // unhandled ast: Eos
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
