//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE classDeclaration (BLOCK (ALT (? (BLOCK (ALT Abstract))) Class Identifier (? (BLOCK (ALT typeParameters))) classHeritage classTail)))
 * </pre>
 *
 * <pre>
 * classDeclaration
 *     : Abstract? Class Identifier typeParameters? classHeritage classTail
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1985-2003
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#classDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ClassDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassDeclaration")
public interface ClassDeclaration extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_ABSTRACT")
    TerminalNodeStrings getAbstract();

    void setAbstract(TerminalNodeStrings setAbstract);

    @Relation("HAS_CLASS")
    TerminalNodeStrings getClazz();

    void setClazz(TerminalNodeStrings setClazz);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // optional: ?
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_CLASS_HERITAGE")
    ClassHeritage getClassHeritage();

    void setClassHeritage(ClassHeritage setClassHeritage);

    @Relation("HAS_CLASS_TAIL")
    ClassTail getClassTail();

    void setClassTail(ClassTail setClassTail);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
