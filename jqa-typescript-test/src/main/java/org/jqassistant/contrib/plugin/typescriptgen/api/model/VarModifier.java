//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class VarModifierContext extends ParserRuleContext {
 *
 *     public TerminalNode Var() {
 *         return getToken(TypeScriptParser.Var, 0);
 *     }
 *
 *     public TerminalNode Let() {
 *         return getToken(TypeScriptParser.Let, 0);
 *     }
 *
 *     public TerminalNode Const() {
 *         return getToken(TypeScriptParser.Const, 0);
 *     }
 *
 *     public VarModifierContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_varModifier;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterVarModifier(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitVarModifier(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
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
