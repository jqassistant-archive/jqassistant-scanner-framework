//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE expressionStatement (BLOCK (ALT {this.notOpenBraceAndNotFunction()}? expressionSequence (? (BLOCK (ALT SemiColon))))))
 * </pre>
 *
 * <pre>
 * expressionStatement
 *     : {this.notOpenBraceAndNotFunction()}? expressionSequence SemiColon?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1512-1523
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#expressionStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ExpressionStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExpressionStatement")
public interface ExpressionStatement extends TypeScriptGen {

    // unhandled AST type: 59 - list: false : {this.notOpenBraceAndNotFunction()}?
    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    // optional: ?
    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
