//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE fieldAccess (BLOCK (ALT primary '.' Identifier) (ALT 'super' '.' Identifier) (ALT typeName '.' 'super' '.' Identifier)))
 * </pre>
 *
 * <pre>
 * fieldAccess
 * 	:	primary '.' Identifier
 * 	|	'super' '.' Identifier
 * 	|	typeName '.' 'super' '.' Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3575-3605
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#fieldAccess()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FieldAccessMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FieldAccess")
public interface FieldAccess extends JavaGen {

    @Relation("HAS_PRIMARY")
    Primary getPrimary();

    void setPrimary(Primary setPrimary);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '.'
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName setTypeName);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '.'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
