//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EqualityExpression")
public interface EqualityExpression extends JavaGen {

    @Relation("HAS_RELATIONAL_EXPRESSION")
    RelationalExpression getRelationalExpression();

    void setRelationalExpression(RelationalExpression setRelationalExpression);

    @Relation("HAS_EQUALITY_EXPRESSION")
    EqualityExpression getEqualityExpression();

    void setEqualityExpression(EqualityExpression setEqualityExpression);

    // unhandled TerminalAST token: '=='
    // unhandled TerminalAST token: '!='
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
