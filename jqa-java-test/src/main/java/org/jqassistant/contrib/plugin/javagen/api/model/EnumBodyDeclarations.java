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
 * public static class EnumBodyDeclarationsContext extends ParserRuleContext {
 *
 *     public TerminalNode SEMI() {
 *         return getToken(Java8Parser.SEMI, 0);
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
 *     public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_enumBodyDeclarations;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterEnumBodyDeclarations(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitEnumBodyDeclarations(this);
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
@Label("EnumBodyDeclarations")
public interface EnumBodyDeclarations extends JavaGen {

    @Relation("HAS_SEMI")
    TerminalNodeStrings getSEMI();

    void setSEMI(TerminalNodeStrings setSEMI);

    @Relation("HAS_CLASS_BODY_DECLARATION")
    List<ClassBodyDeclaration> getClassBodyDeclaration();

    void setClassBodyDeclaration(List<ClassBodyDeclaration> setClassBodyDeclaration);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
