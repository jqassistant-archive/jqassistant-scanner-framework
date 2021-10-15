//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class DecoratorCallExpressionContext extends ParserRuleContext {
 *
 *     public DecoratorMemberExpressionContext decoratorMemberExpression() {
 *         return getRuleContext(DecoratorMemberExpressionContext.class, 0);
 *     }
 *
 *     public ArgumentsContext arguments() {
 *         return getRuleContext(ArgumentsContext.class, 0);
 *     }
 *
 *     public DecoratorCallExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_decoratorCallExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterDecoratorCallExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitDecoratorCallExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
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
