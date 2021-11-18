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
 * public static class VariableDeclaratorListContext extends ParserRuleContext {
 *
 *     public List<VariableDeclaratorContext> variableDeclarator() {
 *         return getRuleContexts(VariableDeclaratorContext.class);
 *     }
 *
 *     public VariableDeclaratorContext variableDeclarator(int i) {
 *         return getRuleContext(VariableDeclaratorContext.class, i);
 *     }
 *
 *     public List<TerminalNode> COMMA() {
 *         return getTokens(Java8Parser.COMMA);
 *     }
 *
 *     public TerminalNode COMMA(int i) {
 *         return getToken(Java8Parser.COMMA, i);
 *     }
 *
 *     public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_variableDeclaratorList;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterVariableDeclaratorList(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitVariableDeclaratorList(this);
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
@Label("VariableDeclaratorList")
public interface VariableDeclaratorList extends JavaGenAST {

    @Relation("HAS_VARIABLE_DECLARATOR")
    List<VariableDeclarator> getVariableDeclarator();

    void setVariableDeclarator(List<VariableDeclarator> setVariableDeclarator);

    @Relation("HAS_COMMA")
    List<TerminalNodeStrings> getCOMMA();

    void setCOMMA(List<TerminalNodeStrings> setCOMMA);
}
