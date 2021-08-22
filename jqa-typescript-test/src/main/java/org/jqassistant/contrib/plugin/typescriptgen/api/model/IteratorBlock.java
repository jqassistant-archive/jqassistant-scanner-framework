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
 * (RULE iteratorBlock (BLOCK (ALT '{' iteratorDefinition (* (BLOCK (ALT ',' iteratorDefinition))) (? (BLOCK (ALT ','))) '}')))
 * </pre>
 *
 * <pre>
 * iteratorBlock
 *     : '{' iteratorDefinition (',' iteratorDefinition)* ','? '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2261-2281
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#iteratorBlock()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IteratorBlockMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IteratorBlock")
public interface IteratorBlock extends TypeScriptGen {

    // unhandled TerminalAST token: '{'
    // unhandled TerminalAST token: ','
    @Relation("HAS_ITERATOR_DEFINITION")
    List<IteratorDefinition> getIteratorDefinition();

    void setIteratorDefinition(List<IteratorDefinition> setIteratorDefinition);

    // optional: ?
    // unhandled TerminalAST token: ','
    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
