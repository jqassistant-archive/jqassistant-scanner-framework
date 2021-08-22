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
 * (RULE parameterList (BLOCK (ALT restParameter) (ALT parameter (* (BLOCK (ALT ',' parameter))) (? (BLOCK (ALT ',' restParameter))))))
 * </pre>
 *
 * <pre>
 * parameterList
 *     : restParameter
 *     | parameter (',' parameter)* (',' restParameter)?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:645-669
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#parameterList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ParameterListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ParameterList")
public interface ParameterList extends TypeScriptGen {

    @Relation("HAS_REST_PARAMETER")
    RestParameter getRestParameter();

    void setRestParameter(RestParameter setRestParameter);

    // unhandled TerminalAST token: ','
    @Relation("HAS_PARAMETER")
    List<Parameter> getParameter();

    void setParameter(List<Parameter> setParameter);

    // optional: ?
    // unhandled TerminalAST token: ','
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
