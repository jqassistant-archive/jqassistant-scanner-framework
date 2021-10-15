//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.mapstruct.factory.Mappers;
import org.mapstruct.NullValueCheckStrategy;
import org.jqassistant.contrib.plugin.javagen.api.model.*;
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

    AdditionalBound map(@Context() ScannerContext scannerContext, Java8Parser.AdditionalBoundContext parserContext);

    AdditiveExpression map(@Context() ScannerContext scannerContext, Java8Parser.AdditiveExpressionContext parserContext);

    AmbiguousName map(@Context() ScannerContext scannerContext, Java8Parser.AmbiguousNameContext parserContext);

    AndExpression map(@Context() ScannerContext scannerContext, Java8Parser.AndExpressionContext parserContext);

    Annotation map(@Context() ScannerContext scannerContext, Java8Parser.AnnotationContext parserContext);

    AnnotationTypeBody map(@Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeBodyContext parserContext);

    AnnotationTypeDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeDeclarationContext parserContext);

    AnnotationTypeElementDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeElementDeclarationContext parserContext);

    AnnotationTypeElementModifier map(@Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeElementModifierContext parserContext);

    AnnotationTypeMemberDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeMemberDeclarationContext parserContext);

    ArgumentList map(@Context() ScannerContext scannerContext, Java8Parser.ArgumentListContext parserContext);

    ArrayAccess map(@Context() ScannerContext scannerContext, Java8Parser.ArrayAccessContext parserContext);

    ArrayAccess_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.ArrayAccess_lf_primaryContext parserContext);

    ArrayAccess_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.ArrayAccess_lfno_primaryContext parserContext);

    ArrayCreationExpression map(@Context() ScannerContext scannerContext, Java8Parser.ArrayCreationExpressionContext parserContext);

    ArrayInitializer map(@Context() ScannerContext scannerContext, Java8Parser.ArrayInitializerContext parserContext);

    ArrayType map(@Context() ScannerContext scannerContext, Java8Parser.ArrayTypeContext parserContext);

    AssertStatement map(@Context() ScannerContext scannerContext, Java8Parser.AssertStatementContext parserContext);

    Assignment map(@Context() ScannerContext scannerContext, Java8Parser.AssignmentContext parserContext);

    AssignmentExpression map(@Context() ScannerContext scannerContext, Java8Parser.AssignmentExpressionContext parserContext);

    AssignmentOperator map(@Context() ScannerContext scannerContext, Java8Parser.AssignmentOperatorContext parserContext);

    BasicForStatement map(@Context() ScannerContext scannerContext, Java8Parser.BasicForStatementContext parserContext);

    BasicForStatementNoShortIf map(@Context() ScannerContext scannerContext, Java8Parser.BasicForStatementNoShortIfContext parserContext);

    Block map(@Context() ScannerContext scannerContext, Java8Parser.BlockContext parserContext);

    BlockStatement map(@Context() ScannerContext scannerContext, Java8Parser.BlockStatementContext parserContext);

    BlockStatements map(@Context() ScannerContext scannerContext, Java8Parser.BlockStatementsContext parserContext);

    BreakStatement map(@Context() ScannerContext scannerContext, Java8Parser.BreakStatementContext parserContext);

    CastExpression map(@Context() ScannerContext scannerContext, Java8Parser.CastExpressionContext parserContext);

    CatchClause map(@Context() ScannerContext scannerContext, Java8Parser.CatchClauseContext parserContext);

    CatchFormalParameter map(@Context() ScannerContext scannerContext, Java8Parser.CatchFormalParameterContext parserContext);

    CatchType map(@Context() ScannerContext scannerContext, Java8Parser.CatchTypeContext parserContext);

    Catches map(@Context() ScannerContext scannerContext, Java8Parser.CatchesContext parserContext);

    ClassBody map(@Context() ScannerContext scannerContext, Java8Parser.ClassBodyContext parserContext);

    ClassBodyDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.ClassBodyDeclarationContext parserContext);

    ClassDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.ClassDeclarationContext parserContext);

    ClassInstanceCreationExpression map(@Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpressionContext parserContext);

    ClassInstanceCreationExpression_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpression_lf_primaryContext parserContext);

    ClassInstanceCreationExpression_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext parserContext);

    ClassMemberDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.ClassMemberDeclarationContext parserContext);

    ClassModifier map(@Context() ScannerContext scannerContext, Java8Parser.ClassModifierContext parserContext);

    ClassOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.ClassOrInterfaceTypeContext parserContext);

    ClassType map(@Context() ScannerContext scannerContext, Java8Parser.ClassTypeContext parserContext);

    ClassType_lf_classOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.ClassType_lf_classOrInterfaceTypeContext parserContext);

    ClassType_lfno_classOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.ClassType_lfno_classOrInterfaceTypeContext parserContext);

    CompilationUnit map(@Context() ScannerContext scannerContext, Java8Parser.CompilationUnitContext parserContext);

    ConditionalAndExpression map(@Context() ScannerContext scannerContext, Java8Parser.ConditionalAndExpressionContext parserContext);

    ConditionalExpression map(@Context() ScannerContext scannerContext, Java8Parser.ConditionalExpressionContext parserContext);

    ConditionalOrExpression map(@Context() ScannerContext scannerContext, Java8Parser.ConditionalOrExpressionContext parserContext);

    ConstantDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.ConstantDeclarationContext parserContext);

    ConstantExpression map(@Context() ScannerContext scannerContext, Java8Parser.ConstantExpressionContext parserContext);

    ConstantModifier map(@Context() ScannerContext scannerContext, Java8Parser.ConstantModifierContext parserContext);

    ConstructorBody map(@Context() ScannerContext scannerContext, Java8Parser.ConstructorBodyContext parserContext);

    ConstructorDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.ConstructorDeclarationContext parserContext);

    ConstructorDeclarator map(@Context() ScannerContext scannerContext, Java8Parser.ConstructorDeclaratorContext parserContext);

    ConstructorModifier map(@Context() ScannerContext scannerContext, Java8Parser.ConstructorModifierContext parserContext);

    ContinueStatement map(@Context() ScannerContext scannerContext, Java8Parser.ContinueStatementContext parserContext);

    DefaultValue map(@Context() ScannerContext scannerContext, Java8Parser.DefaultValueContext parserContext);

    DimExpr map(@Context() ScannerContext scannerContext, Java8Parser.DimExprContext parserContext);

    DimExprs map(@Context() ScannerContext scannerContext, Java8Parser.DimExprsContext parserContext);

    Dims map(@Context() ScannerContext scannerContext, Java8Parser.DimsContext parserContext);

    DoStatement map(@Context() ScannerContext scannerContext, Java8Parser.DoStatementContext parserContext);

    ElementValue map(@Context() ScannerContext scannerContext, Java8Parser.ElementValueContext parserContext);

    ElementValueArrayInitializer map(@Context() ScannerContext scannerContext, Java8Parser.ElementValueArrayInitializerContext parserContext);

    ElementValueList map(@Context() ScannerContext scannerContext, Java8Parser.ElementValueListContext parserContext);

    ElementValuePair map(@Context() ScannerContext scannerContext, Java8Parser.ElementValuePairContext parserContext);

    ElementValuePairList map(@Context() ScannerContext scannerContext, Java8Parser.ElementValuePairListContext parserContext);

    EmptyStatement map(@Context() ScannerContext scannerContext, Java8Parser.EmptyStatementContext parserContext);

    EnhancedForStatement map(@Context() ScannerContext scannerContext, Java8Parser.EnhancedForStatementContext parserContext);

    EnhancedForStatementNoShortIf map(@Context() ScannerContext scannerContext, Java8Parser.EnhancedForStatementNoShortIfContext parserContext);

    EnumBody map(@Context() ScannerContext scannerContext, Java8Parser.EnumBodyContext parserContext);

    EnumBodyDeclarations map(@Context() ScannerContext scannerContext, Java8Parser.EnumBodyDeclarationsContext parserContext);

    EnumConstant map(@Context() ScannerContext scannerContext, Java8Parser.EnumConstantContext parserContext);

    EnumConstantList map(@Context() ScannerContext scannerContext, Java8Parser.EnumConstantListContext parserContext);

    EnumConstantModifier map(@Context() ScannerContext scannerContext, Java8Parser.EnumConstantModifierContext parserContext);

    EnumConstantName map(@Context() ScannerContext scannerContext, Java8Parser.EnumConstantNameContext parserContext);

    EnumDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.EnumDeclarationContext parserContext);

    EqualityExpression map(@Context() ScannerContext scannerContext, Java8Parser.EqualityExpressionContext parserContext);

    ExceptionType map(@Context() ScannerContext scannerContext, Java8Parser.ExceptionTypeContext parserContext);

    ExceptionTypeList map(@Context() ScannerContext scannerContext, Java8Parser.ExceptionTypeListContext parserContext);

    ExclusiveOrExpression map(@Context() ScannerContext scannerContext, Java8Parser.ExclusiveOrExpressionContext parserContext);

    ExplicitConstructorInvocation map(@Context() ScannerContext scannerContext, Java8Parser.ExplicitConstructorInvocationContext parserContext);

    Expression map(@Context() ScannerContext scannerContext, Java8Parser.ExpressionContext parserContext);

    ExpressionName map(@Context() ScannerContext scannerContext, Java8Parser.ExpressionNameContext parserContext);

    ExpressionStatement map(@Context() ScannerContext scannerContext, Java8Parser.ExpressionStatementContext parserContext);

    ExtendsInterfaces map(@Context() ScannerContext scannerContext, Java8Parser.ExtendsInterfacesContext parserContext);

    FieldAccess map(@Context() ScannerContext scannerContext, Java8Parser.FieldAccessContext parserContext);

    FieldAccess_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.FieldAccess_lf_primaryContext parserContext);

    FieldAccess_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.FieldAccess_lfno_primaryContext parserContext);

    FieldDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.FieldDeclarationContext parserContext);

    FieldModifier map(@Context() ScannerContext scannerContext, Java8Parser.FieldModifierContext parserContext);

    Finally_ map(@Context() ScannerContext scannerContext, Java8Parser.Finally_Context parserContext);

    FloatingPointType map(@Context() ScannerContext scannerContext, Java8Parser.FloatingPointTypeContext parserContext);

    ForInit map(@Context() ScannerContext scannerContext, Java8Parser.ForInitContext parserContext);

    ForStatement map(@Context() ScannerContext scannerContext, Java8Parser.ForStatementContext parserContext);

    ForStatementNoShortIf map(@Context() ScannerContext scannerContext, Java8Parser.ForStatementNoShortIfContext parserContext);

    ForUpdate map(@Context() ScannerContext scannerContext, Java8Parser.ForUpdateContext parserContext);

    FormalParameter map(@Context() ScannerContext scannerContext, Java8Parser.FormalParameterContext parserContext);

    FormalParameterList map(@Context() ScannerContext scannerContext, Java8Parser.FormalParameterListContext parserContext);

    FormalParameters map(@Context() ScannerContext scannerContext, Java8Parser.FormalParametersContext parserContext);

    IfThenElseStatement map(@Context() ScannerContext scannerContext, Java8Parser.IfThenElseStatementContext parserContext);

    IfThenElseStatementNoShortIf map(@Context() ScannerContext scannerContext, Java8Parser.IfThenElseStatementNoShortIfContext parserContext);

    IfThenStatement map(@Context() ScannerContext scannerContext, Java8Parser.IfThenStatementContext parserContext);

    ImportDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.ImportDeclarationContext parserContext);

    InclusiveOrExpression map(@Context() ScannerContext scannerContext, Java8Parser.InclusiveOrExpressionContext parserContext);

    InferredFormalParameterList map(@Context() ScannerContext scannerContext, Java8Parser.InferredFormalParameterListContext parserContext);

    InstanceInitializer map(@Context() ScannerContext scannerContext, Java8Parser.InstanceInitializerContext parserContext);

    IntegralType map(@Context() ScannerContext scannerContext, Java8Parser.IntegralTypeContext parserContext);

    InterfaceBody map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceBodyContext parserContext);

    InterfaceDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceDeclarationContext parserContext);

    InterfaceMemberDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceMemberDeclarationContext parserContext);

    InterfaceMethodDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceMethodDeclarationContext parserContext);

    InterfaceMethodModifier map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceMethodModifierContext parserContext);

    InterfaceModifier map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceModifierContext parserContext);

    InterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceTypeContext parserContext);

    InterfaceTypeList map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceTypeListContext parserContext);

    InterfaceType_lf_classOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext parserContext);

    InterfaceType_lfno_classOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext parserContext);

    LabeledStatement map(@Context() ScannerContext scannerContext, Java8Parser.LabeledStatementContext parserContext);

    LabeledStatementNoShortIf map(@Context() ScannerContext scannerContext, Java8Parser.LabeledStatementNoShortIfContext parserContext);

    LambdaBody map(@Context() ScannerContext scannerContext, Java8Parser.LambdaBodyContext parserContext);

    LambdaExpression map(@Context() ScannerContext scannerContext, Java8Parser.LambdaExpressionContext parserContext);

    LambdaParameters map(@Context() ScannerContext scannerContext, Java8Parser.LambdaParametersContext parserContext);

    LastFormalParameter map(@Context() ScannerContext scannerContext, Java8Parser.LastFormalParameterContext parserContext);

    LeftHandSide map(@Context() ScannerContext scannerContext, Java8Parser.LeftHandSideContext parserContext);

    Literal map(@Context() ScannerContext scannerContext, Java8Parser.LiteralContext parserContext);

    LocalVariableDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.LocalVariableDeclarationContext parserContext);

    LocalVariableDeclarationStatement map(@Context() ScannerContext scannerContext, Java8Parser.LocalVariableDeclarationStatementContext parserContext);

    MarkerAnnotation map(@Context() ScannerContext scannerContext, Java8Parser.MarkerAnnotationContext parserContext);

    MethodBody map(@Context() ScannerContext scannerContext, Java8Parser.MethodBodyContext parserContext);

    MethodDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.MethodDeclarationContext parserContext);

    MethodDeclarator map(@Context() ScannerContext scannerContext, Java8Parser.MethodDeclaratorContext parserContext);

    MethodHeader map(@Context() ScannerContext scannerContext, Java8Parser.MethodHeaderContext parserContext);

    MethodInvocation map(@Context() ScannerContext scannerContext, Java8Parser.MethodInvocationContext parserContext);

    MethodInvocation_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.MethodInvocation_lf_primaryContext parserContext);

    MethodInvocation_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.MethodInvocation_lfno_primaryContext parserContext);

    MethodModifier map(@Context() ScannerContext scannerContext, Java8Parser.MethodModifierContext parserContext);

    MethodName map(@Context() ScannerContext scannerContext, Java8Parser.MethodNameContext parserContext);

    MethodReference map(@Context() ScannerContext scannerContext, Java8Parser.MethodReferenceContext parserContext);

    MethodReference_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.MethodReference_lf_primaryContext parserContext);

    MethodReference_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.MethodReference_lfno_primaryContext parserContext);

    MultiplicativeExpression map(@Context() ScannerContext scannerContext, Java8Parser.MultiplicativeExpressionContext parserContext);

    NormalAnnotation map(@Context() ScannerContext scannerContext, Java8Parser.NormalAnnotationContext parserContext);

    NormalClassDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.NormalClassDeclarationContext parserContext);

    NormalInterfaceDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.NormalInterfaceDeclarationContext parserContext);

    NumericType map(@Context() ScannerContext scannerContext, Java8Parser.NumericTypeContext parserContext);

    PackageDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.PackageDeclarationContext parserContext);

    PackageModifier map(@Context() ScannerContext scannerContext, Java8Parser.PackageModifierContext parserContext);

    PackageName map(@Context() ScannerContext scannerContext, Java8Parser.PackageNameContext parserContext);

    PackageOrTypeName map(@Context() ScannerContext scannerContext, Java8Parser.PackageOrTypeNameContext parserContext);

    PostDecrementExpression map(@Context() ScannerContext scannerContext, Java8Parser.PostDecrementExpressionContext parserContext);

    PostDecrementExpression_lf_postfixExpression map(@Context() ScannerContext scannerContext, Java8Parser.PostDecrementExpression_lf_postfixExpressionContext parserContext);

    PostIncrementExpression map(@Context() ScannerContext scannerContext, Java8Parser.PostIncrementExpressionContext parserContext);

    PostIncrementExpression_lf_postfixExpression map(@Context() ScannerContext scannerContext, Java8Parser.PostIncrementExpression_lf_postfixExpressionContext parserContext);

    PostfixExpression map(@Context() ScannerContext scannerContext, Java8Parser.PostfixExpressionContext parserContext);

    PreDecrementExpression map(@Context() ScannerContext scannerContext, Java8Parser.PreDecrementExpressionContext parserContext);

    PreIncrementExpression map(@Context() ScannerContext scannerContext, Java8Parser.PreIncrementExpressionContext parserContext);

    Primary map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryContext parserContext);

    PrimaryNoNewArray map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArrayContext parserContext);

    PrimaryNoNewArray_lf_arrayAccess map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext parserContext);

    PrimaryNoNewArray_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primaryContext parserContext);

    PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext parserContext);

    PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext parserContext);

    PrimaryNoNewArray_lfno_arrayAccess map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext parserContext);

    PrimaryNoNewArray_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primaryContext parserContext);

    PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext parserContext);

    PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext parserContext);

    PrimitiveType map(@Context() ScannerContext scannerContext, Java8Parser.PrimitiveTypeContext parserContext);

    ReceiverParameter map(@Context() ScannerContext scannerContext, Java8Parser.ReceiverParameterContext parserContext);

    ReferenceType map(@Context() ScannerContext scannerContext, Java8Parser.ReferenceTypeContext parserContext);

    RelationalExpression map(@Context() ScannerContext scannerContext, Java8Parser.RelationalExpressionContext parserContext);

    Resource map(@Context() ScannerContext scannerContext, Java8Parser.ResourceContext parserContext);

    ResourceList map(@Context() ScannerContext scannerContext, Java8Parser.ResourceListContext parserContext);

    ResourceSpecification map(@Context() ScannerContext scannerContext, Java8Parser.ResourceSpecificationContext parserContext);

    Result map(@Context() ScannerContext scannerContext, Java8Parser.ResultContext parserContext);

    ReturnStatement map(@Context() ScannerContext scannerContext, Java8Parser.ReturnStatementContext parserContext);

    ShiftExpression map(@Context() ScannerContext scannerContext, Java8Parser.ShiftExpressionContext parserContext);

    SimpleTypeName map(@Context() ScannerContext scannerContext, Java8Parser.SimpleTypeNameContext parserContext);

    SingleElementAnnotation map(@Context() ScannerContext scannerContext, Java8Parser.SingleElementAnnotationContext parserContext);

    SingleStaticImportDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.SingleStaticImportDeclarationContext parserContext);

    SingleTypeImportDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.SingleTypeImportDeclarationContext parserContext);

    Statement map(@Context() ScannerContext scannerContext, Java8Parser.StatementContext parserContext);

    StatementExpression map(@Context() ScannerContext scannerContext, Java8Parser.StatementExpressionContext parserContext);

    StatementExpressionList map(@Context() ScannerContext scannerContext, Java8Parser.StatementExpressionListContext parserContext);

    StatementNoShortIf map(@Context() ScannerContext scannerContext, Java8Parser.StatementNoShortIfContext parserContext);

    StatementWithoutTrailingSubstatement map(@Context() ScannerContext scannerContext, Java8Parser.StatementWithoutTrailingSubstatementContext parserContext);

    StaticImportOnDemandDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.StaticImportOnDemandDeclarationContext parserContext);

    StaticInitializer map(@Context() ScannerContext scannerContext, Java8Parser.StaticInitializerContext parserContext);

    Superclass map(@Context() ScannerContext scannerContext, Java8Parser.SuperclassContext parserContext);

    Superinterfaces map(@Context() ScannerContext scannerContext, Java8Parser.SuperinterfacesContext parserContext);

    SwitchBlock map(@Context() ScannerContext scannerContext, Java8Parser.SwitchBlockContext parserContext);

    SwitchBlockStatementGroup map(@Context() ScannerContext scannerContext, Java8Parser.SwitchBlockStatementGroupContext parserContext);

    SwitchLabel map(@Context() ScannerContext scannerContext, Java8Parser.SwitchLabelContext parserContext);

    SwitchLabels map(@Context() ScannerContext scannerContext, Java8Parser.SwitchLabelsContext parserContext);

    SwitchStatement map(@Context() ScannerContext scannerContext, Java8Parser.SwitchStatementContext parserContext);

    SynchronizedStatement map(@Context() ScannerContext scannerContext, Java8Parser.SynchronizedStatementContext parserContext);

    ThrowStatement map(@Context() ScannerContext scannerContext, Java8Parser.ThrowStatementContext parserContext);

    Throws_ map(@Context() ScannerContext scannerContext, Java8Parser.Throws_Context parserContext);

    TryStatement map(@Context() ScannerContext scannerContext, Java8Parser.TryStatementContext parserContext);

    TryWithResourcesStatement map(@Context() ScannerContext scannerContext, Java8Parser.TryWithResourcesStatementContext parserContext);

    TypeArgument map(@Context() ScannerContext scannerContext, Java8Parser.TypeArgumentContext parserContext);

    TypeArgumentList map(@Context() ScannerContext scannerContext, Java8Parser.TypeArgumentListContext parserContext);

    TypeArguments map(@Context() ScannerContext scannerContext, Java8Parser.TypeArgumentsContext parserContext);

    TypeArgumentsOrDiamond map(@Context() ScannerContext scannerContext, Java8Parser.TypeArgumentsOrDiamondContext parserContext);

    TypeBound map(@Context() ScannerContext scannerContext, Java8Parser.TypeBoundContext parserContext);

    TypeDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.TypeDeclarationContext parserContext);

    TypeImportOnDemandDeclaration map(@Context() ScannerContext scannerContext, Java8Parser.TypeImportOnDemandDeclarationContext parserContext);

    TypeName map(@Context() ScannerContext scannerContext, Java8Parser.TypeNameContext parserContext);

    TypeParameter map(@Context() ScannerContext scannerContext, Java8Parser.TypeParameterContext parserContext);

    TypeParameterList map(@Context() ScannerContext scannerContext, Java8Parser.TypeParameterListContext parserContext);

    TypeParameterModifier map(@Context() ScannerContext scannerContext, Java8Parser.TypeParameterModifierContext parserContext);

    TypeParameters map(@Context() ScannerContext scannerContext, Java8Parser.TypeParametersContext parserContext);

    TypeVariable map(@Context() ScannerContext scannerContext, Java8Parser.TypeVariableContext parserContext);

    UnannArrayType map(@Context() ScannerContext scannerContext, Java8Parser.UnannArrayTypeContext parserContext);

    UnannClassOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.UnannClassOrInterfaceTypeContext parserContext);

    UnannClassType map(@Context() ScannerContext scannerContext, Java8Parser.UnannClassTypeContext parserContext);

    UnannClassType_lf_unannClassOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext parserContext);

    UnannClassType_lfno_unannClassOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext parserContext);

    UnannInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceTypeContext parserContext);

    UnannInterfaceType_lf_unannClassOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext parserContext);

    UnannInterfaceType_lfno_unannClassOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext parserContext);

    UnannPrimitiveType map(@Context() ScannerContext scannerContext, Java8Parser.UnannPrimitiveTypeContext parserContext);

    UnannReferenceType map(@Context() ScannerContext scannerContext, Java8Parser.UnannReferenceTypeContext parserContext);

    UnannType map(@Context() ScannerContext scannerContext, Java8Parser.UnannTypeContext parserContext);

    UnannTypeVariable map(@Context() ScannerContext scannerContext, Java8Parser.UnannTypeVariableContext parserContext);

    UnaryExpression map(@Context() ScannerContext scannerContext, Java8Parser.UnaryExpressionContext parserContext);

    UnaryExpressionNotPlusMinus map(@Context() ScannerContext scannerContext, Java8Parser.UnaryExpressionNotPlusMinusContext parserContext);

    VariableDeclarator map(@Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorContext parserContext);

    VariableDeclaratorId map(@Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorIdContext parserContext);

    VariableDeclaratorList map(@Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorListContext parserContext);

    VariableInitializer map(@Context() ScannerContext scannerContext, Java8Parser.VariableInitializerContext parserContext);

    VariableInitializerList map(@Context() ScannerContext scannerContext, Java8Parser.VariableInitializerListContext parserContext);

    VariableModifier map(@Context() ScannerContext scannerContext, Java8Parser.VariableModifierContext parserContext);

    VisibilityModifier map(@Context() ScannerContext scannerContext, Java8Parser.VisibilityModifierContext parserContext);

    WhileStatement map(@Context() ScannerContext scannerContext, Java8Parser.WhileStatementContext parserContext);

    WhileStatementNoShortIf map(@Context() ScannerContext scannerContext, Java8Parser.WhileStatementNoShortIfContext parserContext);

    Wildcard map(@Context() ScannerContext scannerContext, Java8Parser.WildcardContext parserContext);

    WildcardBounds map(@Context() ScannerContext scannerContext, Java8Parser.WildcardBoundsContext parserContext);

    default TerminalNodeStrings map(@Context() ScannerContext scannerContext, TerminalNode terminalNode) {
        return map(scannerContext, terminalNode == null ? null : terminalNode.getSymbol());
    }

    TerminalNodeStrings map(@Context() ScannerContext scannerContext, Token symbol);

    String map(CharStream value);
}
