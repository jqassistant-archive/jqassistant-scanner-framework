//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceType (BLOCK (ALT classType)))
 * </pre>
 *
 * <pre>
 * interfaceType
 * 	:	classType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:219-225
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("InterfaceType")
public interface InterfaceType extends JavaGen {

    @Relation("HAS_CLASS_TYPE")
    ClassType getClassType();

    void setClassType(ClassType classType);
}