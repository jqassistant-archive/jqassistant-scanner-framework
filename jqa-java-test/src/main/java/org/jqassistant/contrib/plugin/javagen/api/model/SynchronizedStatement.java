//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE synchronizedStatement (BLOCK (ALT 'synchronized' '(' expression ')' block)))
 * </pre>
 *
 * <pre>
 * synchronizedStatement
 * 	:	'synchronized' '(' expression ')' block
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2799-2813
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#synchronizedStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SynchronizedStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SynchronizedStatement")
public interface SynchronizedStatement extends JavaGen {

    // unhandled TerminalAST token: 'synchronized'
    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block block);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
