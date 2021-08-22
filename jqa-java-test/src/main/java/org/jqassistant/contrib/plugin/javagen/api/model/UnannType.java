//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE unannType (BLOCK (ALT unannPrimitiveType) (ALT unannReferenceType)))
 * </pre>
 *
 * <pre>
 * unannType
 * 	:	unannPrimitiveType
 * 	|	unannReferenceType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:948-958
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnannType")
public interface UnannType extends JavaGen {

    @Relation("HAS_UNANN_PRIMITIVE_TYPE")
    UnannPrimitiveType getUnannPrimitiveType();

    void setUnannPrimitiveType(UnannPrimitiveType setUnannPrimitiveType);

    @Relation("HAS_UNANN_REFERENCE_TYPE")
    UnannReferenceType getUnannReferenceType();

    void setUnannReferenceType(UnannReferenceType setUnannReferenceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
