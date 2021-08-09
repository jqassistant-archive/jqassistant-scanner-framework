//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE methodInvocation_lfno_primary (BLOCK (ALT methodName '(' (? (BLOCK (ALT argumentList))) ')') (ALT typeName '.' (? (BLOCK (ALT typeArguments))) Identifier '(' (? (BLOCK (ALT argumentList))) ')') (ALT expressionName '.' (? (BLOCK (ALT typeArguments))) Identifier '(' (? (BLOCK (ALT argumentList))) ')') (ALT 'super' '.' (? (BLOCK (ALT typeArguments))) Identifier '(' (? (BLOCK (ALT argumentList))) ')') (ALT typeName '.' 'super' '.' (? (BLOCK (ALT typeArguments))) Identifier '(' (? (BLOCK (ALT argumentList))) ')')))
 * </pre>
 *
 * <pre>
 * methodInvocation_lfno_primary
 * 	:	methodName '(' argumentList? ')'
 * 	|	typeName '.' typeArguments? Identifier '(' argumentList? ')'
 * 	|	expressionName '.' typeArguments? Identifier '(' argumentList? ')'
 * 	|	'super' '.' typeArguments? Identifier '(' argumentList? ')'
 * 	|	typeName '.' 'super' '.' typeArguments? Identifier '(' argumentList? ')'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3883-3972
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#methodInvocation_lfno_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MethodInvocation_lfno_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("MethodInvocation_lfno_primary")
public interface MethodInvocation_lfno_primary extends JavaGen {

    @Relation("HAS_METHOD_NAME")
    MethodName getMethodName();

    void setMethodName(MethodName methodName);

    // unhandled TerminalAST token: '('
    // optional: argumentList
    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: '.'
    // optional: typeArguments
    // unhandled TerminalAST token: '('
    // optional: argumentList
    @Relation("HAS_ARGUMENT_LIST")
    List<ArgumentList> getArgumentLists();

    void setArgumentLists(List<ArgumentList> setArgumentLists);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName expressionName);

    // unhandled TerminalAST token: '.'
    // optional: typeArguments
    @Relation("HAS_TYPE_ARGUMENTS")
    List<TypeArguments> getTypeArgumentss();

    void setTypeArgumentss(List<TypeArguments> setTypeArgumentss);

    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifiers();

    void setIdentifiers(List<TerminalNodeStrings> setIdentifiers);

    // unhandled TerminalAST token: '('
    // optional: argumentList
    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '.'
    // optional: typeArguments
    // unhandled TerminalAST token: '('
    // optional: argumentList
    // unhandled TerminalAST token: ')'
    @Relation("HAS_TYPE_NAME")
    List<TypeName> getTypeNames();

    void setTypeNames(List<TypeName> setTypeNames);
    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '.'
    // optional: typeArguments
    // unhandled TerminalAST token: '('
    // optional: argumentList
    // unhandled TerminalAST token: ')'
}
