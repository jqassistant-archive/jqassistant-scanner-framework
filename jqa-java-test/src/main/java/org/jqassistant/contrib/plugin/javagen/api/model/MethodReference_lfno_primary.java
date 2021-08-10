//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE methodReference_lfno_primary (BLOCK (ALT expressionName '::' (? (BLOCK (ALT typeArguments))) Identifier) (ALT referenceType '::' (? (BLOCK (ALT typeArguments))) Identifier) (ALT 'super' '::' (? (BLOCK (ALT typeArguments))) Identifier) (ALT typeName '.' 'super' '::' (? (BLOCK (ALT typeArguments))) Identifier) (ALT classType '::' (? (BLOCK (ALT typeArguments))) 'new') (ALT arrayType '::' 'new')))
 * </pre>
 *
 * <pre>
 * methodReference_lfno_primary
 * 	:	expressionName '::' typeArguments? Identifier
 * 	|	referenceType '::' typeArguments? Identifier
 * 	|	'super' '::' typeArguments? Identifier
 * 	|	typeName '.' 'super' '::' typeArguments? Identifier
 * 	|	classType '::' typeArguments? 'new'
 * 	|	arrayType '::' 'new'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4084-4153
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#methodReference_lfno_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MethodReference_lfno_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("MethodReference_lfno_primary")
public interface MethodReference_lfno_primary extends JavaGen {

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName expressionName);

    // unhandled TerminalAST token: '::'
    // optional: ?
    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments typeArguments);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    @Relation("HAS_REFERENCE_TYPE")
    ReferenceType getReferenceType();

    void setReferenceType(ReferenceType referenceType);

    // unhandled TerminalAST token: '::'
    // optional: ?
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '::'
    // optional: ?
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName typeName);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '::'
    // optional: ?
    @Relation("HAS_CLASS_TYPE")
    ClassType getClassType();

    void setClassType(ClassType classType);

    // unhandled TerminalAST token: '::'
    // optional: ?
    // unhandled TerminalAST token: 'new'
    @Relation("HAS_ARRAY_TYPE")
    ArrayType getArrayType();

    void setArrayType(ArrayType arrayType);
    // unhandled TerminalAST token: '::'
    // unhandled TerminalAST token: 'new'
}
