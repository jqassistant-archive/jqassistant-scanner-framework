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
 * (RULE argumentList (BLOCK (ALT argument (* (BLOCK (ALT ',' argument))))))
 * </pre>
 *
 * <pre>
 * argumentList
 *     : argument (',' argument)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2654-2667
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#argumentList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ArgumentListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArgumentList")
public interface ArgumentList extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_ARGUMENT")
    List<Argument> getArgument();

    void setArgument(List<Argument> setArgument);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
