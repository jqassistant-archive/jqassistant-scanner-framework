//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE superinterfaces (BLOCK (ALT 'implements' interfaceTypeList)))
 * </pre>
 *
 * <pre>
 * superinterfaces
 * 	:	'implements' interfaceTypeList
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:762-770
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#superinterfaces()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SuperinterfacesMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("Superinterfaces")
public interface Superinterfaces extends JavaGen {

    // unhandled TerminalAST token: 'implements'
    @Relation("HAS_INTERFACE_TYPE_LIST")
    InterfaceTypeList getInterfaceTypeList();

    void setInterfaceTypeList(InterfaceTypeList interfaceTypeList);
}