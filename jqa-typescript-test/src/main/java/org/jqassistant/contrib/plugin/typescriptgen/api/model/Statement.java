//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE statement (BLOCK (ALT block) (ALT importStatement) (ALT exportStatement) (ALT emptyStatement) (ALT abstractDeclaration) (ALT decoratorList) (ALT classDeclaration) (ALT interfaceDeclaration) (ALT namespaceDeclaration) (ALT ifStatement) (ALT iterationStatement) (ALT continueStatement) (ALT breakStatement) (ALT returnStatement) (ALT yieldStatement) (ALT withStatement) (ALT labelledStatement) (ALT switchStatement) (ALT throwStatement) (ALT tryStatement) (ALT debuggerStatement) (ALT functionDeclaration) (ALT arrowFunctionDeclaration) (ALT generatorFunctionDeclaration) (ALT variableStatement) (ALT typeAliasDeclaration) (ALT enumDeclaration) (ALT expressionStatement) (ALT Export statement)))
 * </pre>
 *
 * <pre>
 * statement
 *     : block
 *     | importStatement
 *     | exportStatement
 *     | emptyStatement
 *     | abstractDeclaration //ADDED
 *     | decoratorList
 *     | classDeclaration
 *     | interfaceDeclaration //ADDED
 *     | namespaceDeclaration //ADDED
 *     | ifStatement
 *     | iterationStatement
 *     | continueStatement
 *     | breakStatement
 *     | returnStatement
 *     | yieldStatement
 *     | withStatement
 *     | labelledStatement
 *     | switchStatement
 *     | throwStatement
 *     | tryStatement
 *     | debuggerStatement
 *     | functionDeclaration
 *     | arrowFunctionDeclaration
 *     | generatorFunctionDeclaration
 *     | variableStatement
 *     | typeAliasDeclaration //ADDED
 *     | enumDeclaration      //ADDED
 *     | expressionStatement
 *     | Export statement
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1146-1276
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#statement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.StatementMapper
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

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
