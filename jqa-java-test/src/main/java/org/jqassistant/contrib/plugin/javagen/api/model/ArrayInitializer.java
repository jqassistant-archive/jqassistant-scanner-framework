//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE arrayInitializer (BLOCK (ALT '{' (? (BLOCK (ALT variableInitializerList))) (? (BLOCK (ALT ','))) '}')))
 * </pre>
 *
 * <pre>
 * arrayInitializer
 * 	:	'{' variableInitializerList? ','? '}'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2094-2108
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#arrayInitializer()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ArrayInitializerMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrayInitializer")
public interface ArrayInitializer extends JavaGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_VARIABLE_INITIALIZER_LIST")
    VariableInitializerList getVariableInitializerList();

    void setVariableInitializerList(VariableInitializerList setVariableInitializerList);

    // optional: ?
    // unhandled TerminalAST token: ','
    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
