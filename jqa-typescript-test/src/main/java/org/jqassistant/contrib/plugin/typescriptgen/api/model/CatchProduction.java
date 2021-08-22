//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE catchProduction (BLOCK (ALT Catch '(' Identifier ')' block)))
 * </pre>
 *
 * <pre>
 * catchProduction
 *     : Catch '(' Identifier ')' block
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1920-1934
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#catchProduction()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.CatchProductionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CatchProduction")
public interface CatchProduction extends TypeScriptGen {

    @Relation("HAS_CATCH")
    TerminalNodeStrings getCatch();

    void setCatch(TerminalNodeStrings setCatch);

    // unhandled TerminalAST token: '('
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
