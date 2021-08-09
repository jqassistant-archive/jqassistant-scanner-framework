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
 * (RULE primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary (BLOCK (ALT literal) (ALT typeName (* (BLOCK (ALT '[' ']'))) '.' 'class') (ALT unannPrimitiveType (* (BLOCK (ALT '[' ']'))) '.' 'class') (ALT 'void' '.' 'class') (ALT 'this') (ALT typeName '.' 'this') (ALT '(' expression ')') (ALT classInstanceCreationExpression_lfno_primary) (ALT fieldAccess_lfno_primary) (ALT methodInvocation_lfno_primary) (ALT methodReference_lfno_primary)))
 * </pre>
 *
 * <pre>
 * primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
 * 	:	literal
 * 	|	typeName ('[' ']')* '.' 'class'
 * 	|	unannPrimitiveType ('[' ']')* '.' 'class'
 * 	|	'void' '.' 'class'
 * 	|	'this'
 * 	|	typeName '.' 'this'
 * 	|	'(' expression ')'
 * 	|	classInstanceCreationExpression_lfno_primary
 * 	|	fieldAccess_lfno_primary
 * 	|	methodInvocation_lfno_primary
 * 	|	methodReference_lfno_primary
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3283-3363
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary")
public interface PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary extends JavaGen {

    @Relation("HAS_LITERAL")
    Literal getLiteral();

    void setLiteral(Literal literal);

    // unhandled TerminalAST token: '['
    // unhandled StarBlockAST: '['
    // unhandled TerminalAST token: ']'
    // unhandled StarBlockAST: ']'
    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'class'
    @Relation("HAS_UNANN_PRIMITIVE_TYPE")
    UnannPrimitiveType getUnannPrimitiveType();

    void setUnannPrimitiveType(UnannPrimitiveType unannPrimitiveType);

    // unhandled TerminalAST token: '['
    // unhandled StarBlockAST: '['
    // unhandled TerminalAST token: ']'
    // unhandled StarBlockAST: ']'
    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'class'
    // unhandled TerminalAST token: 'void'
    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'class'
    // unhandled TerminalAST token: 'this'
    @Relation("HAS_TYPE_NAME")
    List<TypeName> getTypeNames();

    void setTypeNames(List<TypeName> setTypeNames);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'this'
    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_CLASS_INSTANCE_CREATION_EXPRESSION_LFNO_PRIMARY")
    ClassInstanceCreationExpression_lfno_primary getClassInstanceCreationExpression_lfno_primary();

    void setClassInstanceCreationExpression_lfno_primary(ClassInstanceCreationExpression_lfno_primary classInstanceCreationExpression_lfno_primary);

    @Relation("HAS_FIELD_ACCESS_LFNO_PRIMARY")
    FieldAccess_lfno_primary getFieldAccess_lfno_primary();

    void setFieldAccess_lfno_primary(FieldAccess_lfno_primary fieldAccess_lfno_primary);

    @Relation("HAS_METHOD_INVOCATION_LFNO_PRIMARY")
    MethodInvocation_lfno_primary getMethodInvocation_lfno_primary();

    void setMethodInvocation_lfno_primary(MethodInvocation_lfno_primary methodInvocation_lfno_primary);

    @Relation("HAS_METHOD_REFERENCE_LFNO_PRIMARY")
    MethodReference_lfno_primary getMethodReference_lfno_primary();

    void setMethodReference_lfno_primary(MethodReference_lfno_primary methodReference_lfno_primary);
}
