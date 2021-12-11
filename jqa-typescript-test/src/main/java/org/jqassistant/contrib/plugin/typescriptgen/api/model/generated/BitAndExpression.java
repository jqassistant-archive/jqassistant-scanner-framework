//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class BitAndExpressionContext extends SingleExpressionContext {
 *
 *     public List<SingleExpressionContext> singleExpression() {
 *         return getRuleContexts(SingleExpressionContext.class);
 *     }
 *
 *     public SingleExpressionContext singleExpression(int i) {
 *         return getRuleContext(SingleExpressionContext.class, i);
 *     }
 *
 *     public TerminalNode BitAnd() {
 *         return getToken(TypeScriptParser.BitAnd, 0);
 *     }
 *
 *     public BitAndExpressionContext(SingleExpressionContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterBitAndExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitBitAndExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	comments = "REQUIRES_SPECIAL_MAPPING")
@Label("BitAndExpression")
public interface BitAndExpression extends SingleExpression {

    @Relation("HAS_SINGLE_EXPRESSION")
    List<SingleExpression> getSingleExpression();

    void setSingleExpression(List<SingleExpression> setSingleExpression);

    @Relation("HAS_BIT_AND")
    TerminalNodeStrings getBitAnd();

    void setBitAnd(TerminalNodeStrings setBitAnd);
}
