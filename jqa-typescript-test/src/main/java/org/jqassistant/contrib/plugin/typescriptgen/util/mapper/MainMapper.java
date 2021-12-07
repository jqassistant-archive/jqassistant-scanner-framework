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
        String code = "mapSourceCode ERROR: ";
        try {
            code = parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex()));
            return code.indexOf("\n") == -1 ? code : code.substring(0, code.indexOf("\n"));
        } catch (Exception e) {
            return code + e.getMessage();
        }
    }

    default TerminalNodeStrings map(@Context() ScannerContext scannerContext, TerminalNode terminalNode) {
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
    AccessibilityModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AccessibilityModifierContext parserContext);

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
    ArrayElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayElementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayLiteralContext parserContext);

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
    ArrowFunctionParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AsExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AssignmentOperator map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentOperatorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BindingPattern map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BindingPatternContext parserContext);

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
    CatchProduction map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CatchProductionContext parserContext);

    @Mapping(target = "clazz", expression = "java(map(scannerContext, parserContext.Class()))")
    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassElementContext parserContext);

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
    GetAccessor map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetAccessorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Getter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetterContext parserContext);

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
    IndexMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IndexMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IndexSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IndexSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Initializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InterfaceDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceExtendsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InterfaceExtendsClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IterationStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IterationStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IteratorBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IteratorDefinition map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorDefinitionContext parserContext);

    @Mapping(target = "clazz", expression = "java(map(scannerContext, parserContext.Class()))")
    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
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
    MethodSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodSignatureContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MultipleImportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MultipleImportStatementContext parserContext);

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
    NumericLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NumericLiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ObjectLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectLiteralContext parserContext);

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
    PredefinedType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PredefinedTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PrimaryTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Program map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ProgramContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyAssignmentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyMemberBase map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberBaseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertySignatur map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertySignaturContext parserContext);

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
    ReturnStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReturnStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SetAccessor map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SetAccessorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Setter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SetterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
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
    SwitchStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SwitchStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TemplateStringAtom map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringAtomContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TemplateStringLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringLiteralContext parserContext);

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
    WithStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.WithStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    YieldStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.YieldStatementContext parserContext);
}
