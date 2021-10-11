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
 * public static class MethodDeclarationContext extends ParserRuleContext {
 *
 *     public MethodHeaderContext methodHeader() {
 *         return getRuleContext(MethodHeaderContext.class, 0);
 *     }
 *
 *     public MethodBodyContext methodBody() {
 *         return getRuleContext(MethodBodyContext.class, 0);
 *     }
 *
 *     public List<MethodModifierContext> methodModifier() {
 *         return getRuleContexts(MethodModifierContext.class);
 *     }
 *
 *     public MethodModifierContext methodModifier(int i) {
 *         return getRuleContext(MethodModifierContext.class, i);
 *     }
 *
 *     public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_methodDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterMethodDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitMethodDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MethodDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MethodDeclaration")
public interface MethodDeclaration extends JavaGen {

    @Relation("HAS_METHOD_HEADER")
    MethodHeader getMethodHeader();

    void setMethodHeader(MethodHeader setMethodHeader);

    @Relation("HAS_METHOD_BODY")
    MethodBody getMethodBody();

    void setMethodBody(MethodBody setMethodBody);

    @Relation("HAS_METHOD_MODIFIER")
    List<MethodModifier> getMethodModifier();

    void setMethodModifier(List<MethodModifier> setMethodModifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
