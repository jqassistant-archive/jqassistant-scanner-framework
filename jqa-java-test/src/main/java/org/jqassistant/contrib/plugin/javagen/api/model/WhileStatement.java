//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE whileStatement (BLOCK (ALT 'while' '(' expression ')' statement)))
 * </pre>
 *
 * <pre>
 * whileStatement
 * 	:	'while' '(' expression ')' statement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2533-2547
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#whileStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.WhileStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("WhileStatement")
public interface WhileStatement extends JavaGen {

    // unhandled TerminalAST token: 'while'
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
