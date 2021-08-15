//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TryStatement")
public interface TryStatement extends JavaGen {

    // unhandled TerminalAST token: 'try'
    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block block);

    @Relation("HAS_CATCHES")
    Catches getCatches();

    void setCatches(Catches catches);

    // unhandled TerminalAST token: 'try'
    // optional: ?
    @Relation("HAS_FINALLY_")
    Finally_ getFinally_();

    void setFinally_(Finally_ finally_);

    @Relation("HAS_TRY_WITH_RESOURCES_STATEMENT")
    TryWithResourcesStatement getTryWithResourcesStatement();

    void setTryWithResourcesStatement(TryWithResourcesStatement tryWithResourcesStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
