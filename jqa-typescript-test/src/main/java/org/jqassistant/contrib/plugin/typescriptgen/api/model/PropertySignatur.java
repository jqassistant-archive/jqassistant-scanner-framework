//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class PropertySignaturContext extends ParserRuleContext {
 *
 *     public PropertyNameContext propertyName() {
 *         return getRuleContext(PropertyNameContext.class, 0);
 *     }
 *
 *     public TerminalNode ReadOnly() {
 *         return getToken(TypeScriptParser.ReadOnly, 0);
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
 *     public TerminalNode ARROW() {
 *         return getToken(TypeScriptParser.ARROW, 0);
 *     }
 *
 *     public Type_Context type_() {
 *         return getRuleContext(Type_Context.class, 0);
 *     }
 *
 *     public PropertySignaturContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_propertySignatur;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterPropertySignatur(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitPropertySignatur(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PropertySignatur")
public interface PropertySignatur extends TypeScriptGen {

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    @Relation("HAS_READ_ONLY")
    TerminalNodeStrings getReadOnly();

    void setReadOnly(TerminalNodeStrings setReadOnly);

    @Relation("HAS_QUESTION_MARK")
    TerminalNodeStrings getQuestionMark();

    void setQuestionMark(TerminalNodeStrings setQuestionMark);

    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_ARROW")
    TerminalNodeStrings getARROW();

    void setARROW(TerminalNodeStrings setARROW);

    @Relation("HAS_TYPE")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
