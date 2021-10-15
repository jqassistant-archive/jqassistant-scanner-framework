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
 * public static class DimExprContext extends ParserRuleContext {
 *
 *     public TerminalNode LBRACK() {
 *         return getToken(Java8Parser.LBRACK, 0);
 *     }
 *
 *     public ExpressionContext expression() {
 *         return getRuleContext(ExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode RBRACK() {
 *         return getToken(Java8Parser.RBRACK, 0);
 *     }
 *
 *     public List<AnnotationContext> annotation() {
 *         return getRuleContexts(AnnotationContext.class);
 *     }
 *
 *     public AnnotationContext annotation(int i) {
 *         return getRuleContext(AnnotationContext.class, i);
 *     }
 *
 *     public DimExprContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_dimExpr;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterDimExpr(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitDimExpr(this);
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
@Label("DimExpr")
public interface DimExpr extends JavaGen {

    @Relation("HAS_LBRACK")
    TerminalNodeStrings getLBRACK();

    void setLBRACK(TerminalNodeStrings setLBRACK);

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    @Relation("HAS_RBRACK")
    TerminalNodeStrings getRBRACK();

    void setRBRACK(TerminalNodeStrings setRBRACK);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
