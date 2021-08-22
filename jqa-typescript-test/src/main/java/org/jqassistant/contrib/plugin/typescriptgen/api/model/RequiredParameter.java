//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE requiredParameter (BLOCK (ALT (? (BLOCK (ALT decoratorList))) (? (BLOCK (ALT accessibilityModifier))) identifierOrPattern (? (BLOCK (ALT typeAnnotation))))))
 * </pre>
 *
 * <pre>
 * requiredParameter
 *     : decoratorList? accessibilityModifier? identifierOrPattern typeAnnotation?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:742-757
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#requiredParameter()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.RequiredParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("RequiredParameter")
public interface RequiredParameter extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_DECORATOR_LIST")
    DecoratorList getDecoratorList();

    void setDecoratorList(DecoratorList setDecoratorList);

    // optional: ?
    @Relation("HAS_ACCESSIBILITY_MODIFIER")
    AccessibilityModifier getAccessibilityModifier();

    void setAccessibilityModifier(AccessibilityModifier setAccessibilityModifier);

    @Relation("HAS_IDENTIFIER_OR_PATTERN")
    IdentifierOrPattern getIdentifierOrPattern();

    void setIdentifierOrPattern(IdentifierOrPattern setIdentifierOrPattern);

    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
