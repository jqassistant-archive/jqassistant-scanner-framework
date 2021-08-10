//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceType_lfno_classOrInterfaceType (BLOCK (ALT classType_lfno_classOrInterfaceType)))
 * </pre>
 *
 * <pre>
 * interfaceType_lfno_classOrInterfaceType
 * 	:	classType_lfno_classOrInterfaceType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:235-241
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceType_lfno_classOrInterfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceType_lfno_classOrInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("InterfaceType_lfno_classOrInterfaceType")
public interface InterfaceType_lfno_classOrInterfaceType extends JavaGen {

    @Relation("HAS_CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE")
    ClassType_lfno_classOrInterfaceType getClassType_lfno_classOrInterfaceType();

    void setClassType_lfno_classOrInterfaceType(ClassType_lfno_classOrInterfaceType classType_lfno_classOrInterfaceType);
}
