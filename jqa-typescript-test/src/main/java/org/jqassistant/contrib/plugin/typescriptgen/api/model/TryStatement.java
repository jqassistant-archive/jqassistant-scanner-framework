//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE tryStatement (BLOCK (ALT Try block (BLOCK (ALT catchProduction (? (BLOCK (ALT finallyProduction)))) (ALT finallyProduction)))))
 * </pre>
 *
 * <pre>
 * tryStatement
 *     : Try block (catchProduction finallyProduction? | finallyProduction)
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1899-1918
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#tryStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TryStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TryStatement")
public interface TryStatement extends TypeScriptGen {

    @Relation("HAS_TRY")
    TerminalNodeStrings getTryDescriptor();

    void setTry(TerminalNodeStrings setTry);

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    @Relation("HAS_CATCH_PRODUCTION")
    CatchProduction getCatchProduction();

    void setCatchProduction(CatchProduction setCatchProduction);

    // optional: ?
    @Relation("HAS_FINALLY_PRODUCTION")
    FinallyProduction getFinallyProduction();

    void setFinallyProduction(FinallyProduction setFinallyProduction);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
