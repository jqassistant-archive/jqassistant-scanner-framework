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
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("MethodReference_lfno_primary")
public interface MethodReference_lfno_primary extends JavaGen {

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName expressionName);

    // unhandled TerminalAST token: '::'
    // optional: typeArguments
    @Relation("HAS_REFERENCE_TYPE")
    ReferenceType getReferenceType();

    void setReferenceType(ReferenceType referenceType);

    // unhandled TerminalAST token: '::'
    // optional: typeArguments
    @Relation("HAS_TYPE_ARGUMENTS")
    List<TypeArguments> getTypeArgumentss();

    void setTypeArgumentss(List<TypeArguments> setTypeArgumentss);

    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifiers();

    void setIdentifiers(List<TerminalNodeStrings> setIdentifiers);

    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '::'
    // optional: typeArguments
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName typeName);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'super'
    // unhandled TerminalAST token: '::'
    // optional: typeArguments
    @Relation("HAS_CLASS_TYPE")
    ClassType getClassType();

    void setClassType(ClassType classType);

    // unhandled TerminalAST token: '::'
    // optional: typeArguments
    // unhandled TerminalAST token: 'new'
    @Relation("HAS_ARRAY_TYPE")
    ArrayType getArrayType();

    void setArrayType(ArrayType arrayType);
    // unhandled TerminalAST token: '::'
    // unhandled TerminalAST token: 'new'
}
