//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE switchBlock (BLOCK (ALT '{' (* (BLOCK (ALT switchBlockStatementGroup))) (* (BLOCK (ALT switchLabel))) '}')))
 * </pre>
 *
 * <pre>
 * switchBlock
 * 	:	'{' switchBlockStatementGroup* switchLabel* '}'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2462-2476
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#switchBlock()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SwitchBlockMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SwitchBlock")
public interface SwitchBlock extends JavaGen {

    // unhandled TerminalAST token: '{'
    @Relation("HAS_SWITCH_BLOCK_STATEMENT_GROUP")
    List<SwitchBlockStatementGroup> getSwitchBlockStatementGroup();

    void setSwitchBlockStatementGroup(List<SwitchBlockStatementGroup> setSwitchBlockStatementGroup);

    @Relation("HAS_SWITCH_LABEL")
    List<SwitchLabel> getSwitchLabel();

    void setSwitchLabel(List<SwitchLabel> setSwitchLabel);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
