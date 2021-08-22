//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE unannTypeVariable (BLOCK (ALT Identifier)))
 * </pre>
 *
 * <pre>
 * unannTypeVariable
 * 	:	Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1091-1097
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannTypeVariable()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannTypeVariableMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnannTypeVariable")
public interface UnannTypeVariable extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
