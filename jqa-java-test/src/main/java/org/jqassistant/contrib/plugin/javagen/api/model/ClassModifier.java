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
 * public static class ClassModifierContext extends ParserRuleContext {
 *
 *     public AnnotationContext annotation() {
 *         return getRuleContext(AnnotationContext.class, 0);
 *     }
 *
 *     public VisibilityModifierContext visibilityModifier() {
 *         return getRuleContext(VisibilityModifierContext.class, 0);
 *     }
 *
 *     public TerminalNode ABSTRACT() {
 *         return getToken(Java8Parser.ABSTRACT, 0);
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
 *     public TerminalNode STRICTFP() {
 *         return getToken(Java8Parser.STRICTFP, 0);
 *     }
 *
 *     public ClassModifierContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classModifier;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterClassModifier(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitClassModifier(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassModifier")
public interface ClassModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    @Relation("HAS_VISIBILITY_MODIFIER")
    VisibilityModifier getVisibilityModifier();

    void setVisibilityModifier(VisibilityModifier setVisibilityModifier);

    @Relation("HAS_A_B_S_T_R_A_C_T")
    TerminalNodeStrings getABSTRACT();

    void setABSTRACT(TerminalNodeStrings setABSTRACT);

    @Relation("HAS_S_T_A_T_I_C")
    TerminalNodeStrings getSTATIC();

    void setSTATIC(TerminalNodeStrings setSTATIC);

    @Relation("HAS_F_I_N_A_L")
    TerminalNodeStrings getFINAL();

    void setFINAL(TerminalNodeStrings setFINAL);

    @Relation("HAS_S_T_R_I_C_T_F_P")
    TerminalNodeStrings getSTRICTFP();

    void setSTRICTFP(TerminalNodeStrings setSTRICTFP);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
