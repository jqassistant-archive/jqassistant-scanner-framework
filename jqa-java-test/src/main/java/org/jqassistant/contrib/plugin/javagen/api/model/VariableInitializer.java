//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE variableInitializer (BLOCK (ALT expression) (ALT arrayInitializer)))
 * </pre>
 *
 * <pre>
 * variableInitializer
 * 	:	expression
 * 	|	arrayInitializer
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:936-946
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#variableInitializer()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.VariableInitializerMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("VariableInitializer")
public interface VariableInitializer extends JavaGen {

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    @Relation("HAS_ARRAY_INITIALIZER")
    ArrayInitializer getArrayInitializer();

    void setArrayInitializer(ArrayInitializer setArrayInitializer);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
