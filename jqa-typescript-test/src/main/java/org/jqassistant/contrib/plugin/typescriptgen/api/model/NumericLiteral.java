//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE numericLiteral (BLOCK (ALT DecimalLiteral) (ALT HexIntegerLiteral) (ALT OctalIntegerLiteral) (ALT OctalIntegerLiteral2) (ALT BinaryIntegerLiteral)))
 * </pre>
 *
 * <pre>
 * numericLiteral
 *     : DecimalLiteral
 *     | HexIntegerLiteral
 *     | OctalIntegerLiteral
 *     | OctalIntegerLiteral2
 *     | BinaryIntegerLiteral
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3499-3521
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#numericLiteral()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.NumericLiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("NumericLiteral")
public interface NumericLiteral extends TypeScriptGen {

    @Relation("HAS_DECIMAL_LITERAL")
    TerminalNodeStrings getDecimalLiteral();

    void setDecimalLiteral(TerminalNodeStrings setDecimalLiteral);

    @Relation("HAS_HEX_INTEGER_LITERAL")
    TerminalNodeStrings getHexIntegerLiteral();

    void setHexIntegerLiteral(TerminalNodeStrings setHexIntegerLiteral);

    @Relation("HAS_OCTAL_INTEGER_LITERAL")
    TerminalNodeStrings getOctalIntegerLiteral();

    void setOctalIntegerLiteral(TerminalNodeStrings setOctalIntegerLiteral);

    @Relation("HAS_OCTAL_INTEGER_LITERAL2")
    TerminalNodeStrings getOctalIntegerLiteral2();

    void setOctalIntegerLiteral2(TerminalNodeStrings setOctalIntegerLiteral2);

    @Relation("HAS_BINARY_INTEGER_LITERAL")
    TerminalNodeStrings getBinaryIntegerLiteral();

    void setBinaryIntegerLiteral(TerminalNodeStrings setBinaryIntegerLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
