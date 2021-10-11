//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class InitializerContext extends ParserRuleContext {
 *
 *     public TerminalNode Assign() {
 *         return getToken(TypeScriptParser.Assign, 0);
 *     }
 *
 *     public SingleExpressionContext singleExpression() {
 *         return getRuleContext(SingleExpressionContext.class, 0);
 *     }
 *
 *     public InitializerContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_initializer;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterInitializer(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitInitializer(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.InitializerMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Initializer")
public interface Initializer extends TypeScriptGen {

    @Relation("HAS_ASSIGN")
    TerminalNodeStrings getAssign();

    void setAssign(TerminalNodeStrings setAssign);

    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
