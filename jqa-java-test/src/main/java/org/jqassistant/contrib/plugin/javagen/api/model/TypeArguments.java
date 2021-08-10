//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeArguments (BLOCK (ALT '<' typeArgumentList '>')))
 * </pre>
 *
 * <pre>
 * typeArguments
 * 	:	'<' typeArgumentList '>'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:350-360
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeArguments()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeArgumentsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("TypeArguments")
public interface TypeArguments extends JavaGen {

    // unhandled TerminalAST token: '<'
    @Relation("HAS_TYPE_ARGUMENT_LIST")
    TypeArgumentList getTypeArgumentList();

    void setTypeArgumentList(TypeArgumentList typeArgumentList);
    // unhandled TerminalAST token: '>'
}
