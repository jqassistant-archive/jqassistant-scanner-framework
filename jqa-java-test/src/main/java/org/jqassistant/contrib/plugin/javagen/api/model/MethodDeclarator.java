//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE methodDeclarator (BLOCK (ALT Identifier '(' (? (BLOCK (ALT formalParameterList))) ')' (? (BLOCK (ALT dims))))))
 * </pre>
 *
 * <pre>
 * methodDeclarator
 * 	:	Identifier '(' formalParameterList? ')' dims?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1217-1233
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#methodDeclarator()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MethodDeclaratorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MethodDeclarator")
public interface MethodDeclarator extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList formalParameterList);

    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_DIMS")
    Dims getDims();

    void setDims(Dims dims);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
