//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE finallyProduction (BLOCK (ALT Finally block)))
 * </pre>
 *
 * <pre>
 * finallyProduction
 *     : Finally block
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1936-1944
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#finallyProduction()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FinallyProductionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FinallyProduction")
public interface FinallyProduction extends TypeScriptGen {

    @Relation("HAS_FINALLY")
    TerminalNodeStrings getFinally();

    void setFinally(TerminalNodeStrings setFinally);

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
