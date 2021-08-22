//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE generatorMethod (BLOCK (ALT (? (BLOCK (ALT '*'))) Identifier '(' (? (BLOCK (ALT formalParameterList))) ')' '{' functionBody '}')))
 * </pre>
 *
 * <pre>
 * generatorMethod
 *     : '*'?  Identifier '(' formalParameterList? ')' '{' functionBody '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2179-2201
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#generatorMethod()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.GeneratorMethodMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("GeneratorMethod")
public interface GeneratorMethod extends TypeScriptGen {

    // optional: ?
    // unhandled TerminalAST token: '*'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList setFormalParameterList);

    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: '{'
    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
