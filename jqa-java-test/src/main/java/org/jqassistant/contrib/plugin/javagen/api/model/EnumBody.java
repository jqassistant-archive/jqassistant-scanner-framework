//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator",
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("EnumBody")
public interface EnumBody extends JavaGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
//    @Relation("HAS_ENUM_CONSTANT_LIST")
//    EnumConstantList getEnumConstantList();
//
//    void setEnumConstantList(EnumConstantList enumConstantList);

    // optional: ?
    // unhandled TerminalAST token: ','
    // optional: ?
//    @Relation("HAS_ENUM_BODY_DECLARATIONS")
//    EnumBodyDeclarations getEnumBodyDeclarations();
//
//    void setEnumBodyDeclarations(EnumBodyDeclarations enumBodyDeclarations);
    // unhandled TerminalAST token: '}'
}
