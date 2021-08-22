//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE block (BLOCK (ALT '{' (? (BLOCK (ALT statementList))) '}')))
 * </pre>
 *
 * <pre>
 * block
 *     : '{' statementList? '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1278-1289
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#block()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.BlockMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Block")
public interface Block extends TypeScriptGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_STATEMENT_LIST")
    StatementList getStatementList();

    void setStatementList(StatementList setStatementList);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
