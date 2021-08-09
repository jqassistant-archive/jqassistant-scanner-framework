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
 * (RULE classInstanceCreationExpression_lfno_primary (BLOCK (ALT 'new' (? (BLOCK (ALT typeArguments))) (* (BLOCK (ALT annotation))) Identifier (* (BLOCK (ALT '.' (* (BLOCK (ALT annotation))) Identifier))) (? (BLOCK (ALT typeArgumentsOrDiamond))) '(' (? (BLOCK (ALT argumentList))) ')' (? (BLOCK (ALT classBody)))) (ALT expressionName '.' 'new' (? (BLOCK (ALT typeArguments))) (* (BLOCK (ALT annotation))) Identifier (? (BLOCK (ALT typeArgumentsOrDiamond))) '(' (? (BLOCK (ALT argumentList))) ')' (? (BLOCK (ALT classBody))))))
 * </pre>
 *
 * <pre>
 * classInstanceCreationExpression_lfno_primary
 * 	:	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
 * 	|	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3493-3559
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#classInstanceCreationExpression_lfno_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassInstanceCreationExpression_lfno_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("ClassInstanceCreationExpression_lfno_primary")
public interface ClassInstanceCreationExpression_lfno_primary extends JavaGen {

    // unhandled TerminalAST token: 'new'
    // optional: typeArguments
    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotations();

    void setAnnotations(List<Annotation> setAnnotations);

    // unhandled TerminalAST token: '.'
    // unhandled StarBlockAST: '.'
    // unhandled StarBlockAST: *
    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifiers();

    void setIdentifiers(List<TerminalNodeStrings> setIdentifiers);

    // optional: typeArgumentsOrDiamond
    // unhandled TerminalAST token: '('
    // optional: argumentList
    // unhandled TerminalAST token: ')'
    // optional: classBody
    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName expressionName);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'new'
    // optional: typeArguments
    @Relation("HAS_TYPE_ARGUMENTS")
    List<TypeArguments> getTypeArgumentss();

    void setTypeArgumentss(List<TypeArguments> setTypeArgumentss);

    // optional: typeArgumentsOrDiamond
    @Relation("HAS_TYPE_ARGUMENTS_OR_DIAMOND")
    List<TypeArgumentsOrDiamond> getTypeArgumentsOrDiamonds();

    void setTypeArgumentsOrDiamonds(List<TypeArgumentsOrDiamond> setTypeArgumentsOrDiamonds);

    // unhandled TerminalAST token: '('
    // optional: argumentList
    @Relation("HAS_ARGUMENT_LIST")
    List<ArgumentList> getArgumentLists();

    void setArgumentLists(List<ArgumentList> setArgumentLists);

    // unhandled TerminalAST token: ')'
    // optional: classBody
    @Relation("HAS_CLASS_BODY")
    List<ClassBody> getClassBodys();

    void setClassBodys(List<ClassBody> setClassBodys);
}
