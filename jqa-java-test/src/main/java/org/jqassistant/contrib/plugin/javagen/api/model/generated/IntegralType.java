//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class IntegralTypeContext extends ParserRuleContext {
 *
 *     public TerminalNode BYTE() {
 *         return getToken(Java8Parser.BYTE, 0);
 *     }
 *
 *     public TerminalNode SHORT() {
 *         return getToken(Java8Parser.SHORT, 0);
 *     }
 *
 *     public TerminalNode INT() {
 *         return getToken(Java8Parser.INT, 0);
 *     }
 *
 *     public TerminalNode LONG() {
 *         return getToken(Java8Parser.LONG, 0);
 *     }
 *
 *     public TerminalNode CHAR() {
 *         return getToken(Java8Parser.CHAR, 0);
 *     }
 *
 *     public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_integralType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterIntegralType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitIntegralType(this);
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
@Label("IntegralType")
public interface IntegralType extends JavaGenAST {

    @Relation("HAS_BYTE")
    TerminalNodeStrings getBYTE();

    void setBYTE(TerminalNodeStrings setBYTE);

    @Relation("HAS_SHORT")
    TerminalNodeStrings getSHORT();

    void setSHORT(TerminalNodeStrings setSHORT);

    @Relation("HAS_INT")
    TerminalNodeStrings getINT();

    void setINT(TerminalNodeStrings setINT);

    @Relation("HAS_LONG")
    TerminalNodeStrings getLONG();

    void setLONG(TerminalNodeStrings setLONG);

    @Relation("HAS_CHAR")
    TerminalNodeStrings getCHAR();

    void setCHAR(TerminalNodeStrings setCHAR);
}
