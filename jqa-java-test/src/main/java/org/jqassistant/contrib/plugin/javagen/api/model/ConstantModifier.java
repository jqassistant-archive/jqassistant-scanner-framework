//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE constantModifier (BLOCK (ALT annotation) (ALT 'public') (ALT 'static') (ALT 'final')))
 * </pre>
 *
 * <pre>
 * constantModifier
 * 	:	annotation
 * 	|	'public'
 * 	|	'static'
 * 	|	'final'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1793-1811
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#constantModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConstantModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("ConstantModifier")
public interface ConstantModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation annotation);
    // unhandled TerminalAST token: 'public'
    // unhandled TerminalAST token: 'static'
    // unhandled TerminalAST token: 'final'
}
