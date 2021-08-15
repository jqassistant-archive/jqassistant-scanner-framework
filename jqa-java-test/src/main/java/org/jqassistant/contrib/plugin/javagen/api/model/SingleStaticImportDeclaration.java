//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE singleStaticImportDeclaration (BLOCK (ALT 'import' 'static' typeName '.' Identifier ';')))
 * </pre>
 *
 * <pre>
 * singleStaticImportDeclaration
 * 	:	'import' 'static' typeName '.' Identifier ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:599-615
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#singleStaticImportDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SingleStaticImportDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SingleStaticImportDeclaration")
public interface SingleStaticImportDeclaration extends JavaGen {

    // unhandled TerminalAST token: 'import'
    // unhandled TerminalAST token: 'static'
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName typeName);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
