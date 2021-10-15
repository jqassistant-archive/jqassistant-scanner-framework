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
 * public static class EqualityExpressionContext extends ParserRuleContext {
 *
 *     public RelationalExpressionContext relationalExpression() {
 *         return getRuleContext(RelationalExpressionContext.class, 0);
 *     }
 *
 *     public EqualityExpressionContext equalityExpression() {
 *         return getRuleContext(EqualityExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode EQUAL() {
 *         return getToken(Java8Parser.EQUAL, 0);
 *     }
 *
 *     public TerminalNode NOTEQUAL() {
 *         return getToken(Java8Parser.NOTEQUAL, 0);
 *     }
 *
 *     public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_equalityExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterEqualityExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitEqualityExpression(this);
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
@Label("EqualityExpression")
public interface EqualityExpression extends JavaGen {

    @Relation("HAS_RELATIONAL_EXPRESSION")
    RelationalExpression getRelationalExpression();

    void setRelationalExpression(RelationalExpression setRelationalExpression);

    @Relation("HAS_EQUALITY_EXPRESSION")
    EqualityExpression getEqualityExpression();

    void setEqualityExpression(EqualityExpression setEqualityExpression);

    @Relation("HAS_EQUAL")
    TerminalNodeStrings getEQUAL();

    void setEQUAL(TerminalNodeStrings setEQUAL);

    @Relation("HAS_NOTEQUAL")
    TerminalNodeStrings getNOTEQUAL();

    void setNOTEQUAL(TerminalNodeStrings setNOTEQUAL);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
