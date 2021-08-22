//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE classModifier (BLOCK (ALT annotation) (ALT 'public') (ALT 'protected') (ALT 'private') (ALT 'abstract') (ALT 'static') (ALT 'final') (ALT 'strictfp')))
 * </pre>
 *
 * <pre>
 * classModifier
 * 	:	annotation
 * 	|	'public'
 * 	|	'protected'
 * 	|	'private'
 * 	|	'abstract'
 * 	|	'static'
 * 	|	'final'
 * 	|	'strictfp'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:689-723
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#classModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassModifier")
public interface ClassModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    // unhandled TerminalAST token: 'public'
    // unhandled TerminalAST token: 'protected'
    // unhandled TerminalAST token: 'private'
    // unhandled TerminalAST token: 'abstract'
    // unhandled TerminalAST token: 'static'
    // unhandled TerminalAST token: 'final'
    // unhandled TerminalAST token: 'strictfp'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
