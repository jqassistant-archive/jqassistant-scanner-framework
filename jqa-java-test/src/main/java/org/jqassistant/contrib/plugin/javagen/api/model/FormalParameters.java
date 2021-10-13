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
 * public static class FormalParametersContext extends ParserRuleContext {
 *
 *     public List<FormalParameterContext> formalParameter() {
 *         return getRuleContexts(FormalParameterContext.class);
 *     }
 *
 *     public FormalParameterContext formalParameter(int i) {
 *         return getRuleContext(FormalParameterContext.class, i);
 *     }
 *
 *     public List<TerminalNode> COMMA() {
 *         return getTokens(Java8Parser.COMMA);
 *     }
 *
 *     public TerminalNode COMMA(int i) {
 *         return getToken(Java8Parser.COMMA, i);
 *     }
 *
 *     public ReceiverParameterContext receiverParameter() {
 *         return getRuleContext(ReceiverParameterContext.class, 0);
 *     }
 *
 *     public FormalParametersContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_formalParameters;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterFormalParameters(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitFormalParameters(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FormalParametersMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FormalParameters")
public interface FormalParameters extends JavaGen {

    @Relation("HAS_FORMAL_PARAMETER")
    List<FormalParameter> getFormalParameter();

    void setFormalParameter(List<FormalParameter> setFormalParameter);

    @Relation("HAS_C_O_M_M_A")
    List<TerminalNodeStrings> getCOMMA();

    void setCOMMA(List<TerminalNodeStrings> setCOMMA);

    @Relation("HAS_RECEIVER_PARAMETER")
    ReceiverParameter getReceiverParameter();

    void setReceiverParameter(ReceiverParameter setReceiverParameter);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
