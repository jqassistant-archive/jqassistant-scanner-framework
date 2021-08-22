//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE initializer (BLOCK (ALT '=' singleExpression)))
 * </pre>
 *
 * <pre>
 * initializer
 *     : '=' singleExpression
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:25-33
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#initializer()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.InitializerMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Initializer")
public interface Initializer extends TypeScriptGen {

    // unhandled TerminalAST token: '='
    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
