//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE annotationTypeElementModifier (BLOCK (ALT annotation) (ALT 'public') (ALT 'abstract')))
 * </pre>
 *
 * <pre>
 * annotationTypeElementModifier
 * 	:	annotation
 * 	|	'public'
 * 	|	'abstract'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1933-1947
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#annotationTypeElementModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationTypeElementModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("AnnotationTypeElementModifier")
public interface AnnotationTypeElementModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation annotation);
    // unhandled TerminalAST token: 'public'
    // unhandled TerminalAST token: 'abstract'
}
