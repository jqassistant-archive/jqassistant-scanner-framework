//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class ExpressionNameContext extends ParserRuleContext {
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
 *     }
 *
 *     public AmbiguousNameContext ambiguousName() {
 *         return getRuleContext(AmbiguousNameContext.class, 0);
 *     }
 *
 *     public TerminalNode DOT() {
 *         return getToken(Java8Parser.DOT, 0);
 *     }
 *
 *     public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_expressionName;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterExpressionName(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitExpressionName(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExpressionName")
public interface ExpressionName extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_AMBIGUOUS_NAME")
    AmbiguousName getAmbiguousName();

    void setAmbiguousName(AmbiguousName setAmbiguousName);

    @Relation("HAS_DOT")
    TerminalNodeStrings getDOT();

    void setDOT(TerminalNodeStrings setDOT);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
