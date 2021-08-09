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
 * (RULE typeName (BLOCK (ALT Identifier) (ALT packageOrTypeName '.' Identifier)))
 * </pre>
 *
 * <pre>
 * typeName
 * 	:	Identifier
 * 	|	packageOrTypeName '.' Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:437-451
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeName()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeNameMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("TypeName")
public interface TypeName extends JavaGen {

    @Relation("HAS_PACKAGE_OR_TYPE_NAME")
    PackageOrTypeName getPackageOrTypeName();

    void setPackageOrTypeName(PackageOrTypeName packageOrTypeName);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifiers();

    void setIdentifiers(List<TerminalNodeStrings> setIdentifiers);
}
