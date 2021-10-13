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
 * public static class ClassBodyContext extends ParserRuleContext {
 *
 *     public TerminalNode LBRACE() {
 *         return getToken(Java8Parser.LBRACE, 0);
 *     }
 *
 *     public TerminalNode RBRACE() {
 *         return getToken(Java8Parser.RBRACE, 0);
 *     }
 *
 *     public List<ClassBodyDeclarationContext> classBodyDeclaration() {
 *         return getRuleContexts(ClassBodyDeclarationContext.class);
 *     }
 *
 *     public ClassBodyDeclarationContext classBodyDeclaration(int i) {
 *         return getRuleContext(ClassBodyDeclarationContext.class, i);
 *     }
 *
 *     public ClassBodyContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classBody;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterClassBody(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitClassBody(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassBody")
public interface ClassBody extends JavaGen {

    @Relation("HAS_L_B_R_A_C_E")
    TerminalNodeStrings getLBRACE();

    void setLBRACE(TerminalNodeStrings setLBRACE);

    @Relation("HAS_R_B_R_A_C_E")
    TerminalNodeStrings getRBRACE();

    void setRBRACE(TerminalNodeStrings setRBRACE);

    @Relation("HAS_CLASS_BODY_DECLARATION")
    List<ClassBodyDeclaration> getClassBodyDeclaration();

    void setClassBodyDeclaration(List<ClassBodyDeclaration> setClassBodyDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
