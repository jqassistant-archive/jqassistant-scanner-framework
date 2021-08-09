//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE tryWithResourcesStatement (BLOCK (ALT 'try' resourceSpecification block (? (BLOCK (ALT catches))) (? (BLOCK (ALT finally_))))))
 * </pre>
 *
 * <pre>
 * tryWithResourcesStatement
 * 	:	'try' resourceSpecification block catches? finally_?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2907-2923
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#tryWithResourcesStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TryWithResourcesStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("TryWithResourcesStatement")
public interface TryWithResourcesStatement extends JavaGen {

    // unhandled TerminalAST token: 'try'
    @Relation("HAS_RESOURCE_SPECIFICATION")
    ResourceSpecification getResourceSpecification();

    void setResourceSpecification(ResourceSpecification resourceSpecification);

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block block);

    // optional: catches
    @Relation("HAS_CATCHES")
    Catches getCatches();

    void setCatches(Catches catches);

    // optional: finally_
    @Relation("HAS_FINALLY_")
    Finally_ getFinally_();

    void setFinally_(Finally_ finally_);
}
