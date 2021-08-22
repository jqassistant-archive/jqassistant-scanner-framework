//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE decoratorCallExpression (BLOCK (ALT decoratorMemberExpression arguments)))
 * </pre>
 *
 * <pre>
 * decoratorCallExpression
 *     : decoratorMemberExpression arguments;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1113-1120
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#decoratorCallExpression()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.DecoratorCallExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("DecoratorCallExpression")
public interface DecoratorCallExpression extends TypeScriptGen {

    @Relation("HAS_DECORATOR_MEMBER_EXPRESSION")
    DecoratorMemberExpression getDecoratorMemberExpression();

    void setDecoratorMemberExpression(DecoratorMemberExpression setDecoratorMemberExpression);

    @Relation("HAS_ARGUMENTS")
    Arguments getArguments();

    void setArguments(Arguments setArguments);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
