//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE localVariableDeclarationStatement (BLOCK (ALT localVariableDeclaration ';')))
 * </pre>
 *
 * <pre>
 * localVariableDeclarationStatement
 * 	:	localVariableDeclaration ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2165-2173
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#localVariableDeclarationStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LocalVariableDeclarationStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("LocalVariableDeclarationStatement")
public interface LocalVariableDeclarationStatement extends JavaGen {

    @Relation("HAS_LOCAL_VARIABLE_DECLARATION")
    LocalVariableDeclaration getLocalVariableDeclaration();

    void setLocalVariableDeclaration(LocalVariableDeclaration localVariableDeclaration);
    // unhandled TerminalAST token: ';'
}
