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
 * public static class CatchesContext extends ParserRuleContext {
 *
 *     public List<CatchClauseContext> catchClause() {
 *         return getRuleContexts(CatchClauseContext.class);
 *     }
 *
 *     public CatchClauseContext catchClause(int i) {
 *         return getRuleContext(CatchClauseContext.class, i);
 *     }
 *
 *     public CatchesContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_catches;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterCatches(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitCatches(this);
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
@Label("Catches")
public interface Catches extends JavaGen {

    @Relation("HAS_CATCH_CLAUSE")
    List<CatchClause> getCatchClause();

    void setCatchClause(List<CatchClause> setCatchClause);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
