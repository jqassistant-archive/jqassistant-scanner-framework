//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;
import java.util.List;

/**
 * Generated from Parser:
 * <pre>
 * public static class ArgumentListContext extends ParserRuleContext {
 *
 *     public List<ExpressionContext> expression() {
 *         return getRuleContexts(ExpressionContext.class);
 *     }
 *
 *     public ExpressionContext expression(int i) {
 *         return getRuleContext(ExpressionContext.class, i);
 *     }
 *
 *     public List<TerminalNode> COMMA() {
 *         return getTokens(Java8Parser.COMMA);
 *     }
 *
 *     public TerminalNode COMMA(int i) {
 *         return getToken(Java8Parser.COMMA, i);
 *     }
 *
 *     public ArgumentListContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_argumentList;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterArgumentList(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitArgumentList(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ArgumentListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArgumentList")
public interface ArgumentList extends JavaGen {

    @Relation("HAS_EXPRESSION")
    List<Expression> getExpression();

    void setExpression(List<Expression> setExpression);

    @Relation("HAS_C_O_M_M_A")
    List<TerminalNodeStrings> getCOMMA();

    void setCOMMA(List<TerminalNodeStrings> setCOMMA);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
