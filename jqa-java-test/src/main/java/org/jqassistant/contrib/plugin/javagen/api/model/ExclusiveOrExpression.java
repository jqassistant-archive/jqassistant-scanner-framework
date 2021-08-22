//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE exclusiveOrExpression (BLOCK (ALT andExpression) (ALT exclusiveOrExpression '^' andExpression)))
 * </pre>
 *
 * <pre>
 * exclusiveOrExpression
 * 	:	andExpression
 * 	|	exclusiveOrExpression '^' andExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4471-4485
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#exclusiveOrExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExclusiveOrExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExclusiveOrExpression")
public interface ExclusiveOrExpression extends JavaGen {

    @Relation("HAS_AND_EXPRESSION")
    AndExpression getAndExpression();

    void setAndExpression(AndExpression setAndExpression);

    @Relation("HAS_EXCLUSIVE_OR_EXPRESSION")
    ExclusiveOrExpression getExclusiveOrExpression();

    void setExclusiveOrExpression(ExclusiveOrExpression setExclusiveOrExpression);

    // unhandled TerminalAST token: '^'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
