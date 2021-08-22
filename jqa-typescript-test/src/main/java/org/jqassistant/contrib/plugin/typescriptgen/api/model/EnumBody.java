//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE enumBody (BLOCK (ALT enumMemberList (? (BLOCK (ALT ','))))))
 * </pre>
 *
 * <pre>
 * enumBody
 *     : enumMemberList ','?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:972-981
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#enumBody()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.EnumBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumBody")
public interface EnumBody extends TypeScriptGen {

    @Relation("HAS_ENUM_MEMBER_LIST")
    EnumMemberList getEnumMemberList();

    void setEnumMemberList(EnumMemberList setEnumMemberList);

    // optional: ?
    // unhandled TerminalAST token: ','
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
