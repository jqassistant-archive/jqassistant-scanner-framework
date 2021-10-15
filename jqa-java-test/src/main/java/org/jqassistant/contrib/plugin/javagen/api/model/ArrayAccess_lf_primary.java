//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
 *
 *     public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
 *         return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class, 0);
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
 *     public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
 *         return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
 *     }
 *
 *     public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
 *         return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class, i);
 *     }
 *
 *     public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_arrayAccess_lf_primary;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterArrayAccess_lf_primary(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitArrayAccess_lf_primary(this);
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
@Label("ArrayAccess_lf_primary")
public interface ArrayAccess_lf_primary extends JavaGen {

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LF_PRIMARY_LFNO_ARRAY_ACCESS_LF_PRIMARY")
    PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary getPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();

    void setPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary setPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);

    @Relation("HAS_LBRACK")
    List<TerminalNodeStrings> getLBRACK();

    void setLBRACK(List<TerminalNodeStrings> setLBRACK);

    @Relation("HAS_EXPRESSION")
    List<Expression> getExpression();

    void setExpression(List<Expression> setExpression);

    @Relation("HAS_RBRACK")
    List<TerminalNodeStrings> getRBRACK();

    void setRBRACK(List<TerminalNodeStrings> setRBRACK);

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LF_PRIMARY_LF_ARRAY_ACCESS_LF_PRIMARY")
    List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary> getPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();

    void setPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary> setPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
