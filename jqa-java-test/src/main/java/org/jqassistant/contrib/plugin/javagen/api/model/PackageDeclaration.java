//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;
import java.util.List;

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
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PackageDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PackageDeclaration")
public interface PackageDeclaration extends JavaGen {

    @Relation("HAS_P_A_C_K_A_G_E")
    TerminalNodeStrings getPACKAGE();

    void setPACKAGE(TerminalNodeStrings setPACKAGE);

    @Relation("HAS_PACKAGE_NAME")
    PackageName getPackageName();

    void setPackageName(PackageName setPackageName);

    @Relation("HAS_S_E_M_I")
    TerminalNodeStrings getSEMI();

    void setSEMI(TerminalNodeStrings setSEMI);

    @Relation("HAS_PACKAGE_MODIFIER")
    List<PackageModifier> getPackageModifier();

    void setPackageModifier(List<PackageModifier> setPackageModifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
