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
 * public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
 *
 *     public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
 *         return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_unannInterfaceType_lf_unannClassOrInterfaceType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
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
@Label("UnannInterfaceType_lf_unannClassOrInterfaceType")
public interface UnannInterfaceType_lf_unannClassOrInterfaceType extends JavaGen {

    @Relation("HAS_UNANN_CLASS_TYPE_LF_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassType_lf_unannClassOrInterfaceType getUnannClassType_lf_unannClassOrInterfaceType();

    void setUnannClassType_lf_unannClassOrInterfaceType(UnannClassType_lf_unannClassOrInterfaceType setUnannClassType_lf_unannClassOrInterfaceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
