//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE doStatement (BLOCK (ALT 'do' statement 'while' '(' expression ')' ';')))
 * </pre>
 *
 * <pre>
 * doStatement
 * 	:	'do' statement 'while' '(' expression ')' ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2565-2583
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#doStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.DoStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("DoStatement")
public interface DoStatement extends JavaGen {

    // unhandled TerminalAST token: 'do'
    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement statement);

    // unhandled TerminalAST token: 'while'
    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);
    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: ';'
}
