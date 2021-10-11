//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class FunctionTypeContext extends ParserRuleContext {
 *
 *     public TerminalNode OpenParen() {
 *         return getToken(TypeScriptParser.OpenParen, 0);
 *     }
 *
 *     public TerminalNode CloseParen() {
 *         return getToken(TypeScriptParser.CloseParen, 0);
 *     }
 *
 *     public TerminalNode ARROW() {
 *         return getToken(TypeScriptParser.ARROW, 0);
 *     }
 *
 *     public Type_Context type_() {
 *         return getRuleContext(Type_Context.class, 0);
 *     }
 *
 *     public TypeParametersContext typeParameters() {
 *         return getRuleContext(TypeParametersContext.class, 0);
 *     }
 *
 *     public ParameterListContext parameterList() {
 *         return getRuleContext(ParameterListContext.class, 0);
 *     }
 *
 *     public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_functionType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterFunctionType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitFunctionType(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FunctionTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FunctionType")
public interface FunctionType extends TypeScriptGen {

    @Relation("HAS_OPEN_PAREN")
    TerminalNodeStrings getOpenParen();

    void setOpenParen(TerminalNodeStrings setOpenParen);

    @Relation("HAS_CLOSE_PAREN")
    TerminalNodeStrings getCloseParen();

    void setCloseParen(TerminalNodeStrings setCloseParen);

    @Relation("HAS_A_R_R_O_W")
    TerminalNodeStrings getARROW();

    void setARROW(TerminalNodeStrings setARROW);

    @Relation("HAS_TYPE")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_PARAMETER_LIST")
    ParameterList getParameterList();

    void setParameterList(ParameterList setParameterList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
