//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class GetterSetterDeclarationExpressionContext extends PropertyMemberDeclarationContext {
 *
 *     public PropertyMemberBaseContext propertyMemberBase() {
 *         return getRuleContext(PropertyMemberBaseContext.class, 0);
 *     }
 *
 *     public GetAccessorContext getAccessor() {
 *         return getRuleContext(GetAccessorContext.class, 0);
 *     }
 *
 *     public SetAccessorContext setAccessor() {
 *         return getRuleContext(SetAccessorContext.class, 0);
 *     }
 *
 *     public GetterSetterDeclarationExpressionContext(PropertyMemberDeclarationContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterGetterSetterDeclarationExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitGetterSetterDeclarationExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	comments = "REQUIRES_SPECIAL_MAPPING")
@Label("GetterSetterDeclarationExpression")
public interface GetterSetterDeclarationExpression extends PropertyMemberDeclaration {

    @Relation("HAS_PROPERTY_MEMBER_BASE")
    PropertyMemberBase getPropertyMemberBase();

    void setPropertyMemberBase(PropertyMemberBase setPropertyMemberBase);

    @Relation("HAS_GET_ACCESSOR")
    GetAccessor getGetAccessor();

    void setGetAccessor(GetAccessor setGetAccessor);

    @Relation("HAS_SET_ACCESSOR")
    SetAccessor getSetAccessor();

    void setSetAccessor(SetAccessor setSetAccessor);
}
