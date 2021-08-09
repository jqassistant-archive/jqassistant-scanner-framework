//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE additionalBound (BLOCK (ALT '&' interfaceType)))
 * </pre>
 *
 * <pre>
 * additionalBound
 * 	:	'&' interfaceType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:340-348
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#additionalBound()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AdditionalBoundMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("AdditionalBound")
public interface AdditionalBound extends JavaGen {

    // unhandled TerminalAST token: '&'
    @Relation("HAS_INTERFACE_TYPE")
    InterfaceType getInterfaceType();

    void setInterfaceType(InterfaceType interfaceType);
}
