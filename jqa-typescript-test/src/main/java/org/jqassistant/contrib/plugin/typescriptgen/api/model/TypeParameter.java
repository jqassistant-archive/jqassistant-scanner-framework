//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeParameter (BLOCK (ALT Identifier (? (BLOCK (ALT constraint)))) (ALT typeParameters)))
 * </pre>
 *
 * <pre>
 * typeParameter
 *     : Identifier constraint?
 *     | typeParameters
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:81-94
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeParameter()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeParameter")
public interface TypeParameter extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // optional: ?
    @Relation("HAS_CONSTRAINT")
    Constraint getConstraint();

    void setConstraint(Constraint setConstraint);

    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
