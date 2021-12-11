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
 * public static class BitShiftExpressionContext extends SingleExpressionContext {
 *
 *     public List<SingleExpressionContext> singleExpression() {
 *         return getRuleContexts(SingleExpressionContext.class);
 *     }
 *
 *     public SingleExpressionContext singleExpression(int i) {
 *         return getRuleContext(SingleExpressionContext.class, i);
 *     }
 *
 *     public TerminalNode LeftShiftArithmetic() {
 *         return getToken(TypeScriptParser.LeftShiftArithmetic, 0);
 *     }
 *
 *     public TerminalNode RightShiftArithmetic() {
 *         return getToken(TypeScriptParser.RightShiftArithmetic, 0);
 *     }
 *
 *     public TerminalNode RightShiftLogical() {
 *         return getToken(TypeScriptParser.RightShiftLogical, 0);
 *     }
 *
 *     public BitShiftExpressionContext(SingleExpressionContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterBitShiftExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitBitShiftExpression(this);
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
@Label("BitShiftExpression")
public interface BitShiftExpression extends SingleExpression {

    @Relation("HAS_SINGLE_EXPRESSION")
    List<SingleExpression> getSingleExpression();

    void setSingleExpression(List<SingleExpression> setSingleExpression);

    @Relation("HAS_LEFT_SHIFT_ARITHMETIC")
    TerminalNodeStrings getLeftShiftArithmetic();

    void setLeftShiftArithmetic(TerminalNodeStrings setLeftShiftArithmetic);

    @Relation("HAS_RIGHT_SHIFT_ARITHMETIC")
    TerminalNodeStrings getRightShiftArithmetic();

    void setRightShiftArithmetic(TerminalNodeStrings setRightShiftArithmetic);

    @Relation("HAS_RIGHT_SHIFT_LOGICAL")
    TerminalNodeStrings getRightShiftLogical();

    void setRightShiftLogical(TerminalNodeStrings setRightShiftLogical);
}
