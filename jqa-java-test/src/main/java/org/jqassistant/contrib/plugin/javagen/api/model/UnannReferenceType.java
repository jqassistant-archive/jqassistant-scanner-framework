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
 * public static class UnannReferenceTypeContext extends ParserRuleContext {
 *
 *     public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
 *         return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public UnannTypeVariableContext unannTypeVariable() {
 *         return getRuleContext(UnannTypeVariableContext.class, 0);
 *     }
 *
 *     public UnannArrayTypeContext unannArrayType() {
 *         return getRuleContext(UnannArrayTypeContext.class, 0);
 *     }
 *
 *     public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_unannReferenceType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterUnannReferenceType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitUnannReferenceType(this);
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
@Label("UnannReferenceType")
public interface UnannReferenceType extends JavaGen {

    @Relation("HAS_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassOrInterfaceType getUnannClassOrInterfaceType();

    void setUnannClassOrInterfaceType(UnannClassOrInterfaceType setUnannClassOrInterfaceType);

    @Relation("HAS_UNANN_TYPE_VARIABLE")
    UnannTypeVariable getUnannTypeVariable();

    void setUnannTypeVariable(UnannTypeVariable setUnannTypeVariable);

    @Relation("HAS_UNANN_ARRAY_TYPE")
    UnannArrayType getUnannArrayType();

    void setUnannArrayType(UnannArrayType setUnannArrayType);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
