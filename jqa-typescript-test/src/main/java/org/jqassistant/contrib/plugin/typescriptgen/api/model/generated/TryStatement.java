//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class TryStatementContext extends ParserRuleContext {
 *
 *     public TerminalNode Try() {
 *         return getToken(TypeScriptParser.Try, 0);
 *     }
 *
 *     public BlockContext block() {
 *         return getRuleContext(BlockContext.class, 0);
 *     }
 *
 *     public CatchProductionContext catchProduction() {
 *         return getRuleContext(CatchProductionContext.class, 0);
 *     }
 *
 *     public FinallyProductionContext finallyProduction() {
 *         return getRuleContext(FinallyProductionContext.class, 0);
 *     }
 *
 *     public TryStatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_tryStatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTryStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTryStatement(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TryStatement")
public interface TryStatement extends TypeScriptGenAST {

    @Relation("HAS_TRY")
    TerminalNodeStrings getTry();

    void setTry(TerminalNodeStrings setTry);

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    @Relation("HAS_CATCH_PRODUCTION")
    CatchProduction getCatchProduction();

    void setCatchProduction(CatchProduction setCatchProduction);

    @Relation("HAS_FINALLY_PRODUCTION")
    FinallyProduction getFinallyProduction();

    void setFinallyProduction(FinallyProduction setFinallyProduction);
}
