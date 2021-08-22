//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeBody (BLOCK (ALT typeMemberList (? (BLOCK (ALT SemiColon) (ALT ','))))))
 * </pre>
 *
 * <pre>
 * typeBody
 *     : typeMemberList (SemiColon | ',')?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:411-426
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeBody()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeBody")
public interface TypeBody extends TypeScriptGen {

    @Relation("HAS_TYPE_MEMBER_LIST")
    TypeMemberList getTypeMemberList();

    void setTypeMemberList(TypeMemberList setTypeMemberList);

    // optional: ?
    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    // unhandled TerminalAST token: ','
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
