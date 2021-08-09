//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE basicForStatement (BLOCK (ALT 'for' '(' (? (BLOCK (ALT forInit))) ';' (? (BLOCK (ALT expression))) ';' (? (BLOCK (ALT forUpdate))) ')' statement)))
 * </pre>
 *
 * <pre>
 * basicForStatement
 * 	:	'for' '(' forInit? ';' expression? ';' forUpdate? ')' statement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2609-2634
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#basicForStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.BasicForStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("BasicForStatement")
public interface BasicForStatement extends JavaGen {

    // unhandled TerminalAST token: 'for'
    // unhandled TerminalAST token: '('
    // optional: forInit
    @Relation("HAS_FOR_INIT")
    ForInit getForInit();

    void setForInit(ForInit forInit);

    // unhandled TerminalAST token: ';'
    // optional: expression
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ';'
    // optional: forUpdate
    @Relation("HAS_FOR_UPDATE")
    ForUpdate getForUpdate();

    void setForUpdate(ForUpdate forUpdate);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement statement);
}
