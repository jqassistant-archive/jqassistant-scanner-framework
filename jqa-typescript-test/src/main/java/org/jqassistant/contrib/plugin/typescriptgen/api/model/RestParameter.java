//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE restParameter (BLOCK (ALT '...' singleExpression (? (BLOCK (ALT typeAnnotation))))))
 * </pre>
 *
 * <pre>
 * restParameter
 *     : '...' singleExpression typeAnnotation?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:729-740
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#restParameter()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.RestParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("RestParameter")
public interface RestParameter extends TypeScriptGen {

    // unhandled TerminalAST token: '...'
    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
