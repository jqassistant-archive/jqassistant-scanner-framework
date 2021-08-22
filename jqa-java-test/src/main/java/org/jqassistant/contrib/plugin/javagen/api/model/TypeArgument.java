//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeArgument (BLOCK (ALT referenceType) (ALT wildcard)))
 * </pre>
 *
 * <pre>
 * typeArgument
 * 	:	referenceType
 * 	|	wildcard
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:377-387
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeArgument()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeArgumentMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeArgument")
public interface TypeArgument extends JavaGen {

    @Relation("HAS_REFERENCE_TYPE")
    ReferenceType getReferenceType();

    void setReferenceType(ReferenceType setReferenceType);

    @Relation("HAS_WILDCARD")
    Wildcard getWildcard();

    void setWildcard(Wildcard setWildcard);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
