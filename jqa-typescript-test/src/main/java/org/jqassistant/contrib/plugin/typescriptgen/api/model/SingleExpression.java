//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class SingleExpressionContext extends ParserRuleContext {
 *
 *     public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_singleExpression;
 *     }
 *
 *     public SingleExpressionContext() {
 *     }
 *
 *     public void copyFrom(SingleExpressionContext ctx) {
 *         super.copyFrom(ctx);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.SingleExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SingleExpression")
public interface SingleExpression extends TypeScriptGen {

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
