//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE lambdaParameters (BLOCK (ALT Identifier) (ALT '(' (? (BLOCK (ALT formalParameterList))) ')') (ALT '(' inferredFormalParameterList ')')))
 * </pre>
 *
 * <pre>
 * lambdaParameters
 * 	:	Identifier
 * 	|	'(' formalParameterList? ')'
 * 	|	'(' inferredFormalParameterList ')'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4259-4282
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#lambdaParameters()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LambdaParametersMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("LambdaParameters")
public interface LambdaParameters extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList formalParameterList);

    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: '('
    @Relation("HAS_INFERRED_FORMAL_PARAMETER_LIST")
    InferredFormalParameterList getInferredFormalParameterList();

    void setInferredFormalParameterList(InferredFormalParameterList inferredFormalParameterList);
    // unhandled TerminalAST token: ')'
}
