//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE nestedTypeGeneric (BLOCK (ALT typeIncludeGeneric) (ALT typeGeneric)))
 * </pre>
 *
 * <pre>
 * nestedTypeGeneric
 *     : typeIncludeGeneric
 *     | typeGeneric
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:323-333
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#nestedTypeGeneric()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.NestedTypeGenericMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("NestedTypeGeneric")
public interface NestedTypeGeneric extends TypeScriptGen {

    @Relation("HAS_TYPE_INCLUDE_GENERIC")
    TypeIncludeGeneric getTypeIncludeGeneric();

    void setTypeIncludeGeneric(TypeIncludeGeneric setTypeIncludeGeneric);

    @Relation("HAS_TYPE_GENERIC")
    TypeGeneric getTypeGeneric();

    void setTypeGeneric(TypeGeneric setTypeGeneric);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
