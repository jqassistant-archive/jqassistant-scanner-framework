//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class RedefinitionOfTypeContext extends PrimaryTypeContext {
 *
 *     public TypeReferenceContext typeReference() {
 *         return getRuleContext(TypeReferenceContext.class, 0);
 *     }
 *
 *     public TerminalNode Is() {
 *         return getToken(TypeScriptParser.Is, 0);
 *     }
 *
 *     public PrimaryTypeContext primaryType() {
 *         return getRuleContext(PrimaryTypeContext.class, 0);
 *     }
 *
 *     public RedefinitionOfTypeContext(PrimaryTypeContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterRedefinitionOfType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitRedefinitionOfType(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	comments = "REQUIRES_SPECIAL_MAPPING")
@Label("RedefinitionOfType")
public interface RedefinitionOfType extends PrimaryType {

    @Relation("HAS_TYPE_REFERENCE")
    TypeReference getTypeReference();

    void setTypeReference(TypeReference setTypeReference);

    @Relation("HAS_IS")
    TerminalNodeStrings getIs();

    void setIs(TerminalNodeStrings setIs);

    @Relation("HAS_PRIMARY_TYPE")
    PrimaryType getPrimaryType();

    void setPrimaryType(PrimaryType setPrimaryType);
}
