//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE tupleType (BLOCK (ALT '[' tupleElementTypes ']')))
 * </pre>
 *
 * <pre>
 * tupleType
 *     : '[' tupleElementTypes ']'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:494-504
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#tupleType()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TupleTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TupleType")
public interface TupleType extends TypeScriptGen {

    // unhandled TerminalAST token: '['
    @Relation("HAS_TUPLE_ELEMENT_TYPES")
    TupleElementTypes getTupleElementTypes();

    void setTupleElementTypes(TupleElementTypes setTupleElementTypes);

    // unhandled TerminalAST token: ']'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
