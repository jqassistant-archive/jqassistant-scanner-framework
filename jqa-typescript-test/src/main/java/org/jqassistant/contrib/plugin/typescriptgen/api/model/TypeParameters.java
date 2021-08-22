//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeParameters (BLOCK (ALT '<' (? (BLOCK (ALT typeParameterList))) '>')))
 * </pre>
 *
 * <pre>
 * typeParameters
 *     : '<' typeParameterList? '>'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:53-64
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeParameters()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeParametersMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeParameters")
public interface TypeParameters extends TypeScriptGen {

    // unhandled TerminalAST token: '<'
    // optional: ?
    @Relation("HAS_TYPE_PARAMETER_LIST")
    TypeParameterList getTypeParameterList();

    void setTypeParameterList(TypeParameterList setTypeParameterList);

    // unhandled TerminalAST token: '>'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
