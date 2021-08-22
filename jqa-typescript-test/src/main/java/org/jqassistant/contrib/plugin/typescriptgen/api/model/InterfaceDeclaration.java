//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceDeclaration (BLOCK (ALT (? (BLOCK (ALT Export))) (? (BLOCK (ALT Declare))) Interface Identifier (? (BLOCK (ALT typeParameters))) (? (BLOCK (ALT interfaceExtendsClause))) objectType (? (BLOCK (ALT SemiColon))))))
 * </pre>
 *
 * <pre>
 * interfaceDeclaration
 *     : Export? Declare? Interface Identifier typeParameters? interfaceExtendsClause? objectType SemiColon?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:898-923
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#interfaceDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.InterfaceDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceDeclaration")
public interface InterfaceDeclaration extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_EXPORT")
    TerminalNodeStrings getExport();

    void setExport(TerminalNodeStrings setExport);

    // optional: ?
    @Relation("HAS_DECLARE")
    TerminalNodeStrings getDeclare();

    void setDeclare(TerminalNodeStrings setDeclare);

    @Relation("HAS_INTERFACE")
    TerminalNodeStrings getInterfaceDescriptor();

    void setInterface(TerminalNodeStrings setInterface);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // optional: ?
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    // optional: ?
    @Relation("HAS_INTERFACE_EXTENDS_CLAUSE")
    InterfaceExtendsClause getInterfaceExtendsClause();

    void setInterfaceExtendsClause(InterfaceExtendsClause setInterfaceExtendsClause);

    @Relation("HAS_OBJECT_TYPE")
    ObjectType getObjectType();

    void setObjectType(ObjectType setObjectType);

    // optional: ?
    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
