//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE functionDeclaration (BLOCK (ALT Function_ Identifier callSignature (BLOCK (ALT (BLOCK (ALT '{' functionBody '}'))) (ALT SemiColon)))))
 * </pre>
 *
 * <pre>
 * functionDeclaration
 *     : Function_ Identifier callSignature ( ('{' functionBody '}') | SemiColon)
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1956-1981
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#functionDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FunctionDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FunctionDeclaration")
public interface FunctionDeclaration extends TypeScriptGen {

    @Relation("HAS_FUNCTION_")
    TerminalNodeStrings getFunction_();

    void setFunction_(TerminalNodeStrings setFunction_);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_CALL_SIGNATURE")
    CallSignature getCallSignature();

    void setCallSignature(CallSignature setCallSignature);

    // unhandled TerminalAST token: '{'
    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
