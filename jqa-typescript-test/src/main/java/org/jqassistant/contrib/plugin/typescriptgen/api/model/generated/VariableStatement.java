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
 * public static class VariableStatementContext extends ParserRuleContext {
 *
 *     public BindingPatternContext bindingPattern() {
 *         return getRuleContext(BindingPatternContext.class, 0);
 *     }
 *
 *     public InitializerContext initializer() {
 *         return getRuleContext(InitializerContext.class, 0);
 *     }
 *
 *     public TypeAnnotationContext typeAnnotation() {
 *         return getRuleContext(TypeAnnotationContext.class, 0);
 *     }
 *
 *     public TerminalNode SemiColon() {
 *         return getToken(TypeScriptParser.SemiColon, 0);
 *     }
 *
 *     public VariableDeclarationListContext variableDeclarationList() {
 *         return getRuleContext(VariableDeclarationListContext.class, 0);
 *     }
 *
 *     public AccessibilityModifierContext accessibilityModifier() {
 *         return getRuleContext(AccessibilityModifierContext.class, 0);
 *     }
 *
 *     public VarModifierContext varModifier() {
 *         return getRuleContext(VarModifierContext.class, 0);
 *     }
 *
 *     public TerminalNode ReadOnly() {
 *         return getToken(TypeScriptParser.ReadOnly, 0);
 *     }
 *
 *     public TerminalNode Declare() {
 *         return getToken(TypeScriptParser.Declare, 0);
 *     }
 *
 *     public VariableStatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_variableStatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterVariableStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitVariableStatement(this);
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
@Label("VariableStatement")
public interface VariableStatement extends TypeScriptGenAST {

    @Relation("HAS_BINDING_PATTERN")
    BindingPattern getBindingPattern();

    void setBindingPattern(BindingPattern setBindingPattern);

    @Relation("HAS_INITIALIZER")
    Initializer getInitializer();

    void setInitializer(Initializer setInitializer);

    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_VARIABLE_DECLARATION_LIST")
    VariableDeclarationList getVariableDeclarationList();

    void setVariableDeclarationList(VariableDeclarationList setVariableDeclarationList);

    @Relation("HAS_ACCESSIBILITY_MODIFIER")
    AccessibilityModifier getAccessibilityModifier();

    void setAccessibilityModifier(AccessibilityModifier setAccessibilityModifier);

    @Relation("HAS_VAR_MODIFIER")
    VarModifier getVarModifier();

    void setVarModifier(VarModifier setVarModifier);

    @Relation("HAS_READ_ONLY")
    TerminalNodeStrings getReadOnly();

    void setReadOnly(TerminalNodeStrings setReadOnly);

    @Relation("HAS_DECLARE")
    TerminalNodeStrings getDeclare();

    void setDeclare(TerminalNodeStrings setDeclare);
}
