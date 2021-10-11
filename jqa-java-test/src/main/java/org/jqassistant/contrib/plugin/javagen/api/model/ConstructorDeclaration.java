//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;
import java.util.List;

/**
 * Generated from Parser:
 * <pre>
 * public static class ConstructorDeclarationContext extends ParserRuleContext {
 *
 *     public ConstructorDeclaratorContext constructorDeclarator() {
 *         return getRuleContext(ConstructorDeclaratorContext.class, 0);
 *     }
 *
 *     public ConstructorBodyContext constructorBody() {
 *         return getRuleContext(ConstructorBodyContext.class, 0);
 *     }
 *
 *     public List<ConstructorModifierContext> constructorModifier() {
 *         return getRuleContexts(ConstructorModifierContext.class);
 *     }
 *
 *     public ConstructorModifierContext constructorModifier(int i) {
 *         return getRuleContext(ConstructorModifierContext.class, i);
 *     }
 *
 *     public Throws_Context throws_() {
 *         return getRuleContext(Throws_Context.class, 0);
 *     }
 *
 *     public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_constructorDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterConstructorDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitConstructorDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConstructorDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConstructorDeclaration")
public interface ConstructorDeclaration extends JavaGen {

    @Relation("HAS_CONSTRUCTOR_DECLARATOR")
    ConstructorDeclarator getConstructorDeclarator();

    void setConstructorDeclarator(ConstructorDeclarator setConstructorDeclarator);

    @Relation("HAS_CONSTRUCTOR_BODY")
    ConstructorBody getConstructorBody();

    void setConstructorBody(ConstructorBody setConstructorBody);

    @Relation("HAS_CONSTRUCTOR_MODIFIER")
    List<ConstructorModifier> getConstructorModifier();

    void setConstructorModifier(List<ConstructorModifier> setConstructorModifier);

    @Relation("HAS_THROWS")
    Throws_ getThrows_();

    void setThrows_(Throws_ setThrows_);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
