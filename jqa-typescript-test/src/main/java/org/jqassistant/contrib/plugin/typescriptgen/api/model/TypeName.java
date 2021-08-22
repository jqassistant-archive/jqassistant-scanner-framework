//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeName (BLOCK (ALT Identifier) (ALT namespaceName)))
 * </pre>
 *
 * <pre>
 * typeName
 *     : Identifier
 *     | namespaceName
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:386-396
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeName()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeNameMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeName")
public interface TypeName extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_NAMESPACE_NAME")
    NamespaceName getNamespaceName();

    void setNamespaceName(NamespaceName setNamespaceName);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
