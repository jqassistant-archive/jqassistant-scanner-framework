//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class ClassMemberDeclarationContext extends ParserRuleContext {
 *
 *     public FieldDeclarationContext fieldDeclaration() {
 *         return getRuleContext(FieldDeclarationContext.class, 0);
 *     }
 *
 *     public MethodDeclarationContext methodDeclaration() {
 *         return getRuleContext(MethodDeclarationContext.class, 0);
 *     }
 *
 *     public ClassDeclarationContext classDeclaration() {
 *         return getRuleContext(ClassDeclarationContext.class, 0);
 *     }
 *
 *     public InterfaceDeclarationContext interfaceDeclaration() {
 *         return getRuleContext(InterfaceDeclarationContext.class, 0);
 *     }
 *
 *     public TerminalNode SEMI() {
 *         return getToken(Java8Parser.SEMI, 0);
 *     }
 *
 *     public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classMemberDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterClassMemberDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitClassMemberDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassMemberDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassMemberDeclaration")
public interface ClassMemberDeclaration extends JavaGen {

    @Relation("HAS_FIELD_DECLARATION")
    FieldDeclaration getFieldDeclaration();

    void setFieldDeclaration(FieldDeclaration setFieldDeclaration);

    @Relation("HAS_METHOD_DECLARATION")
    MethodDeclaration getMethodDeclaration();

    void setMethodDeclaration(MethodDeclaration setMethodDeclaration);

    @Relation("HAS_CLASS_DECLARATION")
    ClassDeclaration getClassDeclaration();

    void setClassDeclaration(ClassDeclaration setClassDeclaration);

    @Relation("HAS_INTERFACE_DECLARATION")
    InterfaceDeclaration getInterfaceDeclaration();

    void setInterfaceDeclaration(InterfaceDeclaration setInterfaceDeclaration);

    @Relation("HAS_S_E_M_I")
    TerminalNodeStrings getSEMI();

    void setSEMI(TerminalNodeStrings setSEMI);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
