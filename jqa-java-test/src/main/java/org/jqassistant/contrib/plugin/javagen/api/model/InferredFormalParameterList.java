//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE inferredFormalParameterList (BLOCK (ALT Identifier (* (BLOCK (ALT ',' Identifier))))))
 * </pre>
 *
 * <pre>
 * inferredFormalParameterList
 * 	:	Identifier (',' Identifier)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4284-4297
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#inferredFormalParameterList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InferredFormalParameterListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("InferredFormalParameterList")
public interface InferredFormalParameterList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifier();

    void setIdentifier(List<TerminalNodeStrings> setIdentifier);
}
