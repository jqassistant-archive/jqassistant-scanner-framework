//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE classExtendsClause (BLOCK (ALT Extends typeReference)))
 * </pre>
 *
 * <pre>
 * classExtendsClause
 *     : Extends typeReference
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2030-2038
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#classExtendsClause()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ClassExtendsClauseMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassExtendsClause")
public interface ClassExtendsClause extends TypeScriptGen {

    @Relation("HAS_EXTENDS")
    TerminalNodeStrings getExtendsDescriptor();

    void setExtends(TerminalNodeStrings setExtends);

    @Relation("HAS_TYPE_REFERENCE")
    TypeReference getTypeReference();

    void setTypeReference(TypeReference setTypeReference);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
