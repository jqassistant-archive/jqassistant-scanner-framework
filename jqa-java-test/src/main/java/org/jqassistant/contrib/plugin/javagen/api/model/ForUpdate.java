//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE forUpdate (BLOCK (ALT statementExpressionList)))
 * </pre>
 *
 * <pre>
 * forUpdate
 * 	:	statementExpressionList
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2675-2681
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#forUpdate()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ForUpdateMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ForUpdate")
public interface ForUpdate extends JavaGen {

    @Relation("HAS_STATEMENT_EXPRESSION_LIST")
    StatementExpressionList getStatementExpressionList();

    void setStatementExpressionList(StatementExpressionList statementExpressionList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
