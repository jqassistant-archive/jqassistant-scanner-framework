//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class DebuggerStatementContext extends ParserRuleContext {
 *
 *     public TerminalNode Debugger() {
 *         return getToken(TypeScriptParser.Debugger, 0);
 *     }
 *
 *     public EosContext eos() {
 *         return getRuleContext(EosContext.class, 0);
 *     }
 *
 *     public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_debuggerStatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterDebuggerStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitDebuggerStatement(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.DebuggerStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("DebuggerStatement")
public interface DebuggerStatement extends TypeScriptGen {

    @Relation("HAS_DEBUGGER")
    TerminalNodeStrings getDebugger();

    void setDebugger(TerminalNodeStrings setDebugger);

    @Relation("HAS_EOS")
    Eos getEos();

    void setEos(Eos setEos);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
