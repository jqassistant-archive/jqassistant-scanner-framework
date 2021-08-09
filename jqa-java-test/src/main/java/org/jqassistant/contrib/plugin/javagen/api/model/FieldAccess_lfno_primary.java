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
 * (RULE fieldAccess_lfno_primary (BLOCK (ALT 'super' '.' Identifier) (ALT typeName '.' 'super' '.' Identifier)))
 * </pre>
 *
 * <pre>
 * fieldAccess_lfno_primary
 * 	:	'super' '.' Identifier
 * 	|	typeName '.' 'super' '.' Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3617-3639
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#fieldAccess_lfno_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FieldAccess_lfno_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("FieldAccess_lfno_primary")
public interface FieldAccess_lfno_primary extends JavaGen {

    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '.'
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName typeName);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifiers();

    void setIdentifiers(List<TerminalNodeStrings> setIdentifiers);
}
