//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SwitchLabel")
public interface SwitchLabel extends JavaGen {

    // unhandled TerminalAST token: 'case'
    @Relation("HAS_CONSTANT_EXPRESSION")
    ConstantExpression getConstantExpression();

    void setConstantExpression(ConstantExpression setConstantExpression);

    // unhandled TerminalAST token: ':'
    // unhandled TerminalAST token: 'case'
    @Relation("HAS_ENUM_CONSTANT_NAME")
    EnumConstantName getEnumConstantName();

    void setEnumConstantName(EnumConstantName setEnumConstantName);

    // unhandled TerminalAST token: ':'
    // unhandled TerminalAST token: 'default'
    // unhandled TerminalAST token: ':'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
