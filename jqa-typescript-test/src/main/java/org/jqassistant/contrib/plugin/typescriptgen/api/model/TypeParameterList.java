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
 * (RULE typeParameterList (BLOCK (ALT typeParameter (* (BLOCK (ALT ',' typeParameter))))))
 * </pre>
 *
 * <pre>
 * typeParameterList
 *     : typeParameter (',' typeParameter)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:66-79
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeParameterList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeParameterListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeParameterList")
public interface TypeParameterList extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_TYPE_PARAMETER")
    List<TypeParameter> getTypeParameter();

    void setTypeParameter(List<TypeParameter> setTypeParameter);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
