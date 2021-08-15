//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceModifier (BLOCK (ALT annotation) (ALT 'public') (ALT 'protected') (ALT 'private') (ALT 'abstract') (ALT 'static') (ALT 'strictfp')))
 * </pre>
 *
 * <pre>
 * interfaceModifier
 * 	:	annotation
 * 	|	'public'
 * 	|	'protected'
 * 	|	'private'
 * 	|	'abstract'
 * 	|	'static'
 * 	|	'strictfp'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1699-1729
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceModifier")
public interface InterfaceModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation annotation);

    // unhandled TerminalAST token: 'public'
    // unhandled TerminalAST token: 'protected'
    // unhandled TerminalAST token: 'private'
    // unhandled TerminalAST token: 'abstract'
    // unhandled TerminalAST token: 'static'
    // unhandled TerminalAST token: 'strictfp'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
