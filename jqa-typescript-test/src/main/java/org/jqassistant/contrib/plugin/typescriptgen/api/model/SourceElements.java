//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE sourceElements (BLOCK (ALT (+ (BLOCK (ALT sourceElement))))))
 * </pre>
 *
 * <pre>
 * sourceElements
 *     : sourceElement+
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2403-2410
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#sourceElements()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.SourceElementsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SourceElements")
public interface SourceElements extends TypeScriptGen {

    @Relation("HAS_SOURCE_ELEMENT")
    List<SourceElement> getSourceElement();

    void setSourceElement(List<SourceElement> setSourceElement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
