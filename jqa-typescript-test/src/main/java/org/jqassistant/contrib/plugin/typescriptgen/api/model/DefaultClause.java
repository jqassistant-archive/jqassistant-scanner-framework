//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class DefaultClauseContext extends ParserRuleContext {
 *
 *     public TerminalNode Default() {
 *         return getToken(TypeScriptParser.Default, 0);
 *     }
 *
 *     public TerminalNode Colon() {
 *         return getToken(TypeScriptParser.Colon, 0);
 *     }
 *
 *     public StatementListContext statementList() {
 *         return getRuleContext(StatementListContext.class, 0);
 *     }
 *
 *     public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_defaultClause;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterDefaultClause(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitDefaultClause(this);
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
@Label("DefaultClause")
public interface DefaultClause extends TypeScriptGen {

    @Relation("HAS_DEFAULT")
    TerminalNodeStrings getDefault();

    void setDefault(TerminalNodeStrings setDefault);

    @Relation("HAS_COLON")
    TerminalNodeStrings getColon();

    void setColon(TerminalNodeStrings setColon);

    @Relation("HAS_STATEMENT_LIST")
    StatementList getStatementList();

    void setStatementList(StatementList setStatementList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
