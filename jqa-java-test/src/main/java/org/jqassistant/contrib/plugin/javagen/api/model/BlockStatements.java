//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE blockStatements (BLOCK (ALT (+ (BLOCK (ALT blockStatement))))))
 * </pre>
 *
 * <pre>
 * blockStatements
 * 	:	blockStatement+
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2140-2147
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#blockStatements()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.BlockStatementsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("BlockStatements")
public interface BlockStatements extends JavaGen {

    @Relation("HAS_BLOCK_STATEMENT")
    List<BlockStatement> getBlockStatement();

    void setBlockStatement(List<BlockStatement> setBlockStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
