//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE wildcard (BLOCK (ALT (* (BLOCK (ALT annotation))) '?' (? (BLOCK (ALT wildcardBounds))))))
 * </pre>
 *
 * <pre>
 * wildcard
 * 	:	annotation* '?' wildcardBounds?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:389-401
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#wildcard()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.WildcardMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("Wildcard")
public interface Wildcard extends JavaGen {

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    // unhandled TerminalAST token: '?'
    // optional: ?
    @Relation("HAS_WILDCARD_BOUNDS")
    WildcardBounds getWildcardBounds();

    void setWildcardBounds(WildcardBounds wildcardBounds);
}
