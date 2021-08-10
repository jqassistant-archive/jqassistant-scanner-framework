//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE arrayAccess_lf_primary (BLOCK (ALT (BLOCK (ALT primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary '[' expression ']')) (* (BLOCK (ALT primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']'))))))
 * </pre>
 *
 * <pre>
 * arrayAccess_lf_primary
 * 	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary '[' expression ']'
 * 		)
 * 		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']'
 * 		)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3682-3711
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#arrayAccess_lf_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ArrayAccess_lf_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ArrayAccess_lf_primary")
public interface ArrayAccess_lf_primary extends JavaGen {

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LF_PRIMARY_LFNO_ARRAY_ACCESS_LF_PRIMARY")
    PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary getPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();

    void setPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);

    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LF_PRIMARY_LF_ARRAY_ACCESS_LF_PRIMARY")
    List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary> getPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();

    void setPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary> setPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);

    // unhandled TerminalAST token: '['
    @Relation("HAS_EXPRESSION")
    List<Expression> getExpression();

    void setExpression(List<Expression> setExpression);
    // unhandled TerminalAST token: ']'
}
