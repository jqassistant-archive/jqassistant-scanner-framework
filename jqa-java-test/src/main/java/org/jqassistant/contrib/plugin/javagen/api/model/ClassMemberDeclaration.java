//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassMemberDeclaration")
public interface ClassMemberDeclaration extends JavaGen {

    @Relation("HAS_FIELD_DECLARATION")
    FieldDeclaration getFieldDeclaration();

    void setFieldDeclaration(FieldDeclaration setFieldDeclaration);

    @Relation("HAS_METHOD_DECLARATION")
    MethodDeclaration getMethodDeclaration();

    void setMethodDeclaration(MethodDeclaration setMethodDeclaration);

    @Relation("HAS_CLASS_DECLARATION")
    ClassDeclaration getClassDeclaration();

    void setClassDeclaration(ClassDeclaration setClassDeclaration);

    @Relation("HAS_INTERFACE_DECLARATION")
    InterfaceDeclaration getInterfaceDeclaration();

    void setInterfaceDeclaration(InterfaceDeclaration setInterfaceDeclaration);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
