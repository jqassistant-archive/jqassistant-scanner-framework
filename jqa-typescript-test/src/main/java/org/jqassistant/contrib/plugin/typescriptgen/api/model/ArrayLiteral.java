//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE arrayLiteral (BLOCK (ALT (BLOCK (ALT '[' (? (BLOCK (ALT elementList))) ']')))))
 * </pre>
 *
 * <pre>
 * arrayLiteral
 *     : ('[' elementList? ']')
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2412-2425
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#arrayLiteral()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ArrayLiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrayLiteral")
public interface ArrayLiteral extends TypeScriptGen {

    // unhandled TerminalAST token: '['
    // optional: ?
    @Relation("HAS_ELEMENT_LIST")
    ElementList getElementList();

    void setElementList(ElementList setElementList);

    // unhandled TerminalAST token: ']'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
