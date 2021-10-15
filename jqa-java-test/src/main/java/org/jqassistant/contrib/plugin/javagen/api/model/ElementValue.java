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
 * public static class ElementValueContext extends ParserRuleContext {
 *
 *     public ConditionalExpressionContext conditionalExpression() {
 *         return getRuleContext(ConditionalExpressionContext.class, 0);
 *     }
 *
 *     public ElementValueArrayInitializerContext elementValueArrayInitializer() {
 *         return getRuleContext(ElementValueArrayInitializerContext.class, 0);
 *     }
 *
 *     public AnnotationContext annotation() {
 *         return getRuleContext(AnnotationContext.class, 0);
 *     }
 *
 *     public ElementValueContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_elementValue;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterElementValue(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitElementValue(this);
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
@Label("ElementValue")
public interface ElementValue extends JavaGen {

    @Relation("HAS_CONDITIONAL_EXPRESSION")
    ConditionalExpression getConditionalExpression();

    void setConditionalExpression(ConditionalExpression setConditionalExpression);

    @Relation("HAS_ELEMENT_VALUE_ARRAY_INITIALIZER")
    ElementValueArrayInitializer getElementValueArrayInitializer();

    void setElementValueArrayInitializer(ElementValueArrayInitializer setElementValueArrayInitializer);

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
