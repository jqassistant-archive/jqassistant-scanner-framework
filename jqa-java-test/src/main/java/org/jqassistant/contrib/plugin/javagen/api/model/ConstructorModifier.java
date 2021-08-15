//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE constructorModifier (BLOCK (ALT annotation) (ALT 'public') (ALT 'protected') (ALT 'private')))
 * </pre>
 *
 * <pre>
 * constructorModifier
 * 	:	annotation
 * 	|	'public'
 * 	|	'protected'
 * 	|	'private'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1431-1449
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#constructorModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConstructorModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConstructorModifier")
public interface ConstructorModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation annotation);

    // unhandled TerminalAST token: 'public'
    // unhandled TerminalAST token: 'protected'
    // unhandled TerminalAST token: 'private'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
