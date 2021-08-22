//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE argument (BLOCK (ALT (? (BLOCK (ALT Ellipsis))) (BLOCK (ALT singleExpression) (ALT Identifier)))))
 * </pre>
 *
 * <pre>
 * argument                      // ECMAScript 6: Spread Operator
 *     : Ellipsis? (singleExpression | Identifier)
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2669-2686
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#argument()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ArgumentMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Argument")
public interface Argument extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_ELLIPSIS")
    TerminalNodeStrings getEllipsis();

    void setEllipsis(TerminalNodeStrings setEllipsis);

    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
