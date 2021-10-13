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
 * public static class UnannArrayTypeContext extends ParserRuleContext {
 *
 *     public UnannPrimitiveTypeContext unannPrimitiveType() {
 *         return getRuleContext(UnannPrimitiveTypeContext.class, 0);
 *     }
 *
 *     public DimsContext dims() {
 *         return getRuleContext(DimsContext.class, 0);
 *     }
 *
 *     public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
 *         return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public UnannTypeVariableContext unannTypeVariable() {
 *         return getRuleContext(UnannTypeVariableContext.class, 0);
 *     }
 *
 *     public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_unannArrayType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterUnannArrayType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitUnannArrayType(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannArrayTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnannArrayType")
public interface UnannArrayType extends JavaGen {

    @Relation("HAS_UNANN_PRIMITIVE_TYPE")
    UnannPrimitiveType getUnannPrimitiveType();

    void setUnannPrimitiveType(UnannPrimitiveType setUnannPrimitiveType);

    @Relation("HAS_DIMS")
    Dims getDims();

    void setDims(Dims setDims);

    @Relation("HAS_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassOrInterfaceType getUnannClassOrInterfaceType();

    void setUnannClassOrInterfaceType(UnannClassOrInterfaceType setUnannClassOrInterfaceType);

    @Relation("HAS_UNANN_TYPE_VARIABLE")
    UnannTypeVariable getUnannTypeVariable();

    void setUnannTypeVariable(UnannTypeVariable setUnannTypeVariable);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
