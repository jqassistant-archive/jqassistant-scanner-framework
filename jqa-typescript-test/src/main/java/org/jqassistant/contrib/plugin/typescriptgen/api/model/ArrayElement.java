//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE arrayElement (BLOCK (ALT (? (BLOCK (ALT Ellipsis))) (BLOCK (ALT singleExpression) (ALT Identifier)) (? (BLOCK (ALT ','))))))
 * </pre>
 *
 * <pre>
 * arrayElement                      // ECMAScript 6: Spread Operator
 *     : Ellipsis? (singleExpression | Identifier) ','?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2443-2463
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#arrayElement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ArrayElementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrayElement")
public interface ArrayElement extends TypeScriptGen {

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

    // optional: ?
    // unhandled TerminalAST token: ','
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
