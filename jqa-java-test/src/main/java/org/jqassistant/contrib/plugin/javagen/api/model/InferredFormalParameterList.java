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
 * (RULE inferredFormalParameterList (BLOCK (ALT Identifier (* (BLOCK (ALT ',' Identifier))))))
 * </pre>
 *
 * <pre>
 * inferredFormalParameterList
 * 	:	Identifier (',' Identifier)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4284-4297
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#inferredFormalParameterList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InferredFormalParameterListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InferredFormalParameterList")
public interface InferredFormalParameterList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifier();

    void setIdentifier(List<TerminalNodeStrings> setIdentifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
