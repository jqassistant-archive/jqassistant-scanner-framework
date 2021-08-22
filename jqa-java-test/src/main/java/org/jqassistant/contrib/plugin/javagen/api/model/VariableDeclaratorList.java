//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE variableDeclaratorList (BLOCK (ALT variableDeclarator (* (BLOCK (ALT ',' variableDeclarator))))))
 * </pre>
 *
 * <pre>
 * variableDeclaratorList
 * 	:	variableDeclarator (',' variableDeclarator)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:895-908
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#variableDeclaratorList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.VariableDeclaratorListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("VariableDeclaratorList")
public interface VariableDeclaratorList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_VARIABLE_DECLARATOR")
    List<VariableDeclarator> getVariableDeclarator();

    void setVariableDeclarator(List<VariableDeclarator> setVariableDeclarator);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
