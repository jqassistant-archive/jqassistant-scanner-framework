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
 * (RULE singleExpression (BLOCK (ALT functionExpressionDeclaration) (ALT arrowFunctionDeclaration) (ALT Class (? (BLOCK (ALT Identifier))) classTail) (ALT singleExpression '[' expressionSequence ']') (ALT singleExpression '.' identifierName (? (BLOCK (ALT nestedTypeGeneric)))) (ALT New singleExpression (? (BLOCK (ALT typeArguments))) arguments) (ALT New singleExpression (? (BLOCK (ALT typeArguments)))) (ALT singleExpression arguments) (ALT singleExpression {this.notLineTerminator()}? '++') (ALT singleExpression {this.notLineTerminator()}? '--') (ALT Delete singleExpression) (ALT Void singleExpression) (ALT Typeof singleExpression) (ALT '++' singleExpression) (ALT '--' singleExpression) (ALT '+' singleExpression) (ALT '-' singleExpression) (ALT '~' singleExpression) (ALT '!' singleExpression) (ALT singleExpression (BLOCK (ALT '*') (ALT '/') (ALT '%')) singleExpression) (ALT singleExpression (BLOCK (ALT '+') (ALT '-')) singleExpression) (ALT singleExpression (BLOCK (ALT '<<') (ALT '>>') (ALT '>>>')) singleExpression) (ALT singleExpression (BLOCK (ALT '<') (ALT '>') (ALT '<=') (ALT '>=')) singleExpression) (ALT singleExpression Instanceof singleExpression) (ALT singleExpression In singleExpression) (ALT singleExpression (BLOCK (ALT '==') (ALT '!=') (ALT '===') (ALT '!==')) singleExpression) (ALT singleExpression '&' singleExpression) (ALT singleExpression '^' singleExpression) (ALT singleExpression '|' singleExpression) (ALT singleExpression '&&' singleExpression) (ALT singleExpression '||' singleExpression) (ALT singleExpression '?' singleExpression ':' singleExpression) (ALT singleExpression '=' singleExpression) (ALT singleExpression assignmentOperator singleExpression) (ALT singleExpression templateStringLiteral) (ALT iteratorBlock) (ALT generatorBlock) (ALT generatorFunctionDeclaration) (ALT yieldStatement) (ALT This) (ALT identifierName (? (BLOCK (ALT singleExpression)))) (ALT Super) (ALT literal) (ALT arrayLiteral) (ALT objectLiteral) (ALT '(' expressionSequence ')') (ALT typeArguments (? (BLOCK (ALT expressionSequence)))) (ALT singleExpression As asExpression)))
 * </pre>
 *
 * <pre>
 * singleExpression
 *     : functionExpressionDeclaration                                          # FunctionExpression
 *     | arrowFunctionDeclaration                                               # ArrowFunctionExpression   // ECMAScript 6
 *     | Class Identifier? classTail                                            # ClassExpression
 *     | singleExpression '[' expressionSequence ']'                            # MemberIndexExpression
 *     | singleExpression '.' identifierName nestedTypeGeneric?                 # MemberDotExpression
 *     // Split to try `new Date()` first, then `new Date`.
 *     | New singleExpression typeArguments? arguments                          # NewExpression
 *     | New singleExpression typeArguments?                                    # NewExpression
 *     | singleExpression arguments                                             # ArgumentsExpression
 *     | singleExpression {this.notLineTerminator()}? '++'                      # PostIncrementExpression
 *     | singleExpression {this.notLineTerminator()}? '--'                      # PostDecreaseExpression
 *     | Delete singleExpression                                                # DeleteExpression
 *     | Void singleExpression                                                  # VoidExpression
 *     | Typeof singleExpression                                                # TypeofExpression
 *     | '++' singleExpression                                                  # PreIncrementExpression
 *     | '--' singleExpression                                                  # PreDecreaseExpression
 *     | '+' singleExpression                                                   # UnaryPlusExpression
 *     | '-' singleExpression                                                   # UnaryMinusExpression
 *     | '~' singleExpression                                                   # BitNotExpression
 *     | '!' singleExpression                                                   # NotExpression
 *     | singleExpression ('*' | '/' | '%') singleExpression                    # MultiplicativeExpression
 *     | singleExpression ('+' | '-') singleExpression                          # AdditiveExpression
 *     | singleExpression ('<<' | '>>' | '>>>') singleExpression                # BitShiftExpression
 *     | singleExpression ('<' | '>' | '<=' | '>=') singleExpression            # RelationalExpression
 *     | singleExpression Instanceof singleExpression                           # InstanceofExpression
 *     | singleExpression In singleExpression                                   # InExpression
 *     | singleExpression ('==' | '!=' | '===' | '!==') singleExpression        # EqualityExpression
 *     | singleExpression '&' singleExpression                                  # BitAndExpression
 *     | singleExpression '^' singleExpression                                  # BitXOrExpression
 *     | singleExpression '|' singleExpression                                  # BitOrExpression
 *     | singleExpression '&&' singleExpression                                 # LogicalAndExpression
 *     | singleExpression '||' singleExpression                                 # LogicalOrExpression
 *     | singleExpression '?' singleExpression ':' singleExpression             # TernaryExpression
 *     | singleExpression '=' singleExpression                                  # AssignmentExpression
 *     | singleExpression assignmentOperator singleExpression                   # AssignmentOperatorExpression
 *     | singleExpression templateStringLiteral                                 # TemplateStringExpression  // ECMAScript 6
 *     | iteratorBlock                                                          # IteratorsExpression // ECMAScript 6
 *     | generatorBlock                                                         # GeneratorsExpression // ECMAScript 6
 *     | generatorFunctionDeclaration                                           # GeneratorsFunctionExpression // ECMAScript 6
 *     | yieldStatement                                                         # YieldExpression // ECMAScript 6
 *     | This                                                                   # ThisExpression
 *     | identifierName singleExpression?                                       # IdentifierExpression
 *     | Super                                                                  # SuperExpression
 *     | literal                                                                # LiteralExpression
 *     | arrayLiteral                                                           # ArrayLiteralExpression
 *     | objectLiteral                                                          # ObjectLiteralExpression
 *     | '(' expressionSequence ')'                                             # ParenthesizedExpression
 *     | typeArguments expressionSequence?                                      # GenericTypes
 *     | singleExpression As asExpression                                       # CastAsExpression
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2730-3322
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#singleExpression()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.SingleExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SingleExpression")
public interface SingleExpression extends TypeScriptGen {

    @Relation("HAS_FUNCTION_EXPRESSION_DECLARATION")
    FunctionExpressionDeclaration getFunctionExpressionDeclaration();

    void setFunctionExpressionDeclaration(FunctionExpressionDeclaration setFunctionExpressionDeclaration);

    @Relation("HAS_ARROW_FUNCTION_DECLARATION")
    ArrowFunctionDeclaration getArrowFunctionDeclaration();

    void setArrowFunctionDeclaration(ArrowFunctionDeclaration setArrowFunctionDeclaration);

    @Relation("HAS_CLASS")
    TerminalNodeStrings getClazz();

    void setClazz(TerminalNodeStrings setClazz);

    // optional: ?
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_CLASS_TAIL")
    ClassTail getClassTail();

    void setClassTail(ClassTail setClassTail);

    // unhandled TerminalAST token: '['
    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    // unhandled TerminalAST token: ']'
    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER_NAME")
    IdentifierName getIdentifierName();

    void setIdentifierName(IdentifierName setIdentifierName);

    // optional: ?
    @Relation("HAS_NESTED_TYPE_GENERIC")
    NestedTypeGeneric getNestedTypeGeneric();

    void setNestedTypeGeneric(NestedTypeGeneric setNestedTypeGeneric);

    @Relation("HAS_NEW")
    TerminalNodeStrings getNew();

    void setNew(TerminalNodeStrings setNew);

    // optional: ?
    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments setTypeArguments);

    @Relation("HAS_ARGUMENTS")
    Arguments getArguments();

    void setArguments(Arguments setArguments);

    // optional: ?
    // unhandled AST type: 59 - list: false : {this.notLineTerminator()}?
    // unhandled TerminalAST token: '++'
    // unhandled AST type: 59 - list: false : {this.notLineTerminator()}?
    // unhandled TerminalAST token: '--'
    @Relation("HAS_DELETE")
    TerminalNodeStrings getDelete();

    void setDelete(TerminalNodeStrings setDelete);

    @Relation("HAS_VOID")
    TerminalNodeStrings getVoid();

    void setVoid(TerminalNodeStrings setVoid);

    @Relation("HAS_TYPEOF")
    TerminalNodeStrings getTypeof();

    void setTypeof(TerminalNodeStrings setTypeof);

    // unhandled TerminalAST token: '++'
    // unhandled TerminalAST token: '--'
    // unhandled TerminalAST token: '+'
    // unhandled TerminalAST token: '-'
    // unhandled TerminalAST token: '~'
    // unhandled TerminalAST token: '!'
    @Relation("HAS_SINGLE_EXPRESSION")
    List<SingleExpression> getSingleExpression();

    void setSingleExpression(List<SingleExpression> setSingleExpression);

    // unhandled TerminalAST token: '*'
    // unhandled TerminalAST token: '/'
    // unhandled TerminalAST token: '%'
    // unhandled TerminalAST token: '+'
    // unhandled TerminalAST token: '-'
    // unhandled TerminalAST token: '<<'
    // unhandled TerminalAST token: '>>'
    // unhandled TerminalAST token: '>>>'
    // unhandled TerminalAST token: '<'
    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '<='
    // unhandled TerminalAST token: '>='
    @Relation("HAS_INSTANCEOF")
    TerminalNodeStrings getInstanceof();

    void setInstanceof(TerminalNodeStrings setInstanceof);

    @Relation("HAS_IN")
    TerminalNodeStrings getIn();

    void setIn(TerminalNodeStrings setIn);

    // unhandled TerminalAST token: '=='
    // unhandled TerminalAST token: '!='
    // unhandled TerminalAST token: '==='
    // unhandled TerminalAST token: '!=='
    // unhandled TerminalAST token: '&'
    // unhandled TerminalAST token: '^'
    // unhandled TerminalAST token: '|'
    // unhandled TerminalAST token: '&&'
    // unhandled TerminalAST token: '||'
    // unhandled TerminalAST token: '?'
    // unhandled TerminalAST token: ':'
    // unhandled TerminalAST token: '='
    @Relation("HAS_ASSIGNMENT_OPERATOR")
    AssignmentOperator getAssignmentOperator();

    void setAssignmentOperator(AssignmentOperator setAssignmentOperator);

    @Relation("HAS_TEMPLATE_STRING_LITERAL")
    TemplateStringLiteral getTemplateStringLiteral();

    void setTemplateStringLiteral(TemplateStringLiteral setTemplateStringLiteral);

    @Relation("HAS_ITERATOR_BLOCK")
    IteratorBlock getIteratorBlock();

    void setIteratorBlock(IteratorBlock setIteratorBlock);

    @Relation("HAS_GENERATOR_BLOCK")
    GeneratorBlock getGeneratorBlock();

    void setGeneratorBlock(GeneratorBlock setGeneratorBlock);

    @Relation("HAS_GENERATOR_FUNCTION_DECLARATION")
    GeneratorFunctionDeclaration getGeneratorFunctionDeclaration();

    void setGeneratorFunctionDeclaration(GeneratorFunctionDeclaration setGeneratorFunctionDeclaration);

    @Relation("HAS_YIELD_STATEMENT")
    YieldStatement getYieldStatement();

    void setYieldStatement(YieldStatement setYieldStatement);

    @Relation("HAS_THIS")
    TerminalNodeStrings getThis();

    void setThis(TerminalNodeStrings setThis);

    // optional: ?
    @Relation("HAS_SUPER")
    TerminalNodeStrings getSuper();

    void setSuper(TerminalNodeStrings setSuper);

    @Relation("HAS_LITERAL")
    Literal getLiteral();

    void setLiteral(Literal setLiteral);

    @Relation("HAS_ARRAY_LITERAL")
    ArrayLiteral getArrayLiteral();

    void setArrayLiteral(ArrayLiteral setArrayLiteral);

    @Relation("HAS_OBJECT_LITERAL")
    ObjectLiteral getObjectLiteral();

    void setObjectLiteral(ObjectLiteral setObjectLiteral);

    // unhandled TerminalAST token: '('
    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_AS")
    TerminalNodeStrings getAs();

    void setAs(TerminalNodeStrings setAs);

    @Relation("HAS_AS_EXPRESSION")
    AsExpression getAsExpression();

    void setAsExpression(AsExpression setAsExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
