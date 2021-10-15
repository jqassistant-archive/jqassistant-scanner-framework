//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class CatchClauseContext extends ParserRuleContext {
 *
 *     public TerminalNode CATCH() {
 *         return getToken(Java8Parser.CATCH, 0);
 *     }
 *
 *     public TerminalNode LPAREN() {
 *         return getToken(Java8Parser.LPAREN, 0);
 *     }
 *
 *     public CatchFormalParameterContext catchFormalParameter() {
 *         return getRuleContext(CatchFormalParameterContext.class, 0);
 *     }
 *
 *     public TerminalNode RPAREN() {
 *         return getToken(Java8Parser.RPAREN, 0);
 *     }
 *
 *     public BlockContext block() {
 *         return getRuleContext(BlockContext.class, 0);
 *     }
 *
 *     public CatchClauseContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_catchClause;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterCatchClause(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitCatchClause(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CatchClause")
public interface CatchClause extends JavaGen {

    @Relation("HAS_CATCH")
    TerminalNodeStrings getCATCH();

    void setCATCH(TerminalNodeStrings setCATCH);

    @Relation("HAS_LPAREN")
    TerminalNodeStrings getLPAREN();

    void setLPAREN(TerminalNodeStrings setLPAREN);

    @Relation("HAS_CATCH_FORMAL_PARAMETER")
    CatchFormalParameter getCatchFormalParameter();

    void setCatchFormalParameter(CatchFormalParameter setCatchFormalParameter);

    @Relation("HAS_RPAREN")
    TerminalNodeStrings getRPAREN();

    void setRPAREN(TerminalNodeStrings setRPAREN);

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
