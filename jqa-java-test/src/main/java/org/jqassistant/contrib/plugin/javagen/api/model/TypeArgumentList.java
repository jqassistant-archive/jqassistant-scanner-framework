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
 * (RULE typeArgumentList (BLOCK (ALT typeArgument (* (BLOCK (ALT ',' typeArgument))))))
 * </pre>
 *
 * <pre>
 * typeArgumentList
 * 	:	typeArgument (',' typeArgument)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:362-375
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeArgumentList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeArgumentListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeArgumentList")
public interface TypeArgumentList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_TYPE_ARGUMENT")
    List<TypeArgument> getTypeArgument();

    void setTypeArgument(List<TypeArgument> setTypeArgument);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
