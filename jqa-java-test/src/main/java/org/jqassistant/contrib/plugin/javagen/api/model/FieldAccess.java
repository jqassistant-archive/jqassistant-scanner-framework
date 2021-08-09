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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("FieldAccess")
public interface FieldAccess extends JavaGen {

    @Relation("HAS_PRIMARY")
    Primary getPrimary();

    void setPrimary(Primary primary);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifiers();

    void setIdentifiers(List<TerminalNodeStrings> setIdentifiers);

    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName typeName);
    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '.'
}
