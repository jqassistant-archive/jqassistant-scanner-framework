//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class AssignmentOperatorContext extends ParserRuleContext {
 *
 *     public TerminalNode ASSIGN() {
 *         return getToken(Java8Parser.ASSIGN, 0);
 *     }
 *
 *     public TerminalNode MUL_ASSIGN() {
 *         return getToken(Java8Parser.MUL_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode DIV_ASSIGN() {
 *         return getToken(Java8Parser.DIV_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode MOD_ASSIGN() {
 *         return getToken(Java8Parser.MOD_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode ADD_ASSIGN() {
 *         return getToken(Java8Parser.ADD_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode SUB_ASSIGN() {
 *         return getToken(Java8Parser.SUB_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode LSHIFT_ASSIGN() {
 *         return getToken(Java8Parser.LSHIFT_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode RSHIFT_ASSIGN() {
 *         return getToken(Java8Parser.RSHIFT_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode URSHIFT_ASSIGN() {
 *         return getToken(Java8Parser.URSHIFT_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode AND_ASSIGN() {
 *         return getToken(Java8Parser.AND_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode XOR_ASSIGN() {
 *         return getToken(Java8Parser.XOR_ASSIGN, 0);
 *     }
 *
 *     public TerminalNode OR_ASSIGN() {
 *         return getToken(Java8Parser.OR_ASSIGN, 0);
 *     }
 *
 *     public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_assignmentOperator;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAssignmentOperator(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAssignmentOperator(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AssignmentOperatorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AssignmentOperator")
public interface AssignmentOperator extends JavaGen {

    @Relation("HAS_A_S_S_I_G_N")
    TerminalNodeStrings getASSIGN();

    void setASSIGN(TerminalNodeStrings setASSIGN);

    @Relation("HAS_M_U_L__A_S_S_I_G_N")
    TerminalNodeStrings getMUL_ASSIGN();

    void setMUL_ASSIGN(TerminalNodeStrings setMUL_ASSIGN);

    @Relation("HAS_D_I_V__A_S_S_I_G_N")
    TerminalNodeStrings getDIV_ASSIGN();

    void setDIV_ASSIGN(TerminalNodeStrings setDIV_ASSIGN);

    @Relation("HAS_M_O_D__A_S_S_I_G_N")
    TerminalNodeStrings getMOD_ASSIGN();

    void setMOD_ASSIGN(TerminalNodeStrings setMOD_ASSIGN);

    @Relation("HAS_A_D_D__A_S_S_I_G_N")
    TerminalNodeStrings getADD_ASSIGN();

    void setADD_ASSIGN(TerminalNodeStrings setADD_ASSIGN);

    @Relation("HAS_S_U_B__A_S_S_I_G_N")
    TerminalNodeStrings getSUB_ASSIGN();

    void setSUB_ASSIGN(TerminalNodeStrings setSUB_ASSIGN);

    @Relation("HAS_L_S_H_I_F_T__A_S_S_I_G_N")
    TerminalNodeStrings getLSHIFT_ASSIGN();

    void setLSHIFT_ASSIGN(TerminalNodeStrings setLSHIFT_ASSIGN);

    @Relation("HAS_R_S_H_I_F_T__A_S_S_I_G_N")
    TerminalNodeStrings getRSHIFT_ASSIGN();

    void setRSHIFT_ASSIGN(TerminalNodeStrings setRSHIFT_ASSIGN);

    @Relation("HAS_U_R_S_H_I_F_T__A_S_S_I_G_N")
    TerminalNodeStrings getURSHIFT_ASSIGN();

    void setURSHIFT_ASSIGN(TerminalNodeStrings setURSHIFT_ASSIGN);

    @Relation("HAS_A_N_D__A_S_S_I_G_N")
    TerminalNodeStrings getAND_ASSIGN();

    void setAND_ASSIGN(TerminalNodeStrings setAND_ASSIGN);

    @Relation("HAS_X_O_R__A_S_S_I_G_N")
    TerminalNodeStrings getXOR_ASSIGN();

    void setXOR_ASSIGN(TerminalNodeStrings setXOR_ASSIGN);

    @Relation("HAS_O_R__A_S_S_I_G_N")
    TerminalNodeStrings getOR_ASSIGN();

    void setOR_ASSIGN(TerminalNodeStrings setOR_ASSIGN);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
