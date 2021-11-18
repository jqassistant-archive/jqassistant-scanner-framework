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
 * public static class ClassHeritageContext extends ParserRuleContext {
 *
 *     public ClassExtendsClauseContext classExtendsClause() {
 *         return getRuleContext(ClassExtendsClauseContext.class, 0);
 *     }
 *
 *     public ImplementsClauseContext implementsClause() {
 *         return getRuleContext(ImplementsClauseContext.class, 0);
 *     }
 *
 *     public ClassHeritageContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classHeritage;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterClassHeritage(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitClassHeritage(this);
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
@Label("ClassHeritage")
public interface ClassHeritage extends TypeScriptGen {

    @Relation("HAS_CLASS_EXTENDS_CLAUSE")
    ClassExtendsClause getClassExtendsClause();

    void setClassExtendsClause(ClassExtendsClause setClassExtendsClause);

    @Relation("HAS_IMPLEMENTS_CLAUSE")
    ImplementsClause getImplementsClause();

    void setImplementsClause(ImplementsClause setImplementsClause);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
