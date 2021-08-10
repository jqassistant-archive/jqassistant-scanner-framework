//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE switchBlockStatementGroup (BLOCK (ALT switchLabels blockStatements)))
 * </pre>
 *
 * <pre>
 * switchBlockStatementGroup
 * 	:	switchLabels blockStatements
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2478-2486
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#switchBlockStatementGroup()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SwitchBlockStatementGroupMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("SwitchBlockStatementGroup")
public interface SwitchBlockStatementGroup extends JavaGen {

    @Relation("HAS_SWITCH_LABELS")
    SwitchLabels getSwitchLabels();

    void setSwitchLabels(SwitchLabels switchLabels);

    @Relation("HAS_BLOCK_STATEMENTS")
    BlockStatements getBlockStatements();

    void setBlockStatements(BlockStatements blockStatements);
}
