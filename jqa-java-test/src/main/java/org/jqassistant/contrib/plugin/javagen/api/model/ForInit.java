//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class ForInitContext extends ParserRuleContext {
 *
 *     public StatementExpressionListContext statementExpressionList() {
 *         return getRuleContext(StatementExpressionListContext.class, 0);
 *     }
 *
 *     public LocalVariableDeclarationContext localVariableDeclaration() {
 *         return getRuleContext(LocalVariableDeclarationContext.class, 0);
 *     }
 *
 *     public ForInitContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_forInit;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterForInit(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitForInit(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ForInitMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ForInit")
public interface ForInit extends JavaGen {

    @Relation("HAS_STATEMENT_EXPRESSION_LIST")
    StatementExpressionList getStatementExpressionList();

    void setStatementExpressionList(StatementExpressionList setStatementExpressionList);

    @Relation("HAS_LOCAL_VARIABLE_DECLARATION")
    LocalVariableDeclaration getLocalVariableDeclaration();

    void setLocalVariableDeclaration(LocalVariableDeclaration setLocalVariableDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
