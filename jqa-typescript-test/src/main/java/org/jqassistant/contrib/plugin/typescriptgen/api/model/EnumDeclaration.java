//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE enumDeclaration (BLOCK (ALT (? (BLOCK (ALT Const))) Enum Identifier '{' (? (BLOCK (ALT enumBody))) '}')))
 * </pre>
 *
 * <pre>
 * enumDeclaration
 *     : Const? Enum Identifier '{' enumBody? '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:952-970
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#enumDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.EnumDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumDeclaration")
public interface EnumDeclaration extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_CONST")
    TerminalNodeStrings getConstDescriptor();

    void setConst(TerminalNodeStrings setConst);

    @Relation("HAS_ENUM")
    TerminalNodeStrings getEnumDescriptor();

    void setEnum(TerminalNodeStrings setEnum);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_ENUM_BODY")
    EnumBody getEnumBody();

    void setEnumBody(EnumBody setEnumBody);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
