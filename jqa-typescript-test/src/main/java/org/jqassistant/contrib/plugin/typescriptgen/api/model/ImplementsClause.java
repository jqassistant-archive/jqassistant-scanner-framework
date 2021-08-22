//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE implementsClause (BLOCK (ALT Implements classOrInterfaceTypeList)))
 * </pre>
 *
 * <pre>
 * implementsClause
 *     : Implements classOrInterfaceTypeList
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2040-2048
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#implementsClause()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ImplementsClauseMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ImplementsClause")
public interface ImplementsClause extends TypeScriptGen {

    @Relation("HAS_IMPLEMENTS")
    TerminalNodeStrings getImplementsDescriptor();

    void setImplements(TerminalNodeStrings setImplements);

    @Relation("HAS_CLASS_OR_INTERFACE_TYPE_LIST")
    ClassOrInterfaceTypeList getClassOrInterfaceTypeList();

    void setClassOrInterfaceTypeList(ClassOrInterfaceTypeList setClassOrInterfaceTypeList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
