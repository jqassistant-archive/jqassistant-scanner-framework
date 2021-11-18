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
 * public static class ClassBodyDeclarationContext extends ParserRuleContext {
 *
 *     public ClassMemberDeclarationContext classMemberDeclaration() {
 *         return getRuleContext(ClassMemberDeclarationContext.class, 0);
 *     }
 *
 *     public InstanceInitializerContext instanceInitializer() {
 *         return getRuleContext(InstanceInitializerContext.class, 0);
 *     }
 *
 *     public StaticInitializerContext staticInitializer() {
 *         return getRuleContext(StaticInitializerContext.class, 0);
 *     }
 *
 *     public ConstructorDeclarationContext constructorDeclaration() {
 *         return getRuleContext(ConstructorDeclarationContext.class, 0);
 *     }
 *
 *     public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classBodyDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterClassBodyDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitClassBodyDeclaration(this);
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
@Label("ClassBodyDeclaration")
public interface ClassBodyDeclaration extends JavaGenAST {

    @Relation("HAS_CLASS_MEMBER_DECLARATION")
    ClassMemberDeclaration getClassMemberDeclaration();

    void setClassMemberDeclaration(ClassMemberDeclaration setClassMemberDeclaration);

    @Relation("HAS_INSTANCE_INITIALIZER")
    InstanceInitializer getInstanceInitializer();

    void setInstanceInitializer(InstanceInitializer setInstanceInitializer);

    @Relation("HAS_STATIC_INITIALIZER")
    StaticInitializer getStaticInitializer();

    void setStaticInitializer(StaticInitializer setStaticInitializer);

    @Relation("HAS_CONSTRUCTOR_DECLARATION")
    ConstructorDeclaration getConstructorDeclaration();

    void setConstructorDeclaration(ConstructorDeclaration setConstructorDeclaration);
}
