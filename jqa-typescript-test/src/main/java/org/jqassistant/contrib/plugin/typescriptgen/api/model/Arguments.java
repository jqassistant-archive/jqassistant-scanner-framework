//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE arguments (BLOCK (ALT '(' (? (BLOCK (ALT argumentList (? (BLOCK (ALT ',')))))) ')')))
 * </pre>
 *
 * <pre>
 * arguments
 *     : '(' (argumentList ','?)? ')'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2636-2652
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#arguments()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ArgumentsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Arguments")
public interface Arguments extends TypeScriptGen {

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_ARGUMENT_LIST")
    ArgumentList getArgumentList();

    void setArgumentList(ArgumentList setArgumentList);

    // optional: ?
    // unhandled TerminalAST token: ','
    // unhandled TerminalAST token: ')'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
