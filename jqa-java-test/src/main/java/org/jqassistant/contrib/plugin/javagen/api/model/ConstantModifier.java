//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class ConstantModifierContext extends ParserRuleContext {
 *
 *     public AnnotationContext annotation() {
 *         return getRuleContext(AnnotationContext.class, 0);
 *     }
 *
 *     public TerminalNode PUBLIC() {
 *         return getToken(Java8Parser.PUBLIC, 0);
 *     }
 *
 *     public TerminalNode STATIC() {
 *         return getToken(Java8Parser.STATIC, 0);
 *     }
 *
 *     public TerminalNode FINAL() {
 *         return getToken(Java8Parser.FINAL, 0);
 *     }
 *
 *     public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_constantModifier;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterConstantModifier(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitConstantModifier(this);
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
@Label("ConstantModifier")
public interface ConstantModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    @Relation("HAS_PUBLIC")
    TerminalNodeStrings getPUBLIC();

    void setPUBLIC(TerminalNodeStrings setPUBLIC);

    @Relation("HAS_STATIC")
    TerminalNodeStrings getSTATIC();

    void setSTATIC(TerminalNodeStrings setSTATIC);

    @Relation("HAS_FINAL")
    TerminalNodeStrings getFINAL();

    void setFINAL(TerminalNodeStrings setFINAL);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
