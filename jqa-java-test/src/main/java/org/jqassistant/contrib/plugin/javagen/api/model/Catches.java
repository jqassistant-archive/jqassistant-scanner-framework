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
 * (RULE catches (BLOCK (ALT catchClause (* (BLOCK (ALT catchClause))))))
 * </pre>
 *
 * <pre>
 * catches
 * 	:	catchClause catchClause*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2842-2851
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#catches()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.CatchesMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("Catches")
public interface Catches extends JavaGen {

    @Relation("HAS_CATCH_CLAUSE")
    List<CatchClause> getCatchClauses();

    void setCatchClauses(List<CatchClause> setCatchClauses);
}
