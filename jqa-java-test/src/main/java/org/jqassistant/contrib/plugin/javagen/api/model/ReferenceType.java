//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE referenceType (BLOCK (ALT classOrInterfaceType) (ALT typeVariable) (ALT arrayType)))
 * </pre>
 *
 * <pre>
 * referenceType
 * 	:	classOrInterfaceType
 * 	|	typeVariable
 * 	|	arrayType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:118-132
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#referenceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ReferenceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("ReferenceType")
public interface ReferenceType extends JavaGen {

    @Relation("HAS_CLASS_OR_INTERFACE_TYPE")
    ClassOrInterfaceType getClassOrInterfaceType();

    void setClassOrInterfaceType(ClassOrInterfaceType classOrInterfaceType);

    @Relation("HAS_TYPE_VARIABLE")
    TypeVariable getTypeVariable();

    void setTypeVariable(TypeVariable typeVariable);

    @Relation("HAS_ARRAY_TYPE")
    ArrayType getArrayType();

    void setArrayType(ArrayType arrayType);
}
