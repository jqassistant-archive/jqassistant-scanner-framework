//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE primaryType (BLOCK (ALT '(' type_ ')') (ALT predefinedType) (ALT typeReference) (ALT objectType) (ALT primaryType {notLineTerminator()}? '[' ']') (ALT '[' tupleElementTypes ']') (ALT typeQuery) (ALT This) (ALT typeReference Is primaryType)))
 * </pre>
 *
 * <pre>
 * primaryType
 *     : '(' type_ ')'                                 #ParenthesizedPrimType
 *     | predefinedType                                #PredefinedPrimType
 *     | typeReference                                 #ReferencePrimType
 *     | objectType                                    #ObjectPrimType
 *     | primaryType {notLineTerminator()}? '[' ']'    #ArrayPrimType
 *     | '[' tupleElementTypes ']'                     #TuplePrimType
 *     | typeQuery                                     #QueryPrimType
 *     | This                                          #ThisPrimType
 *     | typeReference Is primaryType                  #RedefinitionOfType
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:199-282
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#primaryType()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.PrimaryTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PrimaryType")
public interface PrimaryType extends TypeScriptGen {

    // unhandled TerminalAST token: '('
    @Relation("HAS_TYPE")
    Type_ getType_();

    void setType_(Type_ setType_);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_PREDEFINED_TYPE")
    PredefinedType getPredefinedType();

    void setPredefinedType(PredefinedType setPredefinedType);

    @Relation("HAS_TYPE_REFERENCE")
    TypeReference getTypeReference();

    void setTypeReference(TypeReference setTypeReference);

    @Relation("HAS_OBJECT_TYPE")
    ObjectType getObjectType();

    void setObjectType(ObjectType setObjectType);

    @Relation("HAS_PRIMARY_TYPE")
    PrimaryType getPrimaryType();

    void setPrimaryType(PrimaryType setPrimaryType);

    // unhandled AST type: 59 - list: false : {notLineTerminator()}?
    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    // unhandled TerminalAST token: '['
    @Relation("HAS_TUPLE_ELEMENT_TYPES")
    TupleElementTypes getTupleElementTypes();

    void setTupleElementTypes(TupleElementTypes setTupleElementTypes);

    // unhandled TerminalAST token: ']'
    @Relation("HAS_TYPE_QUERY")
    TypeQuery getTypeQuery();

    void setTypeQuery(TypeQuery setTypeQuery);

    @Relation("HAS_THIS")
    TerminalNodeStrings getThis();

    void setThis(TerminalNodeStrings setThis);

    @Relation("HAS_IS")
    TerminalNodeStrings getIs();

    void setIs(TerminalNodeStrings setIs);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
