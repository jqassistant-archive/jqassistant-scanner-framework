//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class NormalClassDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode CLASS() {
 *         return getToken(Java8Parser.CLASS, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
 *     }
 *
 *     public ClassBodyContext classBody() {
 *         return getRuleContext(ClassBodyContext.class, 0);
 *     }
 *
 *     public List<ClassModifierContext> classModifier() {
 *         return getRuleContexts(ClassModifierContext.class);
 *     }
 *
 *     public ClassModifierContext classModifier(int i) {
 *         return getRuleContext(ClassModifierContext.class, i);
 *     }
 *
 *     public TypeParametersContext typeParameters() {
 *         return getRuleContext(TypeParametersContext.class, 0);
 *     }
 *
 *     public SuperclassContext superclass() {
 *         return getRuleContext(SuperclassContext.class, 0);
 *     }
 *
 *     public SuperinterfacesContext superinterfaces() {
 *         return getRuleContext(SuperinterfacesContext.class, 0);
 *     }
 *
 *     public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_normalClassDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterNormalClassDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitNormalClassDeclaration(this);
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
@Label("NormalClassDeclaration")
public interface NormalClassDeclaration extends JavaGen {

    @Relation("HAS_CLASS")
    TerminalNodeStrings getCLASS();

    void setCLASS(TerminalNodeStrings setCLASS);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_CLASS_BODY")
    ClassBody getClassBody();

    void setClassBody(ClassBody setClassBody);

    @Relation("HAS_CLASS_MODIFIER")
    List<ClassModifier> getClassModifier();

    void setClassModifier(List<ClassModifier> setClassModifier);

    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_SUPERCLASS")
    Superclass getSuperclass();

    void setSuperclass(Superclass setSuperclass);

    @Relation("HAS_SUPERINTERFACES")
    Superinterfaces getSuperinterfaces();

    void setSuperinterfaces(Superinterfaces setSuperinterfaces);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
