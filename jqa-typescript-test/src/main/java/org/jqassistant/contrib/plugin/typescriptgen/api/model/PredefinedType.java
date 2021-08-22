//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE predefinedType (BLOCK (ALT Any) (ALT Number) (ALT Boolean) (ALT String) (ALT Symbol) (ALT Void)))
 * </pre>
 *
 * <pre>
 * predefinedType
 *     : Any
 *     | Number
 *     | Boolean
 *     | String
 *     | Symbol
 *     | Void
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:284-310
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#predefinedType()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.PredefinedTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PredefinedType")
public interface PredefinedType extends TypeScriptGen {

    @Relation("HAS_ANY")
    TerminalNodeStrings getAny();

    void setAny(TerminalNodeStrings setAny);

    @Relation("HAS_NUMBER")
    TerminalNodeStrings getNumber();

    void setNumber(TerminalNodeStrings setNumber);

    @Relation("HAS_BOOLEAN")
    TerminalNodeStrings getBoolean();

    void setBoolean(TerminalNodeStrings setBoolean);

    @Relation("HAS_STRING")
    TerminalNodeStrings getString();

    void setString(TerminalNodeStrings setString);

    @Relation("HAS_SYMBOL")
    TerminalNodeStrings getSymbol();

    void setSymbol(TerminalNodeStrings setSymbol);

    @Relation("HAS_VOID")
    TerminalNodeStrings getVoid();

    void setVoid(TerminalNodeStrings setVoid);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
