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
 * public static class ForStatementNoShortIfContext extends ParserRuleContext {
 *
 *     public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
 *         return getRuleContext(BasicForStatementNoShortIfContext.class, 0);
 *     }
 *
 *     public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
 *         return getRuleContext(EnhancedForStatementNoShortIfContext.class, 0);
 *     }
 *
 *     public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_forStatementNoShortIf;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterForStatementNoShortIf(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitForStatementNoShortIf(this);
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
@Label("ForStatementNoShortIf")
public interface ForStatementNoShortIf extends JavaGen {

    @Relation("HAS_BASIC_FOR_STATEMENT_NO_SHORT_IF")
    BasicForStatementNoShortIf getBasicForStatementNoShortIf();

    void setBasicForStatementNoShortIf(BasicForStatementNoShortIf setBasicForStatementNoShortIf);

    @Relation("HAS_ENHANCED_FOR_STATEMENT_NO_SHORT_IF")
    EnhancedForStatementNoShortIf getEnhancedForStatementNoShortIf();

    void setEnhancedForStatementNoShortIf(EnhancedForStatementNoShortIf setEnhancedForStatementNoShortIf);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
