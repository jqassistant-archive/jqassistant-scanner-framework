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
 * public static class IteratorBlockContext extends ParserRuleContext {
 *
 *     public TerminalNode OpenBrace() {
 *         return getToken(TypeScriptParser.OpenBrace, 0);
 *     }
 *
 *     public List<IteratorDefinitionContext> iteratorDefinition() {
 *         return getRuleContexts(IteratorDefinitionContext.class);
 *     }
 *
 *     public IteratorDefinitionContext iteratorDefinition(int i) {
 *         return getRuleContext(IteratorDefinitionContext.class, i);
 *     }
 *
 *     public TerminalNode CloseBrace() {
 *         return getToken(TypeScriptParser.CloseBrace, 0);
 *     }
 *
 *     public List<TerminalNode> Comma() {
 *         return getTokens(TypeScriptParser.Comma);
 *     }
 *
 *     public TerminalNode Comma(int i) {
 *         return getToken(TypeScriptParser.Comma, i);
 *     }
 *
 *     public IteratorBlockContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_iteratorBlock;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterIteratorBlock(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitIteratorBlock(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IteratorBlockMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IteratorBlock")
public interface IteratorBlock extends TypeScriptGen {

    @Relation("HAS_OPEN_BRACE")
    TerminalNodeStrings getOpenBrace();

    void setOpenBrace(TerminalNodeStrings setOpenBrace);

    @Relation("HAS_ITERATOR_DEFINITION")
    List<IteratorDefinition> getIteratorDefinition();

    void setIteratorDefinition(List<IteratorDefinition> setIteratorDefinition);

    @Relation("HAS_CLOSE_BRACE")
    TerminalNodeStrings getCloseBrace();

    void setCloseBrace(TerminalNodeStrings setCloseBrace);

    @Relation("HAS_COMMA")
    List<TerminalNodeStrings> getComma();

    void setComma(List<TerminalNodeStrings> setComma);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
