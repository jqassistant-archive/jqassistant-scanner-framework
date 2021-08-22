//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE constraint (BLOCK (ALT 'extends' type_)))
 * </pre>
 *
 * <pre>
 * constraint
 *     : 'extends' type_
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:96-104
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#constraint()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ConstraintMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Constraint")
public interface Constraint extends TypeScriptGen {

    // unhandled TerminalAST token: 'extends'
    @Relation("HAS_TYPE_")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
