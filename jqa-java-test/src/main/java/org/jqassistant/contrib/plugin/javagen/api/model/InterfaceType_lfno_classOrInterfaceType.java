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
 * public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
 *
 *     public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
 *         return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_interfaceType_lfno_classOrInterfaceType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterInterfaceType_lfno_classOrInterfaceType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitInterfaceType_lfno_classOrInterfaceType(this);
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
@Label("InterfaceType_lfno_classOrInterfaceType")
public interface InterfaceType_lfno_classOrInterfaceType extends JavaGen {

    @Relation("HAS_CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE")
    ClassType_lfno_classOrInterfaceType getClassType_lfno_classOrInterfaceType();

    void setClassType_lfno_classOrInterfaceType(ClassType_lfno_classOrInterfaceType setClassType_lfno_classOrInterfaceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
