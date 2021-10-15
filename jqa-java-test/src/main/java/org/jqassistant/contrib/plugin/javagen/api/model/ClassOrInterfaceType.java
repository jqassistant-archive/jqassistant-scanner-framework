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
 * public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
 *
 *     public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
 *         return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
 *         return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
 *         return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
 *     }
 *
 *     public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
 *         return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class, i);
 *     }
 *
 *     public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
 *         return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
 *     }
 *
 *     public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
 *         return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class, i);
 *     }
 *
 *     public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classOrInterfaceType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterClassOrInterfaceType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitClassOrInterfaceType(this);
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
@Label("ClassOrInterfaceType")
public interface ClassOrInterfaceType extends JavaGen {

    @Relation("HAS_CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE")
    ClassType_lfno_classOrInterfaceType getClassType_lfno_classOrInterfaceType();

    void setClassType_lfno_classOrInterfaceType(ClassType_lfno_classOrInterfaceType setClassType_lfno_classOrInterfaceType);

    @Relation("HAS_INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE")
    InterfaceType_lfno_classOrInterfaceType getInterfaceType_lfno_classOrInterfaceType();

    void setInterfaceType_lfno_classOrInterfaceType(InterfaceType_lfno_classOrInterfaceType setInterfaceType_lfno_classOrInterfaceType);

    @Relation("HAS_CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE")
    List<ClassType_lf_classOrInterfaceType> getClassType_lf_classOrInterfaceType();

    void setClassType_lf_classOrInterfaceType(List<ClassType_lf_classOrInterfaceType> setClassType_lf_classOrInterfaceType);

    @Relation("HAS_INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE")
    List<InterfaceType_lf_classOrInterfaceType> getInterfaceType_lf_classOrInterfaceType();

    void setInterfaceType_lf_classOrInterfaceType(List<InterfaceType_lf_classOrInterfaceType> setInterfaceType_lf_classOrInterfaceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
