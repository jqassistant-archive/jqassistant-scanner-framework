//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE methodReference_lf_primary (BLOCK (ALT '::' (? (BLOCK (ALT typeArguments))) Identifier)))
 * </pre>
 *
 * <pre>
 * methodReference_lf_primary
 * 	:	'::' typeArguments? Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4071-4082
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#methodReference_lf_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MethodReference_lf_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MethodReference_lf_primary")
public interface MethodReference_lf_primary extends JavaGen {

    // unhandled TerminalAST token: '::'
    // optional: ?
    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments typeArguments);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
