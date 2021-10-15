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
 * public static class TypeArgumentContext extends ParserRuleContext {
 *
 *     public ReferenceTypeContext referenceType() {
 *         return getRuleContext(ReferenceTypeContext.class, 0);
 *     }
 *
 *     public WildcardContext wildcard() {
 *         return getRuleContext(WildcardContext.class, 0);
 *     }
 *
 *     public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeArgument;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterTypeArgument(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitTypeArgument(this);
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
@Label("TypeArgument")
public interface TypeArgument extends JavaGen {

    @Relation("HAS_REFERENCE_TYPE")
    ReferenceType getReferenceType();

    void setReferenceType(ReferenceType setReferenceType);

    @Relation("HAS_WILDCARD")
    Wildcard getWildcard();

    void setWildcard(Wildcard setWildcard);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
