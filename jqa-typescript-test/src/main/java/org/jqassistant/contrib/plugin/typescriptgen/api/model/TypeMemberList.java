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
 * (RULE typeMemberList (BLOCK (ALT typeMember (* (BLOCK (ALT (BLOCK (ALT SemiColon) (ALT ',')) typeMember))))))
 * </pre>
 *
 * <pre>
 * typeMemberList
 *     : typeMember ((SemiColon | ',') typeMember)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:428-447
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeMemberList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeMemberListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeMemberList")
public interface TypeMemberList extends TypeScriptGen {

    @Relation("HAS_SEMI_COLON")
    List<TerminalNodeStrings> getSemiColon();

    void setSemiColon(List<TerminalNodeStrings> setSemiColon);

    // unhandled TerminalAST token: ','
    @Relation("HAS_TYPE_MEMBER")
    List<TypeMember> getTypeMember();

    void setTypeMember(List<TypeMember> setTypeMember);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
