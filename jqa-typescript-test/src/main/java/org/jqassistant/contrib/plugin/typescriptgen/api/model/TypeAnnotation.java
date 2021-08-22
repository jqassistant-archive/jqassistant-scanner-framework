//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeAnnotation (BLOCK (ALT ':' type_)))
 * </pre>
 *
 * <pre>
 * typeAnnotation
 *     : ':' type_
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:616-624
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeAnnotation()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeAnnotationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeAnnotation")
public interface TypeAnnotation extends TypeScriptGen {

    // unhandled TerminalAST token: ':'
    @Relation("HAS_TYPE_")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
