//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE arrowFunctionBody (BLOCK (ALT singleExpression) (ALT '{' functionBody '}')))
 * </pre>
 *
 * <pre>
 * arrowFunctionBody
 *     : singleExpression
 *     | '{' functionBody '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3378-3392
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#arrowFunctionBody()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ArrowFunctionBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrowFunctionBody")
public interface ArrowFunctionBody extends TypeScriptGen {

    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    // unhandled TerminalAST token: '{'
    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
