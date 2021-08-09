//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE classDeclaration (BLOCK (ALT normalClassDeclaration) (ALT enumDeclaration)))
 * </pre>
 *
 * <pre>
 * classDeclaration
 * 	:	normalClassDeclaration
 * 	|	enumDeclaration
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:653-663
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#classDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("ClassDeclaration")
public interface ClassDeclaration extends JavaGen {

    @Relation("HAS_NORMAL_CLASS_DECLARATION")
    NormalClassDeclaration getNormalClassDeclaration();

    void setNormalClassDeclaration(NormalClassDeclaration normalClassDeclaration);

    @Relation("HAS_ENUM_DECLARATION")
    EnumDeclaration getEnumDeclaration();

    void setEnumDeclaration(EnumDeclaration enumDeclaration);
}