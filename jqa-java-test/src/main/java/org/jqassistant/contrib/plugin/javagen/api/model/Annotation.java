//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class AnnotationContext extends ParserRuleContext {
 *
 *     public NormalAnnotationContext normalAnnotation() {
 *         return getRuleContext(NormalAnnotationContext.class, 0);
 *     }
 *
 *     public MarkerAnnotationContext markerAnnotation() {
 *         return getRuleContext(MarkerAnnotationContext.class, 0);
 *     }
 *
 *     public SingleElementAnnotationContext singleElementAnnotation() {
 *         return getRuleContext(SingleElementAnnotationContext.class, 0);
 *     }
 *
 *     public AnnotationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_annotation;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAnnotation(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAnnotation(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Annotation")
public interface Annotation extends JavaGen {

    @Relation("HAS_NORMAL_ANNOTATION")
    NormalAnnotation getNormalAnnotation();

    void setNormalAnnotation(NormalAnnotation setNormalAnnotation);

    @Relation("HAS_MARKER_ANNOTATION")
    MarkerAnnotation getMarkerAnnotation();

    void setMarkerAnnotation(MarkerAnnotation setMarkerAnnotation);

    @Relation("HAS_SINGLE_ELEMENT_ANNOTATION")
    SingleElementAnnotation getSingleElementAnnotation();

    void setSingleElementAnnotation(SingleElementAnnotation setSingleElementAnnotation);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
