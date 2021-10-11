//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
 *
 *     public BlockContext block() {
 *         return getRuleContext(BlockContext.class, 0);
 *     }
 *
 *     public EmptyStatementContext emptyStatement() {
 *         return getRuleContext(EmptyStatementContext.class, 0);
 *     }
 *
 *     public ExpressionStatementContext expressionStatement() {
 *         return getRuleContext(ExpressionStatementContext.class, 0);
 *     }
 *
 *     public AssertStatementContext assertStatement() {
 *         return getRuleContext(AssertStatementContext.class, 0);
 *     }
 *
 *     public SwitchStatementContext switchStatement() {
 *         return getRuleContext(SwitchStatementContext.class, 0);
 *     }
 *
 *     public DoStatementContext doStatement() {
 *         return getRuleContext(DoStatementContext.class, 0);
 *     }
 *
 *     public BreakStatementContext breakStatement() {
 *         return getRuleContext(BreakStatementContext.class, 0);
 *     }
 *
 *     public ContinueStatementContext continueStatement() {
 *         return getRuleContext(ContinueStatementContext.class, 0);
 *     }
 *
 *     public ReturnStatementContext returnStatement() {
 *         return getRuleContext(ReturnStatementContext.class, 0);
 *     }
 *
 *     public SynchronizedStatementContext synchronizedStatement() {
 *         return getRuleContext(SynchronizedStatementContext.class, 0);
 *     }
 *
 *     public ThrowStatementContext throwStatement() {
 *         return getRuleContext(ThrowStatementContext.class, 0);
 *     }
 *
 *     public TryStatementContext tryStatement() {
 *         return getRuleContext(TryStatementContext.class, 0);
 *     }
 *
 *     public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_statementWithoutTrailingSubstatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterStatementWithoutTrailingSubstatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitStatementWithoutTrailingSubstatement(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.StatementWithoutTrailingSubstatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("StatementWithoutTrailingSubstatement")
public interface StatementWithoutTrailingSubstatement extends JavaGen {

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    @Relation("HAS_EMPTY_STATEMENT")
    EmptyStatement getEmptyStatement();

    void setEmptyStatement(EmptyStatement setEmptyStatement);

    @Relation("HAS_EXPRESSION_STATEMENT")
    ExpressionStatement getExpressionStatement();

    void setExpressionStatement(ExpressionStatement setExpressionStatement);

    @Relation("HAS_ASSERT_STATEMENT")
    AssertStatement getAssertStatement();

    void setAssertStatement(AssertStatement setAssertStatement);

    @Relation("HAS_SWITCH_STATEMENT")
    SwitchStatement getSwitchStatement();

    void setSwitchStatement(SwitchStatement setSwitchStatement);

    @Relation("HAS_DO_STATEMENT")
    DoStatement getDoStatement();

    void setDoStatement(DoStatement setDoStatement);

    @Relation("HAS_BREAK_STATEMENT")
    BreakStatement getBreakStatement();

    void setBreakStatement(BreakStatement setBreakStatement);

    @Relation("HAS_CONTINUE_STATEMENT")
    ContinueStatement getContinueStatement();

    void setContinueStatement(ContinueStatement setContinueStatement);

    @Relation("HAS_RETURN_STATEMENT")
    ReturnStatement getReturnStatement();

    void setReturnStatement(ReturnStatement setReturnStatement);

    @Relation("HAS_SYNCHRONIZED_STATEMENT")
    SynchronizedStatement getSynchronizedStatement();

    void setSynchronizedStatement(SynchronizedStatement setSynchronizedStatement);

    @Relation("HAS_THROW_STATEMENT")
    ThrowStatement getThrowStatement();

    void setThrowStatement(ThrowStatement setThrowStatement);

    @Relation("HAS_TRY_STATEMENT")
    TryStatement getTryStatement();

    void setTryStatement(TryStatement setTryStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
