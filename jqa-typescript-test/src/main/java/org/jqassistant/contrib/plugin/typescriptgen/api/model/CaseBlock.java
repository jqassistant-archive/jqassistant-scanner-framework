//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE caseBlock (BLOCK (ALT '{' (? (BLOCK (ALT caseClauses))) (? (BLOCK (ALT defaultClause (? (BLOCK (ALT caseClauses)))))) '}')))
 * </pre>
 *
 * <pre>
 * caseBlock
 *     : '{' caseClauses? (defaultClause caseClauses?)? '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1815-1834
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#caseBlock()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.CaseBlockMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CaseBlock")
public interface CaseBlock extends TypeScriptGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_CASE_CLAUSES")
    CaseClauses getCaseClauses();

    void setCaseClauses(CaseClauses setCaseClauses);

    // optional: ?
    @Relation("HAS_DEFAULT_CLAUSE")
    DefaultClause getDefaultClause();

    void setDefaultClause(DefaultClause setDefaultClause);

    // optional: ?
    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
