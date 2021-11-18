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
 * public static class ParameterContext extends ParserRuleContext {
 *
 *     public RequiredParameterContext requiredParameter() {
 *         return getRuleContext(RequiredParameterContext.class, 0);
 *     }
 *
 *     public OptionalParameterContext optionalParameter() {
 *         return getRuleContext(OptionalParameterContext.class, 0);
 *     }
 *
 *     public ParameterContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_parameter;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterParameter(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitParameter(this);
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
@Label("Parameter")
public interface Parameter extends TypeScriptGen {

    @Relation("HAS_REQUIRED_PARAMETER")
    RequiredParameter getRequiredParameter();

    void setRequiredParameter(RequiredParameter setRequiredParameter);

    @Relation("HAS_OPTIONAL_PARAMETER")
    OptionalParameter getOptionalParameter();

    void setOptionalParameter(OptionalParameter setOptionalParameter);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
