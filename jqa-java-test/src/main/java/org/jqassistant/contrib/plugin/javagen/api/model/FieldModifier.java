//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class FieldModifierContext extends ParserRuleContext {
 *
 *     public AnnotationContext annotation() {
 *         return getRuleContext(AnnotationContext.class, 0);
 *     }
 *
 *     public VisibilityModifierContext visibilityModifier() {
 *         return getRuleContext(VisibilityModifierContext.class, 0);
 *     }
 *
 *     public TerminalNode STATIC() {
 *         return getToken(Java8Parser.STATIC, 0);
 *     }
 *
 *     public TerminalNode FINAL() {
 *         return getToken(Java8Parser.FINAL, 0);
 *     }
 *
 *     public TerminalNode TRANSIENT() {
 *         return getToken(Java8Parser.TRANSIENT, 0);
 *     }
 *
 *     public TerminalNode VOLATILE() {
 *         return getToken(Java8Parser.VOLATILE, 0);
 *     }
 *
 *     public FieldModifierContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_fieldModifier;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterFieldModifier(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitFieldModifier(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FieldModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FieldModifier")
public interface FieldModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    @Relation("HAS_VISIBILITY_MODIFIER")
    VisibilityModifier getVisibilityModifier();

    void setVisibilityModifier(VisibilityModifier setVisibilityModifier);

    @Relation("HAS_S_T_A_T_I_C")
    TerminalNodeStrings getSTATIC();

    void setSTATIC(TerminalNodeStrings setSTATIC);

    @Relation("HAS_F_I_N_A_L")
    TerminalNodeStrings getFINAL();

    void setFINAL(TerminalNodeStrings setFINAL);

    @Relation("HAS_T_R_A_N_S_I_E_N_T")
    TerminalNodeStrings getTRANSIENT();

    void setTRANSIENT(TerminalNodeStrings setTRANSIENT);

    @Relation("HAS_V_O_L_A_T_I_L_E")
    TerminalNodeStrings getVOLATILE();

    void setVOLATILE(TerminalNodeStrings setVOLATILE);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
