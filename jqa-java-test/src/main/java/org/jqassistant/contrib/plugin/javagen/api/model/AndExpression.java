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
 * public static class AndExpressionContext extends ParserRuleContext {
 *
 *     public EqualityExpressionContext equalityExpression() {
 *         return getRuleContext(EqualityExpressionContext.class, 0);
 *     }
 *
 *     public AndExpressionContext andExpression() {
 *         return getRuleContext(AndExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode BITAND() {
 *         return getToken(Java8Parser.BITAND, 0);
 *     }
 *
 *     public AndExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_andExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAndExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAndExpression(this);
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
@Label("AndExpression")
public interface AndExpression extends JavaGen {

    @Relation("HAS_EQUALITY_EXPRESSION")
    EqualityExpression getEqualityExpression();

    void setEqualityExpression(EqualityExpression setEqualityExpression);

    @Relation("HAS_AND_EXPRESSION")
    AndExpression getAndExpression();

    void setAndExpression(AndExpression setAndExpression);

    @Relation("HAS_BITAND")
    TerminalNodeStrings getBITAND();

    void setBITAND(TerminalNodeStrings setBITAND);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
