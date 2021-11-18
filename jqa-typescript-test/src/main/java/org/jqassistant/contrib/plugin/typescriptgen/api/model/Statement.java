//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class StatementContext extends ParserRuleContext {
 *
 *     public BlockContext block() {
 *         return getRuleContext(BlockContext.class, 0);
 *     }
 *
 *     public ImportStatementContext importStatement() {
 *         return getRuleContext(ImportStatementContext.class, 0);
 *     }
 *
 *     public ExportStatementContext exportStatement() {
 *         return getRuleContext(ExportStatementContext.class, 0);
 *     }
 *
 *     public EmptyStatementContext emptyStatement() {
 *         return getRuleContext(EmptyStatementContext.class, 0);
 *     }
 *
 *     public AbstractDeclarationContext abstractDeclaration() {
 *         return getRuleContext(AbstractDeclarationContext.class, 0);
 *     }
 *
 *     public DecoratorListContext decoratorList() {
 *         return getRuleContext(DecoratorListContext.class, 0);
 *     }
 *
 *     public ClassDeclarationContext classDeclaration() {
 *         return getRuleContext(ClassDeclarationContext.class, 0);
 *     }
 *
 *     public InterfaceDeclarationContext interfaceDeclaration() {
 *         return getRuleContext(InterfaceDeclarationContext.class, 0);
 *     }
 *
 *     public NamespaceDeclarationContext namespaceDeclaration() {
 *         return getRuleContext(NamespaceDeclarationContext.class, 0);
 *     }
 *
 *     public IfStatementContext ifStatement() {
 *         return getRuleContext(IfStatementContext.class, 0);
 *     }
 *
 *     public IterationStatementContext iterationStatement() {
 *         return getRuleContext(IterationStatementContext.class, 0);
 *     }
 *
 *     public ContinueStatementContext continueStatement() {
 *         return getRuleContext(ContinueStatementContext.class, 0);
 *     }
 *
 *     public BreakStatementContext breakStatement() {
 *         return getRuleContext(BreakStatementContext.class, 0);
 *     }
 *
 *     public ReturnStatementContext returnStatement() {
 *         return getRuleContext(ReturnStatementContext.class, 0);
 *     }
 *
 *     public YieldStatementContext yieldStatement() {
 *         return getRuleContext(YieldStatementContext.class, 0);
 *     }
 *
 *     public WithStatementContext withStatement() {
 *         return getRuleContext(WithStatementContext.class, 0);
 *     }
 *
 *     public LabelledStatementContext labelledStatement() {
 *         return getRuleContext(LabelledStatementContext.class, 0);
 *     }
 *
 *     public SwitchStatementContext switchStatement() {
 *         return getRuleContext(SwitchStatementContext.class, 0);
 *     }
 *
 *     public ThrowStatementContext throwStatement() {
 *         return getRuleContext(ThrowStatementContext.class, 0);
 *     }
 *
 *     public TryStatementContext tryStatement() {
 *         return getRuleContext(TryStatementContext.class, 0);
 *     }
 *
 *     public DebuggerStatementContext debuggerStatement() {
 *         return getRuleContext(DebuggerStatementContext.class, 0);
 *     }
 *
 *     public FunctionDeclarationContext functionDeclaration() {
 *         return getRuleContext(FunctionDeclarationContext.class, 0);
 *     }
 *
 *     public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
 *         return getRuleContext(ArrowFunctionDeclarationContext.class, 0);
 *     }
 *
 *     public GeneratorFunctionDeclarationContext generatorFunctionDeclaration() {
 *         return getRuleContext(GeneratorFunctionDeclarationContext.class, 0);
 *     }
 *
 *     public VariableStatementContext variableStatement() {
 *         return getRuleContext(VariableStatementContext.class, 0);
 *     }
 *
 *     public TypeAliasDeclarationContext typeAliasDeclaration() {
 *         return getRuleContext(TypeAliasDeclarationContext.class, 0);
 *     }
 *
 *     public EnumDeclarationContext enumDeclaration() {
 *         return getRuleContext(EnumDeclarationContext.class, 0);
 *     }
 *
 *     public ExpressionStatementContext expressionStatement() {
 *         return getRuleContext(ExpressionStatementContext.class, 0);
 *     }
 *
 *     public TerminalNode Export() {
 *         return getToken(TypeScriptParser.Export, 0);
 *     }
 *
 *     public StatementContext statement() {
 *         return getRuleContext(StatementContext.class, 0);
 *     }
 *
 *     public StatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_statement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitStatement(this);
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
@Label("Statement")
public interface Statement extends TypeScriptGen {

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    @Relation("HAS_IMPORT_STATEMENT")
    ImportStatement getImportStatement();

    void setImportStatement(ImportStatement setImportStatement);

    @Relation("HAS_EXPORT_STATEMENT")
    ExportStatement getExportStatement();

    void setExportStatement(ExportStatement setExportStatement);

    @Relation("HAS_EMPTY_STATEMENT")
    EmptyStatement getEmptyStatement();

    void setEmptyStatement(EmptyStatement setEmptyStatement);

    @Relation("HAS_ABSTRACT_DECLARATION")
    AbstractDeclaration getAbstractDeclaration();

    void setAbstractDeclaration(AbstractDeclaration setAbstractDeclaration);

    @Relation("HAS_DECORATOR_LIST")
    DecoratorList getDecoratorList();

    void setDecoratorList(DecoratorList setDecoratorList);

    @Relation("HAS_CLASS_DECLARATION")
    ClassDeclaration getClassDeclaration();

    void setClassDeclaration(ClassDeclaration setClassDeclaration);

    @Relation("HAS_INTERFACE_DECLARATION")
    InterfaceDeclaration getInterfaceDeclaration();

    void setInterfaceDeclaration(InterfaceDeclaration setInterfaceDeclaration);

    @Relation("HAS_NAMESPACE_DECLARATION")
    NamespaceDeclaration getNamespaceDeclaration();

    void setNamespaceDeclaration(NamespaceDeclaration setNamespaceDeclaration);

    @Relation("HAS_IF_STATEMENT")
    IfStatement getIfStatement();

    void setIfStatement(IfStatement setIfStatement);

    @Relation("HAS_ITERATION_STATEMENT")
    IterationStatement getIterationStatement();

    void setIterationStatement(IterationStatement setIterationStatement);

    @Relation("HAS_CONTINUE_STATEMENT")
    ContinueStatement getContinueStatement();

    void setContinueStatement(ContinueStatement setContinueStatement);

    @Relation("HAS_BREAK_STATEMENT")
    BreakStatement getBreakStatement();

    void setBreakStatement(BreakStatement setBreakStatement);

    @Relation("HAS_RETURN_STATEMENT")
    ReturnStatement getReturnStatement();

    void setReturnStatement(ReturnStatement setReturnStatement);

    @Relation("HAS_YIELD_STATEMENT")
    YieldStatement getYieldStatement();

    void setYieldStatement(YieldStatement setYieldStatement);

    @Relation("HAS_WITH_STATEMENT")
    WithStatement getWithStatement();

    void setWithStatement(WithStatement setWithStatement);

    @Relation("HAS_LABELLED_STATEMENT")
    LabelledStatement getLabelledStatement();

    void setLabelledStatement(LabelledStatement setLabelledStatement);

    @Relation("HAS_SWITCH_STATEMENT")
    SwitchStatement getSwitchStatement();

    void setSwitchStatement(SwitchStatement setSwitchStatement);

    @Relation("HAS_THROW_STATEMENT")
    ThrowStatement getThrowStatement();

    void setThrowStatement(ThrowStatement setThrowStatement);

    @Relation("HAS_TRY_STATEMENT")
    TryStatement getTryStatement();

    void setTryStatement(TryStatement setTryStatement);

    @Relation("HAS_DEBUGGER_STATEMENT")
    DebuggerStatement getDebuggerStatement();

    void setDebuggerStatement(DebuggerStatement setDebuggerStatement);

    @Relation("HAS_FUNCTION_DECLARATION")
    FunctionDeclaration getFunctionDeclaration();

    void setFunctionDeclaration(FunctionDeclaration setFunctionDeclaration);

    @Relation("HAS_ARROW_FUNCTION_DECLARATION")
    ArrowFunctionDeclaration getArrowFunctionDeclaration();

    void setArrowFunctionDeclaration(ArrowFunctionDeclaration setArrowFunctionDeclaration);

    @Relation("HAS_GENERATOR_FUNCTION_DECLARATION")
    GeneratorFunctionDeclaration getGeneratorFunctionDeclaration();

    void setGeneratorFunctionDeclaration(GeneratorFunctionDeclaration setGeneratorFunctionDeclaration);

    @Relation("HAS_VARIABLE_STATEMENT")
    VariableStatement getVariableStatement();

    void setVariableStatement(VariableStatement setVariableStatement);

    @Relation("HAS_TYPE_ALIAS_DECLARATION")
    TypeAliasDeclaration getTypeAliasDeclaration();

    void setTypeAliasDeclaration(TypeAliasDeclaration setTypeAliasDeclaration);

    @Relation("HAS_ENUM_DECLARATION")
    EnumDeclaration getEnumDeclaration();

    void setEnumDeclaration(EnumDeclaration setEnumDeclaration);

    @Relation("HAS_EXPRESSION_STATEMENT")
    ExpressionStatement getExpressionStatement();

    void setExpressionStatement(ExpressionStatement setExpressionStatement);

    @Relation("HAS_EXPORT")
    TerminalNodeStrings getExport();

    void setExport(TerminalNodeStrings setExport);

    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
