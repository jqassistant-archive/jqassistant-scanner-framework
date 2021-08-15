//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeParameter (BLOCK (ALT (* (BLOCK (ALT typeParameterModifier))) Identifier (? (BLOCK (ALT typeBound))))))
 * </pre>
 *
 * <pre>
 * typeParameter
 * 	:	typeParameterModifier* Identifier typeBound?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:299-311
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeParameter()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeParameter")
public interface TypeParameter extends JavaGen {

    @Relation("HAS_TYPE_PARAMETER_MODIFIER")
    List<TypeParameterModifier> getTypeParameterModifier();

    void setTypeParameterModifier(List<TypeParameterModifier> setTypeParameterModifier);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // optional: ?
    @Relation("HAS_TYPE_BOUND")
    TypeBound getTypeBound();

    void setTypeBound(TypeBound typeBound);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
