//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
 *
 *     public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
 *         return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class, 0);
 *     }
 *
 *     public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
 *         return getRuleContext(FieldAccess_lf_primaryContext.class, 0);
 *     }
 *
 *     public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
 *         return getRuleContext(ArrayAccess_lf_primaryContext.class, 0);
 *     }
 *
 *     public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
 *         return getRuleContext(MethodInvocation_lf_primaryContext.class, 0);
 *     }
 *
 *     public MethodReference_lf_primaryContext methodReference_lf_primary() {
 *         return getRuleContext(MethodReference_lf_primaryContext.class, 0);
 *     }
 *
 *     public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_primaryNoNewArray_lf_primary;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPrimaryNoNewArray_lf_primary(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPrimaryNoNewArray_lf_primary(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimaryNoNewArray_lf_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PrimaryNoNewArray_lf_primary")
public interface PrimaryNoNewArray_lf_primary extends JavaGen {

    @Relation("HAS_CLASS_INSTANCE_CREATION_EXPRESSION_LF_PRIMARY")
    ClassInstanceCreationExpression_lf_primary getClassInstanceCreationExpression_lf_primary();

    void setClassInstanceCreationExpression_lf_primary(ClassInstanceCreationExpression_lf_primary setClassInstanceCreationExpression_lf_primary);

    @Relation("HAS_FIELD_ACCESS_LF_PRIMARY")
    FieldAccess_lf_primary getFieldAccess_lf_primary();

    void setFieldAccess_lf_primary(FieldAccess_lf_primary setFieldAccess_lf_primary);

    @Relation("HAS_ARRAY_ACCESS_LF_PRIMARY")
    ArrayAccess_lf_primary getArrayAccess_lf_primary();

    void setArrayAccess_lf_primary(ArrayAccess_lf_primary setArrayAccess_lf_primary);

    @Relation("HAS_METHOD_INVOCATION_LF_PRIMARY")
    MethodInvocation_lf_primary getMethodInvocation_lf_primary();

    void setMethodInvocation_lf_primary(MethodInvocation_lf_primary setMethodInvocation_lf_primary);

    @Relation("HAS_METHOD_REFERENCE_LF_PRIMARY")
    MethodReference_lf_primary getMethodReference_lf_primary();

    void setMethodReference_lf_primary(MethodReference_lf_primary setMethodReference_lf_primary);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
