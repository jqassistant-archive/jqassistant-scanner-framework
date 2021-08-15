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
 * (RULE variableInitializerList (BLOCK (ALT variableInitializer (* (BLOCK (ALT ',' variableInitializer))))))
 * </pre>
 *
 * <pre>
 * variableInitializerList
 * 	:	variableInitializer (',' variableInitializer)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2110-2123
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#variableInitializerList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.VariableInitializerListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("VariableInitializerList")
public interface VariableInitializerList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_VARIABLE_INITIALIZER")
    List<VariableInitializer> getVariableInitializer();

    void setVariableInitializer(List<VariableInitializer> setVariableInitializer);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
