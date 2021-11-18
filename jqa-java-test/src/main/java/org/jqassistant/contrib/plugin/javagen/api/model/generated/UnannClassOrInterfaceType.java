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
 * public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
 *
 *     public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
 *         return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
 *         return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
 *         return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
 *     }
 *
 *     public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
 *         return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class, i);
 *     }
 *
 *     public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
 *         return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
 *     }
 *
 *     public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
 *         return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class, i);
 *     }
 *
 *     public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_unannClassOrInterfaceType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterUnannClassOrInterfaceType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitUnannClassOrInterfaceType(this);
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
@Label("UnannClassOrInterfaceType")
public interface UnannClassOrInterfaceType extends JavaGenAST {

    @Relation("HAS_UNANN_CLASS_TYPE_LFNO_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassType_lfno_unannClassOrInterfaceType getUnannClassType_lfno_unannClassOrInterfaceType();

    void setUnannClassType_lfno_unannClassOrInterfaceType(UnannClassType_lfno_unannClassOrInterfaceType setUnannClassType_lfno_unannClassOrInterfaceType);

    @Relation("HAS_UNANN_INTERFACE_TYPE_LFNO_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannInterfaceType_lfno_unannClassOrInterfaceType getUnannInterfaceType_lfno_unannClassOrInterfaceType();

    void setUnannInterfaceType_lfno_unannClassOrInterfaceType(UnannInterfaceType_lfno_unannClassOrInterfaceType setUnannInterfaceType_lfno_unannClassOrInterfaceType);

    @Relation("HAS_UNANN_CLASS_TYPE_LF_UNANN_CLASS_OR_INTERFACE_TYPE")
    List<UnannClassType_lf_unannClassOrInterfaceType> getUnannClassType_lf_unannClassOrInterfaceType();

    void setUnannClassType_lf_unannClassOrInterfaceType(List<UnannClassType_lf_unannClassOrInterfaceType> setUnannClassType_lf_unannClassOrInterfaceType);

    @Relation("HAS_UNANN_INTERFACE_TYPE_LF_UNANN_CLASS_OR_INTERFACE_TYPE")
    List<UnannInterfaceType_lf_unannClassOrInterfaceType> getUnannInterfaceType_lf_unannClassOrInterfaceType();

    void setUnannInterfaceType_lf_unannClassOrInterfaceType(List<UnannInterfaceType_lf_unannClassOrInterfaceType> setUnannInterfaceType_lf_unannClassOrInterfaceType);
}
