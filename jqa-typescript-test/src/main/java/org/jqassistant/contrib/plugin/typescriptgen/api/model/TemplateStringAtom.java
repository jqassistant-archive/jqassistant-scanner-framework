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
 * public static class TemplateStringAtomContext extends ParserRuleContext {
 *
 *     public TerminalNode TemplateStringAtom() {
 *         return getToken(TypeScriptParser.TemplateStringAtom, 0);
 *     }
 *
 *     public TerminalNode TemplateStringStartExpression() {
 *         return getToken(TypeScriptParser.TemplateStringStartExpression, 0);
 *     }
 *
 *     public SingleExpressionContext singleExpression() {
 *         return getRuleContext(SingleExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode TemplateCloseBrace() {
 *         return getToken(TypeScriptParser.TemplateCloseBrace, 0);
 *     }
 *
 *     public TemplateStringAtomContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_templateStringAtom;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTemplateStringAtom(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTemplateStringAtom(this);
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
@Label("TemplateStringAtom")
public interface TemplateStringAtom extends TypeScriptGen {

    @Relation("HAS_TEMPLATE_STRING_ATOM")
    TerminalNodeStrings getTemplateStringAtom();

    void setTemplateStringAtom(TerminalNodeStrings setTemplateStringAtom);

    @Relation("HAS_TEMPLATE_STRING_START_EXPRESSION")
    TerminalNodeStrings getTemplateStringStartExpression();

    void setTemplateStringStartExpression(TerminalNodeStrings setTemplateStringStartExpression);

    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_TEMPLATE_CLOSE_BRACE")
    TerminalNodeStrings getTemplateCloseBrace();

    void setTemplateCloseBrace(TerminalNodeStrings setTemplateCloseBrace);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
