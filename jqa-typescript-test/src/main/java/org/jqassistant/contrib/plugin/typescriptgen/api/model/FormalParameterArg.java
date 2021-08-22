//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE formalParameterArg (BLOCK (ALT (? (BLOCK (ALT decorator))) (? (BLOCK (ALT accessibilityModifier))) identifierOrKeyWord (? (BLOCK (ALT '?'))) (? (BLOCK (ALT typeAnnotation))) (? (BLOCK (ALT '=' singleExpression))))))
 * </pre>
 *
 * <pre>
 * formalParameterArg
 *     : decorator? accessibilityModifier? identifierOrKeyWord '?'? typeAnnotation? ('=' singleExpression)?      // ECMAScript 6: Initialization
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2353-2380
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#formalParameterArg()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FormalParameterArgMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FormalParameterArg")
public interface FormalParameterArg extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_DECORATOR")
    Decorator getDecorator();

    void setDecorator(Decorator setDecorator);

    // optional: ?
    @Relation("HAS_ACCESSIBILITY_MODIFIER")
    AccessibilityModifier getAccessibilityModifier();

    void setAccessibilityModifier(AccessibilityModifier setAccessibilityModifier);

    @Relation("HAS_IDENTIFIER_OR_KEY_WORD")
    IdentifierOrKeyWord getIdentifierOrKeyWord();

    void setIdentifierOrKeyWord(IdentifierOrKeyWord setIdentifierOrKeyWord);

    // optional: ?
    // unhandled TerminalAST token: '?'
    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    // optional: ?
    // unhandled TerminalAST token: '='
    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
