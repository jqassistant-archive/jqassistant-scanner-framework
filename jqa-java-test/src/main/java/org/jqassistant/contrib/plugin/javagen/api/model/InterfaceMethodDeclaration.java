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
 * public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
 *
 *     public MethodHeaderContext methodHeader() {
 *         return getRuleContext(MethodHeaderContext.class, 0);
 *     }
 *
 *     public MethodBodyContext methodBody() {
 *         return getRuleContext(MethodBodyContext.class, 0);
 *     }
 *
 *     public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
 *         return getRuleContexts(InterfaceMethodModifierContext.class);
 *     }
 *
 *     public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
 *         return getRuleContext(InterfaceMethodModifierContext.class, i);
 *     }
 *
 *     public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_interfaceMethodDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterInterfaceMethodDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitInterfaceMethodDeclaration(this);
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
@Label("InterfaceMethodDeclaration")
public interface InterfaceMethodDeclaration extends JavaGen {

    @Relation("HAS_METHOD_HEADER")
    MethodHeader getMethodHeader();

    void setMethodHeader(MethodHeader setMethodHeader);

    @Relation("HAS_METHOD_BODY")
    MethodBody getMethodBody();

    void setMethodBody(MethodBody setMethodBody);

    @Relation("HAS_INTERFACE_METHOD_MODIFIER")
    List<InterfaceMethodModifier> getInterfaceMethodModifier();

    void setInterfaceMethodModifier(List<InterfaceMethodModifier> setInterfaceMethodModifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
