//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;
import java.util.List;

/**
 * Generated from Parser:
 * <pre>
 * public static class IfStatementContext extends ParserRuleContext {
 *
 *     public TerminalNode If() {
 *         return getToken(TypeScriptParser.If, 0);
 *     }
 *
 *     public TerminalNode OpenParen() {
 *         return getToken(TypeScriptParser.OpenParen, 0);
 *     }
 *
 *     public ExpressionSequenceContext expressionSequence() {
 *         return getRuleContext(ExpressionSequenceContext.class, 0);
 *     }
 *
 *     public TerminalNode CloseParen() {
 *         return getToken(TypeScriptParser.CloseParen, 0);
 *     }
 *
 *     public List<StatementContext> statement() {
 *         return getRuleContexts(StatementContext.class);
 *     }
 *
 *     public StatementContext statement(int i) {
 *         return getRuleContext(StatementContext.class, i);
 *     }
 *
 *     public TerminalNode Else() {
 *         return getToken(TypeScriptParser.Else, 0);
 *     }
 *
 *     public IfStatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_ifStatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterIfStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitIfStatement(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IfStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IfStatement")
public interface IfStatement extends TypeScriptGen {

    @Relation("HAS_IF")
    TerminalNodeStrings getIf();

    void setIf(TerminalNodeStrings setIf);

    @Relation("HAS_OPEN_PAREN")
    TerminalNodeStrings getOpenParen();

    void setOpenParen(TerminalNodeStrings setOpenParen);

    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    @Relation("HAS_CLOSE_PAREN")
    TerminalNodeStrings getCloseParen();

    void setCloseParen(TerminalNodeStrings setCloseParen);

    @Relation("HAS_STATEMENT")
    List<Statement> getStatement();

    void setStatement(List<Statement> setStatement);

    @Relation("HAS_ELSE")
    TerminalNodeStrings getElse();

    void setElse(TerminalNodeStrings setElse);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
