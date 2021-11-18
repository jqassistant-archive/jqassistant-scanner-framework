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
 * public static class ImplementsClauseContext extends ParserRuleContext {
 *
 *     public TerminalNode Implements() {
 *         return getToken(TypeScriptParser.Implements, 0);
 *     }
 *
 *     public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
 *         return getRuleContext(ClassOrInterfaceTypeListContext.class, 0);
 *     }
 *
 *     public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_implementsClause;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterImplementsClause(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitImplementsClause(this);
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
@Label("ImplementsClause")
public interface ImplementsClause extends TypeScriptGen {

    @Relation("HAS_IMPLEMENTS")
    TerminalNodeStrings getImplements();

    void setImplements(TerminalNodeStrings setImplements);

    @Relation("HAS_CLASS_OR_INTERFACE_TYPE_LIST")
    ClassOrInterfaceTypeList getClassOrInterfaceTypeList();

    void setClassOrInterfaceTypeList(ClassOrInterfaceTypeList setClassOrInterfaceTypeList);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
