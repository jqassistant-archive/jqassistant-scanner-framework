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
 * public static class VariableDeclaratorContext extends ParserRuleContext {
 *
 *     public VariableDeclaratorIdContext variableDeclaratorId() {
 *         return getRuleContext(VariableDeclaratorIdContext.class, 0);
 *     }
 *
 *     public TerminalNode ASSIGN() {
 *         return getToken(Java8Parser.ASSIGN, 0);
 *     }
 *
 *     public VariableInitializerContext variableInitializer() {
 *         return getRuleContext(VariableInitializerContext.class, 0);
 *     }
 *
 *     public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_variableDeclarator;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterVariableDeclarator(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitVariableDeclarator(this);
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
@Label("VariableDeclarator")
public interface VariableDeclarator extends JavaGen {

    @Relation("HAS_VARIABLE_DECLARATOR_ID")
    VariableDeclaratorId getVariableDeclaratorId();

    void setVariableDeclaratorId(VariableDeclaratorId setVariableDeclaratorId);

    @Relation("HAS_ASSIGN")
    TerminalNodeStrings getASSIGN();

    void setASSIGN(TerminalNodeStrings setASSIGN);

    @Relation("HAS_VARIABLE_INITIALIZER")
    VariableInitializer getVariableInitializer();

    void setVariableInitializer(VariableInitializer setVariableInitializer);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
