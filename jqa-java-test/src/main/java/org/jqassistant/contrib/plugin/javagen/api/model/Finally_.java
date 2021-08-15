//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE finally_ (BLOCK (ALT 'finally' block)))
 * </pre>
 *
 * <pre>
 * finally_
 * 	:	'finally' block
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2897-2905
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#finally_()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.Finally_Mapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Finally_")
public interface Finally_ extends JavaGen {

    // unhandled TerminalAST token: 'finally'
    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block block);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
