//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE optionalParameter (BLOCK (ALT (? (BLOCK (ALT decoratorList))) (BLOCK (ALT (? (BLOCK (ALT accessibilityModifier))) identifierOrPattern (BLOCK (ALT '?' (? (BLOCK (ALT typeAnnotation)))) (ALT (? (BLOCK (ALT typeAnnotation))) initializer)))))))
 * </pre>
 *
 * <pre>
 * optionalParameter
 *     : decoratorList? ( accessibilityModifier? identifierOrPattern ('?' typeAnnotation? | typeAnnotation? initializer))
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:698-727
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#optionalParameter()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.OptionalParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("OptionalParameter")
public interface OptionalParameter extends TypeScriptGen {

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

    // unhandled TerminalAST token: '?'
    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    // optional: ?
    @Relation("HAS_INITIALIZER")
    Initializer getInitializer();

    void setInitializer(Initializer setInitializer);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
