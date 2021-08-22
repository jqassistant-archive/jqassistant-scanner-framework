//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE program (BLOCK (ALT (? (BLOCK (ALT sourceElements))) EOF)))
 * </pre>
 *
 * <pre>
 * program
 *     : sourceElements? EOF
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1124-1133
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#program()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ProgramMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Program")
public interface Program extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_SOURCE_ELEMENTS")
    SourceElements getSourceElements();

    void setSourceElements(SourceElements setSourceElements);

    @Relation("HAS_E_O_F")
    TerminalNodeStrings getEOF();

    void setEOF(TerminalNodeStrings setEOF);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
