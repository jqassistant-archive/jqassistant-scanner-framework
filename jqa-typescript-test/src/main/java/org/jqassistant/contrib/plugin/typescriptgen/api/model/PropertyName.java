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
 * public static class PropertyNameContext extends ParserRuleContext {
 *
 *     public IdentifierNameContext identifierName() {
 *         return getRuleContext(IdentifierNameContext.class, 0);
 *     }
 *
 *     public TerminalNode StringLiteral() {
 *         return getToken(TypeScriptParser.StringLiteral, 0);
 *     }
 *
 *     public NumericLiteralContext numericLiteral() {
 *         return getRuleContext(NumericLiteralContext.class, 0);
 *     }
 *
 *     public PropertyNameContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_propertyName;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterPropertyName(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitPropertyName(this);
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
@Label("PropertyName")
public interface PropertyName extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER_NAME")
    IdentifierName getIdentifierName();

    void setIdentifierName(IdentifierName setIdentifierName);

    @Relation("HAS_STRING_LITERAL")
    TerminalNodeStrings getStringLiteral();

    void setStringLiteral(TerminalNodeStrings setStringLiteral);

    @Relation("HAS_NUMERIC_LITERAL")
    NumericLiteral getNumericLiteral();

    void setNumericLiteral(NumericLiteral setNumericLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
