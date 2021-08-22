//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE type_ (BLOCK (ALT unionOrIntersectionOrPrimaryType) (ALT functionType) (ALT constructorType) (ALT typeGeneric) (ALT StringLiteral)))
 * </pre>
 *
 * <pre>
 * type_
 *     : unionOrIntersectionOrPrimaryType
 *     | functionType
 *     | constructorType
 *     | typeGeneric
 *     | StringLiteral
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:142-164
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#type_()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.Type_Mapper
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
