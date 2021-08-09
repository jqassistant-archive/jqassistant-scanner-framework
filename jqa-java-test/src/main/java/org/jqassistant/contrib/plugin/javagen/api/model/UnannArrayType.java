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
 * (RULE unannArrayType (BLOCK (ALT unannPrimitiveType dims) (ALT unannClassOrInterfaceType dims) (ALT unannTypeVariable dims)))
 * </pre>
 *
 * <pre>
 * unannArrayType
 * 	:	unannPrimitiveType dims
 * 	|	unannClassOrInterfaceType dims
 * 	|	unannTypeVariable dims
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1099-1119
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannArrayType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannArrayTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("UnannArrayType")
public interface UnannArrayType extends JavaGen {

    @Relation("HAS_UNANN_PRIMITIVE_TYPE")
    UnannPrimitiveType getUnannPrimitiveType();

    void setUnannPrimitiveType(UnannPrimitiveType unannPrimitiveType);

    @Relation("HAS_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassOrInterfaceType getUnannClassOrInterfaceType();

    void setUnannClassOrInterfaceType(UnannClassOrInterfaceType unannClassOrInterfaceType);

    @Relation("HAS_DIMS")
    List<Dims> getDimss();

    void setDimss(List<Dims> setDimss);

    @Relation("HAS_UNANN_TYPE_VARIABLE")
    UnannTypeVariable getUnannTypeVariable();

    void setUnannTypeVariable(UnannTypeVariable unannTypeVariable);
}
