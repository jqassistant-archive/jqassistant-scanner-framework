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
 * public static class SwitchLabelContext extends ParserRuleContext {
 *
 *     public TerminalNode CASE() {
 *         return getToken(Java8Parser.CASE, 0);
 *     }
 *
 *     public ConstantExpressionContext constantExpression() {
 *         return getRuleContext(ConstantExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode COLON() {
 *         return getToken(Java8Parser.COLON, 0);
 *     }
 *
 *     public EnumConstantNameContext enumConstantName() {
 *         return getRuleContext(EnumConstantNameContext.class, 0);
 *     }
 *
 *     public TerminalNode DEFAULT() {
 *         return getToken(Java8Parser.DEFAULT, 0);
 *     }
 *
 *     public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_switchLabel;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterSwitchLabel(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitSwitchLabel(this);
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
@Label("SwitchLabel")
public interface SwitchLabel extends JavaGen {

    @Relation("HAS_CASE")
    TerminalNodeStrings getCASE();

    void setCASE(TerminalNodeStrings setCASE);

    @Relation("HAS_CONSTANT_EXPRESSION")
    ConstantExpression getConstantExpression();

    void setConstantExpression(ConstantExpression setConstantExpression);

    @Relation("HAS_COLON")
    TerminalNodeStrings getCOLON();

    void setCOLON(TerminalNodeStrings setCOLON);

    @Relation("HAS_ENUM_CONSTANT_NAME")
    EnumConstantName getEnumConstantName();

    void setEnumConstantName(EnumConstantName setEnumConstantName);

    @Relation("HAS_DEFAULT")
    TerminalNodeStrings getDEFAULT();

    void setDEFAULT(TerminalNodeStrings setDEFAULT);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
