//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE switchStatement (BLOCK (ALT 'switch' '(' expression ')' switchBlock)))
 * </pre>
 *
 * <pre>
 * switchStatement
 * 	:	'switch' '(' expression ')' switchBlock
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2446-2460
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#switchStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SwitchStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SwitchStatement")
public interface SwitchStatement extends JavaGen {

    // unhandled TerminalAST token: 'switch'
    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_SWITCH_BLOCK")
    SwitchBlock getSwitchBlock();

    void setSwitchBlock(SwitchBlock setSwitchBlock);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
