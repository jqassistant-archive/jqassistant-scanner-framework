//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeReference (BLOCK (ALT typeName (? (BLOCK (ALT nestedTypeGeneric))))))
 * </pre>
 *
 * <pre>
 * typeReference
 *     : typeName nestedTypeGeneric?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:312-321
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeReference()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeReferenceMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeReference")
public interface TypeReference extends TypeScriptGen {

    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName setTypeName);

    // optional: ?
    @Relation("HAS_NESTED_TYPE_GENERIC")
    NestedTypeGeneric getNestedTypeGeneric();

    void setNestedTypeGeneric(NestedTypeGeneric setNestedTypeGeneric);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
