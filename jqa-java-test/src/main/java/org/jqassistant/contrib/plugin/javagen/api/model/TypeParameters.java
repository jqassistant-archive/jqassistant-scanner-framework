//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class TypeParametersContext extends ParserRuleContext {
 *
 *     public TerminalNode LT() {
 *         return getToken(Java8Parser.LT, 0);
 *     }
 *
 *     public TypeParameterListContext typeParameterList() {
 *         return getRuleContext(TypeParameterListContext.class, 0);
 *     }
 *
 *     public TerminalNode GT() {
 *         return getToken(Java8Parser.GT, 0);
 *     }
 *
 *     public TypeParametersContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeParameters;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterTypeParameters(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitTypeParameters(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeParametersMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeParameters")
public interface TypeParameters extends JavaGen {

    @Relation("HAS_L_T")
    TerminalNodeStrings getLT();

    void setLT(TerminalNodeStrings setLT);

    @Relation("HAS_TYPE_PARAMETER_LIST")
    TypeParameterList getTypeParameterList();

    void setTypeParameterList(TypeParameterList setTypeParameterList);

    @Relation("HAS_G_T")
    TerminalNodeStrings getGT();

    void setGT(TerminalNodeStrings setGT);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
