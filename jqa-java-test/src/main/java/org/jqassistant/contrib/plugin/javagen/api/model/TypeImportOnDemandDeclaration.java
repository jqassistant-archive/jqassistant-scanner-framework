//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode IMPORT() {
 *         return getToken(Java8Parser.IMPORT, 0);
 *     }
 *
 *     public PackageOrTypeNameContext packageOrTypeName() {
 *         return getRuleContext(PackageOrTypeNameContext.class, 0);
 *     }
 *
 *     public TerminalNode DOT() {
 *         return getToken(Java8Parser.DOT, 0);
 *     }
 *
 *     public TerminalNode MUL() {
 *         return getToken(Java8Parser.MUL, 0);
 *     }
 *
 *     public TerminalNode SEMI() {
 *         return getToken(Java8Parser.SEMI, 0);
 *     }
 *
 *     public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeImportOnDemandDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterTypeImportOnDemandDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitTypeImportOnDemandDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeImportOnDemandDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeImportOnDemandDeclaration")
public interface TypeImportOnDemandDeclaration extends JavaGen {

    @Relation("HAS_I_M_P_O_R_T")
    TerminalNodeStrings getIMPORT();

    void setIMPORT(TerminalNodeStrings setIMPORT);

    @Relation("HAS_PACKAGE_OR_TYPE_NAME")
    PackageOrTypeName getPackageOrTypeName();

    void setPackageOrTypeName(PackageOrTypeName setPackageOrTypeName);

    @Relation("HAS_D_O_T")
    TerminalNodeStrings getDOT();

    void setDOT(TerminalNodeStrings setDOT);

    @Relation("HAS_M_U_L")
    TerminalNodeStrings getMUL();

    void setMUL(TerminalNodeStrings setMUL);

    @Relation("HAS_S_E_M_I")
    TerminalNodeStrings getSEMI();

    void setSEMI(TerminalNodeStrings setSEMI);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
