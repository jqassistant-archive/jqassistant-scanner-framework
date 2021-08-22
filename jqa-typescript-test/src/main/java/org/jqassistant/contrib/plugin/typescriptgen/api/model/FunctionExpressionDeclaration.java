//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE functionExpressionDeclaration (BLOCK (ALT Function_ (? (BLOCK (ALT Identifier))) '(' (? (BLOCK (ALT formalParameterList))) ')' (? (BLOCK (ALT typeAnnotation))) '{' functionBody '}')))
 * </pre>
 *
 * <pre>
 * functionExpressionDeclaration
 *     : Function_ Identifier? '(' formalParameterList? ')' typeAnnotation? '{' functionBody '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2703-2728
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#functionExpressionDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FunctionExpressionDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FunctionExpressionDeclaration")
public interface FunctionExpressionDeclaration extends TypeScriptGen {

    @Relation("HAS_FUNCTION")
    TerminalNodeStrings getFunction_();

    void setFunction_(TerminalNodeStrings setFunction_);

    // optional: ?
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList setFormalParameterList);

    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    // unhandled TerminalAST token: '{'
    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
