//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE unannReferenceType (BLOCK (ALT unannClassOrInterfaceType) (ALT unannTypeVariable) (ALT unannArrayType)))
 * </pre>
 *
 * <pre>
 * unannReferenceType
 * 	:	unannClassOrInterfaceType
 * 	|	unannTypeVariable
 * 	|	unannArrayType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:972-986
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannReferenceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannReferenceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("UnannReferenceType")
public interface UnannReferenceType extends JavaGen {

    @Relation("HAS_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassOrInterfaceType getUnannClassOrInterfaceType();

    void setUnannClassOrInterfaceType(UnannClassOrInterfaceType unannClassOrInterfaceType);

    @Relation("HAS_UNANN_TYPE_VARIABLE")
    UnannTypeVariable getUnannTypeVariable();

    void setUnannTypeVariable(UnannTypeVariable unannTypeVariable);

    @Relation("HAS_UNANN_ARRAY_TYPE")
    UnannArrayType getUnannArrayType();

    void setUnannArrayType(UnannArrayType unannArrayType);
}
