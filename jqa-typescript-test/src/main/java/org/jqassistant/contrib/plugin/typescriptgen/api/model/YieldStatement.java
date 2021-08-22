//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE yieldStatement (BLOCK (ALT Yield (? (BLOCK (ALT {this.notLineTerminator()}? expressionSequence))) eos)))
 * </pre>
 *
 * <pre>
 * yieldStatement
 *     : Yield ({this.notLineTerminator()}? expressionSequence)? eos
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1766-1781
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#yieldStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.YieldStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("YieldStatement")
public interface YieldStatement extends TypeScriptGen {

    @Relation("HAS_YIELD")
    TerminalNodeStrings getYield();

    void setYield(TerminalNodeStrings setYield);

    // optional: ?
    // unhandled AST type: 59 - list: false : {this.notLineTerminator()}?
    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    // unhandled ast: eos
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
