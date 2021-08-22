//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE reservedWord (BLOCK (ALT keyword) (ALT NullLiteral) (ALT BooleanLiteral)))
 * </pre>
 *
 * <pre>
 * reservedWord
 *     : keyword
 *     | NullLiteral
 *     | BooleanLiteral
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3551-3565
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#reservedWord()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ReservedWordMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ReservedWord")
public interface ReservedWord extends TypeScriptGen {

    @Relation("HAS_KEYWORD")
    Keyword getKeyword();

    void setKeyword(Keyword setKeyword);

    @Relation("HAS_NULL_LITERAL")
    TerminalNodeStrings getNullLiteral();

    void setNullLiteral(TerminalNodeStrings setNullLiteral);

    @Relation("HAS_BOOLEAN_LITERAL")
    TerminalNodeStrings getBooleanLiteral();

    void setBooleanLiteral(TerminalNodeStrings setBooleanLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
