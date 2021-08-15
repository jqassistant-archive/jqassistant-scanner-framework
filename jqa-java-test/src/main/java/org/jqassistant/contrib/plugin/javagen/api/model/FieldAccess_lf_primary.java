//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE fieldAccess_lf_primary (BLOCK (ALT '.' Identifier)))
 * </pre>
 *
 * <pre>
 * fieldAccess_lf_primary
 * 	:	'.' Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3607-3615
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#fieldAccess_lf_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FieldAccess_lf_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FieldAccess_lf_primary")
public interface FieldAccess_lf_primary extends JavaGen {

    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
