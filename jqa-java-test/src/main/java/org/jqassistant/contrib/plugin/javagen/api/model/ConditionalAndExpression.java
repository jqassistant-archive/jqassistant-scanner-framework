//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE conditionalAndExpression (BLOCK (ALT inclusiveOrExpression) (ALT conditionalAndExpression '&&' inclusiveOrExpression)))
 * </pre>
 *
 * <pre>
 * conditionalAndExpression
 * 	:	inclusiveOrExpression
 * 	|	conditionalAndExpression '&&' inclusiveOrExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4439-4453
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#conditionalAndExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConditionalAndExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("ConditionalAndExpression")
public interface ConditionalAndExpression extends JavaGen {

    @Relation("HAS_CONDITIONAL_AND_EXPRESSION")
    ConditionalAndExpression getConditionalAndExpression();

    void setConditionalAndExpression(ConditionalAndExpression conditionalAndExpression);

    // unhandled TerminalAST token: '&&'
    @Relation("HAS_INCLUSIVE_OR_EXPRESSION")
    List<InclusiveOrExpression> getInclusiveOrExpressions();

    void setInclusiveOrExpressions(List<InclusiveOrExpression> setInclusiveOrExpressions);
}
