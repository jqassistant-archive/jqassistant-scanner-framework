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
 * public static class EqualityExpressionContext extends SingleExpressionContext {
 *
 *     public List<SingleExpressionContext> singleExpression() {
 *         return getRuleContexts(SingleExpressionContext.class);
 *     }
 *
 *     public SingleExpressionContext singleExpression(int i) {
 *         return getRuleContext(SingleExpressionContext.class, i);
 *     }
 *
 *     public TerminalNode Equals_() {
 *         return getToken(TypeScriptParser.Equals_, 0);
 *     }
 *
 *     public TerminalNode NotEquals() {
 *         return getToken(TypeScriptParser.NotEquals, 0);
 *     }
 *
 *     public TerminalNode IdentityEquals() {
 *         return getToken(TypeScriptParser.IdentityEquals, 0);
 *     }
 *
 *     public TerminalNode IdentityNotEquals() {
 *         return getToken(TypeScriptParser.IdentityNotEquals, 0);
 *     }
 *
 *     public EqualityExpressionContext(SingleExpressionContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterEqualityExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitEqualityExpression(this);
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
@Label("EqualityExpression")
public interface EqualityExpression extends SingleExpression {

    @Relation("HAS_SINGLE_EXPRESSION")
    List<SingleExpression> getSingleExpression();

    void setSingleExpression(List<SingleExpression> setSingleExpression);

    @Relation("HAS_EQUALS")
    TerminalNodeStrings getEquals_();

    void setEquals_(TerminalNodeStrings setEquals_);

    @Relation("HAS_NOT_EQUALS")
    TerminalNodeStrings getNotEquals();

    void setNotEquals(TerminalNodeStrings setNotEquals);

    @Relation("HAS_IDENTITY_EQUALS")
    TerminalNodeStrings getIdentityEquals();

    void setIdentityEquals(TerminalNodeStrings setIdentityEquals);

    @Relation("HAS_IDENTITY_NOT_EQUALS")
    TerminalNodeStrings getIdentityNotEquals();

    void setIdentityNotEquals(TerminalNodeStrings setIdentityNotEquals);
}
