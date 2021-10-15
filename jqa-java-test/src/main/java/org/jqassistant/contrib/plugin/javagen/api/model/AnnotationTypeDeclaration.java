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
 * public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode AT() {
 *         return getToken(Java8Parser.AT, 0);
 *     }
 *
 *     public TerminalNode INTERFACE() {
 *         return getToken(Java8Parser.INTERFACE, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
 *     }
 *
 *     public AnnotationTypeBodyContext annotationTypeBody() {
 *         return getRuleContext(AnnotationTypeBodyContext.class, 0);
 *     }
 *
 *     public List<InterfaceModifierContext> interfaceModifier() {
 *         return getRuleContexts(InterfaceModifierContext.class);
 *     }
 *
 *     public InterfaceModifierContext interfaceModifier(int i) {
 *         return getRuleContext(InterfaceModifierContext.class, i);
 *     }
 *
 *     public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_annotationTypeDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAnnotationTypeDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAnnotationTypeDeclaration(this);
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
@Label("AnnotationTypeDeclaration")
public interface AnnotationTypeDeclaration extends JavaGen {

    @Relation("HAS_AT")
    TerminalNodeStrings getAT();

    void setAT(TerminalNodeStrings setAT);

    @Relation("HAS_INTERFACE")
    TerminalNodeStrings getINTERFACE();

    void setINTERFACE(TerminalNodeStrings setINTERFACE);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_ANNOTATION_TYPE_BODY")
    AnnotationTypeBody getAnnotationTypeBody();

    void setAnnotationTypeBody(AnnotationTypeBody setAnnotationTypeBody);

    @Relation("HAS_INTERFACE_MODIFIER")
    List<InterfaceModifier> getInterfaceModifier();

    void setInterfaceModifier(List<InterfaceModifier> setInterfaceModifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
