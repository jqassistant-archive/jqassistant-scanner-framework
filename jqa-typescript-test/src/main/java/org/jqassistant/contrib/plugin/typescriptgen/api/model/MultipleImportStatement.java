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
 * (RULE multipleImportStatement (BLOCK (ALT (? (BLOCK (ALT identifierName ','))) '{' identifierName (* (BLOCK (ALT ',' identifierName))) '}')))
 * </pre>
 *
 * <pre>
 * multipleImportStatement
 *     : (identifierName ',')? '{' identifierName (',' identifierName)* '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1363-1387
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#multipleImportStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.MultipleImportStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MultipleImportStatement")
public interface MultipleImportStatement extends TypeScriptGen {

    // optional: ?
    // unhandled TerminalAST token: ','
    // unhandled TerminalAST token: '{'
    // unhandled TerminalAST token: ','
    @Relation("HAS_IDENTIFIER_NAME")
    List<IdentifierName> getIdentifierName();

    void setIdentifierName(List<IdentifierName> setIdentifierName);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
