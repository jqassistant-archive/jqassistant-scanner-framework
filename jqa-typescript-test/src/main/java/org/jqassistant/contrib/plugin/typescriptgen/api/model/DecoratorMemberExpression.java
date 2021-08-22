//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE decoratorMemberExpression (BLOCK (ALT Identifier) (ALT decoratorMemberExpression '.' identifierName) (ALT '(' singleExpression ')')))
 * </pre>
 *
 * <pre>
 * decoratorMemberExpression
 *     : Identifier
 *     | decoratorMemberExpression '.' identifierName
 *     | '(' singleExpression ')'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1089-1111
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#decoratorMemberExpression()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.DecoratorMemberExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("DecoratorMemberExpression")
public interface DecoratorMemberExpression extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_DECORATOR_MEMBER_EXPRESSION")
    DecoratorMemberExpression getDecoratorMemberExpression();

    void setDecoratorMemberExpression(DecoratorMemberExpression setDecoratorMemberExpression);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER_NAME")
    IdentifierName getIdentifierName();

    void setIdentifierName(IdentifierName setIdentifierName);

    // unhandled TerminalAST token: '('
    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
