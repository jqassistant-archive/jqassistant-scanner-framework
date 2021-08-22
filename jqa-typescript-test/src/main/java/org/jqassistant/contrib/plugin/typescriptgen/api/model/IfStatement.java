//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE ifStatement (BLOCK (ALT If '(' expressionSequence ')' statement (? (BLOCK (ALT Else statement))))))
 * </pre>
 *
 * <pre>
 * ifStatement
 *     : If '(' expressionSequence ')' statement (Else statement)?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1525-1546
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#ifStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IfStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IfStatement")
public interface IfStatement extends TypeScriptGen {

    @Relation("HAS_IF")
    TerminalNodeStrings getIf();

    void setIf(TerminalNodeStrings setIf);

    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT")
    List<Statement> getStatement();

    void setStatement(List<Statement> setStatement);

    // optional: ?
    @Relation("HAS_ELSE")
    TerminalNodeStrings getElse();

    void setElse(TerminalNodeStrings setElse);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
