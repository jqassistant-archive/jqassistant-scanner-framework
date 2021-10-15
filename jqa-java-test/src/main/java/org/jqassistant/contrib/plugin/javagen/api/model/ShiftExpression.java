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
 * public static class ShiftExpressionContext extends ParserRuleContext {
 *
 *     public AdditiveExpressionContext additiveExpression() {
 *         return getRuleContext(AdditiveExpressionContext.class, 0);
 *     }
 *
 *     public ShiftExpressionContext shiftExpression() {
 *         return getRuleContext(ShiftExpressionContext.class, 0);
 *     }
 *
 *     public List<TerminalNode> LT() {
 *         return getTokens(Java8Parser.LT);
 *     }
 *
 *     public TerminalNode LT(int i) {
 *         return getToken(Java8Parser.LT, i);
 *     }
 *
 *     public List<TerminalNode> GT() {
 *         return getTokens(Java8Parser.GT);
 *     }
 *
 *     public TerminalNode GT(int i) {
 *         return getToken(Java8Parser.GT, i);
 *     }
 *
 *     public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_shiftExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterShiftExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitShiftExpression(this);
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
@Label("ShiftExpression")
public interface ShiftExpression extends JavaGen {

    @Relation("HAS_ADDITIVE_EXPRESSION")
    AdditiveExpression getAdditiveExpression();

    void setAdditiveExpression(AdditiveExpression setAdditiveExpression);

    @Relation("HAS_SHIFT_EXPRESSION")
    ShiftExpression getShiftExpression();

    void setShiftExpression(ShiftExpression setShiftExpression);

    @Relation("HAS_LT")
    List<TerminalNodeStrings> getLT();

    void setLT(List<TerminalNodeStrings> setLT);

    @Relation("HAS_GT")
    List<TerminalNodeStrings> getGT();

    void setGT(List<TerminalNodeStrings> setGT);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
