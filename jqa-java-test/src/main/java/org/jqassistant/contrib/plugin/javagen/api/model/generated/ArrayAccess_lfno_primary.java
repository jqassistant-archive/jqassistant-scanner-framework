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
 * public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
 *
 *     public ExpressionNameContext expressionName() {
 *         return getRuleContext(ExpressionNameContext.class, 0);
 *     }
 *
 *     public List<TerminalNode> LBRACK() {
 *         return getTokens(Java8Parser.LBRACK);
 *     }
 *
 *     public TerminalNode LBRACK(int i) {
 *         return getToken(Java8Parser.LBRACK, i);
 *     }
 *
 *     public List<ExpressionContext> expression() {
 *         return getRuleContexts(ExpressionContext.class);
 *     }
 *
 *     public ExpressionContext expression(int i) {
 *         return getRuleContext(ExpressionContext.class, i);
 *     }
 *
 *     public List<TerminalNode> RBRACK() {
 *         return getTokens(Java8Parser.RBRACK);
 *     }
 *
 *     public TerminalNode RBRACK(int i) {
 *         return getToken(Java8Parser.RBRACK, i);
 *     }
 *
 *     public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
 *         return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class, 0);
 *     }
 *
 *     public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
 *         return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
 *     }
 *
 *     public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
 *         return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class, i);
 *     }
 *
 *     public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_arrayAccess_lfno_primary;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterArrayAccess_lfno_primary(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitArrayAccess_lfno_primary(this);
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
@Label("ArrayAccess_lfno_primary")
public interface ArrayAccess_lfno_primary extends JavaGenAST {

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName setExpressionName);

    @Relation("HAS_LBRACK")
    List<TerminalNodeStrings> getLBRACK();

    void setLBRACK(List<TerminalNodeStrings> setLBRACK);

    @Relation("HAS_EXPRESSION")
    List<Expression> getExpression();

    void setExpression(List<Expression> setExpression);

    @Relation("HAS_RBRACK")
    List<TerminalNodeStrings> getRBRACK();

    void setRBRACK(List<TerminalNodeStrings> setRBRACK);

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LFNO_PRIMARY_LFNO_ARRAY_ACCESS_LFNO_PRIMARY")
    PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary getPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();

    void setPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary setPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LFNO_PRIMARY_LF_ARRAY_ACCESS_LFNO_PRIMARY")
    List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary> getPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();

    void setPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary> setPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
}
