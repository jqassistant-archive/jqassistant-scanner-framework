//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE propertyAssignment (BLOCK (ALT propertyName (BLOCK (ALT ':') (ALT '=')) singleExpression) (ALT '[' singleExpression ']' ':' singleExpression) (ALT getAccessor) (ALT setAccessor) (ALT generatorMethod) (ALT identifierOrKeyWord) (ALT restParameter)))
 * </pre>
 *
 * <pre>
 * propertyAssignment
 *     : propertyName (':' |'=') singleExpression                # PropertyExpressionAssignment
 *     | '[' singleExpression ']' ':' singleExpression           # ComputedPropertyExpressionAssignment
 *     | getAccessor                                             # PropertyGetter
 *     | setAccessor                                             # PropertySetter
 *     | generatorMethod                                         # MethodProperty
 *     | identifierOrKeyWord                                     # PropertyShorthand
 *     | restParameter                                           # RestParameterInObject
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2492-2567
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#propertyAssignment()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.PropertyAssignmentMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PropertyAssignment")
public interface PropertyAssignment extends TypeScriptGen {

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    // unhandled TerminalAST token: ':'
    // unhandled TerminalAST token: '='
    // unhandled TerminalAST token: '['
    @Relation("HAS_SINGLE_EXPRESSION")
    List<SingleExpression> getSingleExpression();

    void setSingleExpression(List<SingleExpression> setSingleExpression);

    // unhandled TerminalAST token: ']'
    // unhandled TerminalAST token: ':'
    @Relation("HAS_GET_ACCESSOR")
    GetAccessor getGetAccessor();

    void setGetAccessor(GetAccessor setGetAccessor);

    @Relation("HAS_SET_ACCESSOR")
    SetAccessor getSetAccessor();

    void setSetAccessor(SetAccessor setSetAccessor);

    @Relation("HAS_GENERATOR_METHOD")
    GeneratorMethod getGeneratorMethod();

    void setGeneratorMethod(GeneratorMethod setGeneratorMethod);

    @Relation("HAS_IDENTIFIER_OR_KEY_WORD")
    IdentifierOrKeyWord getIdentifierOrKeyWord();

    void setIdentifierOrKeyWord(IdentifierOrKeyWord setIdentifierOrKeyWord);

    @Relation("HAS_REST_PARAMETER")
    RestParameter getRestParameter();

    void setRestParameter(RestParameter setRestParameter);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
