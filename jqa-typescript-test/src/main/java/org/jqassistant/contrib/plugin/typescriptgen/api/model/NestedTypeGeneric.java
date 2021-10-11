//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class NestedTypeGenericContext extends ParserRuleContext {
 *
 *     public TypeIncludeGenericContext typeIncludeGeneric() {
 *         return getRuleContext(TypeIncludeGenericContext.class, 0);
 *     }
 *
 *     public TypeGenericContext typeGeneric() {
 *         return getRuleContext(TypeGenericContext.class, 0);
 *     }
 *
 *     public NestedTypeGenericContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_nestedTypeGeneric;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterNestedTypeGeneric(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitNestedTypeGeneric(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.NestedTypeGenericMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("NestedTypeGeneric")
public interface NestedTypeGeneric extends TypeScriptGen {

    @Relation("HAS_TYPE_INCLUDE_GENERIC")
    TypeIncludeGeneric getTypeIncludeGeneric();

    void setTypeIncludeGeneric(TypeIncludeGeneric setTypeIncludeGeneric);

    @Relation("HAS_TYPE_GENERIC")
    TypeGeneric getTypeGeneric();

    void setTypeGeneric(TypeGeneric setTypeGeneric);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
