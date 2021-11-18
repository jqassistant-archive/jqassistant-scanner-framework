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
 * public static class ConstructSignatureContext extends ParserRuleContext {
 *
 *     public TerminalNode New() {
 *         return getToken(TypeScriptParser.New, 0);
 *     }
 *
 *     public TerminalNode OpenParen() {
 *         return getToken(TypeScriptParser.OpenParen, 0);
 *     }
 *
 *     public TerminalNode CloseParen() {
 *         return getToken(TypeScriptParser.CloseParen, 0);
 *     }
 *
 *     public TypeParametersContext typeParameters() {
 *         return getRuleContext(TypeParametersContext.class, 0);
 *     }
 *
 *     public ParameterListContext parameterList() {
 *         return getRuleContext(ParameterListContext.class, 0);
 *     }
 *
 *     public TypeAnnotationContext typeAnnotation() {
 *         return getRuleContext(TypeAnnotationContext.class, 0);
 *     }
 *
 *     public ConstructSignatureContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_constructSignature;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterConstructSignature(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitConstructSignature(this);
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
@Label("ConstructSignature")
public interface ConstructSignature extends TypeScriptGen {

    @Relation("HAS_NEW")
    TerminalNodeStrings getNew();

    void setNew(TerminalNodeStrings setNew);

    @Relation("HAS_OPEN_PAREN")
    TerminalNodeStrings getOpenParen();

    void setOpenParen(TerminalNodeStrings setOpenParen);

    @Relation("HAS_CLOSE_PAREN")
    TerminalNodeStrings getCloseParen();

    void setCloseParen(TerminalNodeStrings setCloseParen);

    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_PARAMETER_LIST")
    ParameterList getParameterList();

    void setParameterList(ParameterList setParameterList);

    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
