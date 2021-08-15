//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE arrayType (BLOCK (ALT primitiveType dims) (ALT classOrInterfaceType dims) (ALT typeVariable dims)))
 * </pre>
 *
 * <pre>
 * arrayType
 * 	:	primitiveType dims
 * 	|	classOrInterfaceType dims
 * 	|	typeVariable dims
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:254-274
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#arrayType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ArrayTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrayType")
public interface ArrayType extends JavaGen {

    @Relation("HAS_PRIMITIVE_TYPE")
    PrimitiveType getPrimitiveType();

    void setPrimitiveType(PrimitiveType primitiveType);

    @Relation("HAS_DIMS")
    Dims getDims();

    void setDims(Dims dims);

    @Relation("HAS_CLASS_OR_INTERFACE_TYPE")
    ClassOrInterfaceType getClassOrInterfaceType();

    void setClassOrInterfaceType(ClassOrInterfaceType classOrInterfaceType);

    @Relation("HAS_TYPE_VARIABLE")
    TypeVariable getTypeVariable();

    void setTypeVariable(TypeVariable typeVariable);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
