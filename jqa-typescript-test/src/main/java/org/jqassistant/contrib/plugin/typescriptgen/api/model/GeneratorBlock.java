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
 * (RULE generatorBlock (BLOCK (ALT '{' generatorDefinition (* (BLOCK (ALT ',' generatorDefinition))) (? (BLOCK (ALT ','))) '}')))
 * </pre>
 *
 * <pre>
 * generatorBlock
 *     : '{' generatorDefinition (',' generatorDefinition)* ','? '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2229-2249
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#generatorBlock()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.GeneratorBlockMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("GeneratorBlock")
public interface GeneratorBlock extends TypeScriptGen {

    // unhandled TerminalAST token: '{'
    // unhandled TerminalAST token: ','
    @Relation("HAS_GENERATOR_DEFINITION")
    List<GeneratorDefinition> getGeneratorDefinition();

    void setGeneratorDefinition(List<GeneratorDefinition> setGeneratorDefinition);

    // optional: ?
    // unhandled TerminalAST token: ','
    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
