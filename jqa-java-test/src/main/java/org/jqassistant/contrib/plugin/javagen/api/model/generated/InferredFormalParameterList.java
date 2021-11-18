//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class InferredFormalParameterListContext extends ParserRuleContext {
 *
 *     public List<TerminalNode> Identifier() {
 *         return getTokens(Java8Parser.Identifier);
 *     }
 *
 *     public TerminalNode Identifier(int i) {
 *         return getToken(Java8Parser.Identifier, i);
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
 *     public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_inferredFormalParameterList;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterInferredFormalParameterList(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitInferredFormalParameterList(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InferredFormalParameterList")
public interface InferredFormalParameterList extends JavaGenAST {

    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifier();

    void setIdentifier(List<TerminalNodeStrings> setIdentifier);

    @Relation("HAS_COMMA")
    List<TerminalNodeStrings> getCOMMA();

    void setCOMMA(List<TerminalNodeStrings> setCOMMA);
}
