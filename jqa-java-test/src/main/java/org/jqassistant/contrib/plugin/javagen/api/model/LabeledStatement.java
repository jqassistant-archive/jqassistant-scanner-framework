//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE labeledStatement (BLOCK (ALT Identifier ':' statement)))
 * </pre>
 *
 * <pre>
 * labeledStatement
 * 	:	Identifier ':' statement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2300-2310
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#labeledStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LabeledStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("LabeledStatement")
public interface LabeledStatement extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: ':'
    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
