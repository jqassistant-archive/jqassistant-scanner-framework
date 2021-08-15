//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE argumentList (BLOCK (ALT expression (* (BLOCK (ALT ',' expression))))))
 * </pre>
 *
 * <pre>
 * argumentList
 * 	:	expression (',' expression)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3974-3987
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#argumentList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ArgumentListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArgumentList")
public interface ArgumentList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_EXPRESSION")
    List<Expression> getExpression();

    void setExpression(List<Expression> setExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
