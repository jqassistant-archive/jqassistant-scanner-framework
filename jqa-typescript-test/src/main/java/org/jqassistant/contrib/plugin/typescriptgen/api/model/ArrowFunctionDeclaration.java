//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE arrowFunctionDeclaration (BLOCK (ALT (? (BLOCK (ALT Async))) arrowFunctionParameters (? (BLOCK (ALT typeAnnotation))) '=>' arrowFunctionBody)))
 * </pre>
 *
 * <pre>
 * arrowFunctionDeclaration
 *     : Async? arrowFunctionParameters typeAnnotation? '=>' arrowFunctionBody
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3343-3359
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#arrowFunctionDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ArrowFunctionDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrowFunctionDeclaration")
public interface ArrowFunctionDeclaration extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_ASYNC")
    TerminalNodeStrings getAsync();

    void setAsync(TerminalNodeStrings setAsync);

    @Relation("HAS_ARROW_FUNCTION_PARAMETERS")
    ArrowFunctionParameters getArrowFunctionParameters();

    void setArrowFunctionParameters(ArrowFunctionParameters setArrowFunctionParameters);

    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    // unhandled TerminalAST token: '=>'
    @Relation("HAS_ARROW_FUNCTION_BODY")
    ArrowFunctionBody getArrowFunctionBody();

    void setArrowFunctionBody(ArrowFunctionBody setArrowFunctionBody);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
