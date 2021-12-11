//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class PropertyMemberBaseContext extends ParserRuleContext {
 *
 *     public TerminalNode Async() {
 *         return getToken(TypeScriptParser.Async, 0);
 *     }
 *
 *     public AccessibilityModifierContext accessibilityModifier() {
 *         return getRuleContext(AccessibilityModifierContext.class, 0);
 *     }
 *
 *     public TerminalNode Static() {
 *         return getToken(TypeScriptParser.Static, 0);
 *     }
 *
 *     public TerminalNode ReadOnly() {
 *         return getToken(TypeScriptParser.ReadOnly, 0);
 *     }
 *
 *     public PropertyMemberBaseContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_propertyMemberBase;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterPropertyMemberBase(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitPropertyMemberBase(this);
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
@Label("PropertyMemberBase")
public interface PropertyMemberBase extends TypeScriptGenAST {

    @Relation("HAS_ASYNC")
    TerminalNodeStrings getAsync();

    void setAsync(TerminalNodeStrings setAsync);

    @Relation("HAS_ACCESSIBILITY_MODIFIER")
    AccessibilityModifier getAccessibilityModifier();

    void setAccessibilityModifier(AccessibilityModifier setAccessibilityModifier);

    @Relation("HAS_STATIC")
    TerminalNodeStrings getStatic();

    void setStatic(TerminalNodeStrings setStatic);

    @Relation("HAS_READ_ONLY")
    TerminalNodeStrings getReadOnly();

    void setReadOnly(TerminalNodeStrings setReadOnly);
}
