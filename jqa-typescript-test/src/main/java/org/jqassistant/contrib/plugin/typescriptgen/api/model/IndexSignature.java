//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE indexSignature (BLOCK (ALT '[' Identifier ':' (BLOCK (ALT Number) (ALT String)) ']' typeAnnotation)))
 * </pre>
 *
 * <pre>
 * indexSignature
 *     : '[' Identifier ':' (Number|String) ']' typeAnnotation
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:808-828
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#indexSignature()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IndexSignatureMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IndexSignature")
public interface IndexSignature extends TypeScriptGen {

    // unhandled TerminalAST token: '['
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: ':'
    @Relation("HAS_NUMBER")
    TerminalNodeStrings getNumber();

    void setNumber(TerminalNodeStrings setNumber);

    @Relation("HAS_STRING")
    TerminalNodeStrings getString();

    void setString(TerminalNodeStrings setString);

    // unhandled TerminalAST token: ']'
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
