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
 * public static class TypeArgumentsContext extends ParserRuleContext {
 *
 *     public TerminalNode LT() {
 *         return getToken(Java8Parser.LT, 0);
 *     }
 *
 *     public TypeArgumentListContext typeArgumentList() {
 *         return getRuleContext(TypeArgumentListContext.class, 0);
 *     }
 *
 *     public TerminalNode GT() {
 *         return getToken(Java8Parser.GT, 0);
 *     }
 *
 *     public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeArguments;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterTypeArguments(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitTypeArguments(this);
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
@Label("TypeArguments")
public interface TypeArguments extends JavaGen {

    @Relation("HAS_LT")
    TerminalNodeStrings getLT();

    void setLT(TerminalNodeStrings setLT);

    @Relation("HAS_TYPE_ARGUMENT_LIST")
    TypeArgumentList getTypeArgumentList();

    void setTypeArgumentList(TypeArgumentList setTypeArgumentList);

    @Relation("HAS_GT")
    TerminalNodeStrings getGT();

    void setGT(TerminalNodeStrings setGT);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
