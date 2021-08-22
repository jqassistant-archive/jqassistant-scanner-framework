//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE assignmentOperator (BLOCK (ALT '*=') (ALT '/=') (ALT '%=') (ALT '+=') (ALT '-=') (ALT '<<=') (ALT '>>=') (ALT '>>>=') (ALT '&=') (ALT '^=') (ALT '|=')))
 * </pre>
 *
 * <pre>
 * assignmentOperator
 *     : '*='
 *     | '/='
 *     | '%='
 *     | '+='
 *     | '-='
 *     | '<<='
 *     | '>>='
 *     | '>>>='
 *     | '&='
 *     | '^='
 *     | '|='
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3394-3440
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#assignmentOperator()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.AssignmentOperatorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AssignmentOperator")
public interface AssignmentOperator extends TypeScriptGen {

    // unhandled TerminalAST token: '*='
    // unhandled TerminalAST token: '/='
    // unhandled TerminalAST token: '%='
    // unhandled TerminalAST token: '+='
    // unhandled TerminalAST token: '-='
    // unhandled TerminalAST token: '<<='
    // unhandled TerminalAST token: '>>='
    // unhandled TerminalAST token: '>>>='
    // unhandled TerminalAST token: '&='
    // unhandled TerminalAST token: '^='
    // unhandled TerminalAST token: '|='
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
