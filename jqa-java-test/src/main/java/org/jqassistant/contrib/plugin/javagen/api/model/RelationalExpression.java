//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class RelationalExpressionContext extends ParserRuleContext {
 *
 *     public ShiftExpressionContext shiftExpression() {
 *         return getRuleContext(ShiftExpressionContext.class, 0);
 *     }
 *
 *     public RelationalExpressionContext relationalExpression() {
 *         return getRuleContext(RelationalExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode LT() {
 *         return getToken(Java8Parser.LT, 0);
 *     }
 *
 *     public TerminalNode GT() {
 *         return getToken(Java8Parser.GT, 0);
 *     }
 *
 *     public TerminalNode LE() {
 *         return getToken(Java8Parser.LE, 0);
 *     }
 *
 *     public TerminalNode GE() {
 *         return getToken(Java8Parser.GE, 0);
 *     }
 *
 *     public TerminalNode INSTANCEOF() {
 *         return getToken(Java8Parser.INSTANCEOF, 0);
 *     }
 *
 *     public ReferenceTypeContext referenceType() {
 *         return getRuleContext(ReferenceTypeContext.class, 0);
 *     }
 *
 *     public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_relationalExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterRelationalExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitRelationalExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.RelationalExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("RelationalExpression")
public interface RelationalExpression extends JavaGen {

    @Relation("HAS_SHIFT_EXPRESSION")
    ShiftExpression getShiftExpression();

    void setShiftExpression(ShiftExpression setShiftExpression);

    @Relation("HAS_RELATIONAL_EXPRESSION")
    RelationalExpression getRelationalExpression();

    void setRelationalExpression(RelationalExpression setRelationalExpression);

    @Relation("HAS_L_T")
    TerminalNodeStrings getLT();

    void setLT(TerminalNodeStrings setLT);

    @Relation("HAS_G_T")
    TerminalNodeStrings getGT();

    void setGT(TerminalNodeStrings setGT);

    @Relation("HAS_L_E")
    TerminalNodeStrings getLE();

    void setLE(TerminalNodeStrings setLE);

    @Relation("HAS_G_E")
    TerminalNodeStrings getGE();

    void setGE(TerminalNodeStrings setGE);

    @Relation("HAS_I_N_S_T_A_N_C_E_O_F")
    TerminalNodeStrings getINSTANCEOF();

    void setINSTANCEOF(TerminalNodeStrings setINSTANCEOF);

    @Relation("HAS_REFERENCE_TYPE")
    ReferenceType getReferenceType();

    void setReferenceType(ReferenceType setReferenceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
