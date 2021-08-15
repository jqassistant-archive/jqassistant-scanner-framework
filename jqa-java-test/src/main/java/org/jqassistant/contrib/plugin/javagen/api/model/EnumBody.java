//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE enumBody (BLOCK (ALT '{' (? (BLOCK (ALT enumConstantList))) (? (BLOCK (ALT ','))) (? (BLOCK (ALT enumBodyDeclarations))) '}')))
 * </pre>
 *
 * <pre>
 * enumBody
 * 	:	'{' enumConstantList? ','? enumBodyDeclarations? '}'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1587-1604
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#enumBody()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnumBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumBody")
public interface EnumBody extends JavaGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_ENUM_CONSTANT_LIST")
    EnumConstantList getEnumConstantList();

    void setEnumConstantList(EnumConstantList enumConstantList);

    // optional: ?
    // unhandled TerminalAST token: ','
    // optional: ?
    @Relation("HAS_ENUM_BODY_DECLARATIONS")
    EnumBodyDeclarations getEnumBodyDeclarations();

    void setEnumBodyDeclarations(EnumBodyDeclarations enumBodyDeclarations);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
