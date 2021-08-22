//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE generatorDefinition (BLOCK (ALT '*' iteratorDefinition)))
 * </pre>
 *
 * <pre>
 * generatorDefinition
 *     : '*' iteratorDefinition
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2251-2259
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#generatorDefinition()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.GeneratorDefinitionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("GeneratorDefinition")
public interface GeneratorDefinition extends TypeScriptGen {

    // unhandled TerminalAST token: '*'
    @Relation("HAS_ITERATOR_DEFINITION")
    IteratorDefinition getIteratorDefinition();

    void setIteratorDefinition(IteratorDefinition setIteratorDefinition);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
