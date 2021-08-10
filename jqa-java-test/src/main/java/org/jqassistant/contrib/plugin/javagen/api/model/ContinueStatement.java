//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE continueStatement (BLOCK (ALT 'continue' (? (BLOCK (ALT Identifier))) ';')))
 * </pre>
 *
 * <pre>
 * continueStatement
 * 	:	'continue' Identifier? ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2761-2772
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#continueStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ContinueStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ContinueStatement")
public interface ContinueStatement extends JavaGen {

    // unhandled TerminalAST token: 'continue'
    // optional: ?
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);
    // unhandled TerminalAST token: ';'
}
