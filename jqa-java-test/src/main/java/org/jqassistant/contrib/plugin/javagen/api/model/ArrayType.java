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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("ArrayType")
public interface ArrayType extends JavaGen {

    @Relation("HAS_PRIMITIVE_TYPE")
    PrimitiveType getPrimitiveType();

    void setPrimitiveType(PrimitiveType primitiveType);

    @Relation("HAS_CLASS_OR_INTERFACE_TYPE")
    ClassOrInterfaceType getClassOrInterfaceType();

    void setClassOrInterfaceType(ClassOrInterfaceType classOrInterfaceType);

    @Relation("HAS_DIMS")
    List<Dims> getDimss();

    void setDimss(List<Dims> setDimss);

    @Relation("HAS_TYPE_VARIABLE")
    TypeVariable getTypeVariable();

    void setTypeVariable(TypeVariable typeVariable);
}
