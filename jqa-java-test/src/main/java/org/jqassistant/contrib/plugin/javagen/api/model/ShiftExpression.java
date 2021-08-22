//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ShiftExpression")
public interface ShiftExpression extends JavaGen {

    @Relation("HAS_ADDITIVE_EXPRESSION")
    AdditiveExpression getAdditiveExpression();

    void setAdditiveExpression(AdditiveExpression setAdditiveExpression);

    @Relation("HAS_SHIFT_EXPRESSION")
    ShiftExpression getShiftExpression();

    void setShiftExpression(ShiftExpression setShiftExpression);

    // unhandled TerminalAST token: '<'
    // unhandled TerminalAST token: '<'
    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '>'
    // unhandled TerminalAST token: '>'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
