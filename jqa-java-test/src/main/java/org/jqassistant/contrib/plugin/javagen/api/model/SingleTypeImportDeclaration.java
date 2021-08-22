//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE singleTypeImportDeclaration (BLOCK (ALT 'import' typeName ';')))
 * </pre>
 *
 * <pre>
 * singleTypeImportDeclaration
 * 	:	'import' typeName ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:571-581
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#singleTypeImportDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SingleTypeImportDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SingleTypeImportDeclaration")
public interface SingleTypeImportDeclaration extends JavaGen {

    // unhandled TerminalAST token: 'import'
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName setTypeName);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
