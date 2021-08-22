//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE elementValuePair (BLOCK (ALT Identifier '=' elementValue)))
 * </pre>
 *
 * <pre>
 * elementValuePair
 * 	:	Identifier '=' elementValue
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2007-2017
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#elementValuePair()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ElementValuePairMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ElementValuePair")
public interface ElementValuePair extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: '='
    @Relation("HAS_ELEMENT_VALUE")
    ElementValue getElementValue();

    void setElementValue(ElementValue setElementValue);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
