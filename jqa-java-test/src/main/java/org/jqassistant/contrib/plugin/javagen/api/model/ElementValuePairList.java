//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE elementValuePairList (BLOCK (ALT elementValuePair (* (BLOCK (ALT ',' elementValuePair))))))
 * </pre>
 *
 * <pre>
 * elementValuePairList
 * 	:	elementValuePair (',' elementValuePair)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1992-2005
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#elementValuePairList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ElementValuePairListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("ElementValuePairList")
public interface ElementValuePairList extends JavaGen {

    // unhandled TerminalAST token: ','
    // unhandled StarBlockAST: ','
    @Relation("HAS_ELEMENT_VALUE_PAIR")
    List<ElementValuePair> getElementValuePairs();

    void setElementValuePairs(List<ElementValuePair> setElementValuePairs);
}
