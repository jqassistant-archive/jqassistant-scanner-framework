//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE whileStatementNoShortIf (BLOCK (ALT 'while' '(' expression ')' statementNoShortIf)))
 * </pre>
 *
 * <pre>
 * whileStatementNoShortIf
 * 	:	'while' '(' expression ')' statementNoShortIf
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2549-2563
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#whileStatementNoShortIf()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.WhileStatementNoShortIfMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("WhileStatementNoShortIf")
public interface WhileStatementNoShortIf extends JavaGen {

    // unhandled TerminalAST token: 'while'
    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT_NO_SHORT_IF")
    StatementNoShortIf getStatementNoShortIf();

    void setStatementNoShortIf(StatementNoShortIf setStatementNoShortIf);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
