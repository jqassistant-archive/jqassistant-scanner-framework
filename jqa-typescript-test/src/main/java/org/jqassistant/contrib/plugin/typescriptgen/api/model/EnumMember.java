//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE enumMember (BLOCK (ALT propertyName (? (BLOCK (ALT '=' singleExpression))))))
 * </pre>
 *
 * <pre>
 * enumMember
 *     : propertyName ('=' singleExpression)?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:998-1011
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#enumMember()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.EnumMemberMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumMember")
public interface EnumMember extends TypeScriptGen {

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    // optional: ?
    // unhandled TerminalAST token: '='
    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
