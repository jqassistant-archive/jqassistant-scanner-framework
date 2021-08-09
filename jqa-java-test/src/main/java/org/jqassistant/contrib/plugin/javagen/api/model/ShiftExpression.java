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
 * (RULE shiftExpression (BLOCK (ALT additiveExpression) (ALT shiftExpression '<' '<' additiveExpression) (ALT shiftExpression '>' '>' additiveExpression) (ALT shiftExpression '>' '>' '>' additiveExpression)))
 * </pre>
 *
 * <pre>
 * shiftExpression
 * 	:	additiveExpression
 * 	|	shiftExpression '<' '<' additiveExpression
 * 	|	shiftExpression '>' '>' additiveExpression
 * 	|	shiftExpression '>' '>' '>' additiveExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4575-4613
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#shiftExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ShiftExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("ShiftExpression")
public interface ShiftExpression extends JavaGen {

    // unhandled TerminalAST token: '<'
    // unhandled TerminalAST token: '<'
    @Relation("HAS_ADDITIVE_EXPRESSION")
    List<AdditiveExpression> getAdditiveExpressions();

    void setAdditiveExpressions(List<AdditiveExpression> setAdditiveExpressions);

    @Relation("HAS_SHIFT_EXPRESSION")
    List<ShiftExpression> getShiftExpressions();

    void setShiftExpressions(List<ShiftExpression> setShiftExpressions);
    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '>'
}
