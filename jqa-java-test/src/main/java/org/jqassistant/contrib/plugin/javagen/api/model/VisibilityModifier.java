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
 * public static class VisibilityModifierContext extends ParserRuleContext {
 *
 *     public TerminalNode PUBLIC() {
 *         return getToken(Java8Parser.PUBLIC, 0);
 *     }
 *
 *     public TerminalNode PROTECTED() {
 *         return getToken(Java8Parser.PROTECTED, 0);
 *     }
 *
 *     public TerminalNode PRIVATE() {
 *         return getToken(Java8Parser.PRIVATE, 0);
 *     }
 *
 *     public VisibilityModifierContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_visibilityModifier;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterVisibilityModifier(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitVisibilityModifier(this);
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
@Label("VisibilityModifier")
public interface VisibilityModifier extends JavaGen {

    @Relation("HAS_PUBLIC")
    TerminalNodeStrings getPUBLIC();

    void setPUBLIC(TerminalNodeStrings setPUBLIC);

    @Relation("HAS_PROTECTED")
    TerminalNodeStrings getPROTECTED();

    void setPROTECTED(TerminalNodeStrings setPROTECTED);

    @Relation("HAS_PRIVATE")
    TerminalNodeStrings getPRIVATE();

    void setPRIVATE(TerminalNodeStrings setPRIVATE);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
