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
 * public static class TypeQueryContext extends ParserRuleContext {
 *
 *     public TerminalNode Typeof() {
 *         return getToken(TypeScriptParser.Typeof, 0);
 *     }
 *
 *     public TypeQueryExpressionContext typeQueryExpression() {
 *         return getRuleContext(TypeQueryExpressionContext.class, 0);
 *     }
 *
 *     public TypeQueryContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeQuery;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTypeQuery(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTypeQuery(this);
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
@Label("TypeQuery")
public interface TypeQuery extends TypeScriptGen {

    @Relation("HAS_TYPEOF")
    TerminalNodeStrings getTypeof();

    void setTypeof(TerminalNodeStrings setTypeof);

    @Relation("HAS_TYPE_QUERY_EXPRESSION")
    TypeQueryExpression getTypeQueryExpression();

    void setTypeQueryExpression(TypeQueryExpression setTypeQueryExpression);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
