//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
 *
 *     public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
 *         return getRuleContext(AnnotationTypeElementDeclarationContext.class, 0);
 *     }
 *
 *     public ConstantDeclarationContext constantDeclaration() {
 *         return getRuleContext(ConstantDeclarationContext.class, 0);
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
 *     public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_annotationTypeMemberDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAnnotationTypeMemberDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAnnotationTypeMemberDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationTypeMemberDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AnnotationTypeMemberDeclaration")
public interface AnnotationTypeMemberDeclaration extends JavaGen {

    @Relation("HAS_ANNOTATION_TYPE_ELEMENT_DECLARATION")
    AnnotationTypeElementDeclaration getAnnotationTypeElementDeclaration();

    void setAnnotationTypeElementDeclaration(AnnotationTypeElementDeclaration setAnnotationTypeElementDeclaration);

    @Relation("HAS_CONSTANT_DECLARATION")
    ConstantDeclaration getConstantDeclaration();

    void setConstantDeclaration(ConstantDeclaration setConstantDeclaration);

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
