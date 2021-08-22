//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE varModifier (BLOCK (ALT Var) (ALT Let) (ALT Const)))
 * </pre>
 *
 * <pre>
 * varModifier
 *     : Var
 *     | Let
 *     | Const
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1699-1713
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#varModifier()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.VarModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("VarModifier")
public interface VarModifier extends TypeScriptGen {

    @Relation("HAS_VAR")
    TerminalNodeStrings getVar();

    void setVar(TerminalNodeStrings setVar);

    @Relation("HAS_LET")
    TerminalNodeStrings getLet();

    void setLet(TerminalNodeStrings setLet);

    @Relation("HAS_CONST")
    TerminalNodeStrings getConst();

    void setConst(TerminalNodeStrings setConst);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
