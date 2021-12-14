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
 * public static class FromBlockContext extends ParserRuleContext {
 *
 *     public TerminalNode From() {
 *         return getToken(TypeScriptParser.From, 0);
 *     }
 *
 *     public TerminalNode StringLiteral() {
 *         return getToken(TypeScriptParser.StringLiteral, 0);
 *     }
 *
 *     public EosContext eos() {
 *         return getRuleContext(EosContext.class, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(TypeScriptParser.Identifier, 0);
 *     }
 *
 *     public TerminalNode Multiply() {
 *         return getToken(TypeScriptParser.Multiply, 0);
 *     }
 *
 *     public MultipleImportStatementContext multipleImportStatement() {
 *         return getRuleContext(MultipleImportStatementContext.class, 0);
 *     }
 *
 *     public TerminalNode As() {
 *         return getToken(TypeScriptParser.As, 0);
 *     }
 *
 *     public IdentifierNameContext identifierName() {
 *         return getRuleContext(IdentifierNameContext.class, 0);
 *     }
 *
 *     public FromBlockContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_fromBlock;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterFromBlock(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitFromBlock(this);
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
@Label("FromBlock")
public interface FromBlock extends TypeScriptGenAST {

    @Relation("HAS_FROM")
    TerminalNodeStrings getFrom();

    void setFrom(TerminalNodeStrings setFrom);

    @Relation("HAS_STRING_LITERAL")
    TerminalNodeStrings getStringLiteral();

    void setStringLiteral(TerminalNodeStrings setStringLiteral);

    @Relation("HAS_EOS")
    Eos getEos();

    void setEos(Eos setEos);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_MULTIPLY")
    TerminalNodeStrings getMultiply();

    void setMultiply(TerminalNodeStrings setMultiply);

    @Relation("HAS_MULTIPLE_IMPORT_STATEMENT")
    MultipleImportStatement getMultipleImportStatement();

    void setMultipleImportStatement(MultipleImportStatement setMultipleImportStatement);

    @Relation("HAS_AS")
    TerminalNodeStrings getAs();

    void setAs(TerminalNodeStrings setAs);

    @Relation("HAS_IDENTIFIER_NAME")
    IdentifierName getIdentifierName();

    void setIdentifierName(IdentifierName setIdentifierName);
}
