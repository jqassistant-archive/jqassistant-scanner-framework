//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE caseClauses (BLOCK (ALT (+ (BLOCK (ALT caseClause))))))
 * </pre>
 *
 * <pre>
 * caseClauses
 *     : caseClause+
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1836-1843
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#caseClauses()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.CaseClausesMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CaseClauses")
public interface CaseClauses extends TypeScriptGen {

    @Relation("HAS_CASE_CLAUSE")
    List<CaseClause> getCaseClause();

    void setCaseClause(List<CaseClause> setCaseClause);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
