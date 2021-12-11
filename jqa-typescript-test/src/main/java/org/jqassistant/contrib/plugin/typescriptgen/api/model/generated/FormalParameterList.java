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
 * public static class FormalParameterListContext extends ParserRuleContext {
 *
 *     public List<FormalParameterArgContext> formalParameterArg() {
 *         return getRuleContexts(FormalParameterArgContext.class);
 *     }
 *
 *     public FormalParameterArgContext formalParameterArg(int i) {
 *         return getRuleContext(FormalParameterArgContext.class, i);
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
 *     public LastFormalParameterArgContext lastFormalParameterArg() {
 *         return getRuleContext(LastFormalParameterArgContext.class, 0);
 *     }
 *
 *     public ArrayLiteralContext arrayLiteral() {
 *         return getRuleContext(ArrayLiteralContext.class, 0);
 *     }
 *
 *     public ObjectLiteralContext objectLiteral() {
 *         return getRuleContext(ObjectLiteralContext.class, 0);
 *     }
 *
 *     public TerminalNode Colon() {
 *         return getToken(TypeScriptParser.Colon, 0);
 *     }
 *
 *     public FormalParameterListContext formalParameterList() {
 *         return getRuleContext(FormalParameterListContext.class, 0);
 *     }
 *
 *     public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_formalParameterList;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterFormalParameterList(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitFormalParameterList(this);
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
@Label("FormalParameterList")
public interface FormalParameterList extends TypeScriptGenAST {

    @Relation("HAS_FORMAL_PARAMETER_ARG")
    List<FormalParameterArg> getFormalParameterArg();

    void setFormalParameterArg(List<FormalParameterArg> setFormalParameterArg);

    @Relation("HAS_COMMA")
    List<TerminalNodeStrings> getComma();

    void setComma(List<TerminalNodeStrings> setComma);

    @Relation("HAS_LAST_FORMAL_PARAMETER_ARG")
    LastFormalParameterArg getLastFormalParameterArg();

    void setLastFormalParameterArg(LastFormalParameterArg setLastFormalParameterArg);

    @Relation("HAS_ARRAY_LITERAL")
    ArrayLiteral getArrayLiteral();

    void setArrayLiteral(ArrayLiteral setArrayLiteral);

    @Relation("HAS_OBJECT_LITERAL")
    ObjectLiteral getObjectLiteral();

    void setObjectLiteral(ObjectLiteral setObjectLiteral);

    @Relation("HAS_COLON")
    TerminalNodeStrings getColon();

    void setColon(TerminalNodeStrings setColon);

    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList setFormalParameterList);
}
