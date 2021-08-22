//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE asExpression (BLOCK (ALT predefinedType (? (BLOCK (ALT '[' ']')))) (ALT singleExpression)))
 * </pre>
 *
 * <pre>
 * asExpression
 *     : predefinedType ('[' ']')?
 *     | singleExpression
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3324-3341
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#asExpression()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.AsExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AsExpression")
public interface AsExpression extends TypeScriptGen {

    @Relation("HAS_PREDEFINED_TYPE")
    PredefinedType getPredefinedType();

    void setPredefinedType(PredefinedType setPredefinedType);

    // optional: ?
    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
