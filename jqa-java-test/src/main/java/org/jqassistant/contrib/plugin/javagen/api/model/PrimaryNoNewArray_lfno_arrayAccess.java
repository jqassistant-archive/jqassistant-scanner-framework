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
 * (RULE primaryNoNewArray_lfno_arrayAccess (BLOCK (ALT literal) (ALT typeName (* (BLOCK (ALT '[' ']'))) '.' 'class') (ALT 'void' '.' 'class') (ALT 'this') (ALT typeName '.' 'this') (ALT '(' expression ')') (ALT classInstanceCreationExpression) (ALT fieldAccess) (ALT methodInvocation) (ALT methodReference)))
 * </pre>
 *
 * <pre>
 * primaryNoNewArray_lfno_arrayAccess
 * 	:	literal
 * 	|	typeName ('[' ']')* '.' 'class'
 * 	|	'void' '.' 'class'
 * 	|	'this'
 * 	|	typeName '.' 'this'
 * 	|	'(' expression ')'
 * 	|	classInstanceCreationExpression
 * 	|	fieldAccess
 * 	|	methodInvocation
 * 	|	methodReference
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3074-3139
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#primaryNoNewArray_lfno_arrayAccess()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimaryNoNewArray_lfno_arrayAccessMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("PrimaryNoNewArray_lfno_arrayAccess")
public interface PrimaryNoNewArray_lfno_arrayAccess extends JavaGen {

    @Relation("HAS_LITERAL")
    Literal getLiteral();

    void setLiteral(Literal literal);

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
    @Relation("HAS_CLASS_INSTANCE_CREATION_EXPRESSION")
    ClassInstanceCreationExpression getClassInstanceCreationExpression();

    void setClassInstanceCreationExpression(ClassInstanceCreationExpression classInstanceCreationExpression);

    @Relation("HAS_FIELD_ACCESS")
    FieldAccess getFieldAccess();

    void setFieldAccess(FieldAccess fieldAccess);

    @Relation("HAS_METHOD_INVOCATION")
    MethodInvocation getMethodInvocation();

    void setMethodInvocation(MethodInvocation methodInvocation);

    @Relation("HAS_METHOD_REFERENCE")
    MethodReference getMethodReference();

    void setMethodReference(MethodReference methodReference);
}