//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE classInstanceCreationExpression (BLOCK (ALT 'new' (? (BLOCK (ALT typeArguments))) (* (BLOCK (ALT annotation))) Identifier (* (BLOCK (ALT '.' (* (BLOCK (ALT annotation))) Identifier))) (? (BLOCK (ALT typeArgumentsOrDiamond))) '(' (? (BLOCK (ALT argumentList))) ')' (? (BLOCK (ALT classBody)))) (ALT expressionName '.' 'new' (? (BLOCK (ALT typeArguments))) (* (BLOCK (ALT annotation))) Identifier (? (BLOCK (ALT typeArgumentsOrDiamond))) '(' (? (BLOCK (ALT argumentList))) ')' (? (BLOCK (ALT classBody)))) (ALT primary '.' 'new' (? (BLOCK (ALT typeArguments))) (* (BLOCK (ALT annotation))) Identifier (? (BLOCK (ALT typeArgumentsOrDiamond))) '(' (? (BLOCK (ALT argumentList))) ')' (? (BLOCK (ALT classBody))))))
 * </pre>
 *
 * <pre>
 * classInstanceCreationExpression
 * 	:	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
 * 	|	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
 * 	|	primary '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3365-3460
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#classInstanceCreationExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassInstanceCreationExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassInstanceCreationExpression")
public interface ClassInstanceCreationExpression extends JavaGen {

    // unhandled TerminalAST token: 'new'
    // optional: ?
    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments typeArguments);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifier();

    void setIdentifier(List<TerminalNodeStrings> setIdentifier);

    // optional: ?
    @Relation("HAS_TYPE_ARGUMENTS_OR_DIAMOND")
    TypeArgumentsOrDiamond getTypeArgumentsOrDiamond();

    void setTypeArgumentsOrDiamond(TypeArgumentsOrDiamond typeArgumentsOrDiamond);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_ARGUMENT_LIST")
    ArgumentList getArgumentList();

    void setArgumentList(ArgumentList argumentList);

    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_CLASS_BODY")
    ClassBody getClassBody();

    void setClassBody(ClassBody classBody);

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName expressionName);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'new'
    // optional: ?
    // optional: ?
    // unhandled TerminalAST token: '('
    // optional: ?
    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_PRIMARY")
    Primary getPrimary();

    void setPrimary(Primary primary);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'new'
    // optional: ?
    // optional: ?
    // unhandled TerminalAST token: '('
    // optional: ?
    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
