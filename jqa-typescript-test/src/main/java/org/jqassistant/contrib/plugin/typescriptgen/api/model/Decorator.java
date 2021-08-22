//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE decorator (BLOCK (ALT '@' (BLOCK (ALT decoratorMemberExpression) (ALT decoratorCallExpression)))))
 * </pre>
 *
 * <pre>
 * decorator
 *     : '@' (decoratorMemberExpression | decoratorCallExpression)
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1073-1087
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#decorator()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.DecoratorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Decorator")
public interface Decorator extends TypeScriptGen {

    // unhandled TerminalAST token: '@'
    @Relation("HAS_DECORATOR_MEMBER_EXPRESSION")
    DecoratorMemberExpression getDecoratorMemberExpression();

    void setDecoratorMemberExpression(DecoratorMemberExpression setDecoratorMemberExpression);

    @Relation("HAS_DECORATOR_CALL_EXPRESSION")
    DecoratorCallExpression getDecoratorCallExpression();

    void setDecoratorCallExpression(DecoratorCallExpression setDecoratorCallExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
