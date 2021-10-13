//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class FormalParameterListContext extends ParserRuleContext {
 *
 *     public ReceiverParameterContext receiverParameter() {
 *         return getRuleContext(ReceiverParameterContext.class, 0);
 *     }
 *
 *     public FormalParametersContext formalParameters() {
 *         return getRuleContext(FormalParametersContext.class, 0);
 *     }
 *
 *     public TerminalNode COMMA() {
 *         return getToken(Java8Parser.COMMA, 0);
 *     }
 *
 *     public LastFormalParameterContext lastFormalParameter() {
 *         return getRuleContext(LastFormalParameterContext.class, 0);
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
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterFormalParameterList(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitFormalParameterList(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FormalParameterListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FormalParameterList")
public interface FormalParameterList extends JavaGen {

    @Relation("HAS_RECEIVER_PARAMETER")
    ReceiverParameter getReceiverParameter();

    void setReceiverParameter(ReceiverParameter setReceiverParameter);

    @Relation("HAS_FORMAL_PARAMETERS")
    FormalParameters getFormalParameters();

    void setFormalParameters(FormalParameters setFormalParameters);

    @Relation("HAS_C_O_M_M_A")
    TerminalNodeStrings getCOMMA();

    void setCOMMA(TerminalNodeStrings setCOMMA);

    @Relation("HAS_LAST_FORMAL_PARAMETER")
    LastFormalParameter getLastFormalParameter();

    void setLastFormalParameter(LastFormalParameter setLastFormalParameter);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
