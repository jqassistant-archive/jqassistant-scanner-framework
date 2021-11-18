//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class ImportDeclarationContext extends ParserRuleContext {
 *
 *     public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
 *         return getRuleContext(SingleTypeImportDeclarationContext.class, 0);
 *     }
 *
 *     public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
 *         return getRuleContext(TypeImportOnDemandDeclarationContext.class, 0);
 *     }
 *
 *     public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
 *         return getRuleContext(SingleStaticImportDeclarationContext.class, 0);
 *     }
 *
 *     public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
 *         return getRuleContext(StaticImportOnDemandDeclarationContext.class, 0);
 *     }
 *
 *     public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_importDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterImportDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitImportDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ImportDeclaration")
public interface ImportDeclaration extends JavaGenAST {

    @Relation("HAS_SINGLE_TYPE_IMPORT_DECLARATION")
    SingleTypeImportDeclaration getSingleTypeImportDeclaration();

    void setSingleTypeImportDeclaration(SingleTypeImportDeclaration setSingleTypeImportDeclaration);

    @Relation("HAS_TYPE_IMPORT_ON_DEMAND_DECLARATION")
    TypeImportOnDemandDeclaration getTypeImportOnDemandDeclaration();

    void setTypeImportOnDemandDeclaration(TypeImportOnDemandDeclaration setTypeImportOnDemandDeclaration);

    @Relation("HAS_SINGLE_STATIC_IMPORT_DECLARATION")
    SingleStaticImportDeclaration getSingleStaticImportDeclaration();

    void setSingleStaticImportDeclaration(SingleStaticImportDeclaration setSingleStaticImportDeclaration);

    @Relation("HAS_STATIC_IMPORT_ON_DEMAND_DECLARATION")
    StaticImportOnDemandDeclaration getStaticImportOnDemandDeclaration();

    void setStaticImportOnDemandDeclaration(StaticImportOnDemandDeclaration setStaticImportOnDemandDeclaration);
}
