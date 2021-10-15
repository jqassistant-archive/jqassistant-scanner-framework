//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.util.mapper;

import org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser;
import org.mapstruct.factory.Mappers;
import org.mapstruct.NullValueCheckStrategy;
import org.jqassistant.contrib.plugin.typescriptgen.api.model.*;
import javax.annotation.Generated;
import org.mapstruct.Mapper;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(uses = DescriptorFactory.class, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
public interface MainMapper {

    public static MainMapper INSTANCE = Mappers.getMapper(MainMapper.class);

    AbstractDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.AbstractDeclarationContext parserContext);

    AccessibilityModifier map(@Context() ScannerContext scannerContext, TypeScriptParser.AccessibilityModifierContext parserContext);

    Argument map(@Context() ScannerContext scannerContext, TypeScriptParser.ArgumentContext parserContext);

    ArgumentList map(@Context() ScannerContext scannerContext, TypeScriptParser.ArgumentListContext parserContext);

    Arguments map(@Context() ScannerContext scannerContext, TypeScriptParser.ArgumentsContext parserContext);

    ArrayElement map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrayElementContext parserContext);

    ArrayLiteral map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrayLiteralContext parserContext);

    ArrayType map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrayTypeContext parserContext);

    ArrowFunctionBody map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionBodyContext parserContext);

    ArrowFunctionDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionDeclarationContext parserContext);

    ArrowFunctionParameters map(@Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionParametersContext parserContext);

    AsExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.AsExpressionContext parserContext);

    AssignmentOperator map(@Context() ScannerContext scannerContext, TypeScriptParser.AssignmentOperatorContext parserContext);

    BindingPattern map(@Context() ScannerContext scannerContext, TypeScriptParser.BindingPatternContext parserContext);

    Block map(@Context() ScannerContext scannerContext, TypeScriptParser.BlockContext parserContext);

    BreakStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.BreakStatementContext parserContext);

    CallSignature map(@Context() ScannerContext scannerContext, TypeScriptParser.CallSignatureContext parserContext);

    CaseBlock map(@Context() ScannerContext scannerContext, TypeScriptParser.CaseBlockContext parserContext);

    CaseClause map(@Context() ScannerContext scannerContext, TypeScriptParser.CaseClauseContext parserContext);

    CaseClauses map(@Context() ScannerContext scannerContext, TypeScriptParser.CaseClausesContext parserContext);

    CatchProduction map(@Context() ScannerContext scannerContext, TypeScriptParser.CatchProductionContext parserContext);

    ClassDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassDeclarationContext parserContext);

    ClassElement map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassElementContext parserContext);

    ClassExtendsClause map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassExtendsClauseContext parserContext);

    ClassHeritage map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassHeritageContext parserContext);

    ClassOrInterfaceTypeList map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassOrInterfaceTypeListContext parserContext);

    ClassTail map(@Context() ScannerContext scannerContext, TypeScriptParser.ClassTailContext parserContext);

    Constraint map(@Context() ScannerContext scannerContext, TypeScriptParser.ConstraintContext parserContext);

    ConstructSignature map(@Context() ScannerContext scannerContext, TypeScriptParser.ConstructSignatureContext parserContext);

    ConstructorDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.ConstructorDeclarationContext parserContext);

    ConstructorType map(@Context() ScannerContext scannerContext, TypeScriptParser.ConstructorTypeContext parserContext);

    ContinueStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ContinueStatementContext parserContext);

    DebuggerStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.DebuggerStatementContext parserContext);

    Decorator map(@Context() ScannerContext scannerContext, TypeScriptParser.DecoratorContext parserContext);

    DecoratorCallExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.DecoratorCallExpressionContext parserContext);

    DecoratorList map(@Context() ScannerContext scannerContext, TypeScriptParser.DecoratorListContext parserContext);

    DecoratorMemberExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.DecoratorMemberExpressionContext parserContext);

    DefaultClause map(@Context() ScannerContext scannerContext, TypeScriptParser.DefaultClauseContext parserContext);

    ElementList map(@Context() ScannerContext scannerContext, TypeScriptParser.ElementListContext parserContext);

    EmptyStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.EmptyStatementContext parserContext);

    EnumBody map(@Context() ScannerContext scannerContext, TypeScriptParser.EnumBodyContext parserContext);

    EnumDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.EnumDeclarationContext parserContext);

    EnumMember map(@Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberContext parserContext);

    EnumMemberList map(@Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberListContext parserContext);

    Eos map(@Context() ScannerContext scannerContext, TypeScriptParser.EosContext parserContext);

    ExportStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ExportStatementContext parserContext);

    ExpressionSequence map(@Context() ScannerContext scannerContext, TypeScriptParser.ExpressionSequenceContext parserContext);

    ExpressionStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ExpressionStatementContext parserContext);

    FinallyProduction map(@Context() ScannerContext scannerContext, TypeScriptParser.FinallyProductionContext parserContext);

    FormalParameterArg map(@Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterArgContext parserContext);

    FormalParameterList map(@Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterListContext parserContext);

    FromBlock map(@Context() ScannerContext scannerContext, TypeScriptParser.FromBlockContext parserContext);

    FunctionBody map(@Context() ScannerContext scannerContext, TypeScriptParser.FunctionBodyContext parserContext);

    FunctionDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.FunctionDeclarationContext parserContext);

    FunctionExpressionDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.FunctionExpressionDeclarationContext parserContext);

    FunctionType map(@Context() ScannerContext scannerContext, TypeScriptParser.FunctionTypeContext parserContext);

    GeneratorBlock map(@Context() ScannerContext scannerContext, TypeScriptParser.GeneratorBlockContext parserContext);

    GeneratorDefinition map(@Context() ScannerContext scannerContext, TypeScriptParser.GeneratorDefinitionContext parserContext);

    GeneratorFunctionDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.GeneratorFunctionDeclarationContext parserContext);

    GeneratorMethod map(@Context() ScannerContext scannerContext, TypeScriptParser.GeneratorMethodContext parserContext);

    GetAccessor map(@Context() ScannerContext scannerContext, TypeScriptParser.GetAccessorContext parserContext);

    Getter map(@Context() ScannerContext scannerContext, TypeScriptParser.GetterContext parserContext);

    IdentifierName map(@Context() ScannerContext scannerContext, TypeScriptParser.IdentifierNameContext parserContext);

    IdentifierOrKeyWord map(@Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrKeyWordContext parserContext);

    IdentifierOrPattern map(@Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrPatternContext parserContext);

    IfStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.IfStatementContext parserContext);

    ImplementsClause map(@Context() ScannerContext scannerContext, TypeScriptParser.ImplementsClauseContext parserContext);

    ImportAliasDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.ImportAliasDeclarationContext parserContext);

    ImportStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ImportStatementContext parserContext);

    IndexMemberDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.IndexMemberDeclarationContext parserContext);

    IndexSignature map(@Context() ScannerContext scannerContext, TypeScriptParser.IndexSignatureContext parserContext);

    Initializer map(@Context() ScannerContext scannerContext, TypeScriptParser.InitializerContext parserContext);

    InterfaceDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.InterfaceDeclarationContext parserContext);

    InterfaceExtendsClause map(@Context() ScannerContext scannerContext, TypeScriptParser.InterfaceExtendsClauseContext parserContext);

    IterationStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.IterationStatementContext parserContext);

    IteratorBlock map(@Context() ScannerContext scannerContext, TypeScriptParser.IteratorBlockContext parserContext);

    IteratorDefinition map(@Context() ScannerContext scannerContext, TypeScriptParser.IteratorDefinitionContext parserContext);

    Keyword map(@Context() ScannerContext scannerContext, TypeScriptParser.KeywordContext parserContext);

    LabelledStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.LabelledStatementContext parserContext);

    LastFormalParameterArg map(@Context() ScannerContext scannerContext, TypeScriptParser.LastFormalParameterArgContext parserContext);

    Literal map(@Context() ScannerContext scannerContext, TypeScriptParser.LiteralContext parserContext);

    MethodSignature map(@Context() ScannerContext scannerContext, TypeScriptParser.MethodSignatureContext parserContext);

    MultipleImportStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.MultipleImportStatementContext parserContext);

    NamespaceDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.NamespaceDeclarationContext parserContext);

    NamespaceName map(@Context() ScannerContext scannerContext, TypeScriptParser.NamespaceNameContext parserContext);

    NestedTypeGeneric map(@Context() ScannerContext scannerContext, TypeScriptParser.NestedTypeGenericContext parserContext);

    NumericLiteral map(@Context() ScannerContext scannerContext, TypeScriptParser.NumericLiteralContext parserContext);

    ObjectLiteral map(@Context() ScannerContext scannerContext, TypeScriptParser.ObjectLiteralContext parserContext);

    ObjectType map(@Context() ScannerContext scannerContext, TypeScriptParser.ObjectTypeContext parserContext);

    OptionalParameter map(@Context() ScannerContext scannerContext, TypeScriptParser.OptionalParameterContext parserContext);

    Parameter map(@Context() ScannerContext scannerContext, TypeScriptParser.ParameterContext parserContext);

    ParameterList map(@Context() ScannerContext scannerContext, TypeScriptParser.ParameterListContext parserContext);

    PredefinedType map(@Context() ScannerContext scannerContext, TypeScriptParser.PredefinedTypeContext parserContext);

    PrimaryType map(@Context() ScannerContext scannerContext, TypeScriptParser.PrimaryTypeContext parserContext);

    Program map(@Context() ScannerContext scannerContext, TypeScriptParser.ProgramContext parserContext);

    PropertyAssignment map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertyAssignmentContext parserContext);

    PropertyMemberBase map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberBaseContext parserContext);

    PropertyMemberDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberDeclarationContext parserContext);

    PropertyName map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertyNameContext parserContext);

    PropertySignatur map(@Context() ScannerContext scannerContext, TypeScriptParser.PropertySignaturContext parserContext);

    RequiredParameter map(@Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterContext parserContext);

    RequiredParameterList map(@Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterListContext parserContext);

    ReservedWord map(@Context() ScannerContext scannerContext, TypeScriptParser.ReservedWordContext parserContext);

    RestParameter map(@Context() ScannerContext scannerContext, TypeScriptParser.RestParameterContext parserContext);

    ReturnStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ReturnStatementContext parserContext);

    SetAccessor map(@Context() ScannerContext scannerContext, TypeScriptParser.SetAccessorContext parserContext);

    Setter map(@Context() ScannerContext scannerContext, TypeScriptParser.SetterContext parserContext);

    SingleExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.SingleExpressionContext parserContext);

    SourceElement map(@Context() ScannerContext scannerContext, TypeScriptParser.SourceElementContext parserContext);

    SourceElements map(@Context() ScannerContext scannerContext, TypeScriptParser.SourceElementsContext parserContext);

    Statement map(@Context() ScannerContext scannerContext, TypeScriptParser.StatementContext parserContext);

    StatementList map(@Context() ScannerContext scannerContext, TypeScriptParser.StatementListContext parserContext);

    SwitchStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.SwitchStatementContext parserContext);

    TemplateStringAtom map(@Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringAtomContext parserContext);

    TemplateStringLiteral map(@Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringLiteralContext parserContext);

    ThrowStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.ThrowStatementContext parserContext);

    TryStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.TryStatementContext parserContext);

    TupleElementTypes map(@Context() ScannerContext scannerContext, TypeScriptParser.TupleElementTypesContext parserContext);

    TupleType map(@Context() ScannerContext scannerContext, TypeScriptParser.TupleTypeContext parserContext);

    TypeAliasDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeAliasDeclarationContext parserContext);

    TypeAnnotation map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeAnnotationContext parserContext);

    TypeArgument map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentContext parserContext);

    TypeArgumentList map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentListContext parserContext);

    TypeArguments map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentsContext parserContext);

    TypeBody map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeBodyContext parserContext);

    TypeGeneric map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeGenericContext parserContext);

    TypeIncludeGeneric map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeIncludeGenericContext parserContext);

    TypeMember map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberContext parserContext);

    TypeMemberList map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberListContext parserContext);

    TypeName map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeNameContext parserContext);

    TypeParameter map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterContext parserContext);

    TypeParameterList map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterListContext parserContext);

    TypeParameters map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeParametersContext parserContext);

    TypeQuery map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryContext parserContext);

    TypeQueryExpression map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryExpressionContext parserContext);

    TypeReference map(@Context() ScannerContext scannerContext, TypeScriptParser.TypeReferenceContext parserContext);

    Type_ map(@Context() ScannerContext scannerContext, TypeScriptParser.Type_Context parserContext);

    UnionOrIntersectionOrPrimaryType map(@Context() ScannerContext scannerContext, TypeScriptParser.UnionOrIntersectionOrPrimaryTypeContext parserContext);

    VarModifier map(@Context() ScannerContext scannerContext, TypeScriptParser.VarModifierContext parserContext);

    VariableDeclaration map(@Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationContext parserContext);

    VariableDeclarationList map(@Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationListContext parserContext);

    VariableStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.VariableStatementContext parserContext);

    WithStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.WithStatementContext parserContext);

    YieldStatement map(@Context() ScannerContext scannerContext, TypeScriptParser.YieldStatementContext parserContext);

    default TerminalNodeStrings map(@Context() ScannerContext scannerContext, TerminalNode terminalNode) {
        return map(scannerContext, terminalNode == null ? null : terminalNode.getSymbol());
    }

    TerminalNodeStrings map(@Context() ScannerContext scannerContext, Token symbol);

    String map(CharStream value);
}
