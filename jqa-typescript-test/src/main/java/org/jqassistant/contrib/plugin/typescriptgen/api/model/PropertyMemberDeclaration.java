//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE propertyMemberDeclaration (BLOCK (ALT propertyMemberBase propertyName (? (BLOCK (ALT '?'))) (? (BLOCK (ALT typeAnnotation))) (? (BLOCK (ALT initializer))) SemiColon) (ALT propertyMemberBase propertyName callSignature (BLOCK (ALT (BLOCK (ALT '{' functionBody '}'))) (ALT SemiColon))) (ALT propertyMemberBase (BLOCK (ALT getAccessor) (ALT setAccessor))) (ALT abstractDeclaration)))
 * </pre>
 *
 * <pre>
 * propertyMemberDeclaration
 *     : propertyMemberBase propertyName '?'? typeAnnotation? initializer? SemiColon                   # PropertyDeclarationExpression
 *     | propertyMemberBase propertyName callSignature ( ('{' functionBody '}') | SemiColon)           # MethodDeclarationExpression
 *     | propertyMemberBase (getAccessor | setAccessor)                                                # GetterSetterDeclarationExpression
 *     | abstractDeclaration                                                                           # AbstractMemberDeclaration
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2075-2149
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#propertyMemberDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.PropertyMemberDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PropertyMemberDeclaration")
public interface PropertyMemberDeclaration extends TypeScriptGen {

    @Relation("HAS_PROPERTY_MEMBER_BASE")
    PropertyMemberBase getPropertyMemberBase();

    void setPropertyMemberBase(PropertyMemberBase setPropertyMemberBase);

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    // optional: ?
    // unhandled TerminalAST token: '?'
    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    // optional: ?
    @Relation("HAS_INITIALIZER")
    Initializer getInitializer();

    void setInitializer(Initializer setInitializer);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_CALL_SIGNATURE")
    CallSignature getCallSignature();

    void setCallSignature(CallSignature setCallSignature);

    // unhandled TerminalAST token: '{'
    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_GET_ACCESSOR")
    GetAccessor getGetAccessor();

    void setGetAccessor(GetAccessor setGetAccessor);

    @Relation("HAS_SET_ACCESSOR")
    SetAccessor getSetAccessor();

    void setSetAccessor(SetAccessor setSetAccessor);

    @Relation("HAS_ABSTRACT_DECLARATION")
    AbstractDeclaration getAbstractDeclaration();

    void setAbstractDeclaration(AbstractDeclaration setAbstractDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
