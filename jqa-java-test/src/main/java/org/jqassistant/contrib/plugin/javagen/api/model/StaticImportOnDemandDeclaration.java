//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE staticImportOnDemandDeclaration (BLOCK (ALT 'import' 'static' typeName '.' '*' ';')))
 * </pre>
 *
 * <pre>
 * staticImportOnDemandDeclaration
 * 	:	'import' 'static' typeName '.' '*' ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:617-633
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#staticImportOnDemandDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.StaticImportOnDemandDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("StaticImportOnDemandDeclaration")
public interface StaticImportOnDemandDeclaration extends JavaGen {

    // unhandled TerminalAST token: 'import'
    // unhandled TerminalAST token: 'static'
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName typeName);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: '*'
    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
