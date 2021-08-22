//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE methodSignature (BLOCK (ALT propertyName (? (BLOCK (ALT '?'))) callSignature)))
 * </pre>
 *
 * <pre>
 * methodSignature
 *     : propertyName '?'? callSignature
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:830-841
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#methodSignature()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.MethodSignatureMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MethodSignature")
public interface MethodSignature extends TypeScriptGen {

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    // optional: ?
    // unhandled TerminalAST token: '?'
    @Relation("HAS_CALL_SIGNATURE")
    CallSignature getCallSignature();

    void setCallSignature(CallSignature setCallSignature);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
