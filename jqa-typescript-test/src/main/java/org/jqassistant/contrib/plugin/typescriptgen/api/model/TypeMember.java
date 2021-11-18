//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class TypeMemberContext extends ParserRuleContext {
 *
 *     public PropertySignaturContext propertySignatur() {
 *         return getRuleContext(PropertySignaturContext.class, 0);
 *     }
 *
 *     public CallSignatureContext callSignature() {
 *         return getRuleContext(CallSignatureContext.class, 0);
 *     }
 *
 *     public ConstructSignatureContext constructSignature() {
 *         return getRuleContext(ConstructSignatureContext.class, 0);
 *     }
 *
 *     public IndexSignatureContext indexSignature() {
 *         return getRuleContext(IndexSignatureContext.class, 0);
 *     }
 *
 *     public MethodSignatureContext methodSignature() {
 *         return getRuleContext(MethodSignatureContext.class, 0);
 *     }
 *
 *     public TerminalNode ARROW() {
 *         return getToken(TypeScriptParser.ARROW, 0);
 *     }
 *
 *     public Type_Context type_() {
 *         return getRuleContext(Type_Context.class, 0);
 *     }
 *
 *     public TypeMemberContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeMember;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTypeMember(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTypeMember(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
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

    @Relation("HAS_ARROW")
    TerminalNodeStrings getARROW();

    void setARROW(TerminalNodeStrings setARROW);

    @Relation("HAS_TYPE")
    Type_ getType_();

    void setType_(Type_ setType_);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
