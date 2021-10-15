//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class ClassExtendsClauseContext extends ParserRuleContext {
 *
 *     public TerminalNode Extends() {
 *         return getToken(TypeScriptParser.Extends, 0);
 *     }
 *
 *     public TypeReferenceContext typeReference() {
 *         return getRuleContext(TypeReferenceContext.class, 0);
 *     }
 *
 *     public ClassExtendsClauseContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classExtendsClause;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterClassExtendsClause(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitClassExtendsClause(this);
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
@Label("ClassExtendsClause")
public interface ClassExtendsClause extends TypeScriptGen {

    @Relation("HAS_EXTENDS")
    TerminalNodeStrings getExtends();

    void setExtends(TerminalNodeStrings setExtends);

    @Relation("HAS_TYPE_REFERENCE")
    TypeReference getTypeReference();

    void setTypeReference(TypeReference setTypeReference);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
