//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class PredefinedTypeContext extends ParserRuleContext {
 *
 *     public TerminalNode Any() {
 *         return getToken(TypeScriptParser.Any, 0);
 *     }
 *
 *     public TerminalNode Number() {
 *         return getToken(TypeScriptParser.Number, 0);
 *     }
 *
 *     public TerminalNode Boolean() {
 *         return getToken(TypeScriptParser.Boolean, 0);
 *     }
 *
 *     public TerminalNode String() {
 *         return getToken(TypeScriptParser.String, 0);
 *     }
 *
 *     public TerminalNode Symbol() {
 *         return getToken(TypeScriptParser.Symbol, 0);
 *     }
 *
 *     public TerminalNode Void() {
 *         return getToken(TypeScriptParser.Void, 0);
 *     }
 *
 *     public PredefinedTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_predefinedType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterPredefinedType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitPredefinedType(this);
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
@Label("PredefinedType")
public interface PredefinedType extends TypeScriptGenAST {

    @Relation("HAS_ANY")
    TerminalNodeStrings getAny();

    void setAny(TerminalNodeStrings setAny);

    @Relation("HAS_NUMBER")
    TerminalNodeStrings getNumber();

    void setNumber(TerminalNodeStrings setNumber);

    @Relation("HAS_BOOLEAN")
    TerminalNodeStrings getBoolean();

    void setBoolean(TerminalNodeStrings setBoolean);

    @Relation("HAS_STRING")
    TerminalNodeStrings getString();

    void setString(TerminalNodeStrings setString);

    @Relation("HAS_SYMBOL")
    TerminalNodeStrings getSymbol();

    void setSymbol(TerminalNodeStrings setSymbol);

    @Relation("HAS_VOID")
    TerminalNodeStrings getVoid();

    void setVoid(TerminalNodeStrings setVoid);
}
