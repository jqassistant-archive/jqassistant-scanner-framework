//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
 *
 *     public TypeArgumentsContext typeArguments() {
 *         return getRuleContext(TypeArgumentsContext.class, 0);
 *     }
 *
 *     public TerminalNode LT() {
 *         return getToken(Java8Parser.LT, 0);
 *     }
 *
 *     public TerminalNode GT() {
 *         return getToken(Java8Parser.GT, 0);
 *     }
 *
 *     public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeArgumentsOrDiamond;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterTypeArgumentsOrDiamond(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitTypeArgumentsOrDiamond(this);
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
@Label("TypeArgumentsOrDiamond")
public interface TypeArgumentsOrDiamond extends JavaGenAST {

    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments setTypeArguments);

    @Relation("HAS_LT")
    TerminalNodeStrings getLT();

    void setLT(TerminalNodeStrings setLT);

    @Relation("HAS_GT")
    TerminalNodeStrings getGT();

    void setGT(TerminalNodeStrings setGT);
}
