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
 * public static class UnannTypeContext extends ParserRuleContext {
 *
 *     public UnannPrimitiveTypeContext unannPrimitiveType() {
 *         return getRuleContext(UnannPrimitiveTypeContext.class, 0);
 *     }
 *
 *     public UnannReferenceTypeContext unannReferenceType() {
 *         return getRuleContext(UnannReferenceTypeContext.class, 0);
 *     }
 *
 *     public UnannTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_unannType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterUnannType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitUnannType(this);
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
@Label("UnannType")
public interface UnannType extends JavaGen {

    @Relation("HAS_UNANN_PRIMITIVE_TYPE")
    UnannPrimitiveType getUnannPrimitiveType();

    void setUnannPrimitiveType(UnannPrimitiveType setUnannPrimitiveType);

    @Relation("HAS_UNANN_REFERENCE_TYPE")
    UnannReferenceType getUnannReferenceType();

    void setUnannReferenceType(UnannReferenceType setUnannReferenceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
