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
 * (RULE tryStatement (BLOCK (ALT 'try' block catches) (ALT 'try' block (? (BLOCK (ALT catches))) finally_) (ALT tryWithResourcesStatement)))
 * </pre>
 *
 * <pre>
 * tryStatement
 * 	:	'try' block catches
 * 	|	'try' block catches? finally_
 * 	|	tryWithResourcesStatement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2815-2840
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#tryStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TryStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("TryStatement")
public interface TryStatement extends JavaGen {

    // unhandled TerminalAST token: 'try'
    // unhandled TerminalAST token: 'try'
    @Relation("HAS_BLOCK")
    List<Block> getBlocks();

    void setBlocks(List<Block> setBlocks);

    // optional: catches
    @Relation("HAS_CATCHES")
    List<Catches> getCatchess();

    void setCatchess(List<Catches> setCatchess);

    @Relation("HAS_FINALLY_")
    Finally_ getFinally_();

    void setFinally_(Finally_ finally_);

    @Relation("HAS_TRY_WITH_RESOURCES_STATEMENT")
    TryWithResourcesStatement getTryWithResourcesStatement();

    void setTryWithResourcesStatement(TryWithResourcesStatement tryWithResourcesStatement);
}
