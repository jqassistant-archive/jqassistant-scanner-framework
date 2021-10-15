//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class Type_Context extends ParserRuleContext {
 *
 *     public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType() {
 *         return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class, 0);
 *     }
 *
 *     public FunctionTypeContext functionType() {
 *         return getRuleContext(FunctionTypeContext.class, 0);
 *     }
 *
 *     public ConstructorTypeContext constructorType() {
 *         return getRuleContext(ConstructorTypeContext.class, 0);
 *     }
 *
 *     public TypeGenericContext typeGeneric() {
 *         return getRuleContext(TypeGenericContext.class, 0);
 *     }
 *
 *     public TerminalNode StringLiteral() {
 *         return getToken(TypeScriptParser.StringLiteral, 0);
 *     }
 *
 *     public Type_Context(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_type_;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterType_(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitType_(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Type_")
public interface Type_ extends TypeScriptGen {

    @Relation("HAS_UNION_OR_INTERSECTION_OR_PRIMARY_TYPE")
    UnionOrIntersectionOrPrimaryType getUnionOrIntersectionOrPrimaryType();

    void setUnionOrIntersectionOrPrimaryType(UnionOrIntersectionOrPrimaryType setUnionOrIntersectionOrPrimaryType);

    @Relation("HAS_FUNCTION_TYPE")
    FunctionType getFunctionType();

    void setFunctionType(FunctionType setFunctionType);

    @Relation("HAS_CONSTRUCTOR_TYPE")
    ConstructorType getConstructorType();

    void setConstructorType(ConstructorType setConstructorType);

    @Relation("HAS_TYPE_GENERIC")
    TypeGeneric getTypeGeneric();

    void setTypeGeneric(TypeGeneric setTypeGeneric);

    @Relation("HAS_STRING_LITERAL")
    TerminalNodeStrings getStringLiteral();

    void setStringLiteral(TerminalNodeStrings setStringLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
