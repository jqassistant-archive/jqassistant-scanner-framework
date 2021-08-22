//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE setAccessor (BLOCK (ALT setter '(' (BLOCK (ALT Identifier) (ALT bindingPattern)) (? (BLOCK (ALT typeAnnotation))) ')' '{' functionBody '}')))
 * </pre>
 *
 * <pre>
 * setAccessor
 *     : setter '(' ( Identifier | bindingPattern) typeAnnotation? ')' '{' functionBody '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2590-2618
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#setAccessor()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.SetAccessorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SetAccessor")
public interface SetAccessor extends TypeScriptGen {

    @Relation("HAS_SETTER")
    Setter getSetter();

    void setSetter(Setter setSetter);

    // unhandled TerminalAST token: '('
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_BINDING_PATTERN")
    BindingPattern getBindingPattern();

    void setBindingPattern(BindingPattern setBindingPattern);

    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: '{'
    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
