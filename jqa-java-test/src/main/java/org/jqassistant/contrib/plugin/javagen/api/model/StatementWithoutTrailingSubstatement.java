//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE statementWithoutTrailingSubstatement (BLOCK (ALT block) (ALT emptyStatement) (ALT expressionStatement) (ALT assertStatement) (ALT switchStatement) (ALT doStatement) (ALT breakStatement) (ALT continueStatement) (ALT returnStatement) (ALT synchronizedStatement) (ALT throwStatement) (ALT tryStatement)))
 * </pre>
 *
 * <pre>
 * statementWithoutTrailingSubstatement
 * 	:	block
 * 	|	emptyStatement
 * 	|	expressionStatement
 * 	|	assertStatement
 * 	|	switchStatement
 * 	|	doStatement
 * 	|	breakStatement
 * 	|	continueStatement
 * 	|	returnStatement
 * 	|	synchronizedStatement
 * 	|	throwStatement
 * 	|	tryStatement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2240-2290
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#statementWithoutTrailingSubstatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.StatementWithoutTrailingSubstatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("StatementWithoutTrailingSubstatement")
public interface StatementWithoutTrailingSubstatement extends JavaGen {

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block block);

    @Relation("HAS_EMPTY_STATEMENT")
    EmptyStatement getEmptyStatement();

    void setEmptyStatement(EmptyStatement emptyStatement);

    @Relation("HAS_EXPRESSION_STATEMENT")
    ExpressionStatement getExpressionStatement();

    void setExpressionStatement(ExpressionStatement expressionStatement);

    @Relation("HAS_ASSERT_STATEMENT")
    AssertStatement getAssertStatement();

    void setAssertStatement(AssertStatement assertStatement);

    @Relation("HAS_SWITCH_STATEMENT")
    SwitchStatement getSwitchStatement();

    void setSwitchStatement(SwitchStatement switchStatement);

    @Relation("HAS_DO_STATEMENT")
    DoStatement getDoStatement();

    void setDoStatement(DoStatement doStatement);

    @Relation("HAS_BREAK_STATEMENT")
    BreakStatement getBreakStatement();

    void setBreakStatement(BreakStatement breakStatement);

    @Relation("HAS_CONTINUE_STATEMENT")
    ContinueStatement getContinueStatement();

    void setContinueStatement(ContinueStatement continueStatement);

    @Relation("HAS_RETURN_STATEMENT")
    ReturnStatement getReturnStatement();

    void setReturnStatement(ReturnStatement returnStatement);

    @Relation("HAS_SYNCHRONIZED_STATEMENT")
    SynchronizedStatement getSynchronizedStatement();

    void setSynchronizedStatement(SynchronizedStatement synchronizedStatement);

    @Relation("HAS_THROW_STATEMENT")
    ThrowStatement getThrowStatement();

    void setThrowStatement(ThrowStatement throwStatement);

    @Relation("HAS_TRY_STATEMENT")
    TryStatement getTryStatement();

    void setTryStatement(TryStatement tryStatement);
}
