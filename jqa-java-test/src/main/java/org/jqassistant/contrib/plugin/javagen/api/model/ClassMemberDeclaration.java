//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE classMemberDeclaration (BLOCK (ALT fieldDeclaration) (ALT methodDeclaration) (ALT classDeclaration) (ALT interfaceDeclaration) (ALT ';')))
 * </pre>
 *
 * <pre>
 * classMemberDeclaration
 * 	:	fieldDeclaration
 * 	|	methodDeclaration
 * 	|	classDeclaration
 * 	|	interfaceDeclaration
 * 	|	';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:820-842
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#classMemberDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassMemberDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ClassMemberDeclaration")
public interface ClassMemberDeclaration extends JavaGen {

    @Relation("HAS_FIELD_DECLARATION")
    FieldDeclaration getFieldDeclaration();

    void setFieldDeclaration(FieldDeclaration fieldDeclaration);

    @Relation("HAS_METHOD_DECLARATION")
    MethodDeclaration getMethodDeclaration();

    void setMethodDeclaration(MethodDeclaration methodDeclaration);

    @Relation("HAS_CLASS_DECLARATION")
    ClassDeclaration getClassDeclaration();

    void setClassDeclaration(ClassDeclaration classDeclaration);

    @Relation("HAS_INTERFACE_DECLARATION")
    InterfaceDeclaration getInterfaceDeclaration();

    void setInterfaceDeclaration(InterfaceDeclaration interfaceDeclaration);
    // unhandled TerminalAST token: ';'
}
