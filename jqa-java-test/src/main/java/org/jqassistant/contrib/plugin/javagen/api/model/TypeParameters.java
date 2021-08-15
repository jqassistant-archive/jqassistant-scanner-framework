//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeParameters (BLOCK (ALT '<' typeParameterList '>')))
 * </pre>
 *
 * <pre>
 * typeParameters
 * 	:	'<' typeParameterList '>'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:725-735
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeParameters()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeParametersMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeParameters")
public interface TypeParameters extends JavaGen {

    // unhandled TerminalAST token: '<'
    @Relation("HAS_TYPE_PARAMETER_LIST")
    TypeParameterList getTypeParameterList();

    void setTypeParameterList(TypeParameterList typeParameterList);

    // unhandled TerminalAST token: '>'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
