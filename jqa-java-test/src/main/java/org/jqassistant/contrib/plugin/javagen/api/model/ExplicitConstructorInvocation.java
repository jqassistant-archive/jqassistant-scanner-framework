//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE explicitConstructorInvocation (BLOCK (ALT (? (BLOCK (ALT typeArguments))) 'this' '(' (? (BLOCK (ALT argumentList))) ')' ';') (ALT (? (BLOCK (ALT typeArguments))) 'super' '(' (? (BLOCK (ALT argumentList))) ')' ';') (ALT expressionName '.' (? (BLOCK (ALT typeArguments))) 'super' '(' (? (BLOCK (ALT argumentList))) ')' ';') (ALT primary '.' (? (BLOCK (ALT typeArguments))) 'super' '(' (? (BLOCK (ALT argumentList))) ')' ';')))
 * </pre>
 *
 * <pre>
 * explicitConstructorInvocation
 * 	:	typeArguments? 'this' '(' argumentList? ')' ';'
 * 	|	typeArguments? 'super' '(' argumentList? ')' ';'
 * 	|	expressionName '.' typeArguments? 'super' '(' argumentList? ')' ';'
 * 	|	primary '.' typeArguments? 'super' '(' argumentList? ')' ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1493-1567
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#explicitConstructorInvocation()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExplicitConstructorInvocationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExplicitConstructorInvocation")
public interface ExplicitConstructorInvocation extends JavaGen {

    // optional: ?
    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments typeArguments);

    // unhandled TerminalAST token: 'this'
    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_ARGUMENT_LIST")
    ArgumentList getArgumentList();

    void setArgumentList(ArgumentList argumentList);

    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: ';'
    // optional: ?
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '('
    // optional: ?
    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: ';'
    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName expressionName);

    // unhandled TerminalAST token: '.'
    // optional: ?
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '('
    // optional: ?
    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: ';'
    @Relation("HAS_PRIMARY")
    Primary getPrimary();

    void setPrimary(Primary primary);

    // unhandled TerminalAST token: '.'
    // optional: ?
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '('
    // optional: ?
    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
