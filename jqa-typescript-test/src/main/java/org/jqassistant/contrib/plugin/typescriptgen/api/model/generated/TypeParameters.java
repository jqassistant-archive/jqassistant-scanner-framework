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
 * public static class TypeParametersContext extends ParserRuleContext {
 *
 *     public TerminalNode LessThan() {
 *         return getToken(TypeScriptParser.LessThan, 0);
 *     }
 *
 *     public TerminalNode MoreThan() {
 *         return getToken(TypeScriptParser.MoreThan, 0);
 *     }
 *
 *     public TypeParameterListContext typeParameterList() {
 *         return getRuleContext(TypeParameterListContext.class, 0);
 *     }
 *
 *     public TypeParametersContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeParameters;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTypeParameters(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTypeParameters(this);
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
@Label("TypeParameters")
public interface TypeParameters extends TypeScriptGenAST {

    @Relation("HAS_LESS_THAN")
    TerminalNodeStrings getLessThan();

    void setLessThan(TerminalNodeStrings setLessThan);

    @Relation("HAS_MORE_THAN")
    TerminalNodeStrings getMoreThan();

    void setMoreThan(TerminalNodeStrings setMoreThan);

    @Relation("HAS_TYPE_PARAMETER_LIST")
    TypeParameterList getTypeParameterList();

    void setTypeParameterList(TypeParameterList setTypeParameterList);
}
