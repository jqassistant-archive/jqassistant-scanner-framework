//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE statement (BLOCK (ALT statementWithoutTrailingSubstatement) (ALT labeledStatement) (ALT ifThenStatement) (ALT ifThenElseStatement) (ALT whileStatement) (ALT forStatement)))
 * </pre>
 *
 * <pre>
 * statement
 * 	:	statementWithoutTrailingSubstatement
 * 	|	labeledStatement
 * 	|	ifThenStatement
 * 	|	ifThenElseStatement
 * 	|	whileStatement
 * 	|	forStatement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2188-2214
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#statement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.StatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Statement")
public interface Statement extends JavaGen {

    @Relation("HAS_STATEMENT_WITHOUT_TRAILING_SUBSTATEMENT")
    StatementWithoutTrailingSubstatement getStatementWithoutTrailingSubstatement();

    void setStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatement setStatementWithoutTrailingSubstatement);

    @Relation("HAS_LABELED_STATEMENT")
    LabeledStatement getLabeledStatement();

    void setLabeledStatement(LabeledStatement setLabeledStatement);

    @Relation("HAS_IF_THEN_STATEMENT")
    IfThenStatement getIfThenStatement();

    void setIfThenStatement(IfThenStatement setIfThenStatement);

    @Relation("HAS_IF_THEN_ELSE_STATEMENT")
    IfThenElseStatement getIfThenElseStatement();

    void setIfThenElseStatement(IfThenElseStatement setIfThenElseStatement);

    @Relation("HAS_WHILE_STATEMENT")
    WhileStatement getWhileStatement();

    void setWhileStatement(WhileStatement setWhileStatement);

    @Relation("HAS_FOR_STATEMENT")
    ForStatement getForStatement();

    void setForStatement(ForStatement setForStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
