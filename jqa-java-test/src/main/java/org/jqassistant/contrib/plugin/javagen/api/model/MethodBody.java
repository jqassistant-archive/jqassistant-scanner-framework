//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MethodBody")
public interface MethodBody extends JavaGen {

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
