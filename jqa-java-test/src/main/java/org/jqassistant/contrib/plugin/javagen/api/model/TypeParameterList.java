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
 * (RULE typeParameterList (BLOCK (ALT typeParameter (* (BLOCK (ALT ',' typeParameter))))))
 * </pre>
 *
 * <pre>
 * typeParameterList
 * 	:	typeParameter (',' typeParameter)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:737-750
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeParameterList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeParameterListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("TypeParameterList")
public interface TypeParameterList extends JavaGen {

    // unhandled TerminalAST token: ','
    // unhandled StarBlockAST: ','
    @Relation("HAS_TYPE_PARAMETER")
    List<TypeParameter> getTypeParameters();

    void setTypeParameters(List<TypeParameter> setTypeParameters);
}
