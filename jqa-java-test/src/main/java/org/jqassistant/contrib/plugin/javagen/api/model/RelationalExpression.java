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
 * (RULE relationalExpression (BLOCK (ALT shiftExpression) (ALT relationalExpression '<' shiftExpression) (ALT relationalExpression '>' shiftExpression) (ALT relationalExpression '<=' shiftExpression) (ALT relationalExpression '>=' shiftExpression) (ALT relationalExpression 'instanceof' referenceType)))
 * </pre>
 *
 * <pre>
 * relationalExpression
 * 	:	shiftExpression
 * 	|	relationalExpression '<' shiftExpression
 * 	|	relationalExpression '>' shiftExpression
 * 	|	relationalExpression '<=' shiftExpression
 * 	|	relationalExpression '>=' shiftExpression
 * 	|	relationalExpression 'instanceof' referenceType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4527-4573
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#relationalExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.RelationalExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("RelationalExpression")
public interface RelationalExpression extends JavaGen {

    // unhandled TerminalAST token: '<'
    @Relation("HAS_SHIFT_EXPRESSION")
    List<ShiftExpression> getShiftExpressions();

    void setShiftExpressions(List<ShiftExpression> setShiftExpressions);

    @Relation("HAS_RELATIONAL_EXPRESSION")
    List<RelationalExpression> getRelationalExpressions();

    void setRelationalExpressions(List<RelationalExpression> setRelationalExpressions);

    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '<='
    // unhandled TerminalAST token: '>='
    // unhandled TerminalAST token: 'instanceof'
    @Relation("HAS_REFERENCE_TYPE")
    ReferenceType getReferenceType();

    void setReferenceType(ReferenceType referenceType);
}
