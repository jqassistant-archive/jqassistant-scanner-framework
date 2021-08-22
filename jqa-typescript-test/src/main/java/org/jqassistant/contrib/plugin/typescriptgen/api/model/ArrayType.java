//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE arrayType (BLOCK (ALT primaryType {notLineTerminator()}? '[' ']')))
 * </pre>
 *
 * <pre>
 * arrayType
 *     : primaryType {notLineTerminator()}? '[' ']'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:480-492
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#arrayType()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ArrayTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrayType")
public interface ArrayType extends TypeScriptGen {

    @Relation("HAS_PRIMARY_TYPE")
    PrimaryType getPrimaryType();

    void setPrimaryType(PrimaryType setPrimaryType);

    // unhandled AST type: 59 - list: false : {notLineTerminator()}?
    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
