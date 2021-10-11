//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class GeneratorDefinitionContext extends ParserRuleContext {
 *
 *     public TerminalNode Multiply() {
 *         return getToken(TypeScriptParser.Multiply, 0);
 *     }
 *
 *     public IteratorDefinitionContext iteratorDefinition() {
 *         return getRuleContext(IteratorDefinitionContext.class, 0);
 *     }
 *
 *     public GeneratorDefinitionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_generatorDefinition;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterGeneratorDefinition(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitGeneratorDefinition(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.GeneratorDefinitionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("GeneratorDefinition")
public interface GeneratorDefinition extends TypeScriptGen {

    @Relation("HAS_MULTIPLY")
    TerminalNodeStrings getMultiply();

    void setMultiply(TerminalNodeStrings setMultiply);

    @Relation("HAS_ITERATOR_DEFINITION")
    IteratorDefinition getIteratorDefinition();

    void setIteratorDefinition(IteratorDefinition setIteratorDefinition);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
