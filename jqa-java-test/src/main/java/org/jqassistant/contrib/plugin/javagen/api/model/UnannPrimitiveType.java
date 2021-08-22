//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE unannPrimitiveType (BLOCK (ALT numericType) (ALT 'boolean')))
 * </pre>
 *
 * <pre>
 * unannPrimitiveType
 * 	:	numericType
 * 	|	'boolean'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:960-970
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannPrimitiveType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannPrimitiveTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnannPrimitiveType")
public interface UnannPrimitiveType extends JavaGen {

    @Relation("HAS_NUMERIC_TYPE")
    NumericType getNumericType();

    void setNumericType(NumericType setNumericType);

    // unhandled TerminalAST token: 'boolean'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
