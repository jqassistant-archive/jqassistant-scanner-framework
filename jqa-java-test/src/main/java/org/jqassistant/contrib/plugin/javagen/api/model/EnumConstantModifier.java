//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE enumConstantModifier (BLOCK (ALT annotation)))
 * </pre>
 *
 * <pre>
 * enumConstantModifier
 * 	:	annotation
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1645-1651
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#enumConstantModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnumConstantModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumConstantModifier")
public interface EnumConstantModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
