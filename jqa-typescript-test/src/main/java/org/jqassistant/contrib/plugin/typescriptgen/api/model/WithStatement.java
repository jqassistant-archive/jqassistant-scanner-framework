//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE withStatement (BLOCK (ALT With '(' expressionSequence ')' statement)))
 * </pre>
 *
 * <pre>
 * withStatement
 *     : With '(' expressionSequence ')' statement
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1783-1797
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#withStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.WithStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("WithStatement")
public interface WithStatement extends TypeScriptGen {

    @Relation("HAS_WITH")
    TerminalNodeStrings getWith();

    void setWith(TerminalNodeStrings setWith);

    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
