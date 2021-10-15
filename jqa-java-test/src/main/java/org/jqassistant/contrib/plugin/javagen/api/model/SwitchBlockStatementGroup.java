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
 * public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
 *
 *     public SwitchLabelsContext switchLabels() {
 *         return getRuleContext(SwitchLabelsContext.class, 0);
 *     }
 *
 *     public BlockStatementsContext blockStatements() {
 *         return getRuleContext(BlockStatementsContext.class, 0);
 *     }
 *
 *     public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_switchBlockStatementGroup;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterSwitchBlockStatementGroup(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitSwitchBlockStatementGroup(this);
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
@Label("SwitchBlockStatementGroup")
public interface SwitchBlockStatementGroup extends JavaGen {

    @Relation("HAS_SWITCH_LABELS")
    SwitchLabels getSwitchLabels();

    void setSwitchLabels(SwitchLabels setSwitchLabels);

    @Relation("HAS_BLOCK_STATEMENTS")
    BlockStatements getBlockStatements();

    void setBlockStatements(BlockStatements setBlockStatements);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
