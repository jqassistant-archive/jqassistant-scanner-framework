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
 * public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
 *
 *     public UnannTypeContext unannType() {
 *         return getRuleContext(UnannTypeContext.class, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
 *     }
 *
 *     public TerminalNode LPAREN() {
 *         return getToken(Java8Parser.LPAREN, 0);
 *     }
 *
 *     public TerminalNode RPAREN() {
 *         return getToken(Java8Parser.RPAREN, 0);
 *     }
 *
 *     public TerminalNode SEMI() {
 *         return getToken(Java8Parser.SEMI, 0);
 *     }
 *
 *     public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
 *         return getRuleContexts(AnnotationTypeElementModifierContext.class);
 *     }
 *
 *     public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
 *         return getRuleContext(AnnotationTypeElementModifierContext.class, i);
 *     }
 *
 *     public DimsContext dims() {
 *         return getRuleContext(DimsContext.class, 0);
 *     }
 *
 *     public DefaultValueContext defaultValue() {
 *         return getRuleContext(DefaultValueContext.class, 0);
 *     }
 *
 *     public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_annotationTypeElementDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAnnotationTypeElementDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAnnotationTypeElementDeclaration(this);
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
@Label("AnnotationTypeElementDeclaration")
public interface AnnotationTypeElementDeclaration extends JavaGen {

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType setUnannType);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_LPAREN")
    TerminalNodeStrings getLPAREN();

    void setLPAREN(TerminalNodeStrings setLPAREN);

    @Relation("HAS_RPAREN")
    TerminalNodeStrings getRPAREN();

    void setRPAREN(TerminalNodeStrings setRPAREN);

    @Relation("HAS_SEMI")
    TerminalNodeStrings getSEMI();

    void setSEMI(TerminalNodeStrings setSEMI);

    @Relation("HAS_ANNOTATION_TYPE_ELEMENT_MODIFIER")
    List<AnnotationTypeElementModifier> getAnnotationTypeElementModifier();

    void setAnnotationTypeElementModifier(List<AnnotationTypeElementModifier> setAnnotationTypeElementModifier);

    @Relation("HAS_DIMS")
    Dims getDims();

    void setDims(Dims setDims);

    @Relation("HAS_DEFAULT_VALUE")
    DefaultValue getDefaultValue();

    void setDefaultValue(DefaultValue setDefaultValue);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
