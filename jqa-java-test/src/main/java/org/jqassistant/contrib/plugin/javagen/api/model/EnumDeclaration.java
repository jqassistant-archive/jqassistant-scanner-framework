//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE enumDeclaration (BLOCK (ALT (* (BLOCK (ALT classModifier))) 'enum' Identifier (? (BLOCK (ALT superinterfaces))) enumBody)))
 * </pre>
 *
 * <pre>
 * enumDeclaration
 * 	:	classModifier* 'enum' Identifier superinterfaces? enumBody
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1569-1585
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#enumDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnumDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("EnumDeclaration")
public interface EnumDeclaration extends JavaGen {

    @Relation("HAS_CLASS_MODIFIER")
    List<ClassModifier> getClassModifiers();

    void setClassModifiers(List<ClassModifier> setClassModifiers);

    // unhandled TerminalAST token: 'enum'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // optional: superinterfaces
    @Relation("HAS_SUPERINTERFACES")
    Superinterfaces getSuperinterfaces();

    void setSuperinterfaces(Superinterfaces superinterfaces);

    @Relation("HAS_ENUM_BODY")
    EnumBody getEnumBody();

    void setEnumBody(EnumBody enumBody);
}
