//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE elementValueArrayInitializer (BLOCK (ALT '{' (? (BLOCK (ALT elementValueList))) (? (BLOCK (ALT ','))) '}')))
 * </pre>
 *
 * <pre>
 * elementValueArrayInitializer
 * 	:	'{' elementValueList? ','? '}'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2035-2049
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#elementValueArrayInitializer()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ElementValueArrayInitializerMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ElementValueArrayInitializer")
public interface ElementValueArrayInitializer extends JavaGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_ELEMENT_VALUE_LIST")
    ElementValueList getElementValueList();

    void setElementValueList(ElementValueList elementValueList);
    // optional: ?
    // unhandled TerminalAST token: ','
    // unhandled TerminalAST token: '}'
}
