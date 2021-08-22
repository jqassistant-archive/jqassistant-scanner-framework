//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE iterationStatement (BLOCK (ALT Do statement While '(' expressionSequence ')' eos) (ALT While '(' expressionSequence ')' statement) (ALT For '(' (? (BLOCK (ALT expressionSequence))) SemiColon (? (BLOCK (ALT expressionSequence))) SemiColon (? (BLOCK (ALT expressionSequence))) ')' statement) (ALT For '(' varModifier variableDeclarationList SemiColon (? (BLOCK (ALT expressionSequence))) SemiColon (? (BLOCK (ALT expressionSequence))) ')' statement) (ALT For '(' singleExpression (BLOCK (ALT In) (ALT Identifier {this.p("of")}?)) expressionSequence ')' statement) (ALT For '(' varModifier variableDeclaration (BLOCK (ALT In) (ALT Identifier {this.p("of")}?)) expressionSequence ')' statement)))
 * </pre>
 *
 * <pre>
 * iterationStatement
 *     : Do statement While '(' expressionSequence ')' eos                                                         # DoStatement
 *     | While '(' expressionSequence ')' statement                                                                # WhileStatement
 *     | For '(' expressionSequence? SemiColon expressionSequence? SemiColon expressionSequence? ')' statement     # ForStatement
 *     | For '(' varModifier variableDeclarationList SemiColon expressionSequence? SemiColon expressionSequence? ')'
 *           statement                                                                                             # ForVarStatement
 *     | For '(' singleExpression (In | Identifier{this.p("of")}?) expressionSequence ')' statement                # ForInStatement
 *     | For '(' varModifier variableDeclaration (In | Identifier{this.p("of")}?) expressionSequence ')' statement # ForVarInStatement
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1548-1697
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#iterationStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.IterationStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IterationStatement")
public interface IterationStatement extends TypeScriptGen {

    @Relation("HAS_DO")
    TerminalNodeStrings getDo();

    void setDo(TerminalNodeStrings setDo);

    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);

    @Relation("HAS_WHILE")
    TerminalNodeStrings getWhile();

    void setWhile(TerminalNodeStrings setWhile);

    // unhandled TerminalAST token: '('
    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    // unhandled TerminalAST token: ')'
    // unhandled ast: Eos
    // unhandled TerminalAST token: '('
    // unhandled TerminalAST token: ')'
    @Relation("HAS_FOR")
    TerminalNodeStrings getFor();

    void setFor(TerminalNodeStrings setFor);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_SEMI_COLON")
    List<TerminalNodeStrings> getSemiColon();

    void setSemiColon(List<TerminalNodeStrings> setSemiColon);

    // optional: ?
    // optional: ?
    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: '('
    @Relation("HAS_VAR_MODIFIER")
    VarModifier getVarModifier();

    void setVarModifier(VarModifier setVarModifier);

    @Relation("HAS_VARIABLE_DECLARATION_LIST")
    VariableDeclarationList getVariableDeclarationList();

    void setVariableDeclarationList(VariableDeclarationList setVariableDeclarationList);

    // optional: ?
    // optional: ?
    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: '('
    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_IN")
    TerminalNodeStrings getIn();

    void setIn(TerminalNodeStrings setIn);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled AST type: 59 - list: false : {this.p("of")}?
    // unhandled TerminalAST token: ')'
    // unhandled TerminalAST token: '('
    @Relation("HAS_VARIABLE_DECLARATION")
    VariableDeclaration getVariableDeclaration();

    void setVariableDeclaration(VariableDeclaration setVariableDeclaration);

    // unhandled AST type: 59 - list: false : {this.p("of")}?
    // unhandled TerminalAST token: ')'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
