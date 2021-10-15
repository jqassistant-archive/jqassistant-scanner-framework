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
 * public static class AsExpressionContext extends ParserRuleContext {
 *
 *     public PredefinedTypeContext predefinedType() {
 *         return getRuleContext(PredefinedTypeContext.class, 0);
 *     }
 *
 *     public TerminalNode OpenBracket() {
 *         return getToken(TypeScriptParser.OpenBracket, 0);
 *     }
 *
 *     public TerminalNode CloseBracket() {
 *         return getToken(TypeScriptParser.CloseBracket, 0);
 *     }
 *
 *     public SingleExpressionContext singleExpression() {
 *         return getRuleContext(SingleExpressionContext.class, 0);
 *     }
 *
 *     public AsExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_asExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterAsExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitAsExpression(this);
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
@Label("AsExpression")
public interface AsExpression extends TypeScriptGen {

    @Relation("HAS_PREDEFINED_TYPE")
    PredefinedType getPredefinedType();

    void setPredefinedType(PredefinedType setPredefinedType);

    @Relation("HAS_OPEN_BRACKET")
    TerminalNodeStrings getOpenBracket();

    void setOpenBracket(TerminalNodeStrings setOpenBracket);

    @Relation("HAS_CLOSE_BRACKET")
    TerminalNodeStrings getCloseBracket();

    void setCloseBracket(TerminalNodeStrings setCloseBracket);

    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
