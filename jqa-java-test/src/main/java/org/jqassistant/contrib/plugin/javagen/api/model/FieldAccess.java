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
 * public static class FieldAccessContext extends ParserRuleContext {
 *
 *     public PrimaryContext primary() {
 *         return getRuleContext(PrimaryContext.class, 0);
 *     }
 *
 *     public List<TerminalNode> DOT() {
 *         return getTokens(Java8Parser.DOT);
 *     }
 *
 *     public TerminalNode DOT(int i) {
 *         return getToken(Java8Parser.DOT, i);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
 *     }
 *
 *     public TerminalNode SUPER() {
 *         return getToken(Java8Parser.SUPER, 0);
 *     }
 *
 *     public TypeNameContext typeName() {
 *         return getRuleContext(TypeNameContext.class, 0);
 *     }
 *
 *     public FieldAccessContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_fieldAccess;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterFieldAccess(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitFieldAccess(this);
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
@Label("FieldAccess")
public interface FieldAccess extends JavaGen {

    @Relation("HAS_PRIMARY")
    Primary getPrimary();

    void setPrimary(Primary setPrimary);

    @Relation("HAS_DOT")
    List<TerminalNodeStrings> getDOT();

    void setDOT(List<TerminalNodeStrings> setDOT);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_SUPER")
    TerminalNodeStrings getSUPER();

    void setSUPER(TerminalNodeStrings setSUPER);

    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName setTypeName);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
