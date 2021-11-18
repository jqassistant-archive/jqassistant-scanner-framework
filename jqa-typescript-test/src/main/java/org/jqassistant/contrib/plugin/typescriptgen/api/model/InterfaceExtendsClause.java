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
 * public static class InterfaceExtendsClauseContext extends ParserRuleContext {
 *
 *     public TerminalNode Extends() {
 *         return getToken(TypeScriptParser.Extends, 0);
 *     }
 *
 *     public ClassOrInterfaceTypeListContext classOrInterfaceTypeList() {
 *         return getRuleContext(ClassOrInterfaceTypeListContext.class, 0);
 *     }
 *
 *     public InterfaceExtendsClauseContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_interfaceExtendsClause;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterInterfaceExtendsClause(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitInterfaceExtendsClause(this);
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
@Label("InterfaceExtendsClause")
public interface InterfaceExtendsClause extends TypeScriptGen {

    @Relation("HAS_EXTENDS")
    TerminalNodeStrings getExtends();

    void setExtends(TerminalNodeStrings setExtends);

    @Relation("HAS_CLASS_OR_INTERFACE_TYPE_LIST")
    ClassOrInterfaceTypeList getClassOrInterfaceTypeList();

    void setClassOrInterfaceTypeList(ClassOrInterfaceTypeList setClassOrInterfaceTypeList);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
