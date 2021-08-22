//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE emptyStatement (BLOCK (ALT SemiColon)))
 * </pre>
 *
 * <pre>
 * emptyStatement
 *     : SemiColon
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1504-1510
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#emptyStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.EmptyStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EmptyStatement")
public interface EmptyStatement extends TypeScriptGen {

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
