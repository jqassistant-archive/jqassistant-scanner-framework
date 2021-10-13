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
 * public static class ForStatementContext extends ParserRuleContext {
 *
 *     public BasicForStatementContext basicForStatement() {
 *         return getRuleContext(BasicForStatementContext.class, 0);
 *     }
 *
 *     public EnhancedForStatementContext enhancedForStatement() {
 *         return getRuleContext(EnhancedForStatementContext.class, 0);
 *     }
 *
 *     public ForStatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_forStatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterForStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitForStatement(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ForStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ForStatement")
public interface ForStatement extends JavaGen {

    @Relation("HAS_BASIC_FOR_STATEMENT")
    BasicForStatement getBasicForStatement();

    void setBasicForStatement(BasicForStatement setBasicForStatement);

    @Relation("HAS_ENHANCED_FOR_STATEMENT")
    EnhancedForStatement getEnhancedForStatement();

    void setEnhancedForStatement(EnhancedForStatement setEnhancedForStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
