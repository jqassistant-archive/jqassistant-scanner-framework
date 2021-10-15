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
 * public static class TypeIncludeGenericContext extends ParserRuleContext {
 *
 *     public List<TerminalNode> LessThan() {
 *         return getTokens(TypeScriptParser.LessThan);
 *     }
 *
 *     public TerminalNode LessThan(int i) {
 *         return getToken(TypeScriptParser.LessThan, i);
 *     }
 *
 *     public List<TypeArgumentListContext> typeArgumentList() {
 *         return getRuleContexts(TypeArgumentListContext.class);
 *     }
 *
 *     public TypeArgumentListContext typeArgumentList(int i) {
 *         return getRuleContext(TypeArgumentListContext.class, i);
 *     }
 *
 *     public List<TerminalNode> MoreThan() {
 *         return getTokens(TypeScriptParser.MoreThan);
 *     }
 *
 *     public TerminalNode MoreThan(int i) {
 *         return getToken(TypeScriptParser.MoreThan, i);
 *     }
 *
 *     public BindingPatternContext bindingPattern() {
 *         return getRuleContext(BindingPatternContext.class, 0);
 *     }
 *
 *     public TerminalNode RightShiftArithmetic() {
 *         return getToken(TypeScriptParser.RightShiftArithmetic, 0);
 *     }
 *
 *     public TypeIncludeGenericContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeIncludeGeneric;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTypeIncludeGeneric(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTypeIncludeGeneric(this);
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
@Label("TypeIncludeGeneric")
public interface TypeIncludeGeneric extends TypeScriptGen {

    @Relation("HAS_LESS_THAN")
    List<TerminalNodeStrings> getLessThan();

    void setLessThan(List<TerminalNodeStrings> setLessThan);

    @Relation("HAS_TYPE_ARGUMENT_LIST")
    List<TypeArgumentList> getTypeArgumentList();

    void setTypeArgumentList(List<TypeArgumentList> setTypeArgumentList);

    @Relation("HAS_MORE_THAN")
    List<TerminalNodeStrings> getMoreThan();

    void setMoreThan(List<TerminalNodeStrings> setMoreThan);

    @Relation("HAS_BINDING_PATTERN")
    BindingPattern getBindingPattern();

    void setBindingPattern(BindingPattern setBindingPattern);

    @Relation("HAS_RIGHT_SHIFT_ARITHMETIC")
    TerminalNodeStrings getRightShiftArithmetic();

    void setRightShiftArithmetic(TerminalNodeStrings setRightShiftArithmetic);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
