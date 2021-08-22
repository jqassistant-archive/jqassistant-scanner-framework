//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE variableModifier (BLOCK (ALT annotation) (ALT 'final')))
 * </pre>
 *
 * <pre>
 * variableModifier
 * 	:	annotation
 * 	|	'final'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1294-1304
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#variableModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.VariableModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("VariableModifier")
public interface VariableModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    // unhandled TerminalAST token: 'final'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
