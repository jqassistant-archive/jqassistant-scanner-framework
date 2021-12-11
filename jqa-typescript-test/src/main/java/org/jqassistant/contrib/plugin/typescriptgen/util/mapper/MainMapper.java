//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.util.mapper;

import org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser;
import org.jqassistant.contrib.plugin.typescriptgen.api.*;
import org.jqassistant.contrib.plugin.typescriptgen.api.model.generated.*;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import javax.annotation.Generated;
import lombok.SneakyThrows;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(uses = DescriptorFactory.class, unmappedTargetPolicy = ReportingPolicy.ERROR, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
public interface MainMapper {

    public static MainMapper INSTANCE = Mappers.getMapper(MainMapper.class);

    @AfterMapping()
    @SneakyThrows()
    default void mapFileName(@Context() FileResource item, @MappingTarget() org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST target) {
        target.setFileName(item.getFile().getAbsolutePath());
    }

    @Named(value = "mapSourceCode")
    default String mapSourceCode(ParserRuleContext parserContext) {
        try {
            return parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex()));
        } catch (Exception ex) {
            return "mapSourceCode ERROR: " + ex.getMessage();
        }
    }

    default TerminalNodeStrings map(@Context() FileResource item, @Context() ScannerContext scannerContext, TerminalNode terminalNode) {
        return map(scannerContext, terminalNode == null ? null : terminalNode.getSymbol());
    }

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TerminalNodeStrings map(@Context() ScannerContext scannerContext, Token symbol);

    String map(CharStream value);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AbstractDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AbstractDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AbstractMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AbstractMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AccessibilityModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AccessibilityModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AdditiveExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AdditiveExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Argument map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Arguments map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArgumentsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayElementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayLiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayLiteralExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayLiteralExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrowFunctionBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrowFunctionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrowFunctionExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrowFunctionParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AssignmentExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AssignmentOperator map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentOperatorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AssignmentOperatorExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentOperatorExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BindingPattern map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BindingPatternContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BitAndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitAndExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BitNotExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitNotExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BitOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BitShiftExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitShiftExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BitXOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitXOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Block map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BreakStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BreakStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CallSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CallSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CaseBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CaseBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CaseClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CaseClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CaseClauses map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CaseClausesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CastAsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CastAsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CatchProduction map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CatchProductionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @Mapping(target = "clazz", expression = "java(map(item, scannerContext, parserContext.Class()))")
    ClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassElementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @Mapping(target = "clazz", expression = "java(map(item, scannerContext, parserContext.Class()))")
    ClassExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassExtendsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassExtendsClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassHeritage map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassHeritageContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassOrInterfaceTypeList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassOrInterfaceTypeListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassTail map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassTailContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ComputedPropertyExpressionAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ComputedPropertyExpressionAssignmentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Constraint map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstraintContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstructSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructorDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstructorDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructorType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstructorTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ContinueStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ContinueStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DebuggerStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DebuggerStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Decorator map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DecoratorCallExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorCallExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DecoratorList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DecoratorMemberExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorMemberExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DefaultClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DefaultClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DeleteExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DeleteExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DoStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DoStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ElementList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ElementListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EmptyStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EmptyStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumMember map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumMemberList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Eos map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EosContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EqualityExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EqualityExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ExportStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExpressionSequence map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ExpressionSequenceContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExpressionStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ExpressionStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FinallyProduction map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FinallyProductionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ForInStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForInStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ForVarInStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForVarInStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ForVarStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForVarStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FormalParameterArg map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterArgContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FormalParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FromBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FromBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FunctionBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FunctionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FunctionExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FunctionExpressionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionExpressionDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FunctionType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorDefinition map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorDefinitionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorFunctionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorFunctionDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorMethod map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorMethodContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorsFunctionExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorsFunctionExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GenericTypes map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GenericTypesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @Mapping(target = "getter", expression = "java(map(item, scannerContext, parserContext.getter()))")
    GetAccessor map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetAccessorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Getter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @Mapping(target = "getAccessor", expression = "java(map(item, scannerContext, parserContext.getAccessor()))")
    @Mapping(target = "setAccessor", expression = "java(map(item, scannerContext, parserContext.setAccessor()))")
    GetterSetterDeclarationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetterSetterDeclarationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IdentifierExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IdentifierName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IdentifierOrKeyWord map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrKeyWordContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IdentifierOrPattern map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrPatternContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IfStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IfStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ImplementsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImplementsClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ImportAliasDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImportAliasDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ImportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImportStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IndexMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IndexMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IndexSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IndexSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Initializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InstanceofExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InstanceofExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InterfaceDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceExtendsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InterfaceExtendsClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Intersection map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IntersectionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @SubclassMapping(target = DoStatement.class, source = TypeScriptParser.DoStatementContext.class)
    @SubclassMapping(target = ForInStatement.class, source = TypeScriptParser.ForInStatementContext.class)
    @SubclassMapping(target = ForStatement.class, source = TypeScriptParser.ForStatementContext.class)
    @SubclassMapping(target = ForVarInStatement.class, source = TypeScriptParser.ForVarInStatementContext.class)
    @SubclassMapping(target = ForVarStatement.class, source = TypeScriptParser.ForVarStatementContext.class)
    @SubclassMapping(target = WhileStatement.class, source = TypeScriptParser.WhileStatementContext.class)
    IterationStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IterationStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IteratorBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IteratorDefinition map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorDefinitionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IteratorsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @Mapping(target = "clazz", expression = "java(map(item, scannerContext, parserContext.Class()))")
    Keyword map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.KeywordContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LabelledStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LabelledStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LastFormalParameterArg map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LastFormalParameterArgContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Literal map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LiteralExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LiteralExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LogicalAndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LogicalAndExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LogicalOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LogicalOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MemberDotExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MemberDotExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MemberIndexExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MemberIndexExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodDeclarationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodDeclarationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodProperty map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodPropertyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MultipleImportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MultipleImportStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MultiplicativeExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MultiplicativeExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NamespaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NamespaceDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NamespaceName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NamespaceNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NestedTypeGeneric map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NestedTypeGenericContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NewExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NewExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NotExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NotExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NumericLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NumericLiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ObjectLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectLiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ObjectLiteralExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectLiteralExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ObjectPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ObjectType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    OptionalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.OptionalParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Parameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ParenthesizedExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParenthesizedExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ParenthesizedPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParenthesizedPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PostDecreaseExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PostDecreaseExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PostIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PostIncrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PreDecreaseExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PreDecreaseExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PreIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PreIncrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PredefinedPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PredefinedPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PredefinedType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PredefinedTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PrimaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @SubclassMapping(target = ArrayPrimType.class, source = TypeScriptParser.ArrayPrimTypeContext.class)
    @SubclassMapping(target = ObjectPrimType.class, source = TypeScriptParser.ObjectPrimTypeContext.class)
    @SubclassMapping(target = ParenthesizedPrimType.class, source = TypeScriptParser.ParenthesizedPrimTypeContext.class)
    @SubclassMapping(target = PredefinedPrimType.class, source = TypeScriptParser.PredefinedPrimTypeContext.class)
    @SubclassMapping(target = QueryPrimType.class, source = TypeScriptParser.QueryPrimTypeContext.class)
    @SubclassMapping(target = RedefinitionOfType.class, source = TypeScriptParser.RedefinitionOfTypeContext.class)
    @SubclassMapping(target = ReferencePrimType.class, source = TypeScriptParser.ReferencePrimTypeContext.class)
    @SubclassMapping(target = ThisPrimType.class, source = TypeScriptParser.ThisPrimTypeContext.class)
    @SubclassMapping(target = TuplePrimType.class, source = TypeScriptParser.TuplePrimTypeContext.class)
    PrimaryType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PrimaryTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Program map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ProgramContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @SubclassMapping(target = ComputedPropertyExpressionAssignment.class, source = TypeScriptParser.ComputedPropertyExpressionAssignmentContext.class)
    @SubclassMapping(target = MethodProperty.class, source = TypeScriptParser.MethodPropertyContext.class)
    @SubclassMapping(target = PropertyExpressionAssignment.class, source = TypeScriptParser.PropertyExpressionAssignmentContext.class)
    @SubclassMapping(target = PropertyGetter.class, source = TypeScriptParser.PropertyGetterContext.class)
    @SubclassMapping(target = PropertySetter.class, source = TypeScriptParser.PropertySetterContext.class)
    @SubclassMapping(target = PropertyShorthand.class, source = TypeScriptParser.PropertyShorthandContext.class)
    @SubclassMapping(target = RestParameterInObject.class, source = TypeScriptParser.RestParameterInObjectContext.class)
    PropertyAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyAssignmentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyDeclarationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyDeclarationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyExpressionAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyExpressionAssignmentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @Mapping(target = "getAccessor", expression = "java(map(item, scannerContext, parserContext.getAccessor()))")
    PropertyGetter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyGetterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyMemberBase map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberBaseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @SubclassMapping(target = AbstractMemberDeclaration.class, source = TypeScriptParser.AbstractMemberDeclarationContext.class)
    @SubclassMapping(target = GetterSetterDeclarationExpression.class, source = TypeScriptParser.GetterSetterDeclarationExpressionContext.class)
    @SubclassMapping(target = MethodDeclarationExpression.class, source = TypeScriptParser.MethodDeclarationExpressionContext.class)
    @SubclassMapping(target = PropertyDeclarationExpression.class, source = TypeScriptParser.PropertyDeclarationExpressionContext.class)
    PropertyMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @Mapping(target = "setAccessor", expression = "java(map(item, scannerContext, parserContext.setAccessor()))")
    PropertySetter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertySetterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyShorthand map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyShorthandContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertySignatur map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertySignaturContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    QueryPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.QueryPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RedefinitionOfType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RedefinitionOfTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ReferencePrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReferencePrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RelationalExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RelationalExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RequiredParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RequiredParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ReservedWord map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReservedWordContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RestParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RestParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RestParameterInObject map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RestParameterInObjectContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ReturnStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReturnStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @Mapping(target = "setter", expression = "java(map(item, scannerContext, parserContext.setter()))")
    SetAccessor map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SetAccessorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Setter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SetterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @SubclassMapping(target = AdditiveExpression.class, source = TypeScriptParser.AdditiveExpressionContext.class)
    @SubclassMapping(target = ArgumentsExpression.class, source = TypeScriptParser.ArgumentsExpressionContext.class)
    @SubclassMapping(target = ArrayLiteralExpression.class, source = TypeScriptParser.ArrayLiteralExpressionContext.class)
    @SubclassMapping(target = ArrowFunctionExpression.class, source = TypeScriptParser.ArrowFunctionExpressionContext.class)
    @SubclassMapping(target = AssignmentExpression.class, source = TypeScriptParser.AssignmentExpressionContext.class)
    @SubclassMapping(target = AssignmentOperatorExpression.class, source = TypeScriptParser.AssignmentOperatorExpressionContext.class)
    @SubclassMapping(target = BitAndExpression.class, source = TypeScriptParser.BitAndExpressionContext.class)
    @SubclassMapping(target = BitNotExpression.class, source = TypeScriptParser.BitNotExpressionContext.class)
    @SubclassMapping(target = BitOrExpression.class, source = TypeScriptParser.BitOrExpressionContext.class)
    @SubclassMapping(target = BitShiftExpression.class, source = TypeScriptParser.BitShiftExpressionContext.class)
    @SubclassMapping(target = BitXOrExpression.class, source = TypeScriptParser.BitXOrExpressionContext.class)
    @SubclassMapping(target = CastAsExpression.class, source = TypeScriptParser.CastAsExpressionContext.class)
    @SubclassMapping(target = ClassExpression.class, source = TypeScriptParser.ClassExpressionContext.class)
    @SubclassMapping(target = DeleteExpression.class, source = TypeScriptParser.DeleteExpressionContext.class)
    @SubclassMapping(target = EqualityExpression.class, source = TypeScriptParser.EqualityExpressionContext.class)
    @SubclassMapping(target = FunctionExpression.class, source = TypeScriptParser.FunctionExpressionContext.class)
    @SubclassMapping(target = GeneratorsExpression.class, source = TypeScriptParser.GeneratorsExpressionContext.class)
    @SubclassMapping(target = GeneratorsFunctionExpression.class, source = TypeScriptParser.GeneratorsFunctionExpressionContext.class)
    @SubclassMapping(target = GenericTypes.class, source = TypeScriptParser.GenericTypesContext.class)
    @SubclassMapping(target = IdentifierExpression.class, source = TypeScriptParser.IdentifierExpressionContext.class)
    @SubclassMapping(target = InExpression.class, source = TypeScriptParser.InExpressionContext.class)
    @SubclassMapping(target = InstanceofExpression.class, source = TypeScriptParser.InstanceofExpressionContext.class)
    @SubclassMapping(target = IteratorsExpression.class, source = TypeScriptParser.IteratorsExpressionContext.class)
    @SubclassMapping(target = LiteralExpression.class, source = TypeScriptParser.LiteralExpressionContext.class)
    @SubclassMapping(target = LogicalAndExpression.class, source = TypeScriptParser.LogicalAndExpressionContext.class)
    @SubclassMapping(target = LogicalOrExpression.class, source = TypeScriptParser.LogicalOrExpressionContext.class)
    @SubclassMapping(target = MemberDotExpression.class, source = TypeScriptParser.MemberDotExpressionContext.class)
    @SubclassMapping(target = MemberIndexExpression.class, source = TypeScriptParser.MemberIndexExpressionContext.class)
    @SubclassMapping(target = MultiplicativeExpression.class, source = TypeScriptParser.MultiplicativeExpressionContext.class)
    @SubclassMapping(target = NewExpression.class, source = TypeScriptParser.NewExpressionContext.class)
    @SubclassMapping(target = NotExpression.class, source = TypeScriptParser.NotExpressionContext.class)
    @SubclassMapping(target = ObjectLiteralExpression.class, source = TypeScriptParser.ObjectLiteralExpressionContext.class)
    @SubclassMapping(target = ParenthesizedExpression.class, source = TypeScriptParser.ParenthesizedExpressionContext.class)
    @SubclassMapping(target = PostDecreaseExpression.class, source = TypeScriptParser.PostDecreaseExpressionContext.class)
    @SubclassMapping(target = PostIncrementExpression.class, source = TypeScriptParser.PostIncrementExpressionContext.class)
    @SubclassMapping(target = PreDecreaseExpression.class, source = TypeScriptParser.PreDecreaseExpressionContext.class)
    @SubclassMapping(target = PreIncrementExpression.class, source = TypeScriptParser.PreIncrementExpressionContext.class)
    @SubclassMapping(target = RelationalExpression.class, source = TypeScriptParser.RelationalExpressionContext.class)
    @SubclassMapping(target = SuperExpression.class, source = TypeScriptParser.SuperExpressionContext.class)
    @SubclassMapping(target = TemplateStringExpression.class, source = TypeScriptParser.TemplateStringExpressionContext.class)
    @SubclassMapping(target = TernaryExpression.class, source = TypeScriptParser.TernaryExpressionContext.class)
    @SubclassMapping(target = ThisExpression.class, source = TypeScriptParser.ThisExpressionContext.class)
    @SubclassMapping(target = TypeofExpression.class, source = TypeScriptParser.TypeofExpressionContext.class)
    @SubclassMapping(target = UnaryMinusExpression.class, source = TypeScriptParser.UnaryMinusExpressionContext.class)
    @SubclassMapping(target = UnaryPlusExpression.class, source = TypeScriptParser.UnaryPlusExpressionContext.class)
    @SubclassMapping(target = VoidExpression.class, source = TypeScriptParser.VoidExpressionContext.class)
    @SubclassMapping(target = YieldExpression.class, source = TypeScriptParser.YieldExpressionContext.class)
    SingleExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SingleExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SourceElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SourceElementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SourceElements map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SourceElementsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Statement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.StatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    StatementList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.StatementListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SuperExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SuperExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SwitchStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SwitchStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TemplateStringAtom map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringAtomContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TemplateStringExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TemplateStringLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringLiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TernaryExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TernaryExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ThisExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ThisExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ThisPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ThisPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ThrowStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ThrowStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TryStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TryStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TupleElementTypes map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TupleElementTypesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TuplePrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TuplePrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TupleType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TupleTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeAliasDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeAliasDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeAnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArgument map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArguments map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeGeneric map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeGenericContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeIncludeGeneric map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeIncludeGenericContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeMember map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeMemberList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeQuery map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeQueryExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeReference map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeReferenceContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Type_ map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.Type_Context parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeofExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeofExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnaryMinusExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnaryMinusExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnaryPlusExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnaryPlusExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Union map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    @SubclassMapping(target = Intersection.class, source = TypeScriptParser.IntersectionContext.class)
    @SubclassMapping(target = Primary.class, source = TypeScriptParser.PrimaryContext.class)
    @SubclassMapping(target = Union.class, source = TypeScriptParser.UnionContext.class)
    UnionOrIntersectionOrPrimaryType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnionOrIntersectionOrPrimaryTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VarModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VarModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableDeclarationList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VariableStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VoidExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VoidExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    WhileStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.WhileStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    WithStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.WithStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    YieldExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.YieldExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    YieldStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.YieldStatementContext parserContext);
}
