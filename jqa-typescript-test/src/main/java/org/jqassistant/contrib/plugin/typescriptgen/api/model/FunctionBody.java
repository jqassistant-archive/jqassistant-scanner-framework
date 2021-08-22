//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE functionBody (BLOCK (ALT (? (BLOCK (ALT sourceElements))))))
 * </pre>
 *
 * <pre>
 * functionBody
 *     : sourceElements?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2394-2401
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#functionBody()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FunctionBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FunctionBody")
public interface FunctionBody extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_SOURCE_ELEMENTS")
    SourceElements getSourceElements();

    void setSourceElements(SourceElements setSourceElements);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
