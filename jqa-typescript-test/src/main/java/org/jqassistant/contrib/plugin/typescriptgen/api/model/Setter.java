//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE setter (BLOCK (ALT Set propertyName)))
 * </pre>
 *
 * <pre>
 * setter
 *     : Set propertyName
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3781-3789
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#setter()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.SetterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Setter")
public interface Setter extends TypeScriptGen {

    @Relation("HAS_SET")
    TerminalNodeStrings getSet();

    void setSet(TerminalNodeStrings setSet);

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
