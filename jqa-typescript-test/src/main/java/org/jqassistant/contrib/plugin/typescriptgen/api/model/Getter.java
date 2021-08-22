//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE getter (BLOCK (ALT Get propertyName)))
 * </pre>
 *
 * <pre>
 * getter
 *     : Get propertyName
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3771-3779
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#getter()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.GetterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Getter")
public interface Getter extends TypeScriptGen {

    @Relation("HAS_GET")
    TerminalNodeStrings getGet();

    void setGet(TerminalNodeStrings setGet);

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
