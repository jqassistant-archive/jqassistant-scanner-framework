//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeQuery (BLOCK (ALT 'typeof' typeQueryExpression)))
 * </pre>
 *
 * <pre>
 * typeQuery
 *     : 'typeof' typeQueryExpression
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:563-571
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeQuery()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeQueryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeQuery")
public interface TypeQuery extends TypeScriptGen {

    // unhandled TerminalAST token: 'typeof'
    @Relation("HAS_TYPE_QUERY_EXPRESSION")
    TypeQueryExpression getTypeQueryExpression();

    void setTypeQueryExpression(TypeQueryExpression setTypeQueryExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
