//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE unannInterfaceType (BLOCK (ALT unannClassType)))
 * </pre>
 *
 * <pre>
 * unannInterfaceType
 * 	:	unannClassType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1067-1073
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannInterfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("UnannInterfaceType")
public interface UnannInterfaceType extends JavaGen {

    @Relation("HAS_UNANN_CLASS_TYPE")
    UnannClassType getUnannClassType();

    void setUnannClassType(UnannClassType unannClassType);
}
