//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE variableStatement (BLOCK (ALT bindingPattern (? (BLOCK (ALT typeAnnotation))) initializer (? (BLOCK (ALT SemiColon)))) (ALT (? (BLOCK (ALT accessibilityModifier))) (? (BLOCK (ALT varModifier))) (? (BLOCK (ALT ReadOnly))) variableDeclarationList (? (BLOCK (ALT SemiColon)))) (ALT Declare (? (BLOCK (ALT varModifier))) variableDeclarationList (? (BLOCK (ALT SemiColon))))))
 * </pre>
 *
 * <pre>
 * variableStatement
 *     : bindingPattern typeAnnotation? initializer SemiColon?
 *     | accessibilityModifier? varModifier? ReadOnly? variableDeclarationList SemiColon?
 *     | Declare varModifier? variableDeclarationList SemiColon?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1408-1450
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#variableStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.VariableStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("VariableStatement")
public interface VariableStatement extends TypeScriptGen {

    @Relation("HAS_BINDING_PATTERN")
    BindingPattern getBindingPattern();

    void setBindingPattern(BindingPattern setBindingPattern);

    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_INITIALIZER")
    Initializer getInitializer();

    void setInitializer(Initializer setInitializer);

    // optional: ?
    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    // optional: ?
    @Relation("HAS_ACCESSIBILITY_MODIFIER")
    AccessibilityModifier getAccessibilityModifier();

    void setAccessibilityModifier(AccessibilityModifier setAccessibilityModifier);

    // optional: ?
    @Relation("HAS_VAR_MODIFIER")
    VarModifier getVarModifier();

    void setVarModifier(VarModifier setVarModifier);

    // optional: ?
    @Relation("HAS_READ_ONLY")
    TerminalNodeStrings getReadOnly();

    void setReadOnly(TerminalNodeStrings setReadOnly);

    @Relation("HAS_VARIABLE_DECLARATION_LIST")
    VariableDeclarationList getVariableDeclarationList();

    void setVariableDeclarationList(VariableDeclarationList setVariableDeclarationList);

    // optional: ?
    @Relation("HAS_DECLARE")
    TerminalNodeStrings getDeclare();

    void setDeclare(TerminalNodeStrings setDeclare);

    // optional: ?
    // optional: ?
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
