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
 * (RULE conditionalOrExpression (BLOCK (ALT conditionalAndExpression) (ALT conditionalOrExpression '||' conditionalAndExpression)))
 * </pre>
 *
 * <pre>
 * conditionalOrExpression
 * 	:	conditionalAndExpression
 * 	|	conditionalOrExpression '||' conditionalAndExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4423-4437
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#conditionalOrExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConditionalOrExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("ConditionalOrExpression")
public interface ConditionalOrExpression extends JavaGen {

    @Relation("HAS_CONDITIONAL_OR_EXPRESSION")
    ConditionalOrExpression getConditionalOrExpression();

    void setConditionalOrExpression(ConditionalOrExpression conditionalOrExpression);

    // unhandled TerminalAST token: '||'
    @Relation("HAS_CONDITIONAL_AND_EXPRESSION")
    List<ConditionalAndExpression> getConditionalAndExpressions();

    void setConditionalAndExpressions(List<ConditionalAndExpression> setConditionalAndExpressions);
}
