//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;

/**
 * Generated from AST:
 * <pre>
 * (RULE integralType (BLOCK (ALT 'byte') (ALT 'short') (ALT 'int') (ALT 'long') (ALT 'char')))
 * </pre>
 *
 * <pre>
 * integralType
 * 	:	'byte'
 * 	|	'short'
 * 	|	'int'
 * 	|	'long'
 * 	|	'char'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:82-104
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#integralType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.IntegralTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("IntegralType")
public interface IntegralType extends JavaGen {
    // unhandled TerminalAST token: 'byte'
    // unhandled TerminalAST token: 'short'
    // unhandled TerminalAST token: 'int'
    // unhandled TerminalAST token: 'long'
    // unhandled TerminalAST token: 'char'
}
