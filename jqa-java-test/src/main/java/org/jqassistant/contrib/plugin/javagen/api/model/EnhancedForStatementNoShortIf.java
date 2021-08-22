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
 * (RULE enhancedForStatementNoShortIf (BLOCK (ALT 'for' '(' (* (BLOCK (ALT variableModifier))) unannType variableDeclaratorId ':' expression ')' statementNoShortIf)))
 * </pre>
 *
 * <pre>
 * enhancedForStatementNoShortIf
 * 	:	'for' '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statementNoShortIf
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2723-2746
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#enhancedForStatementNoShortIf()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnhancedForStatementNoShortIfMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnhancedForStatementNoShortIf")
public interface EnhancedForStatementNoShortIf extends JavaGen {

    // unhandled TerminalAST token: 'for'
    // unhandled TerminalAST token: '('
    @Relation("HAS_VARIABLE_MODIFIER")
    List<VariableModifier> getVariableModifier();

    void setVariableModifier(List<VariableModifier> setVariableModifier);

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType setUnannType);

    @Relation("HAS_VARIABLE_DECLARATOR_ID")
    VariableDeclaratorId getVariableDeclaratorId();

    void setVariableDeclaratorId(VariableDeclaratorId setVariableDeclaratorId);

    // unhandled TerminalAST token: ':'
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT_NO_SHORT_IF")
    StatementNoShortIf getStatementNoShortIf();

    void setStatementNoShortIf(StatementNoShortIf setStatementNoShortIf);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
