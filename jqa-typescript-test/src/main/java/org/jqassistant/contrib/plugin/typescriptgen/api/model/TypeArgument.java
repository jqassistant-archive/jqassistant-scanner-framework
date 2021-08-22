//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeArgument (BLOCK (ALT type_)))
 * </pre>
 *
 * <pre>
 * typeArgument
 *     : type_
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:134-140
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeArgument()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeArgumentMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeArgument")
public interface TypeArgument extends TypeScriptGen {

    @Relation("HAS_TYPE")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
