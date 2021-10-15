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
 * public static class StatementContext extends ParserRuleContext {
 *
 *     public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
 *         return getRuleContext(StatementWithoutTrailingSubstatementContext.class, 0);
 *     }
 *
 *     public LabeledStatementContext labeledStatement() {
 *         return getRuleContext(LabeledStatementContext.class, 0);
 *     }
 *
 *     public IfThenStatementContext ifThenStatement() {
 *         return getRuleContext(IfThenStatementContext.class, 0);
 *     }
 *
 *     public IfThenElseStatementContext ifThenElseStatement() {
 *         return getRuleContext(IfThenElseStatementContext.class, 0);
 *     }
 *
 *     public WhileStatementContext whileStatement() {
 *         return getRuleContext(WhileStatementContext.class, 0);
 *     }
 *
 *     public ForStatementContext forStatement() {
 *         return getRuleContext(ForStatementContext.class, 0);
 *     }
 *
 *     public StatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_statement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitStatement(this);
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
@Label("Statement")
public interface Statement extends JavaGen {

    @Relation("HAS_STATEMENT_WITHOUT_TRAILING_SUBSTATEMENT")
    StatementWithoutTrailingSubstatement getStatementWithoutTrailingSubstatement();

    void setStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatement setStatementWithoutTrailingSubstatement);

    @Relation("HAS_LABELED_STATEMENT")
    LabeledStatement getLabeledStatement();

    void setLabeledStatement(LabeledStatement setLabeledStatement);

    @Relation("HAS_IF_THEN_STATEMENT")
    IfThenStatement getIfThenStatement();

    void setIfThenStatement(IfThenStatement setIfThenStatement);

    @Relation("HAS_IF_THEN_ELSE_STATEMENT")
    IfThenElseStatement getIfThenElseStatement();

    void setIfThenElseStatement(IfThenElseStatement setIfThenElseStatement);

    @Relation("HAS_WHILE_STATEMENT")
    WhileStatement getWhileStatement();

    void setWhileStatement(WhileStatement setWhileStatement);

    @Relation("HAS_FOR_STATEMENT")
    ForStatement getForStatement();

    void setForStatement(ForStatement setForStatement);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
