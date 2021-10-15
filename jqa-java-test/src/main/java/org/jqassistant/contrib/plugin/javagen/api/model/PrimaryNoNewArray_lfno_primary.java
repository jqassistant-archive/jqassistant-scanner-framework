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
 * public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
 *
 *     public LiteralContext literal() {
 *         return getRuleContext(LiteralContext.class, 0);
 *     }
 *
 *     public TypeNameContext typeName() {
 *         return getRuleContext(TypeNameContext.class, 0);
 *     }
 *
 *     public TerminalNode DOT() {
 *         return getToken(Java8Parser.DOT, 0);
 *     }
 *
 *     public TerminalNode CLASS() {
 *         return getToken(Java8Parser.CLASS, 0);
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
 *     public List<TerminalNode> RBRACK() {
 *         return getTokens(Java8Parser.RBRACK);
 *     }
 *
 *     public TerminalNode RBRACK(int i) {
 *         return getToken(Java8Parser.RBRACK, i);
 *     }
 *
 *     public UnannPrimitiveTypeContext unannPrimitiveType() {
 *         return getRuleContext(UnannPrimitiveTypeContext.class, 0);
 *     }
 *
 *     public TerminalNode VOID() {
 *         return getToken(Java8Parser.VOID, 0);
 *     }
 *
 *     public TerminalNode THIS() {
 *         return getToken(Java8Parser.THIS, 0);
 *     }
 *
 *     public TerminalNode LPAREN() {
 *         return getToken(Java8Parser.LPAREN, 0);
 *     }
 *
 *     public ExpressionContext expression() {
 *         return getRuleContext(ExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode RPAREN() {
 *         return getToken(Java8Parser.RPAREN, 0);
 *     }
 *
 *     public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
 *         return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class, 0);
 *     }
 *
 *     public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
 *         return getRuleContext(FieldAccess_lfno_primaryContext.class, 0);
 *     }
 *
 *     public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
 *         return getRuleContext(ArrayAccess_lfno_primaryContext.class, 0);
 *     }
 *
 *     public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
 *         return getRuleContext(MethodInvocation_lfno_primaryContext.class, 0);
 *     }
 *
 *     public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
 *         return getRuleContext(MethodReference_lfno_primaryContext.class, 0);
 *     }
 *
 *     public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_primaryNoNewArray_lfno_primary;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPrimaryNoNewArray_lfno_primary(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPrimaryNoNewArray_lfno_primary(this);
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
@Label("PrimaryNoNewArray_lfno_primary")
public interface PrimaryNoNewArray_lfno_primary extends JavaGen {

    @Relation("HAS_LITERAL")
    Literal getLiteral();

    void setLiteral(Literal setLiteral);

    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName setTypeName);

    @Relation("HAS_DOT")
    TerminalNodeStrings getDOT();

    void setDOT(TerminalNodeStrings setDOT);

    @Relation("HAS_CLASS")
    TerminalNodeStrings getCLASS();

    void setCLASS(TerminalNodeStrings setCLASS);

    @Relation("HAS_LBRACK")
    List<TerminalNodeStrings> getLBRACK();

    void setLBRACK(List<TerminalNodeStrings> setLBRACK);

    @Relation("HAS_RBRACK")
    List<TerminalNodeStrings> getRBRACK();

    void setRBRACK(List<TerminalNodeStrings> setRBRACK);

    @Relation("HAS_UNANN_PRIMITIVE_TYPE")
    UnannPrimitiveType getUnannPrimitiveType();

    void setUnannPrimitiveType(UnannPrimitiveType setUnannPrimitiveType);

    @Relation("HAS_VOID")
    TerminalNodeStrings getVOID();

    void setVOID(TerminalNodeStrings setVOID);

    @Relation("HAS_THIS")
    TerminalNodeStrings getTHIS();

    void setTHIS(TerminalNodeStrings setTHIS);

    @Relation("HAS_LPAREN")
    TerminalNodeStrings getLPAREN();

    void setLPAREN(TerminalNodeStrings setLPAREN);

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    @Relation("HAS_RPAREN")
    TerminalNodeStrings getRPAREN();

    void setRPAREN(TerminalNodeStrings setRPAREN);

    @Relation("HAS_CLASS_INSTANCE_CREATION_EXPRESSION_LFNO_PRIMARY")
    ClassInstanceCreationExpression_lfno_primary getClassInstanceCreationExpression_lfno_primary();

    void setClassInstanceCreationExpression_lfno_primary(ClassInstanceCreationExpression_lfno_primary setClassInstanceCreationExpression_lfno_primary);

    @Relation("HAS_FIELD_ACCESS_LFNO_PRIMARY")
    FieldAccess_lfno_primary getFieldAccess_lfno_primary();

    void setFieldAccess_lfno_primary(FieldAccess_lfno_primary setFieldAccess_lfno_primary);

    @Relation("HAS_ARRAY_ACCESS_LFNO_PRIMARY")
    ArrayAccess_lfno_primary getArrayAccess_lfno_primary();

    void setArrayAccess_lfno_primary(ArrayAccess_lfno_primary setArrayAccess_lfno_primary);

    @Relation("HAS_METHOD_INVOCATION_LFNO_PRIMARY")
    MethodInvocation_lfno_primary getMethodInvocation_lfno_primary();

    void setMethodInvocation_lfno_primary(MethodInvocation_lfno_primary setMethodInvocation_lfno_primary);

    @Relation("HAS_METHOD_REFERENCE_LFNO_PRIMARY")
    MethodReference_lfno_primary getMethodReference_lfno_primary();

    void setMethodReference_lfno_primary(MethodReference_lfno_primary setMethodReference_lfno_primary);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
