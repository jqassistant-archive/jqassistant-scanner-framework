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
 * public static class DecoratorContext extends ParserRuleContext {
 *
 *     public TerminalNode At() {
 *         return getToken(TypeScriptParser.At, 0);
 *     }
 *
 *     public DecoratorMemberExpressionContext decoratorMemberExpression() {
 *         return getRuleContext(DecoratorMemberExpressionContext.class, 0);
 *     }
 *
 *     public DecoratorCallExpressionContext decoratorCallExpression() {
 *         return getRuleContext(DecoratorCallExpressionContext.class, 0);
 *     }
 *
 *     public DecoratorContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_decorator;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterDecorator(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitDecorator(this);
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
@Label("Decorator")
public interface Decorator extends TypeScriptGen {

    @Relation("HAS_AT")
    TerminalNodeStrings getAt();

    void setAt(TerminalNodeStrings setAt);

    @Relation("HAS_DECORATOR_MEMBER_EXPRESSION")
    DecoratorMemberExpression getDecoratorMemberExpression();

    void setDecoratorMemberExpression(DecoratorMemberExpression setDecoratorMemberExpression);

    @Relation("HAS_DECORATOR_CALL_EXPRESSION")
    DecoratorCallExpression getDecoratorCallExpression();

    void setDecoratorCallExpression(DecoratorCallExpression setDecoratorCallExpression);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
