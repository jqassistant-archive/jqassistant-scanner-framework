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
 * (RULE wildcardBounds (BLOCK (ALT 'extends' referenceType) (ALT 'super' referenceType)))
 * </pre>
 *
 * <pre>
 * wildcardBounds
 * 	:	'extends' referenceType
 * 	|	'super' referenceType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:403-417
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#wildcardBounds()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.WildcardBoundsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("WildcardBounds")
public interface WildcardBounds extends JavaGen {

    // unhandled TerminalAST token: 'extends'
    // unhandled TerminalAST token: 'super'
    @Relation("HAS_REFERENCE_TYPE")
    List<ReferenceType> getReferenceTypes();

    void setReferenceTypes(List<ReferenceType> setReferenceTypes);
}
