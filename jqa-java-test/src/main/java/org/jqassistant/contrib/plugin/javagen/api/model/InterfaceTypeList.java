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
 * (RULE interfaceTypeList (BLOCK (ALT interfaceType (* (BLOCK (ALT ',' interfaceType))))))
 * </pre>
 *
 * <pre>
 * interfaceTypeList
 * 	:	interfaceType (',' interfaceType)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:772-785
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceTypeList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceTypeListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceTypeList")
public interface InterfaceTypeList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_INTERFACE_TYPE")
    List<InterfaceType> getInterfaceType();

    void setInterfaceType(List<InterfaceType> setInterfaceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
