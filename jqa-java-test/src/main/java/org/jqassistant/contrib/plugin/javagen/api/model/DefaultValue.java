//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE defaultValue (BLOCK (ALT 'default' elementValue)))
 * </pre>
 *
 * <pre>
 * defaultValue
 * 	:	'default' elementValue
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1949-1957
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#defaultValue()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.DefaultValueMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("DefaultValue")
public interface DefaultValue extends JavaGen {

    // unhandled TerminalAST token: 'default'
    @Relation("HAS_ELEMENT_VALUE")
    ElementValue getElementValue();

    void setElementValue(ElementValue elementValue);
}
