//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.jqassistant.contrib.plugin.javagen.api.*;
import org.jqassistant.contrib.plugin.javagen.api.model.generated.*;
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
    default void mapBaseDescriptor(@Context() FileResource item, ParserRuleContext parserContext, @MappingTarget() JavaGenAST target) {
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

    AdditionalBound map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AdditionalBoundContext parserContext);

    AdditiveExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AdditiveExpressionContext parserContext);

    AmbiguousName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AmbiguousNameContext parserContext);

    AndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AndExpressionContext parserContext);

    Annotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationContext parserContext);

    AnnotationTypeBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeBodyContext parserContext);

    AnnotationTypeDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeDeclarationContext parserContext);

    AnnotationTypeElementDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeElementDeclarationContext parserContext);

    AnnotationTypeElementModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeElementModifierContext parserContext);

    AnnotationTypeMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeMemberDeclarationContext parserContext);

    ArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArgumentListContext parserContext);

    ArrayAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayAccessContext parserContext);

    ArrayAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayAccess_lf_primaryContext parserContext);

    ArrayAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayAccess_lfno_primaryContext parserContext);

    ArrayCreationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayCreationExpressionContext parserContext);

    ArrayInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayInitializerContext parserContext);

    ArrayType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayTypeContext parserContext);

    AssertStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssertStatementContext parserContext);

    Assignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssignmentContext parserContext);

    AssignmentExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssignmentExpressionContext parserContext);

    AssignmentOperator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssignmentOperatorContext parserContext);

    BasicForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BasicForStatementContext parserContext);

    BasicForStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BasicForStatementNoShortIfContext parserContext);

    Block map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BlockContext parserContext);

    BlockStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BlockStatementContext parserContext);

    BlockStatements map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BlockStatementsContext parserContext);

    BreakStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BreakStatementContext parserContext);

    CastExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CastExpressionContext parserContext);

    CatchClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchClauseContext parserContext);

    CatchFormalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchFormalParameterContext parserContext);

    CatchType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchTypeContext parserContext);

    Catches map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchesContext parserContext);

    ClassBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassBodyContext parserContext);

    ClassBodyDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassBodyDeclarationContext parserContext);

    ClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassDeclarationContext parserContext);

    ClassInstanceCreationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpressionContext parserContext);

    ClassInstanceCreationExpression_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpression_lf_primaryContext parserContext);

    ClassInstanceCreationExpression_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext parserContext);

    ClassMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassMemberDeclarationContext parserContext);

    ClassModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassModifierContext parserContext);

    ClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassOrInterfaceTypeContext parserContext);

    ClassType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassTypeContext parserContext);

    ClassType_lf_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassType_lf_classOrInterfaceTypeContext parserContext);

    ClassType_lfno_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassType_lfno_classOrInterfaceTypeContext parserContext);

    CompilationUnit map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CompilationUnitContext parserContext);

    ConditionalAndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConditionalAndExpressionContext parserContext);

    ConditionalExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConditionalExpressionContext parserContext);

    ConditionalOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConditionalOrExpressionContext parserContext);

    ConstantDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstantDeclarationContext parserContext);

    ConstantExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstantExpressionContext parserContext);

    ConstantModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstantModifierContext parserContext);

    ConstructorBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorBodyContext parserContext);

    ConstructorDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorDeclarationContext parserContext);

    ConstructorDeclarator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorDeclaratorContext parserContext);

    ConstructorModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorModifierContext parserContext);

    ContinueStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ContinueStatementContext parserContext);

    DefaultValue map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DefaultValueContext parserContext);

    DimExpr map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DimExprContext parserContext);

    DimExprs map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DimExprsContext parserContext);

    Dims map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DimsContext parserContext);

    DoStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DoStatementContext parserContext);

    ElementValue map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValueContext parserContext);

    ElementValueArrayInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValueArrayInitializerContext parserContext);

    ElementValueList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValueListContext parserContext);

    ElementValuePair map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValuePairContext parserContext);

    ElementValuePairList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValuePairListContext parserContext);

    EmptyStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EmptyStatementContext parserContext);

    EnhancedForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnhancedForStatementContext parserContext);

    EnhancedForStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnhancedForStatementNoShortIfContext parserContext);

    EnumBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumBodyContext parserContext);

    EnumBodyDeclarations map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumBodyDeclarationsContext parserContext);

    EnumConstant map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantContext parserContext);

    EnumConstantList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantListContext parserContext);

    EnumConstantModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantModifierContext parserContext);

    EnumConstantName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantNameContext parserContext);

    EnumDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumDeclarationContext parserContext);

    EqualityExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EqualityExpressionContext parserContext);

    ExceptionType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExceptionTypeContext parserContext);

    ExceptionTypeList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExceptionTypeListContext parserContext);

    ExclusiveOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExclusiveOrExpressionContext parserContext);

    ExplicitConstructorInvocation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExplicitConstructorInvocationContext parserContext);

    Expression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExpressionContext parserContext);

    ExpressionName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExpressionNameContext parserContext);

    ExpressionStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExpressionStatementContext parserContext);

    ExtendsInterfaces map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExtendsInterfacesContext parserContext);

    FieldAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldAccessContext parserContext);

    FieldAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldAccess_lf_primaryContext parserContext);

    FieldAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldAccess_lfno_primaryContext parserContext);

    FieldDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldDeclarationContext parserContext);

    FieldModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldModifierContext parserContext);

    Finally_ map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.Finally_Context parserContext);

    FloatingPointType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FloatingPointTypeContext parserContext);

    ForInit map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForInitContext parserContext);

    ForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForStatementContext parserContext);

    ForStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForStatementNoShortIfContext parserContext);

    ForUpdate map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForUpdateContext parserContext);

    FormalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FormalParameterContext parserContext);

    FormalParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FormalParameterListContext parserContext);

    FormalParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FormalParametersContext parserContext);

    IfThenElseStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IfThenElseStatementContext parserContext);

    IfThenElseStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IfThenElseStatementNoShortIfContext parserContext);

    IfThenStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IfThenStatementContext parserContext);

    ImportDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ImportDeclarationContext parserContext);

    InclusiveOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InclusiveOrExpressionContext parserContext);

    InferredFormalParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InferredFormalParameterListContext parserContext);

    InstanceInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InstanceInitializerContext parserContext);

    IntegralType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IntegralTypeContext parserContext);

    InterfaceBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceBodyContext parserContext);

    InterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceDeclarationContext parserContext);

    InterfaceMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceMemberDeclarationContext parserContext);

    InterfaceMethodDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceMethodDeclarationContext parserContext);

    InterfaceMethodModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceMethodModifierContext parserContext);

    InterfaceModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceModifierContext parserContext);

    InterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceTypeContext parserContext);

    InterfaceTypeList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceTypeListContext parserContext);

    InterfaceType_lf_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext parserContext);

    InterfaceType_lfno_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext parserContext);

    LabeledStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LabeledStatementContext parserContext);

    LabeledStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LabeledStatementNoShortIfContext parserContext);

    LambdaBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LambdaBodyContext parserContext);

    LambdaExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LambdaExpressionContext parserContext);

    LambdaParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LambdaParametersContext parserContext);

    LastFormalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LastFormalParameterContext parserContext);

    LeftHandSide map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LeftHandSideContext parserContext);

    Literal map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LiteralContext parserContext);

    LocalVariableDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LocalVariableDeclarationContext parserContext);

    LocalVariableDeclarationStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LocalVariableDeclarationStatementContext parserContext);

    MarkerAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MarkerAnnotationContext parserContext);

    MethodBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodBodyContext parserContext);

    MethodDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodDeclarationContext parserContext);

    MethodDeclarator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodDeclaratorContext parserContext);

    MethodHeader map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodHeaderContext parserContext);

    MethodInvocation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodInvocationContext parserContext);

    MethodInvocation_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodInvocation_lf_primaryContext parserContext);

    MethodInvocation_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodInvocation_lfno_primaryContext parserContext);

    MethodModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodModifierContext parserContext);

    MethodName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodNameContext parserContext);

    MethodReference map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodReferenceContext parserContext);

    MethodReference_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodReference_lf_primaryContext parserContext);

    MethodReference_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodReference_lfno_primaryContext parserContext);

    MultiplicativeExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MultiplicativeExpressionContext parserContext);

    NormalAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NormalAnnotationContext parserContext);

    NormalClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NormalClassDeclarationContext parserContext);

    NormalInterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NormalInterfaceDeclarationContext parserContext);

    NumericType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NumericTypeContext parserContext);

    PackageDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageDeclarationContext parserContext);

    PackageModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageModifierContext parserContext);

    PackageName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageNameContext parserContext);

    PackageOrTypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageOrTypeNameContext parserContext);

    PostDecrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostDecrementExpressionContext parserContext);

    PostDecrementExpression_lf_postfixExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostDecrementExpression_lf_postfixExpressionContext parserContext);

    PostIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostIncrementExpressionContext parserContext);

    PostIncrementExpression_lf_postfixExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostIncrementExpression_lf_postfixExpressionContext parserContext);

    PostfixExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostfixExpressionContext parserContext);

    PreDecrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PreDecrementExpressionContext parserContext);

    PreIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PreIncrementExpressionContext parserContext);

    Primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryContext parserContext);

    PrimaryNoNewArray map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArrayContext parserContext);

    PrimaryNoNewArray_lf_arrayAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext parserContext);

    PrimaryNoNewArray_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primaryContext parserContext);

    PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext parserContext);

    PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext parserContext);

    PrimaryNoNewArray_lfno_arrayAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext parserContext);

    PrimaryNoNewArray_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primaryContext parserContext);

    PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext parserContext);

    PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext parserContext);

    PrimitiveType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimitiveTypeContext parserContext);

    ReceiverParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ReceiverParameterContext parserContext);

    ReferenceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ReferenceTypeContext parserContext);

    RelationalExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.RelationalExpressionContext parserContext);

    Resource map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResourceContext parserContext);

    ResourceList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResourceListContext parserContext);

    ResourceSpecification map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResourceSpecificationContext parserContext);

    Result map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResultContext parserContext);

    ReturnStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ReturnStatementContext parserContext);

    ShiftExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ShiftExpressionContext parserContext);

    SimpleTypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SimpleTypeNameContext parserContext);

    SingleElementAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SingleElementAnnotationContext parserContext);

    SingleStaticImportDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SingleStaticImportDeclarationContext parserContext);

    SingleTypeImportDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SingleTypeImportDeclarationContext parserContext);

    Statement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementContext parserContext);

    StatementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementExpressionContext parserContext);

    StatementExpressionList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementExpressionListContext parserContext);

    StatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementNoShortIfContext parserContext);

    StatementWithoutTrailingSubstatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementWithoutTrailingSubstatementContext parserContext);

    StaticImportOnDemandDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StaticImportOnDemandDeclarationContext parserContext);

    StaticInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StaticInitializerContext parserContext);

    Superclass map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SuperclassContext parserContext);

    Superinterfaces map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SuperinterfacesContext parserContext);

    SwitchBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchBlockContext parserContext);

    SwitchBlockStatementGroup map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchBlockStatementGroupContext parserContext);

    SwitchLabel map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchLabelContext parserContext);

    SwitchLabels map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchLabelsContext parserContext);

    SwitchStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchStatementContext parserContext);

    SynchronizedStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SynchronizedStatementContext parserContext);

    ThrowStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ThrowStatementContext parserContext);

    Throws_ map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.Throws_Context parserContext);

    TryStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TryStatementContext parserContext);

    TryWithResourcesStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TryWithResourcesStatementContext parserContext);

    TypeArgument map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentContext parserContext);

    TypeArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentListContext parserContext);

    TypeArguments map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentsContext parserContext);

    TypeArgumentsOrDiamond map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentsOrDiamondContext parserContext);

    TypeBound map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeBoundContext parserContext);

    TypeDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeDeclarationContext parserContext);

    TypeImportOnDemandDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeImportOnDemandDeclarationContext parserContext);

    TypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeNameContext parserContext);

    TypeParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParameterContext parserContext);

    TypeParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParameterListContext parserContext);

    TypeParameterModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParameterModifierContext parserContext);

    TypeParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParametersContext parserContext);

    TypeVariable map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeVariableContext parserContext);

    UnannArrayType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannArrayTypeContext parserContext);

    UnannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassOrInterfaceTypeContext parserContext);

    UnannClassType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassTypeContext parserContext);

    UnannClassType_lf_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext parserContext);

    UnannClassType_lfno_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext parserContext);

    UnannInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceTypeContext parserContext);

    UnannInterfaceType_lf_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext parserContext);

    UnannInterfaceType_lfno_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext parserContext);

    UnannPrimitiveType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannPrimitiveTypeContext parserContext);

    UnannReferenceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannReferenceTypeContext parserContext);

    UnannType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannTypeContext parserContext);

    UnannTypeVariable map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannTypeVariableContext parserContext);

    UnaryExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnaryExpressionContext parserContext);

    UnaryExpressionNotPlusMinus map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnaryExpressionNotPlusMinusContext parserContext);

    VariableDeclarator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorContext parserContext);

    VariableDeclaratorId map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorIdContext parserContext);

    VariableDeclaratorList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorListContext parserContext);

    VariableInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableInitializerContext parserContext);

    VariableInitializerList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableInitializerListContext parserContext);

    VariableModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableModifierContext parserContext);

    VisibilityModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VisibilityModifierContext parserContext);

    WhileStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WhileStatementContext parserContext);

    WhileStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WhileStatementNoShortIfContext parserContext);

    Wildcard map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WildcardContext parserContext);

    WildcardBounds map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WildcardBoundsContext parserContext);
}
