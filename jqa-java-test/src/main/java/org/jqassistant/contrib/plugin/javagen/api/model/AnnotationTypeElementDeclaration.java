//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE annotationTypeElementDeclaration (BLOCK (ALT (* (BLOCK (ALT annotationTypeElementModifier))) unannType Identifier '(' ')' (? (BLOCK (ALT dims))) (? (BLOCK (ALT defaultValue))) ';')))
 * </pre>
 *
 * <pre>
 * annotationTypeElementDeclaration
 * 	:	annotationTypeElementModifier* unannType Identifier '(' ')' dims? defaultValue? ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1908-1931
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#annotationTypeElementDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationTypeElementDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("AnnotationTypeElementDeclaration")
public interface AnnotationTypeElementDeclaration extends JavaGen {

    @Relation("HAS_ANNOTATION_TYPE_ELEMENT_MODIFIER")
    List<AnnotationTypeElementModifier> getAnnotationTypeElementModifiers();

    void setAnnotationTypeElementModifiers(List<AnnotationTypeElementModifier> setAnnotationTypeElementModifiers);

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType unannType);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // unhandled TerminalAST token: '('
    // unhandled TerminalAST token: ')'
    // optional: dims
    @Relation("HAS_DIMS")
    Dims getDims();

    void setDims(Dims dims);

    // optional: defaultValue
    @Relation("HAS_DEFAULT_VALUE")
    DefaultValue getDefaultValue();

    void setDefaultValue(DefaultValue defaultValue);
    // unhandled TerminalAST token: ';'
}
