//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE fieldModifier (BLOCK (ALT annotation) (ALT 'public') (ALT 'protected') (ALT 'private') (ALT 'static') (ALT 'final') (ALT 'transient') (ALT 'volatile')))
 * </pre>
 *
 * <pre>
 * fieldModifier
 * 	:	annotation
 * 	|	'public'
 * 	|	'protected'
 * 	|	'private'
 * 	|	'static'
 * 	|	'final'
 * 	|	'transient'
 * 	|	'volatile'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:859-893
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#fieldModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FieldModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("FieldModifier")
public interface FieldModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation annotation);
    // unhandled TerminalAST token: 'public'
    // unhandled TerminalAST token: 'protected'
    // unhandled TerminalAST token: 'private'
    // unhandled TerminalAST token: 'static'
    // unhandled TerminalAST token: 'final'
    // unhandled TerminalAST token: 'transient'
    // unhandled TerminalAST token: 'volatile'
}
