//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class CatchFormalParameterContext extends ParserRuleContext {
 *
 *     public CatchTypeContext catchType() {
 *         return getRuleContext(CatchTypeContext.class, 0);
 *     }
 *
 *     public VariableDeclaratorIdContext variableDeclaratorId() {
 *         return getRuleContext(VariableDeclaratorIdContext.class, 0);
 *     }
 *
 *     public List<VariableModifierContext> variableModifier() {
 *         return getRuleContexts(VariableModifierContext.class);
 *     }
 *
 *     public VariableModifierContext variableModifier(int i) {
 *         return getRuleContext(VariableModifierContext.class, i);
 *     }
 *
 *     public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_catchFormalParameter;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterCatchFormalParameter(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitCatchFormalParameter(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CatchFormalParameter")
public interface CatchFormalParameter extends JavaGen {

    @Relation("HAS_CATCH_TYPE")
    CatchType getCatchType();

    void setCatchType(CatchType setCatchType);

    @Relation("HAS_VARIABLE_DECLARATOR_ID")
    VariableDeclaratorId getVariableDeclaratorId();

    void setVariableDeclaratorId(VariableDeclaratorId setVariableDeclaratorId);

    @Relation("HAS_VARIABLE_MODIFIER")
    List<VariableModifier> getVariableModifier();

    void setVariableModifier(List<VariableModifier> setVariableModifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
