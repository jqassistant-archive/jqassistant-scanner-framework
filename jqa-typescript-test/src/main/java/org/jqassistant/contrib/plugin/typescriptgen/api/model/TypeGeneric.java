//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeGeneric (BLOCK (ALT '<' typeArgumentList '>')))
 * </pre>
 *
 * <pre>
 * typeGeneric
 *     : '<' typeArgumentList '>'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:349-359
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeGeneric()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeGenericMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeGeneric")
public interface TypeGeneric extends TypeScriptGen {

    // unhandled TerminalAST token: '<'
    @Relation("HAS_TYPE_ARGUMENT_LIST")
    TypeArgumentList getTypeArgumentList();

    void setTypeArgumentList(TypeArgumentList setTypeArgumentList);

    // unhandled TerminalAST token: '>'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
