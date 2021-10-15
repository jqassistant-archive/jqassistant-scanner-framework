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
 * public static class AdditiveExpressionContext extends ParserRuleContext {
 *
 *     public MultiplicativeExpressionContext multiplicativeExpression() {
 *         return getRuleContext(MultiplicativeExpressionContext.class, 0);
 *     }
 *
 *     public AdditiveExpressionContext additiveExpression() {
 *         return getRuleContext(AdditiveExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode ADD() {
 *         return getToken(Java8Parser.ADD, 0);
 *     }
 *
 *     public TerminalNode SUB() {
 *         return getToken(Java8Parser.SUB, 0);
 *     }
 *
 *     public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_additiveExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAdditiveExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAdditiveExpression(this);
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
@Label("AdditiveExpression")
public interface AdditiveExpression extends JavaGen {

    @Relation("HAS_MULTIPLICATIVE_EXPRESSION")
    MultiplicativeExpression getMultiplicativeExpression();

    void setMultiplicativeExpression(MultiplicativeExpression setMultiplicativeExpression);

    @Relation("HAS_ADDITIVE_EXPRESSION")
    AdditiveExpression getAdditiveExpression();

    void setAdditiveExpression(AdditiveExpression setAdditiveExpression);

    @Relation("HAS_ADD")
    TerminalNodeStrings getADD();

    void setADD(TerminalNodeStrings setADD);

    @Relation("HAS_SUB")
    TerminalNodeStrings getSUB();

    void setSUB(TerminalNodeStrings setSUB);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
