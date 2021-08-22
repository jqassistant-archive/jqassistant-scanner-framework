//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE caseClause (BLOCK (ALT Case expressionSequence ':' (? (BLOCK (ALT statementList))))))
 * </pre>
 *
 * <pre>
 * caseClause
 *     : Case expressionSequence ':' statementList?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1845-1858
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#caseClause()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.CaseClauseMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CaseClause")
public interface CaseClause extends TypeScriptGen {

    @Relation("HAS_CASE")
    TerminalNodeStrings getCase();

    void setCase(TerminalNodeStrings setCase);

    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    // unhandled TerminalAST token: ':'
    // optional: ?
    @Relation("HAS_STATEMENT_LIST")
    StatementList getStatementList();

    void setStatementList(StatementList setStatementList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
