//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConstructorDeclaration")
public interface ConstructorDeclaration extends JavaGen {

    @Relation("HAS_CONSTRUCTOR_MODIFIER")
    List<ConstructorModifier> getConstructorModifier();

    void setConstructorModifier(List<ConstructorModifier> setConstructorModifier);

    @Relation("HAS_CONSTRUCTOR_DECLARATOR")
    ConstructorDeclarator getConstructorDeclarator();

    void setConstructorDeclarator(ConstructorDeclarator setConstructorDeclarator);

    // optional: ?
    @Relation("HAS_THROWS")
    Throws_ getThrows_();

    void setThrows_(Throws_ setThrows_);

    @Relation("HAS_CONSTRUCTOR_BODY")
    ConstructorBody getConstructorBody();

    void setConstructorBody(ConstructorBody setConstructorBody);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
