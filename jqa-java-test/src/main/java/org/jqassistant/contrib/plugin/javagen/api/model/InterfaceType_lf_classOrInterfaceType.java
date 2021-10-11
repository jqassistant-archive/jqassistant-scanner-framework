//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
 *
 *     public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
 *         return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_interfaceType_lf_classOrInterfaceType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterInterfaceType_lf_classOrInterfaceType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitInterfaceType_lf_classOrInterfaceType(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceType_lf_classOrInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceType_lf_classOrInterfaceType")
public interface InterfaceType_lf_classOrInterfaceType extends JavaGen {

    @Relation("HAS_CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE")
    ClassType_lf_classOrInterfaceType getClassType_lf_classOrInterfaceType();

    void setClassType_lf_classOrInterfaceType(ClassType_lf_classOrInterfaceType setClassType_lf_classOrInterfaceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
