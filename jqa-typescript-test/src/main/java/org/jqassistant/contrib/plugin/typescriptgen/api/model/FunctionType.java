//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE functionType (BLOCK (ALT (? (BLOCK (ALT typeParameters))) '(' (? (BLOCK (ALT parameterList))) ')' '=>' type_)))
 * </pre>
 *
 * <pre>
 * functionType
 *     : typeParameters? '(' parameterList? ')' '=>' type_
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:521-539
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#functionType()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FunctionTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FunctionType")
public interface FunctionType extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_PARAMETER_LIST")
    ParameterList getParameterList();

    void setParameterList(ParameterList setParameterList);

    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: '=>'
    @Relation("HAS_TYPE_")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
