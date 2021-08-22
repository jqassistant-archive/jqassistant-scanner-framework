//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceExtendsClause (BLOCK (ALT Extends classOrInterfaceTypeList)))
 * </pre>
 *
 * <pre>
 * interfaceExtendsClause
 *     : Extends classOrInterfaceTypeList
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:925-933
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#interfaceExtendsClause()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.InterfaceExtendsClauseMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceExtendsClause")
public interface InterfaceExtendsClause extends TypeScriptGen {

    @Relation("HAS_EXTENDS")
    TerminalNodeStrings getExtendsDescriptor();

    void setExtends(TerminalNodeStrings setExtends);

    @Relation("HAS_CLASS_OR_INTERFACE_TYPE_LIST")
    ClassOrInterfaceTypeList getClassOrInterfaceTypeList();

    void setClassOrInterfaceTypeList(ClassOrInterfaceTypeList setClassOrInterfaceTypeList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
