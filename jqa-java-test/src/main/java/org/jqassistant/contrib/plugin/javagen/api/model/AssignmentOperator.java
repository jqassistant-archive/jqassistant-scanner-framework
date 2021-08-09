//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;

/**
 * Generated from AST:
 * <pre>
 * (RULE assignmentOperator (BLOCK (ALT '=') (ALT '*=') (ALT '/=') (ALT '%=') (ALT '+=') (ALT '-=') (ALT '<<=') (ALT '>>=') (ALT '>>>=') (ALT '&=') (ALT '^=') (ALT '|=')))
 * </pre>
 *
 * <pre>
 * assignmentOperator
 * 	:	'='
 * 	|	'*='
 * 	|	'/='
 * 	|	'%='
 * 	|	'+='
 * 	|	'-='
 * 	|	'<<='
 * 	|	'>>='
 * 	|	'>>>='
 * 	|	'&='
 * 	|	'^='
 * 	|	'|='
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4351-4401
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#assignmentOperator()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AssignmentOperatorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("AssignmentOperator")
public interface AssignmentOperator extends JavaGen {
    // unhandled TerminalAST token: '='
    // unhandled TerminalAST token: '*='
    // unhandled TerminalAST token: '/='
    // unhandled TerminalAST token: '%='
    // unhandled TerminalAST token: '+='
    // unhandled TerminalAST token: '-='
    // unhandled TerminalAST token: '<<='
    // unhandled TerminalAST token: '>>='
    // unhandled TerminalAST token: '>>>='
    // unhandled TerminalAST token: '&='
    // unhandled TerminalAST token: '^='
    // unhandled TerminalAST token: '|='
}
