//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE getAccessor (BLOCK (ALT getter '(' ')' (? (BLOCK (ALT typeAnnotation))) '{' functionBody '}')))
 * </pre>
 *
 * <pre>
 * getAccessor
 *     : getter '(' ')' typeAnnotation? '{' functionBody '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2569-2588
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#getAccessor()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.GetAccessorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("GetAccessor")
public interface GetAccessor extends TypeScriptGen {

    @Relation("HAS_GETTER")
    Getter getGetter();

    void setGetter(Getter setGetter);

    // unhandled TerminalAST token: '('
    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    // unhandled TerminalAST token: '{'
    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
