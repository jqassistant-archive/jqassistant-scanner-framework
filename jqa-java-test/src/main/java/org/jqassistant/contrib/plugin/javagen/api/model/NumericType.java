//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE numericType (BLOCK (ALT integralType) (ALT floatingPointType)))
 * </pre>
 *
 * <pre>
 * numericType
 * 	:	integralType
 * 	|	floatingPointType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:70-80
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#numericType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.NumericTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("NumericType")
public interface NumericType extends JavaGen {

    @Relation("HAS_INTEGRAL_TYPE")
    IntegralType getIntegralType();

    void setIntegralType(IntegralType integralType);

    @Relation("HAS_FLOATING_POINT_TYPE")
    FloatingPointType getFloatingPointType();

    void setFloatingPointType(FloatingPointType floatingPointType);
}
