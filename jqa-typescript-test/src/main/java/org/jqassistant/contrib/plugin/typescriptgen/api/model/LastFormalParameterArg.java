//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE lastFormalParameterArg (BLOCK (ALT Ellipsis Identifier)))
 * </pre>
 *
 * <pre>
 * lastFormalParameterArg                        // ECMAScript 6: Rest Parameter
 *     : Ellipsis Identifier
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2382-2392
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#lastFormalParameterArg()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.LastFormalParameterArgMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("LastFormalParameterArg")
public interface LastFormalParameterArg extends TypeScriptGen {

    @Relation("HAS_ELLIPSIS")
    TerminalNodeStrings getEllipsis();

    void setEllipsis(TerminalNodeStrings setEllipsis);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
