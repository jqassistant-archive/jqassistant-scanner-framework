//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE preIncrementExpression (BLOCK (ALT '++' unaryExpression)))
 * </pre>
 *
 * <pre>
 * preIncrementExpression
 * 	:	'++' unaryExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4699-4707
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#preIncrementExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PreIncrementExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PreIncrementExpression")
public interface PreIncrementExpression extends JavaGen {

    // unhandled TerminalAST token: '++'
    @Relation("HAS_UNARY_EXPRESSION")
    UnaryExpression getUnaryExpression();

    void setUnaryExpression(UnaryExpression unaryExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
