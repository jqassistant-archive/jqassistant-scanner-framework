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
 * public static class TypeBoundContext extends ParserRuleContext {
 *
 *     public TerminalNode EXTENDS() {
 *         return getToken(Java8Parser.EXTENDS, 0);
 *     }
 *
 *     public TypeVariableContext typeVariable() {
 *         return getRuleContext(TypeVariableContext.class, 0);
 *     }
 *
 *     public ClassOrInterfaceTypeContext classOrInterfaceType() {
 *         return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public List<AdditionalBoundContext> additionalBound() {
 *         return getRuleContexts(AdditionalBoundContext.class);
 *     }
 *
 *     public AdditionalBoundContext additionalBound(int i) {
 *         return getRuleContext(AdditionalBoundContext.class, i);
 *     }
 *
 *     public TypeBoundContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeBound;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterTypeBound(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitTypeBound(this);
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
@Label("TypeBound")
public interface TypeBound extends JavaGen {

    @Relation("HAS_EXTENDS")
    TerminalNodeStrings getEXTENDS();

    void setEXTENDS(TerminalNodeStrings setEXTENDS);

    @Relation("HAS_TYPE_VARIABLE")
    TypeVariable getTypeVariable();

    void setTypeVariable(TypeVariable setTypeVariable);

    @Relation("HAS_CLASS_OR_INTERFACE_TYPE")
    ClassOrInterfaceType getClassOrInterfaceType();

    void setClassOrInterfaceType(ClassOrInterfaceType setClassOrInterfaceType);

    @Relation("HAS_ADDITIONAL_BOUND")
    List<AdditionalBound> getAdditionalBound();

    void setAdditionalBound(List<AdditionalBound> setAdditionalBound);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
