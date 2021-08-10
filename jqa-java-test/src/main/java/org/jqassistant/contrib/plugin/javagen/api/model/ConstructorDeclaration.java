//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE constructorDeclaration (BLOCK (ALT (* (BLOCK (ALT constructorModifier))) constructorDeclarator (? (BLOCK (ALT throws_))) constructorBody)))
 * </pre>
 *
 * <pre>
 * constructorDeclaration
 * 	:	constructorModifier* constructorDeclarator throws_? constructorBody
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1415-1429
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#constructorDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConstructorDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ConstructorDeclaration")
public interface ConstructorDeclaration extends JavaGen {

    @Relation("HAS_CONSTRUCTOR_MODIFIER")
    List<ConstructorModifier> getConstructorModifier();

    void setConstructorModifier(List<ConstructorModifier> setConstructorModifier);

    @Relation("HAS_CONSTRUCTOR_DECLARATOR")
    ConstructorDeclarator getConstructorDeclarator();

    void setConstructorDeclarator(ConstructorDeclarator constructorDeclarator);

    // optional: ?
    @Relation("HAS_THROWS_")
    Throws_ getThrows_();

    void setThrows_(Throws_ throws_);

    @Relation("HAS_CONSTRUCTOR_BODY")
    ConstructorBody getConstructorBody();

    void setConstructorBody(ConstructorBody constructorBody);
}
