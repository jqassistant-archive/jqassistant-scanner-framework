//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE catchClause (BLOCK (ALT 'catch' '(' catchFormalParameter ')' block)))
 * </pre>
 *
 * <pre>
 * catchClause
 * 	:	'catch' '(' catchFormalParameter ')' block
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2853-2867
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#catchClause()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.CatchClauseMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("CatchClause")
public interface CatchClause extends JavaGen {

    // unhandled TerminalAST token: 'catch'
    // unhandled TerminalAST token: '('
    @Relation("HAS_CATCH_FORMAL_PARAMETER")
    CatchFormalParameter getCatchFormalParameter();

    void setCatchFormalParameter(CatchFormalParameter catchFormalParameter);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block block);
}
