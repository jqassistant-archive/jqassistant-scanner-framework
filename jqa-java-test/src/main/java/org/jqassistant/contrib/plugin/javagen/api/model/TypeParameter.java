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
 * public static class TypeParameterContext extends ParserRuleContext {
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
 *     }
 *
 *     public List<TypeParameterModifierContext> typeParameterModifier() {
 *         return getRuleContexts(TypeParameterModifierContext.class);
 *     }
 *
 *     public TypeParameterModifierContext typeParameterModifier(int i) {
 *         return getRuleContext(TypeParameterModifierContext.class, i);
 *     }
 *
 *     public TypeBoundContext typeBound() {
 *         return getRuleContext(TypeBoundContext.class, 0);
 *     }
 *
 *     public TypeParameterContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeParameter;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterTypeParameter(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitTypeParameter(this);
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
@Label("TypeParameter")
public interface TypeParameter extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_TYPE_PARAMETER_MODIFIER")
    List<TypeParameterModifier> getTypeParameterModifier();

    void setTypeParameterModifier(List<TypeParameterModifier> setTypeParameterModifier);

    @Relation("HAS_TYPE_BOUND")
    TypeBound getTypeBound();

    void setTypeBound(TypeBound setTypeBound);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
