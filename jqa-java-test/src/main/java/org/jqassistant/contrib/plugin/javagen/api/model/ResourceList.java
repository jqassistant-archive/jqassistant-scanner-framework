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
 * (RULE resourceList (BLOCK (ALT resource (* (BLOCK (ALT ';' resource))))))
 * </pre>
 *
 * <pre>
 * resourceList
 * 	:	resource (';' resource)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2940-2953
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#resourceList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ResourceListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Label("ResourceList")
public interface ResourceList extends JavaGen {

    // unhandled TerminalAST token: ';'
    // unhandled StarBlockAST: ';'
    @Relation("HAS_RESOURCE")
    List<Resource> getResources();

    void setResources(List<Resource> setResources);
}
