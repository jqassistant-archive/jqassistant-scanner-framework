//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE constructorDeclarator (BLOCK (ALT (? (BLOCK (ALT typeParameters))) simpleTypeName '(' (? (BLOCK (ALT formalParameterList))) ')')))
 * </pre>
 *
 * <pre>
 * constructorDeclarator
 * 	:	typeParameters? simpleTypeName '(' formalParameterList? ')'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1451-1467
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#constructorDeclarator()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConstructorDeclaratorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ConstructorDeclarator")
public interface ConstructorDeclarator extends JavaGen {

    // optional: ?
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters typeParameters);

    @Relation("HAS_SIMPLE_TYPE_NAME")
    SimpleTypeName getSimpleTypeName();

    void setSimpleTypeName(SimpleTypeName simpleTypeName);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList formalParameterList);
    // unhandled TerminalAST token: ')'
}
