//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE annotationTypeMemberDeclaration (BLOCK (ALT annotationTypeElementDeclaration) (ALT constantDeclaration) (ALT classDeclaration) (ALT interfaceDeclaration) (ALT ';')))
 * </pre>
 *
 * <pre>
 * annotationTypeMemberDeclaration
 * 	:	annotationTypeElementDeclaration
 * 	|	constantDeclaration
 * 	|	classDeclaration
 * 	|	interfaceDeclaration
 * 	|	';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1884-1906
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#annotationTypeMemberDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationTypeMemberDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("AnnotationTypeMemberDeclaration")
public interface AnnotationTypeMemberDeclaration extends JavaGen {

    @Relation("HAS_ANNOTATION_TYPE_ELEMENT_DECLARATION")
    AnnotationTypeElementDeclaration getAnnotationTypeElementDeclaration();

    void setAnnotationTypeElementDeclaration(AnnotationTypeElementDeclaration annotationTypeElementDeclaration);

    @Relation("HAS_CONSTANT_DECLARATION")
    ConstantDeclaration getConstantDeclaration();

    void setConstantDeclaration(ConstantDeclaration constantDeclaration);

    @Relation("HAS_CLASS_DECLARATION")
    ClassDeclaration getClassDeclaration();

    void setClassDeclaration(ClassDeclaration classDeclaration);

    @Relation("HAS_INTERFACE_DECLARATION")
    InterfaceDeclaration getInterfaceDeclaration();

    void setInterfaceDeclaration(InterfaceDeclaration interfaceDeclaration);
    // unhandled TerminalAST token: ';'
}
