//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE ifThenElseStatement (BLOCK (ALT 'if' '(' expression ')' statementNoShortIf 'else' statement)))
 * </pre>
 *
 * <pre>
 * ifThenElseStatement
 * 	:	'if' '(' expression ')' statementNoShortIf 'else' statement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2382-2400
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#ifThenElseStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.IfThenElseStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IfThenElseStatement")
public interface IfThenElseStatement extends JavaGen {

    // unhandled TerminalAST token: 'if'
    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT_NO_SHORT_IF")
    StatementNoShortIf getStatementNoShortIf();

    void setStatementNoShortIf(StatementNoShortIf statementNoShortIf);

    // unhandled TerminalAST token: 'else'
    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement statement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
