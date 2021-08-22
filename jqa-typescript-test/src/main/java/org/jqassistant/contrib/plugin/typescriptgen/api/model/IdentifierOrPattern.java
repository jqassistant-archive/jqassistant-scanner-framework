//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE identifierOrPattern (BLOCK (ALT identifierName) (ALT bindingPattern)))
 * </pre>
 *
 * <pre>
 * identifierOrPattern
 *     : identifierName
 *     | bindingPattern
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:775-785
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#identifierOrPattern()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IdentifierOrPatternMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IdentifierOrPattern")
public interface IdentifierOrPattern extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER_NAME")
    IdentifierName getIdentifierName();

    void setIdentifierName(IdentifierName setIdentifierName);

    @Relation("HAS_BINDING_PATTERN")
    BindingPattern getBindingPattern();

    void setBindingPattern(BindingPattern setBindingPattern);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
