//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;

/**
 * Generated from AST:
 * <pre>
 * (RULE emptyStatement (BLOCK (ALT ';')))
 * </pre>
 *
 * <pre>
 * emptyStatement
 * 	:	';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2292-2298
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#emptyStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EmptyStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("EmptyStatement")
public interface EmptyStatement extends JavaGen {
    // unhandled TerminalAST token: ';'
}
