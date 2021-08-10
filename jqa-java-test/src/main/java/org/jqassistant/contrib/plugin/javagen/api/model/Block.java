//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from AST:
 * <pre>
 * (RULE block (BLOCK (ALT '{' (? (BLOCK (ALT blockStatements))) '}')))
 * </pre>
 *
 * <pre>
 * block
 * 	:	'{' blockStatements? '}'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2127-2138
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#block()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.BlockMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator",
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("Block")
public interface Block extends JavaGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_BLOCK_STATEMENTS")
    BlockStatements getBlockStatements();

    void setBlockStatements(BlockStatements blockStatements);
    // unhandled TerminalAST token: '}'
}
