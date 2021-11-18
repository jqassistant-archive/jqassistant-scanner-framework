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
 * public static class ReservedWordContext extends ParserRuleContext {
 *
 *     public KeywordContext keyword() {
 *         return getRuleContext(KeywordContext.class, 0);
 *     }
 *
 *     public TerminalNode NullLiteral() {
 *         return getToken(TypeScriptParser.NullLiteral, 0);
 *     }
 *
 *     public TerminalNode BooleanLiteral() {
 *         return getToken(TypeScriptParser.BooleanLiteral, 0);
 *     }
 *
 *     public ReservedWordContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_reservedWord;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterReservedWord(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitReservedWord(this);
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
@Label("ReservedWord")
public interface ReservedWord extends TypeScriptGen {

    @Relation("HAS_KEYWORD")
    Keyword getKeyword();

    void setKeyword(Keyword setKeyword);

    @Relation("HAS_NULL_LITERAL")
    TerminalNodeStrings getNullLiteral();

    void setNullLiteral(TerminalNodeStrings setNullLiteral);

    @Relation("HAS_BOOLEAN_LITERAL")
    TerminalNodeStrings getBooleanLiteral();

    void setBooleanLiteral(TerminalNodeStrings setBooleanLiteral);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
