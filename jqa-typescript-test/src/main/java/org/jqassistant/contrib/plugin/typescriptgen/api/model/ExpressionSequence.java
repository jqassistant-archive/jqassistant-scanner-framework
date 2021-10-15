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
 * public static class ExpressionSequenceContext extends ParserRuleContext {
 *
 *     public List<SingleExpressionContext> singleExpression() {
 *         return getRuleContexts(SingleExpressionContext.class);
 *     }
 *
 *     public SingleExpressionContext singleExpression(int i) {
 *         return getRuleContext(SingleExpressionContext.class, i);
 *     }
 *
 *     public List<TerminalNode> Comma() {
 *         return getTokens(TypeScriptParser.Comma);
 *     }
 *
 *     public TerminalNode Comma(int i) {
 *         return getToken(TypeScriptParser.Comma, i);
 *     }
 *
 *     public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_expressionSequence;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterExpressionSequence(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitExpressionSequence(this);
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
@Label("ExpressionSequence")
public interface ExpressionSequence extends TypeScriptGen {

    @Relation("HAS_SINGLE_EXPRESSION")
    List<SingleExpression> getSingleExpression();

    void setSingleExpression(List<SingleExpression> setSingleExpression);

    @Relation("HAS_COMMA")
    List<TerminalNodeStrings> getComma();

    void setComma(List<TerminalNodeStrings> setComma);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
