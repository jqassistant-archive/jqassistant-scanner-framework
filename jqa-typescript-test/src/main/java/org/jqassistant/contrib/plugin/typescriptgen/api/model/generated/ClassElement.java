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
 * public static class ClassElementContext extends ParserRuleContext {
 *
 *     public ConstructorDeclarationContext constructorDeclaration() {
 *         return getRuleContext(ConstructorDeclarationContext.class, 0);
 *     }
 *
 *     public PropertyMemberDeclarationContext propertyMemberDeclaration() {
 *         return getRuleContext(PropertyMemberDeclarationContext.class, 0);
 *     }
 *
 *     public DecoratorListContext decoratorList() {
 *         return getRuleContext(DecoratorListContext.class, 0);
 *     }
 *
 *     public IndexMemberDeclarationContext indexMemberDeclaration() {
 *         return getRuleContext(IndexMemberDeclarationContext.class, 0);
 *     }
 *
 *     public StatementContext statement() {
 *         return getRuleContext(StatementContext.class, 0);
 *     }
 *
 *     public ClassElementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classElement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterClassElement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitClassElement(this);
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
@Label("ClassElement")
public interface ClassElement extends TypeScriptGenAST {

    @Relation("HAS_CONSTRUCTOR_DECLARATION")
    ConstructorDeclaration getConstructorDeclaration();

    void setConstructorDeclaration(ConstructorDeclaration setConstructorDeclaration);

    @Relation("HAS_PROPERTY_MEMBER_DECLARATION")
    PropertyMemberDeclaration getPropertyMemberDeclaration();

    void setPropertyMemberDeclaration(PropertyMemberDeclaration setPropertyMemberDeclaration);

    @Relation("HAS_DECORATOR_LIST")
    DecoratorList getDecoratorList();

    void setDecoratorList(DecoratorList setDecoratorList);

    @Relation("HAS_INDEX_MEMBER_DECLARATION")
    IndexMemberDeclaration getIndexMemberDeclaration();

    void setIndexMemberDeclaration(IndexMemberDeclaration setIndexMemberDeclaration);

    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);
}
