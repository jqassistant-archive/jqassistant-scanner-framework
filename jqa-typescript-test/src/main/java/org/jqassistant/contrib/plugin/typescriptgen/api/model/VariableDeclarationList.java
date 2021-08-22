//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE variableDeclarationList (BLOCK (ALT variableDeclaration (* (BLOCK (ALT ',' variableDeclaration))))))
 * </pre>
 *
 * <pre>
 * variableDeclarationList
 *     : variableDeclaration (',' variableDeclaration)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1452-1465
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#variableDeclarationList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.VariableDeclarationListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("VariableDeclarationList")
public interface VariableDeclarationList extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_VARIABLE_DECLARATION")
    List<VariableDeclaration> getVariableDeclaration();

    void setVariableDeclaration(List<VariableDeclaration> setVariableDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
