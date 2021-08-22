//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE variableDeclaration (BLOCK (ALT (BLOCK (ALT identifierOrKeyWord) (ALT arrayLiteral) (ALT objectLiteral)) (? (BLOCK (ALT typeAnnotation))) (? (BLOCK (ALT singleExpression))) (? (BLOCK (ALT '=' (? (BLOCK (ALT typeParameters))) singleExpression))))))
 * </pre>
 *
 * <pre>
 * variableDeclaration
 *     : ( identifierOrKeyWord | arrayLiteral | objectLiteral) typeAnnotation? singleExpression? ('=' typeParameters? singleExpression)? // ECMAScript 6: Array & Object Matching
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1467-1502
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#variableDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.VariableDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("VariableDeclaration")
public interface VariableDeclaration extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER_OR_KEY_WORD")
    IdentifierOrKeyWord getIdentifierOrKeyWord();

    void setIdentifierOrKeyWord(IdentifierOrKeyWord setIdentifierOrKeyWord);

    @Relation("HAS_ARRAY_LITERAL")
    ArrayLiteral getArrayLiteral();

    void setArrayLiteral(ArrayLiteral setArrayLiteral);

    @Relation("HAS_OBJECT_LITERAL")
    ObjectLiteral getObjectLiteral();

    void setObjectLiteral(ObjectLiteral setObjectLiteral);

    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    // optional: ?
    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    // optional: ?
    // unhandled TerminalAST token: '='
    // optional: ?
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
