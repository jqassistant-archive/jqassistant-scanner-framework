//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;

/**
 * Generated from AST:
 * <pre>
 * (RULE floatingPointType (BLOCK (ALT 'float') (ALT 'double')))
 * </pre>
 *
 * <pre>
 * floatingPointType
 * 	:	'float'
 * 	|	'double'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:106-116
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#floatingPointType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FloatingPointTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("FloatingPointType")
public interface FloatingPointType extends JavaGen {
    // unhandled TerminalAST token: 'float'
    // unhandled TerminalAST token: 'double'
}
