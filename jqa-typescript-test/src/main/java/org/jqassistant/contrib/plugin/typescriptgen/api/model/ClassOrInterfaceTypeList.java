//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;
import java.util.List;

/**
 * Generated from Parser:
 * <pre>
 * public static class ClassOrInterfaceTypeListContext extends ParserRuleContext {
 *
 *     public List<TypeReferenceContext> typeReference() {
 *         return getRuleContexts(TypeReferenceContext.class);
 *     }
 *
 *     public TypeReferenceContext typeReference(int i) {
 *         return getRuleContext(TypeReferenceContext.class, i);
 *     }
 *
 *     public List<TerminalNode> Comma() {
 *         return getTokens(TypeScriptParser.Comma);
 *     }
 *
 *     public TerminalNode Comma(int i) {
 *         return getToken(TypeScriptParser.Comma, i);
 *     }
 *
 *     public ClassOrInterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classOrInterfaceTypeList;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterClassOrInterfaceTypeList(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitClassOrInterfaceTypeList(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ClassOrInterfaceTypeListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassOrInterfaceTypeList")
public interface ClassOrInterfaceTypeList extends TypeScriptGen {

    @Relation("HAS_TYPE_REFERENCE")
    List<TypeReference> getTypeReference();

    void setTypeReference(List<TypeReference> setTypeReference);

    @Relation("HAS_COMMA")
    List<TerminalNodeStrings> getComma();

    void setComma(List<TerminalNodeStrings> setComma);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
