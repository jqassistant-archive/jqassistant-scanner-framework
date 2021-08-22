//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE expressionSequence (BLOCK (ALT singleExpression (* (BLOCK (ALT ',' singleExpression))))))
 * </pre>
 *
 * <pre>
 * expressionSequence
 *     : singleExpression (',' singleExpression)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2688-2701
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#expressionSequence()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ExpressionSequenceMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExpressionSequence")
public interface ExpressionSequence extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_SINGLE_EXPRESSION")
    List<SingleExpression> getSingleExpression();

    void setSingleExpression(List<SingleExpression> setSingleExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
