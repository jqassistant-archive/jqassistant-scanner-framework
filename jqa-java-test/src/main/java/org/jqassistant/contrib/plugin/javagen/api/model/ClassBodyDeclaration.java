//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE classBodyDeclaration (BLOCK (ALT classMemberDeclaration) (ALT instanceInitializer) (ALT staticInitializer) (ALT constructorDeclaration)))
 * </pre>
 *
 * <pre>
 * classBodyDeclaration
 * 	:	classMemberDeclaration
 * 	|	instanceInitializer
 * 	|	staticInitializer
 * 	|	constructorDeclaration
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:800-818
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#classBodyDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassBodyDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassBodyDeclaration")
public interface ClassBodyDeclaration extends JavaGen {

    @Relation("HAS_CLASS_MEMBER_DECLARATION")
    ClassMemberDeclaration getClassMemberDeclaration();

    void setClassMemberDeclaration(ClassMemberDeclaration classMemberDeclaration);

    @Relation("HAS_INSTANCE_INITIALIZER")
    InstanceInitializer getInstanceInitializer();

    void setInstanceInitializer(InstanceInitializer instanceInitializer);

    @Relation("HAS_STATIC_INITIALIZER")
    StaticInitializer getStaticInitializer();

    void setStaticInitializer(StaticInitializer staticInitializer);

    @Relation("HAS_CONSTRUCTOR_DECLARATION")
    ConstructorDeclaration getConstructorDeclaration();

    void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
