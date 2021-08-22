//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE requiredParameterList (BLOCK (ALT requiredParameter (* (BLOCK (ALT ',' requiredParameter))))))
 * </pre>
 *
 * <pre>
 * requiredParameterList
 *     : requiredParameter (',' requiredParameter)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:671-684
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#requiredParameterList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.RequiredParameterListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("RequiredParameterList")
public interface RequiredParameterList extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_REQUIRED_PARAMETER")
    List<RequiredParameter> getRequiredParameter();

    void setRequiredParameter(List<RequiredParameter> setRequiredParameter);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
