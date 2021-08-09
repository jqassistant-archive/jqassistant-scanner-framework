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
 * (RULE equalityExpression (BLOCK (ALT relationalExpression) (ALT equalityExpression '==' relationalExpression) (ALT equalityExpression '!=' relationalExpression)))
 * </pre>
 *
 * <pre>
 * equalityExpression
 * 	:	relationalExpression
 * 	|	equalityExpression '==' relationalExpression
 * 	|	equalityExpression '!=' relationalExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4503-4525
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#equalityExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EqualityExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("EqualityExpression")
public interface EqualityExpression extends JavaGen {

    // unhandled TerminalAST token: '=='
    @Relation("HAS_RELATIONAL_EXPRESSION")
    List<RelationalExpression> getRelationalExpressions();

    void setRelationalExpressions(List<RelationalExpression> setRelationalExpressions);

    @Relation("HAS_EQUALITY_EXPRESSION")
    List<EqualityExpression> getEqualityExpressions();

    void setEqualityExpressions(List<EqualityExpression> setEqualityExpressions);
    // unhandled TerminalAST token: '!='
}
