//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE throwStatement (BLOCK (ALT 'throw' expression ';')))
 * </pre>
 *
 * <pre>
 * throwStatement
 * 	:	'throw' expression ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2787-2797
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#throwStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ThrowStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ThrowStatement")
public interface ThrowStatement extends JavaGen {

    // unhandled TerminalAST token: 'throw'
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
