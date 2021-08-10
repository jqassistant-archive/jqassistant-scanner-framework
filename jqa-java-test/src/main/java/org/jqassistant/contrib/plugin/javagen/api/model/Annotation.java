//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from AST:
 * <pre>
 * (RULE annotation (BLOCK (ALT normalAnnotation) (ALT markerAnnotation) (ALT singleElementAnnotation)))
 * </pre>
 *
 * <pre>
 * annotation
 * 	:	normalAnnotation
 * 	|	markerAnnotation
 * 	|	singleElementAnnotation
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1959-1973
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#annotation()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator",
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("Annotation")
public interface Annotation extends JavaGen {

    @Relation("HAS_NORMAL_ANNOTATION")
    NormalAnnotation getNormalAnnotation();

    void setNormalAnnotation(NormalAnnotation normalAnnotation);

    @Relation("HAS_MARKER_ANNOTATION")
    MarkerAnnotation getMarkerAnnotation();

    void setMarkerAnnotation(MarkerAnnotation markerAnnotation);

    @Relation("HAS_SINGLE_ELEMENT_ANNOTATION")
    SingleElementAnnotation getSingleElementAnnotation();

    void setSingleElementAnnotation(SingleElementAnnotation singleElementAnnotation);
}
