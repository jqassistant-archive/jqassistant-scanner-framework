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
 * (RULE statementList (BLOCK (ALT (+ (BLOCK (ALT statement))))))
 * </pre>
 *
 * <pre>
 * statementList
 *     : statement+
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1291-1298
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#statementList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.StatementListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("StatementList")
public interface StatementList extends TypeScriptGen {

    @Relation("HAS_STATEMENT")
    List<Statement> getStatement();

    void setStatement(List<Statement> setStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
