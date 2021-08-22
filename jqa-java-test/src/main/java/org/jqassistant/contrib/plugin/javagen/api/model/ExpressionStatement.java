//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE expressionStatement (BLOCK (ALT statementExpression ';')))
 * </pre>
 *
 * <pre>
 * expressionStatement
 * 	:	statementExpression ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2324-2332
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#expressionStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExpressionStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExpressionStatement")
public interface ExpressionStatement extends JavaGen {

    @Relation("HAS_STATEMENT_EXPRESSION")
    StatementExpression getStatementExpression();

    void setStatementExpression(StatementExpression setStatementExpression);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
