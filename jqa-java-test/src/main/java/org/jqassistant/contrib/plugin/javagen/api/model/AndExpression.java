//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE andExpression (BLOCK (ALT equalityExpression) (ALT andExpression '&' equalityExpression)))
 * </pre>
 *
 * <pre>
 * andExpression
 * 	:	equalityExpression
 * 	|	andExpression '&' equalityExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4487-4501
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#andExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AndExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AndExpression")
public interface AndExpression extends JavaGen {

    @Relation("HAS_EQUALITY_EXPRESSION")
    EqualityExpression getEqualityExpression();

    void setEqualityExpression(EqualityExpression setEqualityExpression);

    @Relation("HAS_AND_EXPRESSION")
    AndExpression getAndExpression();

    void setAndExpression(AndExpression setAndExpression);

    // unhandled TerminalAST token: '&'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
