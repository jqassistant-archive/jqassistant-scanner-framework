//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class IteratorDefinitionContext extends ParserRuleContext {
 *
 *     public TerminalNode OpenBracket() {
 *         return getToken(TypeScriptParser.OpenBracket, 0);
 *     }
 *
 *     public SingleExpressionContext singleExpression() {
 *         return getRuleContext(SingleExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode CloseBracket() {
 *         return getToken(TypeScriptParser.CloseBracket, 0);
 *     }
 *
 *     public TerminalNode OpenParen() {
 *         return getToken(TypeScriptParser.OpenParen, 0);
 *     }
 *
 *     public TerminalNode CloseParen() {
 *         return getToken(TypeScriptParser.CloseParen, 0);
 *     }
 *
 *     public TerminalNode OpenBrace() {
 *         return getToken(TypeScriptParser.OpenBrace, 0);
 *     }
 *
 *     public FunctionBodyContext functionBody() {
 *         return getRuleContext(FunctionBodyContext.class, 0);
 *     }
 *
 *     public TerminalNode CloseBrace() {
 *         return getToken(TypeScriptParser.CloseBrace, 0);
 *     }
 *
 *     public FormalParameterListContext formalParameterList() {
 *         return getRuleContext(FormalParameterListContext.class, 0);
 *     }
 *
 *     public IteratorDefinitionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_iteratorDefinition;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterIteratorDefinition(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitIteratorDefinition(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IteratorDefinitionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IteratorDefinition")
public interface IteratorDefinition extends TypeScriptGen {

    @Relation("HAS_OPEN_BRACKET")
    TerminalNodeStrings getOpenBracket();

    void setOpenBracket(TerminalNodeStrings setOpenBracket);

    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_CLOSE_BRACKET")
    TerminalNodeStrings getCloseBracket();

    void setCloseBracket(TerminalNodeStrings setCloseBracket);

    @Relation("HAS_OPEN_PAREN")
    TerminalNodeStrings getOpenParen();

    void setOpenParen(TerminalNodeStrings setOpenParen);

    @Relation("HAS_CLOSE_PAREN")
    TerminalNodeStrings getCloseParen();

    void setCloseParen(TerminalNodeStrings setCloseParen);

    @Relation("HAS_OPEN_BRACE")
    TerminalNodeStrings getOpenBrace();

    void setOpenBrace(TerminalNodeStrings setOpenBrace);

    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    @Relation("HAS_CLOSE_BRACE")
    TerminalNodeStrings getCloseBrace();

    void setCloseBrace(TerminalNodeStrings setCloseBrace);

    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList setFormalParameterList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
