//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE inclusiveOrExpression (BLOCK (ALT exclusiveOrExpression) (ALT inclusiveOrExpression '|' exclusiveOrExpression)))
 * </pre>
 *
 * <pre>
 * inclusiveOrExpression
 * 	:	exclusiveOrExpression
 * 	|	inclusiveOrExpression '|' exclusiveOrExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4455-4469
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#inclusiveOrExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InclusiveOrExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InclusiveOrExpression")
public interface InclusiveOrExpression extends JavaGen {

    @Relation("HAS_EXCLUSIVE_OR_EXPRESSION")
    ExclusiveOrExpression getExclusiveOrExpression();

    void setExclusiveOrExpression(ExclusiveOrExpression exclusiveOrExpression);

    @Relation("HAS_INCLUSIVE_OR_EXPRESSION")
    InclusiveOrExpression getInclusiveOrExpression();

    void setInclusiveOrExpression(InclusiveOrExpression inclusiveOrExpression);

    // unhandled TerminalAST token: '|'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
