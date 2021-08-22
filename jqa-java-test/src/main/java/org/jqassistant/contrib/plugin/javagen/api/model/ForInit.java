//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE forInit (BLOCK (ALT statementExpressionList) (ALT localVariableDeclaration)))
 * </pre>
 *
 * <pre>
 * forInit
 * 	:	statementExpressionList
 * 	|	localVariableDeclaration
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2663-2673
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#forInit()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ForInitMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ForInit")
public interface ForInit extends JavaGen {

    @Relation("HAS_STATEMENT_EXPRESSION_LIST")
    StatementExpressionList getStatementExpressionList();

    void setStatementExpressionList(StatementExpressionList setStatementExpressionList);

    @Relation("HAS_LOCAL_VARIABLE_DECLARATION")
    LocalVariableDeclaration getLocalVariableDeclaration();

    void setLocalVariableDeclaration(LocalVariableDeclaration setLocalVariableDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
