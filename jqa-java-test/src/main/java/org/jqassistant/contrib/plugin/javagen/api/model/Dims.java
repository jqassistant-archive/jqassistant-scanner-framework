//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("Dims")
public interface Dims extends JavaGen {

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotations();

    void setAnnotations(List<Annotation> setAnnotations);
    // unhandled TerminalAST token: '['
    // unhandled TerminalAST token: ']'
}
