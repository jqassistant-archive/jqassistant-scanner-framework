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
 * public static class PackageDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode PACKAGE() {
 *         return getToken(Java8Parser.PACKAGE, 0);
 *     }
 *
 *     public PackageNameContext packageName() {
 *         return getRuleContext(PackageNameContext.class, 0);
 *     }
 *
 *     public TerminalNode SEMI() {
 *         return getToken(Java8Parser.SEMI, 0);
 *     }
 *
 *     public List<PackageModifierContext> packageModifier() {
 *         return getRuleContexts(PackageModifierContext.class);
 *     }
 *
 *     public PackageModifierContext packageModifier(int i) {
 *         return getRuleContext(PackageModifierContext.class, i);
 *     }
 *
 *     public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_packageDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPackageDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPackageDeclaration(this);
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
@Label("PackageDeclaration")
public interface PackageDeclaration extends JavaGenAST {

    @Relation("HAS_PACKAGE")
    TerminalNodeStrings getPACKAGE();

    void setPACKAGE(TerminalNodeStrings setPACKAGE);

    @Relation("HAS_PACKAGE_NAME")
    PackageName getPackageName();

    void setPackageName(PackageName setPackageName);

    @Relation("HAS_SEMI")
    TerminalNodeStrings getSEMI();

    void setSEMI(TerminalNodeStrings setSEMI);

    @Relation("HAS_PACKAGE_MODIFIER")
    List<PackageModifier> getPackageModifier();

    void setPackageModifier(List<PackageModifier> setPackageModifier);
}
