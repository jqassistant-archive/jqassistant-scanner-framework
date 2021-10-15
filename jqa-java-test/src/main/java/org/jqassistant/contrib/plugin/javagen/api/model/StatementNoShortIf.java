//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class StatementNoShortIfContext extends ParserRuleContext {
 *
 *     public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
 *         return getRuleContext(StatementWithoutTrailingSubstatementContext.class, 0);
 *     }
 *
 *     public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
 *         return getRuleContext(LabeledStatementNoShortIfContext.class, 0);
 *     }
 *
 *     public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
 *         return getRuleContext(IfThenElseStatementNoShortIfContext.class, 0);
 *     }
 *
 *     public WhileStatementNoShortIfContext whileStatementNoShortIf() {
 *         return getRuleContext(WhileStatementNoShortIfContext.class, 0);
 *     }
 *
 *     public ForStatementNoShortIfContext forStatementNoShortIf() {
 *         return getRuleContext(ForStatementNoShortIfContext.class, 0);
 *     }
 *
 *     public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_statementNoShortIf;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterStatementNoShortIf(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitStatementNoShortIf(this);
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
@Label("StatementNoShortIf")
public interface StatementNoShortIf extends JavaGen {

    @Relation("HAS_STATEMENT_WITHOUT_TRAILING_SUBSTATEMENT")
    StatementWithoutTrailingSubstatement getStatementWithoutTrailingSubstatement();

    void setStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatement setStatementWithoutTrailingSubstatement);

    @Relation("HAS_LABELED_STATEMENT_NO_SHORT_IF")
    LabeledStatementNoShortIf getLabeledStatementNoShortIf();

    void setLabeledStatementNoShortIf(LabeledStatementNoShortIf setLabeledStatementNoShortIf);

    @Relation("HAS_IF_THEN_ELSE_STATEMENT_NO_SHORT_IF")
    IfThenElseStatementNoShortIf getIfThenElseStatementNoShortIf();

    void setIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIf setIfThenElseStatementNoShortIf);

    @Relation("HAS_WHILE_STATEMENT_NO_SHORT_IF")
    WhileStatementNoShortIf getWhileStatementNoShortIf();

    void setWhileStatementNoShortIf(WhileStatementNoShortIf setWhileStatementNoShortIf);

    @Relation("HAS_FOR_STATEMENT_NO_SHORT_IF")
    ForStatementNoShortIf getForStatementNoShortIf();

    void setForStatementNoShortIf(ForStatementNoShortIf setForStatementNoShortIf);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
