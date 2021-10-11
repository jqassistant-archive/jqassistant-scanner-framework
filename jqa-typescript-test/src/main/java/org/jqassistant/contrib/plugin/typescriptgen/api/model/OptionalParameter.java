//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class OptionalParameterContext extends ParserRuleContext {
 *
 *     public IdentifierOrPatternContext identifierOrPattern() {
 *         return getRuleContext(IdentifierOrPatternContext.class, 0);
 *     }
 *
 *     public DecoratorListContext decoratorList() {
 *         return getRuleContext(DecoratorListContext.class, 0);
 *     }
 *
 *     public TerminalNode QuestionMark() {
 *         return getToken(TypeScriptParser.QuestionMark, 0);
 *     }
 *
 *     public InitializerContext initializer() {
 *         return getRuleContext(InitializerContext.class, 0);
 *     }
 *
 *     public AccessibilityModifierContext accessibilityModifier() {
 *         return getRuleContext(AccessibilityModifierContext.class, 0);
 *     }
 *
 *     public TypeAnnotationContext typeAnnotation() {
 *         return getRuleContext(TypeAnnotationContext.class, 0);
 *     }
 *
 *     public OptionalParameterContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_optionalParameter;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterOptionalParameter(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitOptionalParameter(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.OptionalParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("OptionalParameter")
public interface OptionalParameter extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER_OR_PATTERN")
    IdentifierOrPattern getIdentifierOrPattern();

    void setIdentifierOrPattern(IdentifierOrPattern setIdentifierOrPattern);

    @Relation("HAS_DECORATOR_LIST")
    DecoratorList getDecoratorList();

    void setDecoratorList(DecoratorList setDecoratorList);

    @Relation("HAS_QUESTION_MARK")
    TerminalNodeStrings getQuestionMark();

    void setQuestionMark(TerminalNodeStrings setQuestionMark);

    @Relation("HAS_INITIALIZER")
    Initializer getInitializer();

    void setInitializer(Initializer setInitializer);

    @Relation("HAS_ACCESSIBILITY_MODIFIER")
    AccessibilityModifier getAccessibilityModifier();

    void setAccessibilityModifier(AccessibilityModifier setAccessibilityModifier);

    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
