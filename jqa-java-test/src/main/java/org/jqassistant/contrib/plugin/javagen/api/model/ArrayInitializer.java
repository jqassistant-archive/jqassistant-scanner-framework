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
 * public static class ArrayInitializerContext extends ParserRuleContext {
 *
 *     public TerminalNode LBRACE() {
 *         return getToken(Java8Parser.LBRACE, 0);
 *     }
 *
 *     public TerminalNode RBRACE() {
 *         return getToken(Java8Parser.RBRACE, 0);
 *     }
 *
 *     public VariableInitializerListContext variableInitializerList() {
 *         return getRuleContext(VariableInitializerListContext.class, 0);
 *     }
 *
 *     public TerminalNode COMMA() {
 *         return getToken(Java8Parser.COMMA, 0);
 *     }
 *
 *     public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_arrayInitializer;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterArrayInitializer(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitArrayInitializer(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ArrayInitializerMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrayInitializer")
public interface ArrayInitializer extends JavaGen {

    @Relation("HAS_L_B_R_A_C_E")
    TerminalNodeStrings getLBRACE();

    void setLBRACE(TerminalNodeStrings setLBRACE);

    @Relation("HAS_R_B_R_A_C_E")
    TerminalNodeStrings getRBRACE();

    void setRBRACE(TerminalNodeStrings setRBRACE);

    @Relation("HAS_VARIABLE_INITIALIZER_LIST")
    VariableInitializerList getVariableInitializerList();

    void setVariableInitializerList(VariableInitializerList setVariableInitializerList);

    @Relation("HAS_C_O_M_M_A")
    TerminalNodeStrings getCOMMA();

    void setCOMMA(TerminalNodeStrings setCOMMA);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
