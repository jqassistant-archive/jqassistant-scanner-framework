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
 * public static class ArrowFunctionDeclarationContext extends ParserRuleContext {
 *
 *     public ArrowFunctionParametersContext arrowFunctionParameters() {
 *         return getRuleContext(ArrowFunctionParametersContext.class, 0);
 *     }
 *
 *     public TerminalNode ARROW() {
 *         return getToken(TypeScriptParser.ARROW, 0);
 *     }
 *
 *     public ArrowFunctionBodyContext arrowFunctionBody() {
 *         return getRuleContext(ArrowFunctionBodyContext.class, 0);
 *     }
 *
 *     public TerminalNode Async() {
 *         return getToken(TypeScriptParser.Async, 0);
 *     }
 *
 *     public TypeAnnotationContext typeAnnotation() {
 *         return getRuleContext(TypeAnnotationContext.class, 0);
 *     }
 *
 *     public ArrowFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_arrowFunctionDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterArrowFunctionDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitArrowFunctionDeclaration(this);
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
@Label("ArrowFunctionDeclaration")
public interface ArrowFunctionDeclaration extends TypeScriptGen {

    @Relation("HAS_ARROW_FUNCTION_PARAMETERS")
    ArrowFunctionParameters getArrowFunctionParameters();

    void setArrowFunctionParameters(ArrowFunctionParameters setArrowFunctionParameters);

    @Relation("HAS_ARROW")
    TerminalNodeStrings getARROW();

    void setARROW(TerminalNodeStrings setARROW);

    @Relation("HAS_ARROW_FUNCTION_BODY")
    ArrowFunctionBody getArrowFunctionBody();

    void setArrowFunctionBody(ArrowFunctionBody setArrowFunctionBody);

    @Relation("HAS_ASYNC")
    TerminalNodeStrings getAsync();

    void setAsync(TerminalNodeStrings setAsync);

    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
