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
 * public static class AssignmentOperatorContext extends ParserRuleContext {
 *
 *     public TerminalNode MultiplyAssign() {
 *         return getToken(TypeScriptParser.MultiplyAssign, 0);
 *     }
 *
 *     public TerminalNode DivideAssign() {
 *         return getToken(TypeScriptParser.DivideAssign, 0);
 *     }
 *
 *     public TerminalNode ModulusAssign() {
 *         return getToken(TypeScriptParser.ModulusAssign, 0);
 *     }
 *
 *     public TerminalNode PlusAssign() {
 *         return getToken(TypeScriptParser.PlusAssign, 0);
 *     }
 *
 *     public TerminalNode MinusAssign() {
 *         return getToken(TypeScriptParser.MinusAssign, 0);
 *     }
 *
 *     public TerminalNode LeftShiftArithmeticAssign() {
 *         return getToken(TypeScriptParser.LeftShiftArithmeticAssign, 0);
 *     }
 *
 *     public TerminalNode RightShiftArithmeticAssign() {
 *         return getToken(TypeScriptParser.RightShiftArithmeticAssign, 0);
 *     }
 *
 *     public TerminalNode RightShiftLogicalAssign() {
 *         return getToken(TypeScriptParser.RightShiftLogicalAssign, 0);
 *     }
 *
 *     public TerminalNode BitAndAssign() {
 *         return getToken(TypeScriptParser.BitAndAssign, 0);
 *     }
 *
 *     public TerminalNode BitXorAssign() {
 *         return getToken(TypeScriptParser.BitXorAssign, 0);
 *     }
 *
 *     public TerminalNode BitOrAssign() {
 *         return getToken(TypeScriptParser.BitOrAssign, 0);
 *     }
 *
 *     public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_assignmentOperator;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterAssignmentOperator(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitAssignmentOperator(this);
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
@Label("AssignmentOperator")
public interface AssignmentOperator extends TypeScriptGenAST {

    @Relation("HAS_MULTIPLY_ASSIGN")
    TerminalNodeStrings getMultiplyAssign();

    void setMultiplyAssign(TerminalNodeStrings setMultiplyAssign);

    @Relation("HAS_DIVIDE_ASSIGN")
    TerminalNodeStrings getDivideAssign();

    void setDivideAssign(TerminalNodeStrings setDivideAssign);

    @Relation("HAS_MODULUS_ASSIGN")
    TerminalNodeStrings getModulusAssign();

    void setModulusAssign(TerminalNodeStrings setModulusAssign);

    @Relation("HAS_PLUS_ASSIGN")
    TerminalNodeStrings getPlusAssign();

    void setPlusAssign(TerminalNodeStrings setPlusAssign);

    @Relation("HAS_MINUS_ASSIGN")
    TerminalNodeStrings getMinusAssign();

    void setMinusAssign(TerminalNodeStrings setMinusAssign);

    @Relation("HAS_LEFT_SHIFT_ARITHMETIC_ASSIGN")
    TerminalNodeStrings getLeftShiftArithmeticAssign();

    void setLeftShiftArithmeticAssign(TerminalNodeStrings setLeftShiftArithmeticAssign);

    @Relation("HAS_RIGHT_SHIFT_ARITHMETIC_ASSIGN")
    TerminalNodeStrings getRightShiftArithmeticAssign();

    void setRightShiftArithmeticAssign(TerminalNodeStrings setRightShiftArithmeticAssign);

    @Relation("HAS_RIGHT_SHIFT_LOGICAL_ASSIGN")
    TerminalNodeStrings getRightShiftLogicalAssign();

    void setRightShiftLogicalAssign(TerminalNodeStrings setRightShiftLogicalAssign);

    @Relation("HAS_BIT_AND_ASSIGN")
    TerminalNodeStrings getBitAndAssign();

    void setBitAndAssign(TerminalNodeStrings setBitAndAssign);

    @Relation("HAS_BIT_XOR_ASSIGN")
    TerminalNodeStrings getBitXorAssign();

    void setBitXorAssign(TerminalNodeStrings setBitXorAssign);

    @Relation("HAS_BIT_OR_ASSIGN")
    TerminalNodeStrings getBitOrAssign();

    void setBitOrAssign(TerminalNodeStrings setBitOrAssign);
}
