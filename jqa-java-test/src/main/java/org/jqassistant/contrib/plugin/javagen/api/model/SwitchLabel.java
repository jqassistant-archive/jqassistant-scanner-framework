//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE switchLabel (BLOCK (ALT 'case' constantExpression ':') (ALT 'case' enumConstantName ':') (ALT 'default' ':')))
 * </pre>
 *
 * <pre>
 * switchLabel
 * 	:	'case' constantExpression ':'
 * 	|	'case' enumConstantName ':'
 * 	|	'default' ':'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2499-2523
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#switchLabel()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SwitchLabelMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("SwitchLabel")
public interface SwitchLabel extends JavaGen {

    // unhandled TerminalAST token: 'case'
    @Relation("HAS_CONSTANT_EXPRESSION")
    ConstantExpression getConstantExpression();

    void setConstantExpression(ConstantExpression constantExpression);

    // unhandled TerminalAST token: ':'
    // unhandled TerminalAST token: 'case'
    @Relation("HAS_ENUM_CONSTANT_NAME")
    EnumConstantName getEnumConstantName();

    void setEnumConstantName(EnumConstantName enumConstantName);
    // unhandled TerminalAST token: ':'
    // unhandled TerminalAST token: 'default'
    // unhandled TerminalAST token: ':'
}
