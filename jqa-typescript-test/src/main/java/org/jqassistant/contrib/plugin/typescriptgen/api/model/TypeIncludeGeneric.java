//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeIncludeGeneric (BLOCK (ALT '<' typeArgumentList '<' typeArgumentList (BLOCK (ALT '>' bindingPattern '>') (ALT '>>')))))
 * </pre>
 *
 * <pre>
 * typeIncludeGeneric
 *     :'<' typeArgumentList '<' typeArgumentList ('>' bindingPattern '>' | '>>')
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:361-384
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeIncludeGeneric()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeIncludeGenericMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeIncludeGeneric")
public interface TypeIncludeGeneric extends TypeScriptGen {

    // unhandled TerminalAST token: '<'
    @Relation("HAS_TYPE_ARGUMENT_LIST")
    List<TypeArgumentList> getTypeArgumentList();

    void setTypeArgumentList(List<TypeArgumentList> setTypeArgumentList);

    // unhandled TerminalAST token: '<'
    // unhandled TerminalAST token: '>'
    @Relation("HAS_BINDING_PATTERN")
    BindingPattern getBindingPattern();

    void setBindingPattern(BindingPattern setBindingPattern);

    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '>>'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
