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
 * (RULE arrayAccess (BLOCK (ALT (BLOCK (ALT expressionName '[' expression ']') (ALT primaryNoNewArray_lfno_arrayAccess '[' expression ']')) (* (BLOCK (ALT primaryNoNewArray_lf_arrayAccess '[' expression ']'))))))
 * </pre>
 *
 * <pre>
 * arrayAccess
 * 	:	(	expressionName '[' expression ']'
 * 		|	primaryNoNewArray_lfno_arrayAccess '[' expression ']'
 * 		)
 * 		(	primaryNoNewArray_lf_arrayAccess '[' expression ']'
 * 		)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3641-3680
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#arrayAccess()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ArrayAccessMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("ArrayAccess")
public interface ArrayAccess extends JavaGen {

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName expressionName);

    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LFNO_ARRAY_ACCESS")
    PrimaryNoNewArray_lfno_arrayAccess getPrimaryNoNewArray_lfno_arrayAccess();

    void setPrimaryNoNewArray_lfno_arrayAccess(PrimaryNoNewArray_lfno_arrayAccess primaryNoNewArray_lfno_arrayAccess);

    // unhandled TerminalAST token: '['
    @Relation("HAS_EXPRESSION")
    List<Expression> getExpressions();

    void setExpressions(List<Expression> setExpressions);

    // unhandled TerminalAST token: ']'
    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LF_ARRAY_ACCESS")
    List<PrimaryNoNewArray_lf_arrayAccess> getPrimaryNoNewArray_lf_arrayAccesss();

    void setPrimaryNoNewArray_lf_arrayAccesss(List<PrimaryNoNewArray_lf_arrayAccess> setPrimaryNoNewArray_lf_arrayAccesss);
    // unhandled TerminalAST token: '['
    // unhandled StarBlockAST: '['
    // unhandled TerminalAST token: ']'
    // unhandled StarBlockAST: ']'
}
