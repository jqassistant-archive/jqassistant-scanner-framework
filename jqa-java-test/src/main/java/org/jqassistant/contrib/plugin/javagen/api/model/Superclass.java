//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE superclass (BLOCK (ALT 'extends' classType)))
 * </pre>
 *
 * <pre>
 * superclass
 * 	:	'extends' classType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:752-760
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#superclass()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SuperclassMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("Superclass")
public interface Superclass extends JavaGen {

    // unhandled TerminalAST token: 'extends'
    @Relation("HAS_CLASS_TYPE")
    ClassType getClassType();

    void setClassType(ClassType classType);
}