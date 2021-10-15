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
 * public static class DimsContext extends ParserRuleContext {
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
 *     public List<AnnotationContext> annotation() {
 *         return getRuleContexts(AnnotationContext.class);
 *     }
 *
 *     public AnnotationContext annotation(int i) {
 *         return getRuleContext(AnnotationContext.class, i);
 *     }
 *
 *     public DimsContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_dims;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterDims(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitDims(this);
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
@Label("Dims")
public interface Dims extends JavaGen {

    @Relation("HAS_LBRACK")
    List<TerminalNodeStrings> getLBRACK();

    void setLBRACK(List<TerminalNodeStrings> setLBRACK);

    @Relation("HAS_RBRACK")
    List<TerminalNodeStrings> getRBRACK();

    void setRBRACK(List<TerminalNodeStrings> setRBRACK);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
