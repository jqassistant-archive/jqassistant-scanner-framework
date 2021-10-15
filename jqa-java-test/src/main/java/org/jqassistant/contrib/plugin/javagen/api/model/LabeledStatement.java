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
 * public static class LabeledStatementContext extends ParserRuleContext {
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
 *     }
 *
 *     public TerminalNode COLON() {
 *         return getToken(Java8Parser.COLON, 0);
 *     }
 *
 *     public StatementContext statement() {
 *         return getRuleContext(StatementContext.class, 0);
 *     }
 *
 *     public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_labeledStatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterLabeledStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitLabeledStatement(this);
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
@Label("LabeledStatement")
public interface LabeledStatement extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_COLON")
    TerminalNodeStrings getCOLON();

    void setCOLON(TerminalNodeStrings setCOLON);

    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
