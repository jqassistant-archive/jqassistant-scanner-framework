//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE iteratorDefinition (BLOCK (ALT '[' singleExpression ']' '(' (? (BLOCK (ALT formalParameterList))) ')' '{' functionBody '}')))
 * </pre>
 *
 * <pre>
 * iteratorDefinition
 *     : '[' singleExpression ']' '(' formalParameterList? ')' '{' functionBody '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2283-2306
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#iteratorDefinition()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IteratorDefinitionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IteratorDefinition")
public interface IteratorDefinition extends TypeScriptGen {

    // unhandled TerminalAST token: '['
    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    // unhandled TerminalAST token: ']'
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
