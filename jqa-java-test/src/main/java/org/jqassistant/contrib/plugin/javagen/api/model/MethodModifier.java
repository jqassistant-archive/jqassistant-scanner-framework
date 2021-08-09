//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE methodModifier (BLOCK (ALT annotation) (ALT 'public') (ALT 'protected') (ALT 'private') (ALT 'abstract') (ALT 'static') (ALT 'final') (ALT 'synchronized') (ALT 'native') (ALT 'strictfp')))
 * </pre>
 *
 * <pre>
 * methodModifier
 * 	:	annotation
 * 	|	'public'
 * 	|	'protected'
 * 	|	'private'
 * 	|	'abstract'
 * 	|	'static'
 * 	|	'final'
 * 	|	'synchronized'
 * 	|	'native'
 * 	|	'strictfp'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1134-1176
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#methodModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MethodModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("MethodModifier")
public interface MethodModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation annotation);
    // unhandled TerminalAST token: 'public'
    // unhandled TerminalAST token: 'protected'
    // unhandled TerminalAST token: 'private'
    // unhandled TerminalAST token: 'abstract'
    // unhandled TerminalAST token: 'static'
    // unhandled TerminalAST token: 'final'
    // unhandled TerminalAST token: 'synchronized'
    // unhandled TerminalAST token: 'native'
    // unhandled TerminalAST token: 'strictfp'
}
