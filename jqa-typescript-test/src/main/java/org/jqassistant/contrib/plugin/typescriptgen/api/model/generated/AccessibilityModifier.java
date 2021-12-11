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
 * public static class AccessibilityModifierContext extends ParserRuleContext {
 *
 *     public TerminalNode Public() {
 *         return getToken(TypeScriptParser.Public, 0);
 *     }
 *
 *     public TerminalNode Private() {
 *         return getToken(TypeScriptParser.Private, 0);
 *     }
 *
 *     public TerminalNode Protected() {
 *         return getToken(TypeScriptParser.Protected, 0);
 *     }
 *
 *     public AccessibilityModifierContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_accessibilityModifier;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterAccessibilityModifier(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitAccessibilityModifier(this);
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
@Label("AccessibilityModifier")
public interface AccessibilityModifier extends TypeScriptGenAST {

    @Relation("HAS_PUBLIC")
    TerminalNodeStrings getPublic();

    void setPublic(TerminalNodeStrings setPublic);

    @Relation("HAS_PRIVATE")
    TerminalNodeStrings getPrivate();

    void setPrivate(TerminalNodeStrings setPrivate);

    @Relation("HAS_PROTECTED")
    TerminalNodeStrings getProtected();

    void setProtected(TerminalNodeStrings setProtected);
}
