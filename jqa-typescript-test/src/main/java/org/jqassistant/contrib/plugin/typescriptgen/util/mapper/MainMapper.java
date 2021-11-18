//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.util.mapper;

import org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.jqassistant.contrib.plugin.typescriptgen.api.model.*;
import javax.annotation.Generated;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(uses = DescriptorFactory.class, unmappedTargetPolicy = ReportingPolicy.ERROR, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
public interface MainMapper {

    public static MainMapper INSTANCE = Mappers.getMapper(MainMapper.class);

    @Named(value = "mapSourceCode")
    default String mapSourceCode(ParserRuleContext parserContext) {
        String code = parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex()));
        return code.indexOf("\n") == -1 ? code : code.substring(0, code.indexOf("\n"));
    }

    default TerminalNodeStrings map(@Context() ScannerContext scannerContext, TerminalNode terminalNode) {
        return map(scannerContext, terminalNode == null ? null : terminalNode.getSymbol());
    }

    TerminalNodeStrings map(@Context() ScannerContext scannerContext, Token symbol);

    String map(CharStream value);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AbstractDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.AbstractDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AccessibilityModifier map(@Context() ScannerContext scannerContext, TypeScriptParser.AccessibilityModifierContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Argument map(@Context() ScannerContext scannerContext, TypeScriptParser.ArgumentContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArgumentList map(@Context() ScannerContext scannerContext, TypeScriptParser.ArgumentListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Arguments map(@Context() ScannerContext scannerContext, TypeScriptParser.ArgumentsContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayElement map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrayElementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayLiteral map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrayLiteralContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayType map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrayTypeContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrowFunctionBody map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionBodyContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrowFunctionDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrowFunctionParameters map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionParametersContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AsExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.AsExpressionContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AssignmentOperator map(@Context() ScannerContext scannerContext, TypeScriptParser.AssignmentOperatorContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BindingPattern map(@Context() ScannerContext scannerContext, TypeScriptParser.BindingPatternContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Block map(@Context() ScannerContext scannerContext, TypeScriptParser.BlockContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BreakStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.BreakStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CallSignature map(@Context() ScannerContext scannerContext, TypeScriptParser.CallSignatureContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CaseBlock map(@Context() ScannerContext scannerContext, TypeScriptParser.CaseBlockContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CaseClause map(@Context() ScannerContext scannerContext, TypeScriptParser.CaseClauseContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CaseClauses map(@Context() ScannerContext scannerContext, TypeScriptParser.CaseClausesContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CatchProduction map(@Context() ScannerContext scannerContext, TypeScriptParser.CatchProductionContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassElement map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassElementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassExtendsClause map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassExtendsClauseContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassHeritage map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassHeritageContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassOrInterfaceTypeList map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassOrInterfaceTypeListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassTail map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassTailContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Constraint map(@Context() ScannerContext scannerContext, TypeScriptParser.ConstraintContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructSignature map(@Context() ScannerContext scannerContext, TypeScriptParser.ConstructSignatureContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructorDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.ConstructorDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructorType map(@Context() ScannerContext scannerContext, TypeScriptParser.ConstructorTypeContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ContinueStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ContinueStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DebuggerStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.DebuggerStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Decorator map(@Context() ScannerContext scannerContext, TypeScriptParser.DecoratorContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DecoratorCallExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.DecoratorCallExpressionContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DecoratorList map(@Context() ScannerContext scannerContext, TypeScriptParser.DecoratorListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DecoratorMemberExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.DecoratorMemberExpressionContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DefaultClause map(@Context() ScannerContext scannerContext, TypeScriptParser.DefaultClauseContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ElementList map(@Context() ScannerContext scannerContext, TypeScriptParser.ElementListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EmptyStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.EmptyStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumBody map(@Context() ScannerContext scannerContext, TypeScriptParser.EnumBodyContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.EnumDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumMember map(@Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumMemberList map(@Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Eos map(@Context() ScannerContext scannerContext, TypeScriptParser.EosContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExportStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ExportStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExpressionSequence map(@Context() ScannerContext scannerContext, TypeScriptParser.ExpressionSequenceContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExpressionStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ExpressionStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FinallyProduction map(@Context() ScannerContext scannerContext, TypeScriptParser.FinallyProductionContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FormalParameterArg map(@Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterArgContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FormalParameterList map(@Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FromBlock map(@Context() ScannerContext scannerContext, TypeScriptParser.FromBlockContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FunctionBody map(@Context() ScannerContext scannerContext, TypeScriptParser.FunctionBodyContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FunctionDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.FunctionDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FunctionExpressionDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.FunctionExpressionDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FunctionType map(@Context() ScannerContext scannerContext, TypeScriptParser.FunctionTypeContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorBlock map(@Context() ScannerContext scannerContext, TypeScriptParser.GeneratorBlockContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorDefinition map(@Context() ScannerContext scannerContext, TypeScriptParser.GeneratorDefinitionContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorFunctionDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.GeneratorFunctionDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GeneratorMethod map(@Context() ScannerContext scannerContext, TypeScriptParser.GeneratorMethodContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    GetAccessor map(@Context() ScannerContext scannerContext, TypeScriptParser.GetAccessorContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Getter map(@Context() ScannerContext scannerContext, TypeScriptParser.GetterContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IdentifierName map(@Context() ScannerContext scannerContext, TypeScriptParser.IdentifierNameContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IdentifierOrKeyWord map(@Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrKeyWordContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IdentifierOrPattern map(@Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrPatternContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IfStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.IfStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ImplementsClause map(@Context() ScannerContext scannerContext, TypeScriptParser.ImplementsClauseContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ImportAliasDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.ImportAliasDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ImportStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ImportStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IndexMemberDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.IndexMemberDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IndexSignature map(@Context() ScannerContext scannerContext, TypeScriptParser.IndexSignatureContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Initializer map(@Context() ScannerContext scannerContext, TypeScriptParser.InitializerContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.InterfaceDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceExtendsClause map(@Context() ScannerContext scannerContext, TypeScriptParser.InterfaceExtendsClauseContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IterationStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.IterationStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IteratorBlock map(@Context() ScannerContext scannerContext, TypeScriptParser.IteratorBlockContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IteratorDefinition map(@Context() ScannerContext scannerContext, TypeScriptParser.IteratorDefinitionContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Keyword map(@Context() ScannerContext scannerContext, TypeScriptParser.KeywordContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LabelledStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.LabelledStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LastFormalParameterArg map(@Context() ScannerContext scannerContext, TypeScriptParser.LastFormalParameterArgContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Literal map(@Context() ScannerContext scannerContext, TypeScriptParser.LiteralContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodSignature map(@Context() ScannerContext scannerContext, TypeScriptParser.MethodSignatureContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MultipleImportStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.MultipleImportStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NamespaceDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.NamespaceDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NamespaceName map(@Context() ScannerContext scannerContext, TypeScriptParser.NamespaceNameContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NestedTypeGeneric map(@Context() ScannerContext scannerContext, TypeScriptParser.NestedTypeGenericContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NumericLiteral map(@Context() ScannerContext scannerContext, TypeScriptParser.NumericLiteralContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ObjectLiteral map(@Context() ScannerContext scannerContext, TypeScriptParser.ObjectLiteralContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ObjectType map(@Context() ScannerContext scannerContext, TypeScriptParser.ObjectTypeContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    OptionalParameter map(@Context() ScannerContext scannerContext, TypeScriptParser.OptionalParameterContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Parameter map(@Context() ScannerContext scannerContext, TypeScriptParser.ParameterContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ParameterList map(@Context() ScannerContext scannerContext, TypeScriptParser.ParameterListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PredefinedType map(@Context() ScannerContext scannerContext, TypeScriptParser.PredefinedTypeContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryType map(@Context() ScannerContext scannerContext, TypeScriptParser.PrimaryTypeContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Program map(@Context() ScannerContext scannerContext, TypeScriptParser.ProgramContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyAssignment map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertyAssignmentContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyMemberBase map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberBaseContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyMemberDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertyName map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertyNameContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PropertySignatur map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertySignaturContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RequiredParameter map(@Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RequiredParameterList map(@Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ReservedWord map(@Context() ScannerContext scannerContext, TypeScriptParser.ReservedWordContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RestParameter map(@Context() ScannerContext scannerContext, TypeScriptParser.RestParameterContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ReturnStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ReturnStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SetAccessor map(@Context() ScannerContext scannerContext, TypeScriptParser.SetAccessorContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Setter map(@Context() ScannerContext scannerContext, TypeScriptParser.SetterContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SingleExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.SingleExpressionContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SourceElement map(@Context() ScannerContext scannerContext, TypeScriptParser.SourceElementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SourceElements map(@Context() ScannerContext scannerContext, TypeScriptParser.SourceElementsContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Statement map(@Context() ScannerContext scannerContext, TypeScriptParser.StatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    StatementList map(@Context() ScannerContext scannerContext, TypeScriptParser.StatementListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SwitchStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.SwitchStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TemplateStringAtom map(@Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringAtomContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TemplateStringLiteral map(@Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringLiteralContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ThrowStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ThrowStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TryStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.TryStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TupleElementTypes map(@Context() ScannerContext scannerContext, TypeScriptParser.TupleElementTypesContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TupleType map(@Context() ScannerContext scannerContext, TypeScriptParser.TupleTypeContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeAliasDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeAliasDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeAnnotation map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeAnnotationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArgument map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArgumentList map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArguments map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentsContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeBody map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeBodyContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeGeneric map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeGenericContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeIncludeGeneric map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeIncludeGenericContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeMember map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeMemberList map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeName map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeNameContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameter map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameterList map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameters map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeParametersContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeQuery map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeQueryExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryExpressionContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeReference map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeReferenceContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Type_ map(@Context() ScannerContext scannerContext, TypeScriptParser.Type_Context parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnionOrIntersectionOrPrimaryType map(@Context() ScannerContext scannerContext, TypeScriptParser.UnionOrIntersectionOrPrimaryTypeContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VarModifier map(@Context() ScannerContext scannerContext, TypeScriptParser.VarModifierContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableDeclarationList map(@Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationListContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.VariableStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    WithStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.WithStatementContext parserContext);

    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    YieldStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.YieldStatementContext parserContext);
}
