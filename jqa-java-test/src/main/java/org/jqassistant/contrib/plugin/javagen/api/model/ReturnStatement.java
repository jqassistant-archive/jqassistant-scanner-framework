//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE returnStatement (BLOCK (ALT 'return' (? (BLOCK (ALT expression))) ';')))
 * </pre>
 *
 * <pre>
 * returnStatement
 * 	:	'return' expression? ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2774-2785
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#returnStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ReturnStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ReturnStatement")
public interface ReturnStatement extends JavaGen {

    // unhandled TerminalAST token: 'return'
    // optional: ?
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
