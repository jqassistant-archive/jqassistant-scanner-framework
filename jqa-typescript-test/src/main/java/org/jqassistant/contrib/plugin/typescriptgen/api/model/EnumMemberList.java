//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE enumMemberList (BLOCK (ALT enumMember (* (BLOCK (ALT ',' enumMember))))))
 * </pre>
 *
 * <pre>
 * enumMemberList
 *     : enumMember (',' enumMember)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:983-996
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#enumMemberList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.EnumMemberListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumMemberList")
public interface EnumMemberList extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_ENUM_MEMBER")
    List<EnumMember> getEnumMember();

    void setEnumMember(List<EnumMember> setEnumMember);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
