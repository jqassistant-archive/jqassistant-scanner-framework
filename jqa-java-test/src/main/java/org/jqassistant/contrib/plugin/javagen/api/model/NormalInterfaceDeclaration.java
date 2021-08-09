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
 * (RULE normalInterfaceDeclaration (BLOCK (ALT (* (BLOCK (ALT interfaceModifier))) 'interface' Identifier (? (BLOCK (ALT typeParameters))) (? (BLOCK (ALT extendsInterfaces))) interfaceBody)))
 * </pre>
 *
 * <pre>
 * normalInterfaceDeclaration
 * 	:	interfaceModifier* 'interface' Identifier typeParameters? extendsInterfaces? interfaceBody
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1678-1697
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#normalInterfaceDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.NormalInterfaceDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("NormalInterfaceDeclaration")
public interface NormalInterfaceDeclaration extends JavaGen {

    @Relation("HAS_INTERFACE_MODIFIER")
    List<InterfaceModifier> getInterfaceModifiers();

    void setInterfaceModifiers(List<InterfaceModifier> setInterfaceModifiers);

    // unhandled TerminalAST token: 'interface'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // optional: typeParameters
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters typeParameters);

    // optional: extendsInterfaces
    @Relation("HAS_EXTENDS_INTERFACES")
    ExtendsInterfaces getExtendsInterfaces();

    void setExtendsInterfaces(ExtendsInterfaces extendsInterfaces);

    @Relation("HAS_INTERFACE_BODY")
    InterfaceBody getInterfaceBody();

    void setInterfaceBody(InterfaceBody interfaceBody);
}
