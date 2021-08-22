//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE propertySignatur (BLOCK (ALT (? (BLOCK (ALT ReadOnly))) propertyName (? (BLOCK (ALT '?'))) (? (BLOCK (ALT typeAnnotation))) (? (BLOCK (ALT '=>' type_))))))
 * </pre>
 *
 * <pre>
 * propertySignatur
 *     : ReadOnly? propertyName '?'? typeAnnotation? ('=>' type_)?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:592-614
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#propertySignatur()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.PropertySignaturMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PropertySignatur")
public interface PropertySignatur extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_READ_ONLY")
    TerminalNodeStrings getReadOnly();

    void setReadOnly(TerminalNodeStrings setReadOnly);

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    // optional: ?
    // unhandled TerminalAST token: '?'
    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    // optional: ?
    // unhandled TerminalAST token: '=>'
    @Relation("HAS_TYPE_")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
