//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceMemberDeclaration (BLOCK (ALT constantDeclaration) (ALT interfaceMethodDeclaration) (ALT classDeclaration) (ALT interfaceDeclaration) (ALT ';')))
 * </pre>
 *
 * <pre>
 * interfaceMemberDeclaration
 * 	:	constantDeclaration
 * 	|	interfaceMethodDeclaration
 * 	|	classDeclaration
 * 	|	interfaceDeclaration
 * 	|	';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1754-1776
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceMemberDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceMemberDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("InterfaceMemberDeclaration")
public interface InterfaceMemberDeclaration extends JavaGen {

    @Relation("HAS_CONSTANT_DECLARATION")
    ConstantDeclaration getConstantDeclaration();

    void setConstantDeclaration(ConstantDeclaration constantDeclaration);

    @Relation("HAS_INTERFACE_METHOD_DECLARATION")
    InterfaceMethodDeclaration getInterfaceMethodDeclaration();

    void setInterfaceMethodDeclaration(InterfaceMethodDeclaration interfaceMethodDeclaration);

    @Relation("HAS_CLASS_DECLARATION")
    ClassDeclaration getClassDeclaration();

    void setClassDeclaration(ClassDeclaration classDeclaration);

    @Relation("HAS_INTERFACE_DECLARATION")
    InterfaceDeclaration getInterfaceDeclaration();

    void setInterfaceDeclaration(InterfaceDeclaration interfaceDeclaration);
    // unhandled TerminalAST token: ';'
}
