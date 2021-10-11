//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class FormalParameterArgContext extends ParserRuleContext {
 *
 *     public IdentifierOrKeyWordContext identifierOrKeyWord() {
 *         return getRuleContext(IdentifierOrKeyWordContext.class, 0);
 *     }
 *
 *     public DecoratorContext decorator() {
 *         return getRuleContext(DecoratorContext.class, 0);
 *     }
 *
 *     public AccessibilityModifierContext accessibilityModifier() {
 *         return getRuleContext(AccessibilityModifierContext.class, 0);
 *     }
 *
 *     public TerminalNode QuestionMark() {
 *         return getToken(TypeScriptParser.QuestionMark, 0);
 *     }
 *
 *     public TypeAnnotationContext typeAnnotation() {
 *         return getRuleContext(TypeAnnotationContext.class, 0);
 *     }
 *
 *     public TerminalNode Assign() {
 *         return getToken(TypeScriptParser.Assign, 0);
 *     }
 *
 *     public SingleExpressionContext singleExpression() {
 *         return getRuleContext(SingleExpressionContext.class, 0);
 *     }
 *
 *     public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_formalParameterArg;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterFormalParameterArg(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitFormalParameterArg(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FormalParameterArgMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FormalParameterArg")
public interface FormalParameterArg extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER_OR_KEY_WORD")
    IdentifierOrKeyWord getIdentifierOrKeyWord();

    void setIdentifierOrKeyWord(IdentifierOrKeyWord setIdentifierOrKeyWord);

    @Relation("HAS_DECORATOR")
    Decorator getDecorator();

    void setDecorator(Decorator setDecorator);

    @Relation("HAS_ACCESSIBILITY_MODIFIER")
    AccessibilityModifier getAccessibilityModifier();

    void setAccessibilityModifier(AccessibilityModifier setAccessibilityModifier);

    @Relation("HAS_QUESTION_MARK")
    TerminalNodeStrings getQuestionMark();

    void setQuestionMark(TerminalNodeStrings setQuestionMark);

    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_ASSIGN")
    TerminalNodeStrings getAssign();

    void setAssign(TerminalNodeStrings setAssign);

    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
