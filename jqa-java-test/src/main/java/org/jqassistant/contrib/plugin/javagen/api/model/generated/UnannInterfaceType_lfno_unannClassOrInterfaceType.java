//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
 *
 *     public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
 *         return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
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
@Label("UnannInterfaceType_lfno_unannClassOrInterfaceType")
public interface UnannInterfaceType_lfno_unannClassOrInterfaceType extends JavaGenAST {

    @Relation("HAS_UNANN_CLASS_TYPE_LFNO_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassType_lfno_unannClassOrInterfaceType getUnannClassType_lfno_unannClassOrInterfaceType();

    void setUnannClassType_lfno_unannClassOrInterfaceType(UnannClassType_lfno_unannClassOrInterfaceType setUnannClassType_lfno_unannClassOrInterfaceType);
}
