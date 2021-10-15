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
 * public static class PrimaryContext extends ParserRuleContext {
 *
 *     public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
 *         return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class, 0);
 *     }
 *
 *     public ArrayCreationExpressionContext arrayCreationExpression() {
 *         return getRuleContext(ArrayCreationExpressionContext.class, 0);
 *     }
 *
 *     public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
 *         return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
 *     }
 *
 *     public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
 *         return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class, i);
 *     }
 *
 *     public PrimaryContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_primary;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPrimary(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPrimary(this);
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
@Label("Primary")
public interface Primary extends JavaGen {

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LFNO_PRIMARY")
    PrimaryNoNewArray_lfno_primary getPrimaryNoNewArray_lfno_primary();

    void setPrimaryNoNewArray_lfno_primary(PrimaryNoNewArray_lfno_primary setPrimaryNoNewArray_lfno_primary);

    @Relation("HAS_ARRAY_CREATION_EXPRESSION")
    ArrayCreationExpression getArrayCreationExpression();

    void setArrayCreationExpression(ArrayCreationExpression setArrayCreationExpression);

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LF_PRIMARY")
    List<PrimaryNoNewArray_lf_primary> getPrimaryNoNewArray_lf_primary();

    void setPrimaryNoNewArray_lf_primary(List<PrimaryNoNewArray_lf_primary> setPrimaryNoNewArray_lf_primary);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
