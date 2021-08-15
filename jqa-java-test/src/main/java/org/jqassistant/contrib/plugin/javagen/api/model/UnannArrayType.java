//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnannArrayType")
public interface UnannArrayType extends JavaGen {

    @Relation("HAS_UNANN_PRIMITIVE_TYPE")
    UnannPrimitiveType getUnannPrimitiveType();

    void setUnannPrimitiveType(UnannPrimitiveType unannPrimitiveType);

    @Relation("HAS_DIMS")
    Dims getDims();

    void setDims(Dims dims);

    @Relation("HAS_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassOrInterfaceType getUnannClassOrInterfaceType();

    void setUnannClassOrInterfaceType(UnannClassOrInterfaceType unannClassOrInterfaceType);

    @Relation("HAS_UNANN_TYPE_VARIABLE")
    UnannTypeVariable getUnannTypeVariable();

    void setUnannTypeVariable(UnannTypeVariable unannTypeVariable);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
