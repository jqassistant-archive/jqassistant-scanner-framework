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
 * (RULE elementList (BLOCK (ALT arrayElement (* (BLOCK (ALT (+ (BLOCK (ALT ','))) arrayElement))))))
 * </pre>
 *
 * <pre>
 * elementList
 *     : arrayElement (','+ arrayElement)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2427-2441
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#elementList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ElementListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ElementList")
public interface ElementList extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_ARRAY_ELEMENT")
    List<ArrayElement> getArrayElement();

    void setArrayElement(List<ArrayElement> setArrayElement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
