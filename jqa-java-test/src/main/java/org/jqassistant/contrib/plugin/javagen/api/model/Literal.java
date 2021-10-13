//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class LiteralContext extends ParserRuleContext {
 *
 *     public TerminalNode IntegerLiteral() {
 *         return getToken(Java8Parser.IntegerLiteral, 0);
 *     }
 *
 *     public TerminalNode FloatingPointLiteral() {
 *         return getToken(Java8Parser.FloatingPointLiteral, 0);
 *     }
 *
 *     public TerminalNode BooleanLiteral() {
 *         return getToken(Java8Parser.BooleanLiteral, 0);
 *     }
 *
 *     public TerminalNode CharacterLiteral() {
 *         return getToken(Java8Parser.CharacterLiteral, 0);
 *     }
 *
 *     public TerminalNode StringLiteral() {
 *         return getToken(Java8Parser.StringLiteral, 0);
 *     }
 *
 *     public TerminalNode NullLiteral() {
 *         return getToken(Java8Parser.NullLiteral, 0);
 *     }
 *
 *     public LiteralContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_literal;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterLiteral(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitLiteral(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Literal")
public interface Literal extends JavaGen {

    @Relation("HAS_INTEGER_LITERAL")
    TerminalNodeStrings getIntegerLiteral();

    void setIntegerLiteral(TerminalNodeStrings setIntegerLiteral);

    @Relation("HAS_FLOATING_POINT_LITERAL")
    TerminalNodeStrings getFloatingPointLiteral();

    void setFloatingPointLiteral(TerminalNodeStrings setFloatingPointLiteral);

    @Relation("HAS_BOOLEAN_LITERAL")
    TerminalNodeStrings getBooleanLiteral();

    void setBooleanLiteral(TerminalNodeStrings setBooleanLiteral);

    @Relation("HAS_CHARACTER_LITERAL")
    TerminalNodeStrings getCharacterLiteral();

    void setCharacterLiteral(TerminalNodeStrings setCharacterLiteral);

    @Relation("HAS_STRING_LITERAL")
    TerminalNodeStrings getStringLiteral();

    void setStringLiteral(TerminalNodeStrings setStringLiteral);

    @Relation("HAS_NULL_LITERAL")
    TerminalNodeStrings getNullLiteral();

    void setNullLiteral(TerminalNodeStrings setNullLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
