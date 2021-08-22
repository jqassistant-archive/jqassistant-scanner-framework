//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE returnStatement (BLOCK (ALT Return (? (BLOCK (ALT {this.notLineTerminator()}? expressionSequence))) eos)))
 * </pre>
 *
 * <pre>
 * returnStatement
 *     : Return ({this.notLineTerminator()}? expressionSequence)? eos
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1749-1764
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#returnStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ReturnStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ReturnStatement")
public interface ReturnStatement extends TypeScriptGen {

    @Relation("HAS_RETURN")
    TerminalNodeStrings getReturnDescriptor();

    void setReturn(TerminalNodeStrings setReturn);

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
