//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

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
