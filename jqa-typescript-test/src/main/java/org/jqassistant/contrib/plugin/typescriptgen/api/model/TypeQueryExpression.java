//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeQueryExpression (BLOCK (ALT Identifier) (ALT (+ (BLOCK (ALT identifierName '.'))) identifierName)))
 * </pre>
 *
 * <pre>
 * typeQueryExpression
 *     : Identifier
 *     | (identifierName '.')+ identifierName
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:573-590
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeQueryExpression()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeQueryExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeQueryExpression")
public interface TypeQueryExpression extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_IDENTIFIER_NAME")
    List<IdentifierName> getIdentifierName();

    void setIdentifierName(List<IdentifierName> setIdentifierName);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
