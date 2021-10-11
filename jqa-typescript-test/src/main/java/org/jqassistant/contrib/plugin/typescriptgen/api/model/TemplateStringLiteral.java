//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;
import java.util.List;

/**
 * Generated from Parser:
 * <pre>
 * public static class TemplateStringLiteralContext extends ParserRuleContext {
 *
 *     public List<TerminalNode> BackTick() {
 *         return getTokens(TypeScriptParser.BackTick);
 *     }
 *
 *     public TerminalNode BackTick(int i) {
 *         return getToken(TypeScriptParser.BackTick, i);
 *     }
 *
 *     public List<TemplateStringAtomContext> templateStringAtom() {
 *         return getRuleContexts(TemplateStringAtomContext.class);
 *     }
 *
 *     public TemplateStringAtomContext templateStringAtom(int i) {
 *         return getRuleContext(TemplateStringAtomContext.class, i);
 *     }
 *
 *     public TemplateStringLiteralContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_templateStringLiteral;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTemplateStringLiteral(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTemplateStringLiteral(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TemplateStringLiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TemplateStringLiteral")
public interface TemplateStringLiteral extends TypeScriptGen {

    @Relation("HAS_BACK_TICK")
    List<TerminalNodeStrings> getBackTick();

    void setBackTick(List<TerminalNodeStrings> setBackTick);

    @Relation("HAS_TEMPLATE_STRING_ATOM")
    List<TemplateStringAtom> getTemplateStringAtom();

    void setTemplateStringAtom(List<TemplateStringAtom> setTemplateStringAtom);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
