//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceType_lf_classOrInterfaceType (BLOCK (ALT classType_lf_classOrInterfaceType)))
 * </pre>
 *
 * <pre>
 * interfaceType_lf_classOrInterfaceType
 * 	:	classType_lf_classOrInterfaceType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:227-233
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceType_lf_classOrInterfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceType_lf_classOrInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("InterfaceType_lf_classOrInterfaceType")
public interface InterfaceType_lf_classOrInterfaceType extends JavaGen {

    @Relation("HAS_CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE")
    ClassType_lf_classOrInterfaceType getClassType_lf_classOrInterfaceType();

    void setClassType_lf_classOrInterfaceType(ClassType_lf_classOrInterfaceType classType_lf_classOrInterfaceType);
}
