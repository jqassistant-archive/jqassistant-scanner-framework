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
 * public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
 *
 *     public TerminalNode THIS() {
 *         return getToken(Java8Parser.THIS, 0);
 *     }
 *
 *     public TerminalNode LPAREN() {
 *         return getToken(Java8Parser.LPAREN, 0);
 *     }
 *
 *     public TerminalNode RPAREN() {
 *         return getToken(Java8Parser.RPAREN, 0);
 *     }
 *
 *     public TerminalNode SEMI() {
 *         return getToken(Java8Parser.SEMI, 0);
 *     }
 *
 *     public TypeArgumentsContext typeArguments() {
 *         return getRuleContext(TypeArgumentsContext.class, 0);
 *     }
 *
 *     public ArgumentListContext argumentList() {
 *         return getRuleContext(ArgumentListContext.class, 0);
 *     }
 *
 *     public TerminalNode SUPER() {
 *         return getToken(Java8Parser.SUPER, 0);
 *     }
 *
 *     public ExpressionNameContext expressionName() {
 *         return getRuleContext(ExpressionNameContext.class, 0);
 *     }
 *
 *     public TerminalNode DOT() {
 *         return getToken(Java8Parser.DOT, 0);
 *     }
 *
 *     public PrimaryContext primary() {
 *         return getRuleContext(PrimaryContext.class, 0);
 *     }
 *
 *     public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_explicitConstructorInvocation;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterExplicitConstructorInvocation(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitExplicitConstructorInvocation(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExplicitConstructorInvocationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExplicitConstructorInvocation")
public interface ExplicitConstructorInvocation extends JavaGen {

    @Relation("HAS_T_H_I_S")
    TerminalNodeStrings getTHIS();

    void setTHIS(TerminalNodeStrings setTHIS);

    @Relation("HAS_L_P_A_R_E_N")
    TerminalNodeStrings getLPAREN();

    void setLPAREN(TerminalNodeStrings setLPAREN);

    @Relation("HAS_R_P_A_R_E_N")
    TerminalNodeStrings getRPAREN();

    void setRPAREN(TerminalNodeStrings setRPAREN);

    @Relation("HAS_S_E_M_I")
    TerminalNodeStrings getSEMI();

    void setSEMI(TerminalNodeStrings setSEMI);

    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments setTypeArguments);

    @Relation("HAS_ARGUMENT_LIST")
    ArgumentList getArgumentList();

    void setArgumentList(ArgumentList setArgumentList);

    @Relation("HAS_S_U_P_E_R")
    TerminalNodeStrings getSUPER();

    void setSUPER(TerminalNodeStrings setSUPER);

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName setExpressionName);

    @Relation("HAS_D_O_T")
    TerminalNodeStrings getDOT();

    void setDOT(TerminalNodeStrings setDOT);

    @Relation("HAS_PRIMARY")
    Primary getPrimary();

    void setPrimary(Primary setPrimary);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
