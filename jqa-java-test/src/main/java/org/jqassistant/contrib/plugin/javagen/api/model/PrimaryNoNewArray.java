//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE primaryNoNewArray (BLOCK (ALT literal) (ALT typeName (* (BLOCK (ALT '[' ']'))) '.' 'class') (ALT 'void' '.' 'class') (ALT 'this') (ALT typeName '.' 'this') (ALT '(' expression ')') (ALT classInstanceCreationExpression) (ALT fieldAccess) (ALT arrayAccess) (ALT methodInvocation) (ALT methodReference)))
 * </pre>
 *
 * <pre>
 * primaryNoNewArray
 * 	:	literal
 * 	|	typeName ('[' ']')* '.' 'class'
 * 	|	'void' '.' 'class'
 * 	|	'this'
 * 	|	typeName '.' 'this'
 * 	|	'(' expression ')'
 * 	|	classInstanceCreationExpression
 * 	|	fieldAccess
 * 	|	arrayAccess
 * 	|	methodInvocation
 * 	|	methodReference
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2997-3066
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#primaryNoNewArray()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimaryNoNewArrayMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PrimaryNoNewArray")
public interface PrimaryNoNewArray extends JavaGen {

    @Relation("HAS_LITERAL")
    Literal getLiteral();

    void setLiteral(Literal setLiteral);

    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName setTypeName);

    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'class'
    // unhandled TerminalAST token: 'void'
    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'class'
    // unhandled TerminalAST token: 'this'
    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'this'
    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_CLASS_INSTANCE_CREATION_EXPRESSION")
    ClassInstanceCreationExpression getClassInstanceCreationExpression();

    void setClassInstanceCreationExpression(ClassInstanceCreationExpression setClassInstanceCreationExpression);

    @Relation("HAS_FIELD_ACCESS")
    FieldAccess getFieldAccess();

    void setFieldAccess(FieldAccess setFieldAccess);

    @Relation("HAS_ARRAY_ACCESS")
    ArrayAccess getArrayAccess();

    void setArrayAccess(ArrayAccess setArrayAccess);

    @Relation("HAS_METHOD_INVOCATION")
    MethodInvocation getMethodInvocation();

    void setMethodInvocation(MethodInvocation setMethodInvocation);

    @Relation("HAS_METHOD_REFERENCE")
    MethodReference getMethodReference();

    void setMethodReference(MethodReference setMethodReference);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
