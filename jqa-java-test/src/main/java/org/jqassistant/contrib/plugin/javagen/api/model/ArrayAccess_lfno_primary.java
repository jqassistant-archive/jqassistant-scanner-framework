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
 * (RULE arrayAccess_lfno_primary (BLOCK (ALT (BLOCK (ALT expressionName '[' expression ']') (ALT primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary '[' expression ']')) (* (BLOCK (ALT primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']'))))))
 * </pre>
 *
 * <pre>
 * arrayAccess_lfno_primary
 * 	:	(	expressionName '[' expression ']'
 * 		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary '[' expression ']'
 * 		)
 * 		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']'
 * 		)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3713-3752
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#arrayAccess_lfno_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ArrayAccess_lfno_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ArrayAccess_lfno_primary")
public interface ArrayAccess_lfno_primary extends JavaGen {

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName setExpressionName);

    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LFNO_PRIMARY_LFNO_ARRAY_ACCESS_LFNO_PRIMARY")
    PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary getPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();

    void setPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary setPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);

    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LFNO_PRIMARY_LF_ARRAY_ACCESS_LFNO_PRIMARY")
    List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary> getPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();

    void setPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary> setPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);

    // unhandled TerminalAST token: '['
    @Relation("HAS_EXPRESSION")
    List<Expression> getExpression();

    void setExpression(List<Expression> setExpression);

    // unhandled TerminalAST token: ']'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
