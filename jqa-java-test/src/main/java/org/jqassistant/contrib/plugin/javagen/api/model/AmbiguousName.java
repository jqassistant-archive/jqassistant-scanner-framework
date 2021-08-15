//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE ambiguousName (BLOCK (ALT Identifier) (ALT ambiguousName '.' Identifier)))
 * </pre>
 *
 * <pre>
 * ambiguousName
 * 	:	Identifier
 * 	|	ambiguousName '.' Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:493-507
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#ambiguousName()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AmbiguousNameMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AmbiguousName")
public interface AmbiguousName extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    @Relation("HAS_AMBIGUOUS_NAME")
    AmbiguousName getAmbiguousName();

    void setAmbiguousName(AmbiguousName ambiguousName);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
