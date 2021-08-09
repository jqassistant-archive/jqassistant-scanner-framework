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
 * (RULE expressionName (BLOCK (ALT Identifier) (ALT ambiguousName '.' Identifier)))
 * </pre>
 *
 * <pre>
 * expressionName
 * 	:	Identifier
 * 	|	ambiguousName '.' Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:469-483
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#expressionName()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExpressionNameMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("ExpressionName")
public interface ExpressionName extends JavaGen {

    @Relation("HAS_AMBIGUOUS_NAME")
    AmbiguousName getAmbiguousName();

    void setAmbiguousName(AmbiguousName ambiguousName);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifiers();

    void setIdentifiers(List<TerminalNodeStrings> setIdentifiers);
}
