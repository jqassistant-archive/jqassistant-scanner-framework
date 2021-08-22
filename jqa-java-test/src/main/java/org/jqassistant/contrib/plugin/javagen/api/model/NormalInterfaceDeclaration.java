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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("NormalInterfaceDeclaration")
public interface NormalInterfaceDeclaration extends JavaGen {

    @Relation("HAS_INTERFACE_MODIFIER")
    List<InterfaceModifier> getInterfaceModifier();

    void setInterfaceModifier(List<InterfaceModifier> setInterfaceModifier);

    // unhandled TerminalAST token: 'interface'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // optional: ?
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    // optional: ?
    @Relation("HAS_EXTENDS_INTERFACES")
    ExtendsInterfaces getExtendsInterfaces();

    void setExtendsInterfaces(ExtendsInterfaces setExtendsInterfaces);

    @Relation("HAS_INTERFACE_BODY")
    InterfaceBody getInterfaceBody();

    void setInterfaceBody(InterfaceBody setInterfaceBody);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
