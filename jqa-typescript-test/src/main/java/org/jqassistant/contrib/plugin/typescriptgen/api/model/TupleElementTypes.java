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
 * (RULE tupleElementTypes (BLOCK (ALT type_ (* (BLOCK (ALT ',' type_))))))
 * </pre>
 *
 * <pre>
 * tupleElementTypes
 *     : type_ (',' type_)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:506-519
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#tupleElementTypes()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TupleElementTypesMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TupleElementTypes")
public interface TupleElementTypes extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_TYPE_")
    List<Type_> getType_();

    void setType_(List<Type_> setType_);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
