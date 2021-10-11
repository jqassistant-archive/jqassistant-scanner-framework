//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class BindingPatternContext extends ParserRuleContext {
 *
 *     public ArrayLiteralContext arrayLiteral() {
 *         return getRuleContext(ArrayLiteralContext.class, 0);
 *     }
 *
 *     public ObjectLiteralContext objectLiteral() {
 *         return getRuleContext(ObjectLiteralContext.class, 0);
 *     }
 *
 *     public BindingPatternContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_bindingPattern;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterBindingPattern(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitBindingPattern(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.BindingPatternMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("BindingPattern")
public interface BindingPattern extends TypeScriptGen {

    @Relation("HAS_ARRAY_LITERAL")
    ArrayLiteral getArrayLiteral();

    void setArrayLiteral(ArrayLiteral setArrayLiteral);

    @Relation("HAS_OBJECT_LITERAL")
    ObjectLiteral getObjectLiteral();

    void setObjectLiteral(ObjectLiteral setObjectLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
