//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class FieldDeclarationContext extends ParserRuleContext {
 *
 *     public UnannTypeContext unannType() {
 *         return getRuleContext(UnannTypeContext.class, 0);
 *     }
 *
 *     public VariableDeclaratorListContext variableDeclaratorList() {
 *         return getRuleContext(VariableDeclaratorListContext.class, 0);
 *     }
 *
 *     public TerminalNode SEMI() {
 *         return getToken(Java8Parser.SEMI, 0);
 *     }
 *
 *     public List<FieldModifierContext> fieldModifier() {
 *         return getRuleContexts(FieldModifierContext.class);
 *     }
 *
 *     public FieldModifierContext fieldModifier(int i) {
 *         return getRuleContext(FieldModifierContext.class, i);
 *     }
 *
 *     public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_fieldDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterFieldDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitFieldDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FieldDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FieldDeclaration")
public interface FieldDeclaration extends JavaGen {

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType setUnannType);

    @Relation("HAS_VARIABLE_DECLARATOR_LIST")
    VariableDeclaratorList getVariableDeclaratorList();

    void setVariableDeclaratorList(VariableDeclaratorList setVariableDeclaratorList);

    @Relation("HAS_S_E_M_I")
    TerminalNodeStrings getSEMI();

    void setSEMI(TerminalNodeStrings setSEMI);

    @Relation("HAS_FIELD_MODIFIER")
    List<FieldModifier> getFieldModifier();

    void setFieldModifier(List<FieldModifier> setFieldModifier);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
