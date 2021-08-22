//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeMember (BLOCK (ALT propertySignatur) (ALT callSignature) (ALT constructSignature) (ALT indexSignature) (ALT methodSignature (? (BLOCK (ALT '=>' type_))))))
 * </pre>
 *
 * <pre>
 * typeMember
 *     : propertySignatur
 *     | callSignature
 *     | constructSignature
 *     | indexSignature
 *     | methodSignature ('=>' type_)?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:449-478
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#typeMember()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TypeMemberMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeMember")
public interface TypeMember extends TypeScriptGen {

    @Relation("HAS_PROPERTY_SIGNATUR")
    PropertySignatur getPropertySignatur();

    void setPropertySignatur(PropertySignatur setPropertySignatur);

    @Relation("HAS_CALL_SIGNATURE")
    CallSignature getCallSignature();

    void setCallSignature(CallSignature setCallSignature);

    @Relation("HAS_CONSTRUCT_SIGNATURE")
    ConstructSignature getConstructSignature();

    void setConstructSignature(ConstructSignature setConstructSignature);

    @Relation("HAS_INDEX_SIGNATURE")
    IndexSignature getIndexSignature();

    void setIndexSignature(IndexSignature setIndexSignature);

    @Relation("HAS_METHOD_SIGNATURE")
    MethodSignature getMethodSignature();

    void setMethodSignature(MethodSignature setMethodSignature);

    // optional: ?
    // unhandled TerminalAST token: '=>'
    @Relation("HAS_TYPE")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
