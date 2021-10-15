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
 * public static class ArrayAccessContext extends ParserRuleContext {
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
 *     public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
 *         return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class, 0);
 *     }
 *
 *     public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
 *         return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
 *     }
 *
 *     public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
 *         return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class, i);
 *     }
 *
 *     public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_arrayAccess;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterArrayAccess(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitArrayAccess(this);
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
@Label("ArrayAccess")
public interface ArrayAccess extends JavaGen {

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

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LFNO_ARRAY_ACCESS")
    PrimaryNoNewArray_lfno_arrayAccess getPrimaryNoNewArray_lfno_arrayAccess();

    void setPrimaryNoNewArray_lfno_arrayAccess(PrimaryNoNewArray_lfno_arrayAccess setPrimaryNoNewArray_lfno_arrayAccess);

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LF_ARRAY_ACCESS")
    List<PrimaryNoNewArray_lf_arrayAccess> getPrimaryNoNewArray_lf_arrayAccess();

    void setPrimaryNoNewArray_lf_arrayAccess(List<PrimaryNoNewArray_lf_arrayAccess> setPrimaryNoNewArray_lf_arrayAccess);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
