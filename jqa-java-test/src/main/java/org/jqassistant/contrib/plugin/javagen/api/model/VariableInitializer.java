//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("VariableInitializer")
public interface VariableInitializer extends JavaGen {

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    @Relation("HAS_ARRAY_INITIALIZER")
    ArrayInitializer getArrayInitializer();

    void setArrayInitializer(ArrayInitializer arrayInitializer);
}
