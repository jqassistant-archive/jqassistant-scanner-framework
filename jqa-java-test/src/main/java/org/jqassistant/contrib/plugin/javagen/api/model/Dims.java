//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE dims (BLOCK (ALT (* (BLOCK (ALT annotation))) '[' ']' (* (BLOCK (ALT (* (BLOCK (ALT annotation))) '[' ']'))))))
 * </pre>
 *
 * <pre>
 * dims
 * 	:	annotation* '[' ']' (annotation* '[' ']')*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:276-297
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#dims()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.DimsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Dims")
public interface Dims extends JavaGen {

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
