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
 * public static class NumericLiteralContext extends ParserRuleContext {
 *
 *     public TerminalNode DecimalLiteral() {
 *         return getToken(TypeScriptParser.DecimalLiteral, 0);
 *     }
 *
 *     public TerminalNode HexIntegerLiteral() {
 *         return getToken(TypeScriptParser.HexIntegerLiteral, 0);
 *     }
 *
 *     public TerminalNode OctalIntegerLiteral() {
 *         return getToken(TypeScriptParser.OctalIntegerLiteral, 0);
 *     }
 *
 *     public TerminalNode OctalIntegerLiteral2() {
 *         return getToken(TypeScriptParser.OctalIntegerLiteral2, 0);
 *     }
 *
 *     public TerminalNode BinaryIntegerLiteral() {
 *         return getToken(TypeScriptParser.BinaryIntegerLiteral, 0);
 *     }
 *
 *     public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_numericLiteral;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterNumericLiteral(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitNumericLiteral(this);
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
@Label("NumericLiteral")
public interface NumericLiteral extends TypeScriptGen {

    @Relation("HAS_DECIMAL_LITERAL")
    TerminalNodeStrings getDecimalLiteral();

    void setDecimalLiteral(TerminalNodeStrings setDecimalLiteral);

    @Relation("HAS_HEX_INTEGER_LITERAL")
    TerminalNodeStrings getHexIntegerLiteral();

    void setHexIntegerLiteral(TerminalNodeStrings setHexIntegerLiteral);

    @Relation("HAS_OCTAL_INTEGER_LITERAL")
    TerminalNodeStrings getOctalIntegerLiteral();

    void setOctalIntegerLiteral(TerminalNodeStrings setOctalIntegerLiteral);

    @Relation("HAS_OCTAL_INTEGER_LITERAL2")
    TerminalNodeStrings getOctalIntegerLiteral2();

    void setOctalIntegerLiteral2(TerminalNodeStrings setOctalIntegerLiteral2);

    @Relation("HAS_BINARY_INTEGER_LITERAL")
    TerminalNodeStrings getBinaryIntegerLiteral();

    void setBinaryIntegerLiteral(TerminalNodeStrings setBinaryIntegerLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
