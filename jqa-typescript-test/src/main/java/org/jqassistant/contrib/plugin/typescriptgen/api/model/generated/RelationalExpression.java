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
 * public static class RelationalExpressionContext extends SingleExpressionContext {
 *
 *     public List<SingleExpressionContext> singleExpression() {
 *         return getRuleContexts(SingleExpressionContext.class);
 *     }
 *
 *     public SingleExpressionContext singleExpression(int i) {
 *         return getRuleContext(SingleExpressionContext.class, i);
 *     }
 *
 *     public TerminalNode LessThan() {
 *         return getToken(TypeScriptParser.LessThan, 0);
 *     }
 *
 *     public TerminalNode MoreThan() {
 *         return getToken(TypeScriptParser.MoreThan, 0);
 *     }
 *
 *     public TerminalNode LessThanEquals() {
 *         return getToken(TypeScriptParser.LessThanEquals, 0);
 *     }
 *
 *     public TerminalNode GreaterThanEquals() {
 *         return getToken(TypeScriptParser.GreaterThanEquals, 0);
 *     }
 *
 *     public RelationalExpressionContext(SingleExpressionContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterRelationalExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitRelationalExpression(this);
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
@Label("RelationalExpression")
public interface RelationalExpression extends SingleExpression {

    @Relation("HAS_SINGLE_EXPRESSION")
    List<SingleExpression> getSingleExpression();

    void setSingleExpression(List<SingleExpression> setSingleExpression);

    @Relation("HAS_LESS_THAN")
    TerminalNodeStrings getLessThan();

    void setLessThan(TerminalNodeStrings setLessThan);

    @Relation("HAS_MORE_THAN")
    TerminalNodeStrings getMoreThan();

    void setMoreThan(TerminalNodeStrings setMoreThan);

    @Relation("HAS_LESS_THAN_EQUALS")
    TerminalNodeStrings getLessThanEquals();

    void setLessThanEquals(TerminalNodeStrings setLessThanEquals);

    @Relation("HAS_GREATER_THAN_EQUALS")
    TerminalNodeStrings getGreaterThanEquals();

    void setGreaterThanEquals(TerminalNodeStrings setGreaterThanEquals);
}
