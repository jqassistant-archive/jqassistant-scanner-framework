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
 * public static class MultiplicativeExpressionContext extends SingleExpressionContext {
 *
 *     public List<SingleExpressionContext> singleExpression() {
 *         return getRuleContexts(SingleExpressionContext.class);
 *     }
 *
 *     public SingleExpressionContext singleExpression(int i) {
 *         return getRuleContext(SingleExpressionContext.class, i);
 *     }
 *
 *     public TerminalNode Multiply() {
 *         return getToken(TypeScriptParser.Multiply, 0);
 *     }
 *
 *     public TerminalNode Divide() {
 *         return getToken(TypeScriptParser.Divide, 0);
 *     }
 *
 *     public TerminalNode Modulus() {
 *         return getToken(TypeScriptParser.Modulus, 0);
 *     }
 *
 *     public MultiplicativeExpressionContext(SingleExpressionContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterMultiplicativeExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitMultiplicativeExpression(this);
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
@Label("MultiplicativeExpression")
public interface MultiplicativeExpression extends SingleExpression {

    @Relation("HAS_SINGLE_EXPRESSION")
    List<SingleExpression> getSingleExpression();

    void setSingleExpression(List<SingleExpression> setSingleExpression);

    @Relation("HAS_MULTIPLY")
    TerminalNodeStrings getMultiply();

    void setMultiply(TerminalNodeStrings setMultiply);

    @Relation("HAS_DIVIDE")
    TerminalNodeStrings getDivide();

    void setDivide(TerminalNodeStrings setDivide);

    @Relation("HAS_MODULUS")
    TerminalNodeStrings getModulus();

    void setModulus(TerminalNodeStrings setModulus);
}
