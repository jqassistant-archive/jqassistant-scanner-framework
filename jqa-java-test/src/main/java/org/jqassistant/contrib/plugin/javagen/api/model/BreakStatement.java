//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE breakStatement (BLOCK (ALT 'break' (? (BLOCK (ALT Identifier))) ';')))
 * </pre>
 *
 * <pre>
 * breakStatement
 * 	:	'break' Identifier? ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2748-2759
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#breakStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.BreakStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("BreakStatement")
public interface BreakStatement extends JavaGen {

    // unhandled TerminalAST token: 'break'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);
    // unhandled TerminalAST token: ';'
}
