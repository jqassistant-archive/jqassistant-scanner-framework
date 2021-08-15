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
 * (RULE ifThenElseStatementNoShortIf (BLOCK (ALT 'if' '(' expression ')' statementNoShortIf 'else' statementNoShortIf)))
 * </pre>
 *
 * <pre>
 * ifThenElseStatementNoShortIf
 * 	:	'if' '(' expression ')' statementNoShortIf 'else' statementNoShortIf
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2402-2420
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#ifThenElseStatementNoShortIf()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.IfThenElseStatementNoShortIfMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IfThenElseStatementNoShortIf")
public interface IfThenElseStatementNoShortIf extends JavaGen {

    // unhandled TerminalAST token: 'if'
    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT_NO_SHORT_IF")
    List<StatementNoShortIf> getStatementNoShortIf();

    void setStatementNoShortIf(List<StatementNoShortIf> setStatementNoShortIf);

    // unhandled TerminalAST token: 'else'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
