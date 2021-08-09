//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeBound (BLOCK (ALT 'extends' typeVariable) (ALT 'extends' classOrInterfaceType (* (BLOCK (ALT additionalBound))))))
 * </pre>
 *
 * <pre>
 * typeBound
 * 	:	'extends' typeVariable
 * 	|	'extends' classOrInterfaceType additionalBound*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:321-338
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeBound()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeBoundMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("TypeBound")
public interface TypeBound extends JavaGen {

    // unhandled TerminalAST token: 'extends'
    @Relation("HAS_TYPE_VARIABLE")
    TypeVariable getTypeVariable();

    void setTypeVariable(TypeVariable typeVariable);

    // unhandled TerminalAST token: 'extends'
    @Relation("HAS_CLASS_OR_INTERFACE_TYPE")
    ClassOrInterfaceType getClassOrInterfaceType();

    void setClassOrInterfaceType(ClassOrInterfaceType classOrInterfaceType);

    @Relation("HAS_ADDITIONAL_BOUND")
    List<AdditionalBound> getAdditionalBounds();

    void setAdditionalBounds(List<AdditionalBound> setAdditionalBounds);
}
