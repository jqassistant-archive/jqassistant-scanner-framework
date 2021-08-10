//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE elementValueList (BLOCK (ALT elementValue (* (BLOCK (ALT ',' elementValue))))))
 * </pre>
 *
 * <pre>
 * elementValueList
 * 	:	elementValue (',' elementValue)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2051-2064
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#elementValueList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ElementValueListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ElementValueList")
public interface ElementValueList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_ELEMENT_VALUE")
    List<ElementValue> getElementValue();

    void setElementValue(List<ElementValue> setElementValue);
}
