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
 * public static class ForVarStatementContext extends IterationStatementContext {
 *
 *     public TerminalNode For() {
 *         return getToken(TypeScriptParser.For, 0);
 *     }
 *
 *     public TerminalNode OpenParen() {
 *         return getToken(TypeScriptParser.OpenParen, 0);
 *     }
 *
 *     public VarModifierContext varModifier() {
 *         return getRuleContext(VarModifierContext.class, 0);
 *     }
 *
 *     public VariableDeclarationListContext variableDeclarationList() {
 *         return getRuleContext(VariableDeclarationListContext.class, 0);
 *     }
 *
 *     public List<TerminalNode> SemiColon() {
 *         return getTokens(TypeScriptParser.SemiColon);
 *     }
 *
 *     public TerminalNode SemiColon(int i) {
 *         return getToken(TypeScriptParser.SemiColon, i);
 *     }
 *
 *     public TerminalNode CloseParen() {
 *         return getToken(TypeScriptParser.CloseParen, 0);
 *     }
 *
 *     public StatementContext statement() {
 *         return getRuleContext(StatementContext.class, 0);
 *     }
 *
 *     public List<ExpressionSequenceContext> expressionSequence() {
 *         return getRuleContexts(ExpressionSequenceContext.class);
 *     }
 *
 *     public ExpressionSequenceContext expressionSequence(int i) {
 *         return getRuleContext(ExpressionSequenceContext.class, i);
 *     }
 *
 *     public ForVarStatementContext(IterationStatementContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterForVarStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitForVarStatement(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	comments = "REQUIRES_SPECIAL_MAPPING")
@Label("ForVarStatement")
public interface ForVarStatement extends IterationStatement {

    @Relation("HAS_FOR")
    TerminalNodeStrings getFor();

    void setFor(TerminalNodeStrings setFor);

    @Relation("HAS_OPEN_PAREN")
    TerminalNodeStrings getOpenParen();

    void setOpenParen(TerminalNodeStrings setOpenParen);

    @Relation("HAS_VAR_MODIFIER")
    VarModifier getVarModifier();

    void setVarModifier(VarModifier setVarModifier);

    @Relation("HAS_VARIABLE_DECLARATION_LIST")
    VariableDeclarationList getVariableDeclarationList();

    void setVariableDeclarationList(VariableDeclarationList setVariableDeclarationList);

    @Relation("HAS_SEMI_COLON")
    List<TerminalNodeStrings> getSemiColon();

    void setSemiColon(List<TerminalNodeStrings> setSemiColon);

    @Relation("HAS_CLOSE_PAREN")
    TerminalNodeStrings getCloseParen();

    void setCloseParen(TerminalNodeStrings setCloseParen);

    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);

    @Relation("HAS_EXPRESSION_SEQUENCE")
    List<ExpressionSequence> getExpressionSequence();

    void setExpressionSequence(List<ExpressionSequence> setExpressionSequence);
}
