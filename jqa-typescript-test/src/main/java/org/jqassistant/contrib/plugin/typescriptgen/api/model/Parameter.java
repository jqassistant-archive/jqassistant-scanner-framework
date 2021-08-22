//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE parameter (BLOCK (ALT requiredParameter) (ALT optionalParameter)))
 * </pre>
 *
 * <pre>
 * parameter
 *     : requiredParameter
 *     | optionalParameter
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:686-696
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#parameter()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Parameter")
public interface Parameter extends TypeScriptGen {

    @Relation("HAS_REQUIRED_PARAMETER")
    RequiredParameter getRequiredParameter();

    void setRequiredParameter(RequiredParameter setRequiredParameter);

    @Relation("HAS_OPTIONAL_PARAMETER")
    OptionalParameter getOptionalParameter();

    void setOptionalParameter(OptionalParameter setOptionalParameter);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
