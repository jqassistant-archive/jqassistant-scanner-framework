//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE defaultClause (BLOCK (ALT Default ':' (? (BLOCK (ALT statementList))))))
 * </pre>
 *
 * <pre>
 * defaultClause
 *     : Default ':' statementList?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1860-1871
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#defaultClause()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.DefaultClauseMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("DefaultClause")
public interface DefaultClause extends TypeScriptGen {

    @Relation("HAS_DEFAULT")
    TerminalNodeStrings getDefault();

    void setDefault(TerminalNodeStrings setDefault);

    // unhandled TerminalAST token: ':'
    // optional: ?
    @Relation("HAS_STATEMENT_LIST")
    StatementList getStatementList();

    void setStatementList(StatementList setStatementList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
