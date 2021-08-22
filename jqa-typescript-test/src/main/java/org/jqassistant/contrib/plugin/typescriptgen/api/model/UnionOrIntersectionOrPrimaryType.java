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
 * (RULE unionOrIntersectionOrPrimaryType (BLOCK (ALT unionOrIntersectionOrPrimaryType '|' unionOrIntersectionOrPrimaryType) (ALT unionOrIntersectionOrPrimaryType '&' unionOrIntersectionOrPrimaryType) (ALT primaryType)))
 * </pre>
 *
 * <pre>
 * unionOrIntersectionOrPrimaryType
 *     : unionOrIntersectionOrPrimaryType '|' unionOrIntersectionOrPrimaryType #Union
 *     | unionOrIntersectionOrPrimaryType '&' unionOrIntersectionOrPrimaryType #Intersection
 *     | primaryType #Primary
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:166-197
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#unionOrIntersectionOrPrimaryType()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.UnionOrIntersectionOrPrimaryTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnionOrIntersectionOrPrimaryType")
public interface UnionOrIntersectionOrPrimaryType extends TypeScriptGen {

    @Relation("HAS_UNION_OR_INTERSECTION_OR_PRIMARY_TYPE")
    List<UnionOrIntersectionOrPrimaryType> getUnionOrIntersectionOrPrimaryType();

    void setUnionOrIntersectionOrPrimaryType(List<UnionOrIntersectionOrPrimaryType> setUnionOrIntersectionOrPrimaryType);

    // unhandled TerminalAST token: '|'
    // unhandled TerminalAST token: '&'
    @Relation("HAS_PRIMARY_TYPE")
    PrimaryType getPrimaryType();

    void setPrimaryType(PrimaryType setPrimaryType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
