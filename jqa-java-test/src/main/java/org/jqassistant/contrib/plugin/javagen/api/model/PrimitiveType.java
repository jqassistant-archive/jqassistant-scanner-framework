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
 * (RULE primitiveType (BLOCK (ALT (* (BLOCK (ALT annotation))) numericType) (ALT (* (BLOCK (ALT annotation))) 'boolean')))
 * </pre>
 *
 * <pre>
 * primitiveType
 * 	:	annotation* numericType
 * 	|	annotation* 'boolean'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:52-68
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#primitiveType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimitiveTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PrimitiveType")
public interface PrimitiveType extends JavaGen {

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    @Relation("HAS_NUMERIC_TYPE")
    NumericType getNumericType();

    void setNumericType(NumericType setNumericType);

    // unhandled TerminalAST token: 'boolean'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
