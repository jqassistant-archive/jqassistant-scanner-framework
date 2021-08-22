//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AnnotationTypeElementDeclaration")
public interface AnnotationTypeElementDeclaration extends JavaGen {

    @Relation("HAS_ANNOTATION_TYPE_ELEMENT_MODIFIER")
    List<AnnotationTypeElementModifier> getAnnotationTypeElementModifier();

    void setAnnotationTypeElementModifier(List<AnnotationTypeElementModifier> setAnnotationTypeElementModifier);

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType setUnannType);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: '('
    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_DIMS")
    Dims getDims();

    void setDims(Dims setDims);

    // optional: ?
    @Relation("HAS_DEFAULT_VALUE")
    DefaultValue getDefaultValue();

    void setDefaultValue(DefaultValue setDefaultValue);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
