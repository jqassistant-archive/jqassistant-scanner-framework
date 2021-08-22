//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeArgumentsOrDiamond (BLOCK (ALT typeArguments) (ALT '<' '>')))
 * </pre>
 *
 * <pre>
 * typeArgumentsOrDiamond
 * 	:	typeArguments
 * 	|	'<' '>'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3561-3573
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeArgumentsOrDiamond()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeArgumentsOrDiamondMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeArgumentsOrDiamond")
public interface TypeArgumentsOrDiamond extends JavaGen {

    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments setTypeArguments);

    // unhandled TerminalAST token: '<'
    // unhandled TerminalAST token: '>'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
