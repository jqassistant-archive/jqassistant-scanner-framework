//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE constructorBody (BLOCK (ALT '{' (? (BLOCK (ALT explicitConstructorInvocation))) (? (BLOCK (ALT blockStatements))) '}')))
 * </pre>
 *
 * <pre>
 * constructorBody
 * 	:	'{' explicitConstructorInvocation? blockStatements? '}'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1477-1491
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#constructorBody()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConstructorBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConstructorBody")
public interface ConstructorBody extends JavaGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
    @Relation("HAS_EXPLICIT_CONSTRUCTOR_INVOCATION")
    ExplicitConstructorInvocation getExplicitConstructorInvocation();

    void setExplicitConstructorInvocation(ExplicitConstructorInvocation setExplicitConstructorInvocation);

    // optional: ?
    @Relation("HAS_BLOCK_STATEMENTS")
    BlockStatements getBlockStatements();

    void setBlockStatements(BlockStatements setBlockStatements);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
