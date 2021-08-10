//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from AST:
 * <pre>
 * (RULE elementValue (BLOCK (ALT conditionalExpression) (ALT elementValueArrayInitializer) (ALT annotation)))
 * </pre>
 *
 * <pre>
 * elementValue
 * 	:	conditionalExpression
 * 	|	elementValueArrayInitializer
 * 	|	annotation
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2019-2033
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#elementValue()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ElementValueMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator",
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ElementValue")
public interface ElementValue extends JavaGen {

//    @Relation("HAS_CONDITIONAL_EXPRESSION")
//    ConditionalExpression getConditionalExpression();
//
//    void setConditionalExpression(ConditionalExpression conditionalExpression);
//
//    @Relation("HAS_ELEMENT_VALUE_ARRAY_INITIALIZER")
//    ElementValueArrayInitializer getElementValueArrayInitializer();
//
//    void setElementValueArrayInitializer(ElementValueArrayInitializer elementValueArrayInitializer);

//    @Relation("HAS_ANNOTATION")
//    Annotation getAnnotation();
//
//    void setAnnotation(Annotation annotation);
}
