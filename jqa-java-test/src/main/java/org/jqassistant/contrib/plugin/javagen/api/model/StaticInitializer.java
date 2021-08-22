//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE staticInitializer (BLOCK (ALT 'static' block)))
 * </pre>
 *
 * <pre>
 * staticInitializer
 * 	:	'static' block
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1405-1413
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#staticInitializer()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.StaticInitializerMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("StaticInitializer")
public interface StaticInitializer extends JavaGen {

    // unhandled TerminalAST token: 'static'
    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
