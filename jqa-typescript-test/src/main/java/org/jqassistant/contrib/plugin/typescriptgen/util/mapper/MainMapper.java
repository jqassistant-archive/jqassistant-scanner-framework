//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.util.mapper;

import org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser;
import org.jqassistant.contrib.plugin.typescriptgen.api.*;
import org.jqassistant.contrib.plugin.typescriptgen.api.model.generated.*;
import org.mapstruct.*;
import org.slf4j.*;
import org.mapstruct.factory.Mappers;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import javax.annotation.Generated;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(uses = DescriptorFactory.class, unmappedTargetPolicy = ReportingPolicy.WARN, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
public interface MainMapper {

    public static final MainMapper INSTANCE = Mappers.getMapper(MainMapper.class);

    public static final Logger LOGGER = LoggerFactory.getLogger(MainMapper.class);

    @AfterMapping()
    default void mapBaseDescriptor(@Context() FileResource item, ParserRuleContext parserContext, @MappingTarget() org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST target) {
        try {
            target.setFileName(item.getFile().getAbsolutePath());
            target.setSourceCode(parserContext.exception != null ? parserContext.exception.toString() : parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex())));
            target.setSourcePosition(parserContext.getStart().getLine() + ":" + (parserContext.getStart().getCharPositionInLine() + 1) + " to " + parserContext.getStop().getLine() + ":" + (parserContext.getStop().getCharPositionInLine() + 1));
        } catch (Exception ex) {
            LOGGER.error("mapBaseDescriptor ERROR: " + ex.getMessage());
        }
    }

    default TerminalNodeStrings map(@Context() FileResource item, @Context() ScannerContext scannerContext, TerminalNode terminalNode) {
        return map(scannerContext, terminalNode == null ? null : terminalNode.getSymbol());
    }

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", source = "text")
    TerminalNodeStrings map(@Context() ScannerContext scannerContext, Token symbol);

    String map(CharStream value);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    AbstractDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AbstractDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    AbstractMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AbstractMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    AccessibilityModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AccessibilityModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    AdditiveExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AdditiveExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Argument map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Arguments map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArgumentsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArrayElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayElementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArrayLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayLiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArrayLiteralExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayLiteralExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArrayPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArrayType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArrowFunctionBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArrowFunctionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArrowFunctionExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ArrowFunctionParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    AsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    AssignmentExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    AssignmentOperator map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentOperatorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    AssignmentOperatorExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentOperatorExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    BindingPattern map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BindingPatternContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    BitAndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitAndExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    BitNotExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitNotExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    BitOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    BitShiftExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitShiftExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    BitXOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitXOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Block map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    BreakStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BreakStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    CallSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CallSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    CaseBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CaseBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    CaseClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CaseClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    CaseClauses map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CaseClausesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    CastAsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CastAsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    CatchProduction map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CatchProductionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "clazz", expression = "java(map(item, scannerContext, parserContext.Class()))")
    ClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ClassElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassElementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "clazz", expression = "java(map(item, scannerContext, parserContext.Class()))")
    ClassExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ClassExtendsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassExtendsClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ClassHeritage map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassHeritageContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ClassOrInterfaceTypeList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassOrInterfaceTypeListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ClassTail map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassTailContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ComputedPropertyExpressionAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ComputedPropertyExpressionAssignmentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Constraint map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstraintContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ConstructSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstructSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ConstructorDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstructorDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ConstructorType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstructorTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ContinueStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ContinueStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    DebuggerStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DebuggerStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Decorator map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    DecoratorCallExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorCallExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    DecoratorList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    DecoratorMemberExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorMemberExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    DefaultClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DefaultClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    DeleteExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DeleteExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    DoStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DoStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ElementList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ElementListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    EmptyStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EmptyStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    EnumBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    EnumDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    EnumMember map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    EnumMemberList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Eos map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EosContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    EqualityExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EqualityExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ExportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ExportStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ExpressionSequence map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ExpressionSequenceContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ExpressionStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ExpressionStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    FinallyProduction map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FinallyProductionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ForInStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForInStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ForVarInStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForVarInStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ForVarStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForVarStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    FormalParameterArg map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterArgContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    FormalParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    FromBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FromBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    FunctionBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    FunctionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    FunctionExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    FunctionExpressionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionExpressionDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    FunctionType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    GeneratorBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    GeneratorDefinition map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorDefinitionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    GeneratorFunctionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorFunctionDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    GeneratorMethod map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorMethodContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    GeneratorsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    GeneratorsFunctionExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorsFunctionExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    GenericTypes map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GenericTypesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "getter", expression = "java(map(item, scannerContext, parserContext.getter()))")
    GetAccessor map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetAccessorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Getter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "getAccessor", expression = "java(map(item, scannerContext, parserContext.getAccessor()))")
    @Mapping(target = "setAccessor", expression = "java(map(item, scannerContext, parserContext.setAccessor()))")
    GetterSetterDeclarationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetterSetterDeclarationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IdentifierExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IdentifierName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IdentifierOrKeyWord map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrKeyWordContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IdentifierOrPattern map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrPatternContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IfStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IfStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ImplementsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImplementsClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ImportAliasDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImportAliasDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ImportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImportStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    InExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IndexMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IndexMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IndexSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IndexSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Initializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    InstanceofExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InstanceofExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    InterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InterfaceDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    InterfaceExtendsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InterfaceExtendsClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Intersection map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IntersectionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @SubclassMapping(target = DoStatement.class, source = TypeScriptParser.DoStatementContext.class)
    @SubclassMapping(target = ForInStatement.class, source = TypeScriptParser.ForInStatementContext.class)
    @SubclassMapping(target = ForStatement.class, source = TypeScriptParser.ForStatementContext.class)
    @SubclassMapping(target = ForVarInStatement.class, source = TypeScriptParser.ForVarInStatementContext.class)
    @SubclassMapping(target = ForVarStatement.class, source = TypeScriptParser.ForVarStatementContext.class)
    @SubclassMapping(target = WhileStatement.class, source = TypeScriptParser.WhileStatementContext.class)
    IterationStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IterationStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IteratorBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IteratorDefinition map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorDefinitionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    IteratorsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "clazz", expression = "java(map(item, scannerContext, parserContext.Class()))")
    Keyword map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.KeywordContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    LabelledStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LabelledStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    LastFormalParameterArg map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LastFormalParameterArgContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Literal map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    LiteralExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LiteralExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    LogicalAndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LogicalAndExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    LogicalOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LogicalOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    MemberDotExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MemberDotExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    MemberIndexExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MemberIndexExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    MethodDeclarationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodDeclarationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    MethodProperty map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodPropertyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    MethodSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    MultipleImportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MultipleImportStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    MultiplicativeExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MultiplicativeExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    NamespaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NamespaceDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    NamespaceName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NamespaceNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    NestedTypeGeneric map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NestedTypeGenericContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    NewExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NewExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    NotExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NotExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    NumericLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NumericLiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ObjectLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectLiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ObjectLiteralExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectLiteralExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ObjectPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ObjectType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    OptionalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.OptionalParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Parameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ParenthesizedExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParenthesizedExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ParenthesizedPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParenthesizedPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PostDecreaseExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PostDecreaseExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PostIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PostIncrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PreDecreaseExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PreDecreaseExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PreIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PreIncrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PredefinedPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PredefinedPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PredefinedType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PredefinedTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PrimaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
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
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Program map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ProgramContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @SubclassMapping(target = ComputedPropertyExpressionAssignment.class, source = TypeScriptParser.ComputedPropertyExpressionAssignmentContext.class)
    @SubclassMapping(target = MethodProperty.class, source = TypeScriptParser.MethodPropertyContext.class)
    @SubclassMapping(target = PropertyExpressionAssignment.class, source = TypeScriptParser.PropertyExpressionAssignmentContext.class)
    @SubclassMapping(target = PropertyGetter.class, source = TypeScriptParser.PropertyGetterContext.class)
    @SubclassMapping(target = PropertySetter.class, source = TypeScriptParser.PropertySetterContext.class)
    @SubclassMapping(target = PropertyShorthand.class, source = TypeScriptParser.PropertyShorthandContext.class)
    @SubclassMapping(target = RestParameterInObject.class, source = TypeScriptParser.RestParameterInObjectContext.class)
    PropertyAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyAssignmentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PropertyDeclarationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyDeclarationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PropertyExpressionAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyExpressionAssignmentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "getAccessor", expression = "java(map(item, scannerContext, parserContext.getAccessor()))")
    PropertyGetter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyGetterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PropertyMemberBase map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberBaseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @SubclassMapping(target = AbstractMemberDeclaration.class, source = TypeScriptParser.AbstractMemberDeclarationContext.class)
    @SubclassMapping(target = GetterSetterDeclarationExpression.class, source = TypeScriptParser.GetterSetterDeclarationExpressionContext.class)
    @SubclassMapping(target = MethodDeclarationExpression.class, source = TypeScriptParser.MethodDeclarationExpressionContext.class)
    @SubclassMapping(target = PropertyDeclarationExpression.class, source = TypeScriptParser.PropertyDeclarationExpressionContext.class)
    PropertyMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PropertyName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "setAccessor", expression = "java(map(item, scannerContext, parserContext.setAccessor()))")
    PropertySetter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertySetterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PropertyShorthand map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyShorthandContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    PropertySignatur map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertySignaturContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    QueryPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.QueryPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    RedefinitionOfType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RedefinitionOfTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ReferencePrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReferencePrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    RelationalExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RelationalExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    RequiredParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    RequiredParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ReservedWord map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReservedWordContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    RestParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RestParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    RestParameterInObject map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RestParameterInObjectContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ReturnStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReturnStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "setter", expression = "java(map(item, scannerContext, parserContext.setter()))")
    SetAccessor map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SetAccessorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Setter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SetterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
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
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    SourceElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SourceElementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    SourceElements map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SourceElementsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Statement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.StatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    StatementList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.StatementListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    SuperExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SuperExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    SwitchStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SwitchStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TemplateStringAtom map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringAtomContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TemplateStringExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TemplateStringLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringLiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TernaryExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TernaryExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ThisExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ThisExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ThisPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ThisPrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    ThrowStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ThrowStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TryStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TryStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TupleElementTypes map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TupleElementTypesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TuplePrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TuplePrimTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TupleType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TupleTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeAliasDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeAliasDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeAnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeArgument map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeArguments map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeGeneric map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeGenericContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeIncludeGeneric map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeIncludeGenericContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeMember map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeMemberList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeQuery map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeQueryExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeReference map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeReferenceContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Type_ map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.Type_Context parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    TypeofExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeofExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    UnaryMinusExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnaryMinusExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    UnaryPlusExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnaryPlusExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    Union map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @SubclassMapping(target = Intersection.class, source = TypeScriptParser.IntersectionContext.class)
    @SubclassMapping(target = Primary.class, source = TypeScriptParser.PrimaryContext.class)
    @SubclassMapping(target = Union.class, source = TypeScriptParser.UnionContext.class)
    UnionOrIntersectionOrPrimaryType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnionOrIntersectionOrPrimaryTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    VarModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VarModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    VariableDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    VariableDeclarationList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    VariableStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VariableStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    VoidExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VoidExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    WhileStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.WhileStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    WithStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.WithStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    YieldExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.YieldExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    YieldStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.YieldStatementContext parserContext);
}
