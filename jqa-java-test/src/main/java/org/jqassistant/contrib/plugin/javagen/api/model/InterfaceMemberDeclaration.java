//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceMemberDeclaration")
public interface InterfaceMemberDeclaration extends JavaGen {

    @Relation("HAS_CONSTANT_DECLARATION")
    ConstantDeclaration getConstantDeclaration();

    void setConstantDeclaration(ConstantDeclaration setConstantDeclaration);

    @Relation("HAS_INTERFACE_METHOD_DECLARATION")
    InterfaceMethodDeclaration getInterfaceMethodDeclaration();

    void setInterfaceMethodDeclaration(InterfaceMethodDeclaration setInterfaceMethodDeclaration);

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
