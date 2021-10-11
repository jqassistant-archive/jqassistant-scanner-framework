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
 * public static class CaseClausesContext extends ParserRuleContext {
 *
 *     public List<CaseClauseContext> caseClause() {
 *         return getRuleContexts(CaseClauseContext.class);
 *     }
 *
 *     public CaseClauseContext caseClause(int i) {
 *         return getRuleContext(CaseClauseContext.class, i);
 *     }
 *
 *     public CaseClausesContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_caseClauses;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterCaseClauses(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitCaseClauses(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.CaseClausesMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CaseClauses")
public interface CaseClauses extends TypeScriptGen {

    @Relation("HAS_CASE_CLAUSE")
    List<CaseClause> getCaseClause();

    void setCaseClause(List<CaseClause> setCaseClause);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
