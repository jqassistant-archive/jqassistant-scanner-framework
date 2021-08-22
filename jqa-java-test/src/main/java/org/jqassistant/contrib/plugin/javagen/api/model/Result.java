//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE result (BLOCK (ALT unannType) (ALT 'void')))
 * </pre>
 *
 * <pre>
 * result
 * 	:	unannType
 * 	|	'void'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1205-1215
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#result()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ResultMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Result")
public interface Result extends JavaGen {

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType setUnannType);

    // unhandled TerminalAST token: 'void'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
