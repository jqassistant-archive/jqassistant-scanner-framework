//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE simpleTypeName (BLOCK (ALT Identifier)))
 * </pre>
 *
 * <pre>
 * simpleTypeName
 * 	:	Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1469-1475
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#simpleTypeName()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SimpleTypeNameMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("SimpleTypeName")
public interface SimpleTypeName extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);
}
