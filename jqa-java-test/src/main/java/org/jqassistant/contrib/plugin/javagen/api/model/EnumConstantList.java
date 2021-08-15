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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumConstantList")
public interface EnumConstantList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_ENUM_CONSTANT")
    List<EnumConstant> getEnumConstant();

    void setEnumConstant(List<EnumConstant> setEnumConstant);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
