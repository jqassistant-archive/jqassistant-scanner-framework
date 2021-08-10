//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE variableDeclarator (BLOCK (ALT variableDeclaratorId (? (BLOCK (ALT '=' variableInitializer))))))
 * </pre>
 *
 * <pre>
 * variableDeclarator
 * 	:	variableDeclaratorId ('=' variableInitializer)?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:910-923
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#variableDeclarator()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.VariableDeclaratorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("VariableDeclarator")
public interface VariableDeclarator extends JavaGen {

    @Relation("HAS_VARIABLE_DECLARATOR_ID")
    VariableDeclaratorId getVariableDeclaratorId();

    void setVariableDeclaratorId(VariableDeclaratorId variableDeclaratorId);

    // optional: ?
    // unhandled TerminalAST token: '='
    @Relation("HAS_VARIABLE_INITIALIZER")
    VariableInitializer getVariableInitializer();

    void setVariableInitializer(VariableInitializer variableInitializer);
}
