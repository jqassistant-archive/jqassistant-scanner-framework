//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class LiteralContext extends ParserRuleContext {
 *
 *     public TerminalNode NullLiteral() {
 *         return getToken(TypeScriptParser.NullLiteral, 0);
 *     }
 *
 *     public TerminalNode BooleanLiteral() {
 *         return getToken(TypeScriptParser.BooleanLiteral, 0);
 *     }
 *
 *     public TerminalNode StringLiteral() {
 *         return getToken(TypeScriptParser.StringLiteral, 0);
 *     }
 *
 *     public TemplateStringLiteralContext templateStringLiteral() {
 *         return getRuleContext(TemplateStringLiteralContext.class, 0);
 *     }
 *
 *     public TerminalNode RegularExpressionLiteral() {
 *         return getToken(TypeScriptParser.RegularExpressionLiteral, 0);
 *     }
 *
 *     public NumericLiteralContext numericLiteral() {
 *         return getRuleContext(NumericLiteralContext.class, 0);
 *     }
 *
 *     public LiteralContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_literal;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterLiteral(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitLiteral(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.LiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Literal")
public interface Literal extends TypeScriptGen {

    @Relation("HAS_NULL_LITERAL")
    TerminalNodeStrings getNullLiteral();

    void setNullLiteral(TerminalNodeStrings setNullLiteral);

    @Relation("HAS_BOOLEAN_LITERAL")
    TerminalNodeStrings getBooleanLiteral();

    void setBooleanLiteral(TerminalNodeStrings setBooleanLiteral);

    @Relation("HAS_STRING_LITERAL")
    TerminalNodeStrings getStringLiteral();

    void setStringLiteral(TerminalNodeStrings setStringLiteral);

    @Relation("HAS_TEMPLATE_STRING_LITERAL")
    TemplateStringLiteral getTemplateStringLiteral();

    void setTemplateStringLiteral(TemplateStringLiteral setTemplateStringLiteral);

    @Relation("HAS_REGULAR_EXPRESSION_LITERAL")
    TerminalNodeStrings getRegularExpressionLiteral();

    void setRegularExpressionLiteral(TerminalNodeStrings setRegularExpressionLiteral);

    @Relation("HAS_NUMERIC_LITERAL")
    NumericLiteral getNumericLiteral();

    void setNumericLiteral(NumericLiteral setNumericLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
