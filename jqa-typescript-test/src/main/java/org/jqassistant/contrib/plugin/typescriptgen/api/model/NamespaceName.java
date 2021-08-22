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
 * (RULE namespaceName (BLOCK (ALT Identifier (* (BLOCK (ALT (+ (BLOCK (ALT '.'))) Identifier))))))
 * </pre>
 *
 * <pre>
 * namespaceName
 *     : Identifier ('.'+ Identifier)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1032-1046
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#namespaceName()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.NamespaceNameMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("NamespaceName")
public interface NamespaceName extends TypeScriptGen {

    // unhandled TerminalAST token: '.'
    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifier();

    void setIdentifier(List<TerminalNodeStrings> setIdentifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
