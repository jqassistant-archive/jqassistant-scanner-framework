//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("EnhancedForStatementNoShortIf")
public interface EnhancedForStatementNoShortIf extends JavaGen {

    // unhandled TerminalAST token: 'for'
    // unhandled TerminalAST token: '('
    @Relation("HAS_VARIABLE_MODIFIER")
    List<VariableModifier> getVariableModifiers();

    void setVariableModifiers(List<VariableModifier> setVariableModifiers);

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType unannType);

    @Relation("HAS_VARIABLE_DECLARATOR_ID")
    VariableDeclaratorId getVariableDeclaratorId();

    void setVariableDeclaratorId(VariableDeclaratorId variableDeclaratorId);

    // unhandled TerminalAST token: ':'
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT_NO_SHORT_IF")
    StatementNoShortIf getStatementNoShortIf();

    void setStatementNoShortIf(StatementNoShortIf statementNoShortIf);
}