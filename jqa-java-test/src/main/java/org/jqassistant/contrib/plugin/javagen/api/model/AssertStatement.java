//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE assertStatement (BLOCK (ALT 'assert' expression ';') (ALT 'assert' expression ':' expression ';')))
 * </pre>
 *
 * <pre>
 * assertStatement
 * 	:	'assert' expression ';'
 * 	|	'assert' expression ':' expression ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2422-2444
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#assertStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AssertStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AssertStatement")
public interface AssertStatement extends JavaGen {

    // unhandled TerminalAST token: 'assert'
    // unhandled TerminalAST token: ';'
    // unhandled TerminalAST token: 'assert'
    @Relation("HAS_EXPRESSION")
    List<Expression> getExpression();

    void setExpression(List<Expression> setExpression);

    // unhandled TerminalAST token: ':'
    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
