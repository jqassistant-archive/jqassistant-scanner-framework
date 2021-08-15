//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE ifThenStatement (BLOCK (ALT 'if' '(' expression ')' statement)))
 * </pre>
 *
 * <pre>
 * ifThenStatement
 * 	:	'if' '(' expression ')' statement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2366-2380
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#ifThenStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.IfThenStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IfThenStatement")
public interface IfThenStatement extends JavaGen {

    // unhandled TerminalAST token: 'if'
    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement statement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
