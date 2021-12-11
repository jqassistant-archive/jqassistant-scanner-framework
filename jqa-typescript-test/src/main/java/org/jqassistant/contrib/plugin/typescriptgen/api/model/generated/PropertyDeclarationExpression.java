//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class PropertyDeclarationExpressionContext extends PropertyMemberDeclarationContext {
 *
 *     public PropertyMemberBaseContext propertyMemberBase() {
 *         return getRuleContext(PropertyMemberBaseContext.class, 0);
 *     }
 *
 *     public PropertyNameContext propertyName() {
 *         return getRuleContext(PropertyNameContext.class, 0);
 *     }
 *
 *     public TerminalNode SemiColon() {
 *         return getToken(TypeScriptParser.SemiColon, 0);
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
 *     public InitializerContext initializer() {
 *         return getRuleContext(InitializerContext.class, 0);
 *     }
 *
 *     public PropertyDeclarationExpressionContext(PropertyMemberDeclarationContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterPropertyDeclarationExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitPropertyDeclarationExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	comments = "REQUIRES_SPECIAL_MAPPING")
@Label("PropertyDeclarationExpression")
public interface PropertyDeclarationExpression extends PropertyMemberDeclaration {

    @Relation("HAS_PROPERTY_MEMBER_BASE")
    PropertyMemberBase getPropertyMemberBase();

    void setPropertyMemberBase(PropertyMemberBase setPropertyMemberBase);

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_QUESTION_MARK")
    TerminalNodeStrings getQuestionMark();

    void setQuestionMark(TerminalNodeStrings setQuestionMark);

    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_INITIALIZER")
    Initializer getInitializer();

    void setInitializer(Initializer setInitializer);
}
