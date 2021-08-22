//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE objectType (BLOCK (ALT '{' (? (BLOCK (ALT typeBody))) '}')))
 * </pre>
 *
 * <pre>
 * objectType
 *     : '{' typeBody? '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:398-409
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#objectType()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ObjectTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ObjectType")
public interface ObjectType extends TypeScriptGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_TYPE_BODY")
    TypeBody getTypeBody();

    void setTypeBody(TypeBody setTypeBody);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
