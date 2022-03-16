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

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(config = CommonMappingConfig.class)
public interface MainMapper {

    public static final MainMapper INSTANCE = Mappers.getMapper(MainMapper.class);

    public static final Logger LOGGER = LoggerFactory.getLogger(MainMapper.class);

    @AfterMapping()
    default void mapBaseDescriptor(@Context() FileResource item, ParserRuleContext parserContext, @MappingTarget() TypeScriptGenAST target) {
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

    AbstractDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AbstractDeclarationContext parserContext);

    AbstractMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AbstractMemberDeclarationContext parserContext);

    AccessibilityModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AccessibilityModifierContext parserContext);

    AdditiveExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AdditiveExpressionContext parserContext);

    AliasName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AliasNameContext parserContext);

    Argument map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentContext parserContext);

    ArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentListContext parserContext);

    Arguments map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentsContext parserContext);

    ArgumentsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArgumentsExpressionContext parserContext);

    ArrayElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayElementContext parserContext);

    ArrayLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayLiteralContext parserContext);

    ArrayLiteralExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayLiteralExpressionContext parserContext);

    ArrayPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayPrimTypeContext parserContext);

    ArrayType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrayTypeContext parserContext);

    ArrowFunctionBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionBodyContext parserContext);

    ArrowFunctionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionDeclarationContext parserContext);

    ArrowFunctionExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionExpressionContext parserContext);

    ArrowFunctionParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ArrowFunctionParametersContext parserContext);

    AsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AsExpressionContext parserContext);

    AssignmentExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentExpressionContext parserContext);

    AssignmentOperator map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentOperatorContext parserContext);

    AssignmentOperatorExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.AssignmentOperatorExpressionContext parserContext);

    BindingPattern map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BindingPatternContext parserContext);

    BitAndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitAndExpressionContext parserContext);

    BitNotExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitNotExpressionContext parserContext);

    BitOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitOrExpressionContext parserContext);

    BitShiftExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitShiftExpressionContext parserContext);

    BitXOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BitXOrExpressionContext parserContext);

    Block map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BlockContext parserContext);

    BreakStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.BreakStatementContext parserContext);

    CallSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CallSignatureContext parserContext);

    CaseBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CaseBlockContext parserContext);

    CaseClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CaseClauseContext parserContext);

    CaseClauses map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CaseClausesContext parserContext);

    CastAsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CastAsExpressionContext parserContext);

    CatchProduction map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.CatchProductionContext parserContext);

    @Mapping(target = "clazz", expression = "java(map(item, scannerContext, parserContext.Class()))")
    ClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassDeclarationContext parserContext);

    ClassElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassElementContext parserContext);

    @Mapping(target = "clazz", expression = "java(map(item, scannerContext, parserContext.Class()))")
    ClassExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassExpressionContext parserContext);

    ClassExtendsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassExtendsClauseContext parserContext);

    ClassHeritage map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassHeritageContext parserContext);

    ClassOrInterfaceTypeList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassOrInterfaceTypeListContext parserContext);

    ClassTail map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ClassTailContext parserContext);

    ComputedPropertyExpressionAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ComputedPropertyExpressionAssignmentContext parserContext);

    Constraint map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstraintContext parserContext);

    ConstructSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstructSignatureContext parserContext);

    ConstructorDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstructorDeclarationContext parserContext);

    ConstructorType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ConstructorTypeContext parserContext);

    ContinueStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ContinueStatementContext parserContext);

    DebuggerStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DebuggerStatementContext parserContext);

    Decorator map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorContext parserContext);

    DecoratorCallExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorCallExpressionContext parserContext);

    DecoratorList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorListContext parserContext);

    DecoratorMemberExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DecoratorMemberExpressionContext parserContext);

    DefaultClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DefaultClauseContext parserContext);

    DeleteExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DeleteExpressionContext parserContext);

    DoStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.DoStatementContext parserContext);

    ElementList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ElementListContext parserContext);

    EmptyStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EmptyStatementContext parserContext);

    EnumBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumBodyContext parserContext);

    EnumDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumDeclarationContext parserContext);

    EnumMember map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberContext parserContext);

    EnumMemberList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EnumMemberListContext parserContext);

    Eos map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EosContext parserContext);

    EqualityExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.EqualityExpressionContext parserContext);

    ExportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ExportStatementContext parserContext);

    ExpressionSequence map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ExpressionSequenceContext parserContext);

    ExpressionStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ExpressionStatementContext parserContext);

    FinallyProduction map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FinallyProductionContext parserContext);

    ForInStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForInStatementContext parserContext);

    ForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForStatementContext parserContext);

    ForVarInStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForVarInStatementContext parserContext);

    ForVarStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ForVarStatementContext parserContext);

    FormalParameterArg map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterArgContext parserContext);

    FormalParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FormalParameterListContext parserContext);

    FromBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FromBlockContext parserContext);

    FunctionBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionBodyContext parserContext);

    FunctionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionDeclarationContext parserContext);

    FunctionExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionExpressionContext parserContext);

    FunctionExpressionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionExpressionDeclarationContext parserContext);

    FunctionType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.FunctionTypeContext parserContext);

    GeneratorBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorBlockContext parserContext);

    GeneratorDefinition map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorDefinitionContext parserContext);

    GeneratorFunctionDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorFunctionDeclarationContext parserContext);

    GeneratorMethod map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorMethodContext parserContext);

    GeneratorsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorsExpressionContext parserContext);

    GeneratorsFunctionExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GeneratorsFunctionExpressionContext parserContext);

    GenericTypes map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GenericTypesContext parserContext);

    @Mapping(target = "getter", expression = "java(map(item, scannerContext, parserContext.getter()))")
    GetAccessor map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetAccessorContext parserContext);

    Getter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetterContext parserContext);

    @Mapping(target = "getAccessor", expression = "java(map(item, scannerContext, parserContext.getAccessor()))")
    @Mapping(target = "setAccessor", expression = "java(map(item, scannerContext, parserContext.setAccessor()))")
    GetterSetterDeclarationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.GetterSetterDeclarationExpressionContext parserContext);

    IdentifierExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierExpressionContext parserContext);

    IdentifierName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierNameContext parserContext);

    IdentifierOrKeyWord map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrKeyWordContext parserContext);

    IdentifierOrPattern map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IdentifierOrPatternContext parserContext);

    IfStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IfStatementContext parserContext);

    ImplementsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImplementsClauseContext parserContext);

    ImportAliasDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImportAliasDeclarationContext parserContext);

    ImportAsDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImportAsDeclarationContext parserContext);

    ImportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ImportStatementContext parserContext);

    InExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InExpressionContext parserContext);

    IndexMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IndexMemberDeclarationContext parserContext);

    IndexSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IndexSignatureContext parserContext);

    Initializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InitializerContext parserContext);

    InstanceofExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InstanceofExpressionContext parserContext);

    InterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InterfaceDeclarationContext parserContext);

    InterfaceExtendsClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.InterfaceExtendsClauseContext parserContext);

    Intersection map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IntersectionContext parserContext);

    @SubclassMapping(target = DoStatement.class, source = TypeScriptParser.DoStatementContext.class)
    @SubclassMapping(target = ForInStatement.class, source = TypeScriptParser.ForInStatementContext.class)
    @SubclassMapping(target = ForStatement.class, source = TypeScriptParser.ForStatementContext.class)
    @SubclassMapping(target = ForVarInStatement.class, source = TypeScriptParser.ForVarInStatementContext.class)
    @SubclassMapping(target = ForVarStatement.class, source = TypeScriptParser.ForVarStatementContext.class)
    @SubclassMapping(target = WhileStatement.class, source = TypeScriptParser.WhileStatementContext.class)
    IterationStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IterationStatementContext parserContext);

    IteratorBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorBlockContext parserContext);

    IteratorDefinition map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorDefinitionContext parserContext);

    IteratorsExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.IteratorsExpressionContext parserContext);

    @Mapping(target = "clazz", expression = "java(map(item, scannerContext, parserContext.Class()))")
    Keyword map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.KeywordContext parserContext);

    LabelledStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LabelledStatementContext parserContext);

    LastFormalParameterArg map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LastFormalParameterArgContext parserContext);

    Literal map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LiteralContext parserContext);

    LiteralExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LiteralExpressionContext parserContext);

    LogicalAndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LogicalAndExpressionContext parserContext);

    LogicalOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.LogicalOrExpressionContext parserContext);

    MemberDotExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MemberDotExpressionContext parserContext);

    MemberIndexExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MemberIndexExpressionContext parserContext);

    MethodDeclarationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodDeclarationExpressionContext parserContext);

    MethodProperty map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodPropertyContext parserContext);

    MethodSignature map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MethodSignatureContext parserContext);

    MultipleImportStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MultipleImportStatementContext parserContext);

    MultiplicativeExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.MultiplicativeExpressionContext parserContext);

    NamespaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NamespaceDeclarationContext parserContext);

    NamespaceName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NamespaceNameContext parserContext);

    NestedTypeGeneric map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NestedTypeGenericContext parserContext);

    NewExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NewExpressionContext parserContext);

    NotExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NotExpressionContext parserContext);

    NumericLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.NumericLiteralContext parserContext);

    ObjectLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectLiteralContext parserContext);

    ObjectLiteralExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectLiteralExpressionContext parserContext);

    ObjectPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectPrimTypeContext parserContext);

    ObjectType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ObjectTypeContext parserContext);

    OptionalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.OptionalParameterContext parserContext);

    Parameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParameterContext parserContext);

    ParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParameterListContext parserContext);

    ParenthesizedExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParenthesizedExpressionContext parserContext);

    ParenthesizedPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ParenthesizedPrimTypeContext parserContext);

    PostDecreaseExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PostDecreaseExpressionContext parserContext);

    PostIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PostIncrementExpressionContext parserContext);

    PreDecreaseExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PreDecreaseExpressionContext parserContext);

    PreIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PreIncrementExpressionContext parserContext);

    PredefinedPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PredefinedPrimTypeContext parserContext);

    PredefinedType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PredefinedTypeContext parserContext);

    Primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PrimaryContext parserContext);

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

    Program map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ProgramContext parserContext);

    @SubclassMapping(target = ComputedPropertyExpressionAssignment.class, source = TypeScriptParser.ComputedPropertyExpressionAssignmentContext.class)
    @SubclassMapping(target = MethodProperty.class, source = TypeScriptParser.MethodPropertyContext.class)
    @SubclassMapping(target = PropertyExpressionAssignment.class, source = TypeScriptParser.PropertyExpressionAssignmentContext.class)
    @SubclassMapping(target = PropertyGetter.class, source = TypeScriptParser.PropertyGetterContext.class)
    @SubclassMapping(target = PropertySetter.class, source = TypeScriptParser.PropertySetterContext.class)
    @SubclassMapping(target = PropertyShorthand.class, source = TypeScriptParser.PropertyShorthandContext.class)
    @SubclassMapping(target = RestParameterInObject.class, source = TypeScriptParser.RestParameterInObjectContext.class)
    PropertyAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyAssignmentContext parserContext);

    PropertyDeclarationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyDeclarationExpressionContext parserContext);

    PropertyExpressionAssignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyExpressionAssignmentContext parserContext);

    @Mapping(target = "getAccessor", expression = "java(map(item, scannerContext, parserContext.getAccessor()))")
    PropertyGetter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyGetterContext parserContext);

    PropertyMemberBase map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberBaseContext parserContext);

    @SubclassMapping(target = AbstractMemberDeclaration.class, source = TypeScriptParser.AbstractMemberDeclarationContext.class)
    @SubclassMapping(target = GetterSetterDeclarationExpression.class, source = TypeScriptParser.GetterSetterDeclarationExpressionContext.class)
    @SubclassMapping(target = MethodDeclarationExpression.class, source = TypeScriptParser.MethodDeclarationExpressionContext.class)
    @SubclassMapping(target = PropertyDeclarationExpression.class, source = TypeScriptParser.PropertyDeclarationExpressionContext.class)
    PropertyMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyMemberDeclarationContext parserContext);

    PropertyName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyNameContext parserContext);

    @Mapping(target = "setAccessor", expression = "java(map(item, scannerContext, parserContext.setAccessor()))")
    PropertySetter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertySetterContext parserContext);

    PropertyShorthand map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertyShorthandContext parserContext);

    PropertySignatur map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.PropertySignaturContext parserContext);

    QueryPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.QueryPrimTypeContext parserContext);

    RedefinitionOfType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RedefinitionOfTypeContext parserContext);

    ReferencePrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReferencePrimTypeContext parserContext);

    RelationalExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RelationalExpressionContext parserContext);

    RequiredParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterContext parserContext);

    RequiredParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RequiredParameterListContext parserContext);

    ReservedWord map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReservedWordContext parserContext);

    RestParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RestParameterContext parserContext);

    RestParameterInObject map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.RestParameterInObjectContext parserContext);

    ReturnStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ReturnStatementContext parserContext);

    @Mapping(target = "setter", expression = "java(map(item, scannerContext, parserContext.setter()))")
    SetAccessor map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SetAccessorContext parserContext);

    Setter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SetterContext parserContext);

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

    SourceElement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SourceElementContext parserContext);

    SourceElements map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SourceElementsContext parserContext);

    Statement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.StatementContext parserContext);

    StatementList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.StatementListContext parserContext);

    SuperExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SuperExpressionContext parserContext);

    SwitchStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.SwitchStatementContext parserContext);

    TemplateStringAtom map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringAtomContext parserContext);

    TemplateStringExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringExpressionContext parserContext);

    TemplateStringLiteral map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TemplateStringLiteralContext parserContext);

    TernaryExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TernaryExpressionContext parserContext);

    ThisExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ThisExpressionContext parserContext);

    ThisPrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ThisPrimTypeContext parserContext);

    ThrowStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.ThrowStatementContext parserContext);

    TryStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TryStatementContext parserContext);

    TupleElementTypes map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TupleElementTypesContext parserContext);

    TuplePrimType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TuplePrimTypeContext parserContext);

    TupleType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TupleTypeContext parserContext);

    TypeAliasDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeAliasDeclarationContext parserContext);

    TypeAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeAnnotationContext parserContext);

    TypeArgument map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentContext parserContext);

    TypeArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentListContext parserContext);

    TypeArguments map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeArgumentsContext parserContext);

    TypeBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeBodyContext parserContext);

    TypeGeneric map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeGenericContext parserContext);

    TypeIncludeGeneric map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeIncludeGenericContext parserContext);

    TypeMember map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberContext parserContext);

    TypeMemberList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeMemberListContext parserContext);

    TypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeNameContext parserContext);

    TypeParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterContext parserContext);

    TypeParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeParameterListContext parserContext);

    TypeParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeParametersContext parserContext);

    TypeQuery map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryContext parserContext);

    TypeQueryExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeQueryExpressionContext parserContext);

    TypeReference map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeReferenceContext parserContext);

    Type_ map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.Type_Context parserContext);

    TypeofExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.TypeofExpressionContext parserContext);

    UnaryMinusExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnaryMinusExpressionContext parserContext);

    UnaryPlusExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnaryPlusExpressionContext parserContext);

    Union map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnionContext parserContext);

    @SubclassMapping(target = Intersection.class, source = TypeScriptParser.IntersectionContext.class)
    @SubclassMapping(target = Primary.class, source = TypeScriptParser.PrimaryContext.class)
    @SubclassMapping(target = Union.class, source = TypeScriptParser.UnionContext.class)
    UnionOrIntersectionOrPrimaryType map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.UnionOrIntersectionOrPrimaryTypeContext parserContext);

    VarModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VarModifierContext parserContext);

    VariableDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationContext parserContext);

    VariableDeclarationList map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VariableDeclarationListContext parserContext);

    VariableStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VariableStatementContext parserContext);

    VoidExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.VoidExpressionContext parserContext);

    WhileStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.WhileStatementContext parserContext);

    WithStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.WithStatementContext parserContext);

    YieldExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.YieldExpressionContext parserContext);

    YieldStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, TypeScriptParser.YieldStatementContext parserContext);
}
