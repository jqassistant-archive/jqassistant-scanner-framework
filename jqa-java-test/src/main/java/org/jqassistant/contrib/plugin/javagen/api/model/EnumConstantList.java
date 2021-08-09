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
 * (RULE enumConstantList (BLOCK (ALT enumConstant (* (BLOCK (ALT ',' enumConstant))))))
 * </pre>
 *
 * <pre>
 * enumConstantList
 * 	:	enumConstant (',' enumConstant)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1606-1619
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#enumConstantList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnumConstantListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("EnumConstantList")
public interface EnumConstantList extends JavaGen {

    // unhandled TerminalAST token: ','
    // unhandled StarBlockAST: ','
    @Relation("HAS_ENUM_CONSTANT")
    List<EnumConstant> getEnumConstants();

    void setEnumConstants(List<EnumConstant> setEnumConstants);
}
