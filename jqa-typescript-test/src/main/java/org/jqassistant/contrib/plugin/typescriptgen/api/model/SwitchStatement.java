//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE switchStatement (BLOCK (ALT Switch '(' expressionSequence ')' caseBlock)))
 * </pre>
 *
 * <pre>
 * switchStatement
 *     : Switch '(' expressionSequence ')' caseBlock
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1799-1813
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#switchStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.SwitchStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SwitchStatement")
public interface SwitchStatement extends TypeScriptGen {

    @Relation("HAS_SWITCH")
    TerminalNodeStrings getSwitchDescriptor();

    void setSwitch(TerminalNodeStrings setSwitch);

    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_CASE_BLOCK")
    CaseBlock getCaseBlock();

    void setCaseBlock(CaseBlock setCaseBlock);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
