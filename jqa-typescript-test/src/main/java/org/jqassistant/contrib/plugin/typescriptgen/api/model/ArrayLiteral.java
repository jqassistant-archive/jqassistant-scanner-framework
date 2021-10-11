//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class ArrayLiteralContext extends ParserRuleContext {
 *
 *     public TerminalNode OpenBracket() {
 *         return getToken(TypeScriptParser.OpenBracket, 0);
 *     }
 *
 *     public TerminalNode CloseBracket() {
 *         return getToken(TypeScriptParser.CloseBracket, 0);
 *     }
 *
 *     public ElementListContext elementList() {
 *         return getRuleContext(ElementListContext.class, 0);
 *     }
 *
 *     public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_arrayLiteral;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterArrayLiteral(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitArrayLiteral(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ArrayLiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrayLiteral")
public interface ArrayLiteral extends TypeScriptGen {

    @Relation("HAS_OPEN_BRACKET")
    TerminalNodeStrings getOpenBracket();

    void setOpenBracket(TerminalNodeStrings setOpenBracket);

    @Relation("HAS_CLOSE_BRACKET")
    TerminalNodeStrings getCloseBracket();

    void setCloseBracket(TerminalNodeStrings setCloseBracket);

    @Relation("HAS_ELEMENT_LIST")
    ElementList getElementList();

    void setElementList(ElementList setElementList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
