//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE methodBody (BLOCK (ALT block) (ALT ';')))
 * </pre>
 *
 * <pre>
 * methodBody
 * 	:	block
 * 	|	';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1385-1395
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#methodBody()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MethodBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("MethodBody")
public interface MethodBody extends JavaGen {

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block block);
    // unhandled TerminalAST token: ';'
}