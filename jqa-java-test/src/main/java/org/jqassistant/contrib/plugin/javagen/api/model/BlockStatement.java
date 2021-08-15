//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE blockStatement (BLOCK (ALT localVariableDeclarationStatement) (ALT classDeclaration) (ALT statement)))
 * </pre>
 *
 * <pre>
 * blockStatement
 * 	:	localVariableDeclarationStatement
 * 	|	classDeclaration
 * 	|	statement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2149-2163
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#blockStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.BlockStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("BlockStatement")
public interface BlockStatement extends JavaGen {

    @Relation("HAS_LOCAL_VARIABLE_DECLARATION_STATEMENT")
    LocalVariableDeclarationStatement getLocalVariableDeclarationStatement();

    void setLocalVariableDeclarationStatement(LocalVariableDeclarationStatement localVariableDeclarationStatement);

    @Relation("HAS_CLASS_DECLARATION")
    ClassDeclaration getClassDeclaration();

    void setClassDeclaration(ClassDeclaration classDeclaration);

    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement statement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
