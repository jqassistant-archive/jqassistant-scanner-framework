//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class InterfaceDeclarationContext extends ParserRuleContext {
 *
 *     public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
 *         return getRuleContext(NormalInterfaceDeclarationContext.class, 0);
 *     }
 *
 *     public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
 *         return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
 *     }
 *
 *     public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_interfaceDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterInterfaceDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitInterfaceDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceDeclaration")
public interface InterfaceDeclaration extends JavaGen {

    @Relation("HAS_NORMAL_INTERFACE_DECLARATION")
    NormalInterfaceDeclaration getNormalInterfaceDeclaration();

    void setNormalInterfaceDeclaration(NormalInterfaceDeclaration setNormalInterfaceDeclaration);

    @Relation("HAS_ANNOTATION_TYPE_DECLARATION")
    AnnotationTypeDeclaration getAnnotationTypeDeclaration();

    void setAnnotationTypeDeclaration(AnnotationTypeDeclaration setAnnotationTypeDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
