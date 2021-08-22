//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE basicForStatementNoShortIf (BLOCK (ALT 'for' '(' (? (BLOCK (ALT forInit))) ';' (? (BLOCK (ALT expression))) ';' (? (BLOCK (ALT forUpdate))) ')' statementNoShortIf)))
 * </pre>
 *
 * <pre>
 * basicForStatementNoShortIf
 * 	:	'for' '(' forInit? ';' expression? ';' forUpdate? ')' statementNoShortIf
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2636-2661
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#basicForStatementNoShortIf()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.BasicForStatementNoShortIfMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("BasicForStatementNoShortIf")
public interface BasicForStatementNoShortIf extends JavaGen {

    // unhandled TerminalAST token: 'for'
    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_FOR_INIT")
    ForInit getForInit();

    void setForInit(ForInit setForInit);

    // unhandled TerminalAST token: ';'
    // optional: ?
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    // unhandled TerminalAST token: ';'
    // optional: ?
    @Relation("HAS_FOR_UPDATE")
    ForUpdate getForUpdate();

    void setForUpdate(ForUpdate setForUpdate);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT_NO_SHORT_IF")
    StatementNoShortIf getStatementNoShortIf();

    void setStatementNoShortIf(StatementNoShortIf setStatementNoShortIf);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
