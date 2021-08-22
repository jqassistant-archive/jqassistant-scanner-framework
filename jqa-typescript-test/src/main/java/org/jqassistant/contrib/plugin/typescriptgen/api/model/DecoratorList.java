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
 * (RULE decoratorList (BLOCK (ALT (+ (BLOCK (ALT decorator))))))
 * </pre>
 *
 * <pre>
 * decoratorList
 *     : decorator+ ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1064-1071
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#decoratorList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.DecoratorListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("DecoratorList")
public interface DecoratorList extends TypeScriptGen {

    @Relation("HAS_DECORATOR")
    List<Decorator> getDecorator();

    void setDecorator(List<Decorator> setDecorator);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
