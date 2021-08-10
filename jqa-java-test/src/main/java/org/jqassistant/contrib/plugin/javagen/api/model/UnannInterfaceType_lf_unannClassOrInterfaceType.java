//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE unannInterfaceType_lf_unannClassOrInterfaceType (BLOCK (ALT unannClassType_lf_unannClassOrInterfaceType)))
 * </pre>
 *
 * <pre>
 * unannInterfaceType_lf_unannClassOrInterfaceType
 * 	:	unannClassType_lf_unannClassOrInterfaceType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1075-1081
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannInterfaceType_lf_unannClassOrInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("UnannInterfaceType_lf_unannClassOrInterfaceType")
public interface UnannInterfaceType_lf_unannClassOrInterfaceType extends JavaGen {

    @Relation("HAS_UNANN_CLASS_TYPE_LF_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassType_lf_unannClassOrInterfaceType getUnannClassType_lf_unannClassOrInterfaceType();

    void setUnannClassType_lf_unannClassOrInterfaceType(UnannClassType_lf_unannClassOrInterfaceType unannClassType_lf_unannClassOrInterfaceType);
}
