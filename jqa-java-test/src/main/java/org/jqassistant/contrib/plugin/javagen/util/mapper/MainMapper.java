//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.jqassistant.contrib.plugin.javagen.api.*;
import org.jqassistant.contrib.plugin.javagen.api.model.generated.*;
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
    default void mapFileName(@Context() FileResource item, @MappingTarget() org.jqassistant.contrib.plugin.javagen.api.JavaGenAST target) {
        target.setFileName(item.getFile().getAbsolutePath());
    }

    @Named(value = "mapSourceCode")
    default String mapSourceCode(ParserRuleContext parserContext) {
        String code = parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex()));
        return code.indexOf("\n") == -1 ? code : code.substring(0, code.indexOf("\n"));
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
    AdditionalBound map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AdditionalBoundContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AdditiveExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AdditiveExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AmbiguousName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AmbiguousNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AndExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Annotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AnnotationTypeBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AnnotationTypeDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AnnotationTypeElementDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeElementDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AnnotationTypeElementModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeElementModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AnnotationTypeMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArgumentListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayAccessContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayAccess_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayAccess_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayCreationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayCreationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ArrayType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AssertStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssertStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Assignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssignmentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AssignmentExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssignmentExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    AssignmentOperator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssignmentOperatorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BasicForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BasicForStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BasicForStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BasicForStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Block map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BlockStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BlockStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BlockStatements map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BlockStatementsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    BreakStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BreakStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CastExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CastExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CatchClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CatchFormalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchFormalParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CatchType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Catches map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassBodyDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassBodyDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassInstanceCreationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassInstanceCreationExpression_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpression_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassInstanceCreationExpression_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassType_lf_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassType_lf_classOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ClassType_lfno_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassType_lfno_classOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    CompilationUnit map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CompilationUnitContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConditionalAndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConditionalAndExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConditionalExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConditionalExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConditionalOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConditionalOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstantDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstantDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstantExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstantExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstantModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstantModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructorBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructorDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructorDeclarator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorDeclaratorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ConstructorModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ContinueStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ContinueStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DefaultValue map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DefaultValueContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DimExpr map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DimExprContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DimExprs map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DimExprsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Dims map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DimsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    DoStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DoStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ElementValue map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValueContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ElementValueArrayInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValueArrayInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ElementValueList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValueListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ElementValuePair map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValuePairContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ElementValuePairList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValuePairListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EmptyStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EmptyStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnhancedForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnhancedForStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnhancedForStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnhancedForStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumBodyDeclarations map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumBodyDeclarationsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumConstant map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumConstantList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumConstantModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumConstantName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EnumDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    EqualityExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EqualityExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExceptionType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExceptionTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExceptionTypeList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExceptionTypeListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExclusiveOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExclusiveOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExplicitConstructorInvocation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExplicitConstructorInvocationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Expression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExpressionName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExpressionNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExpressionStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExpressionStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ExtendsInterfaces map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExtendsInterfacesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FieldAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldAccessContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FieldAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldAccess_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FieldAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldAccess_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FieldDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FieldModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Finally_ map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.Finally_Context parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FloatingPointType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FloatingPointTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ForInit map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForInitContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ForStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ForUpdate map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForUpdateContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FormalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FormalParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FormalParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FormalParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    FormalParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FormalParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IfThenElseStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IfThenElseStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IfThenElseStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IfThenElseStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IfThenStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IfThenStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ImportDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ImportDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InclusiveOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InclusiveOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InferredFormalParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InferredFormalParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InstanceInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InstanceInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    IntegralType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IntegralTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceMethodDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceMethodDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceMethodModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceMethodModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceTypeList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceTypeListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceType_lf_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    InterfaceType_lfno_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LabeledStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LabeledStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LabeledStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LabeledStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LambdaBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LambdaBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LambdaExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LambdaExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LambdaParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LambdaParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LastFormalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LastFormalParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LeftHandSide map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LeftHandSideContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Literal map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LocalVariableDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LocalVariableDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    LocalVariableDeclarationStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LocalVariableDeclarationStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MarkerAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MarkerAnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodDeclarator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodDeclaratorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodHeader map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodHeaderContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodInvocation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodInvocationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodInvocation_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodInvocation_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodInvocation_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodInvocation_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodReference map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodReferenceContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodReference_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodReference_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MethodReference_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodReference_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    MultiplicativeExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MultiplicativeExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NormalAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NormalAnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NormalClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NormalClassDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NormalInterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NormalInterfaceDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    NumericType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NumericTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PackageDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PackageModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PackageName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PackageOrTypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageOrTypeNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PostDecrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostDecrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PostDecrementExpression_lf_postfixExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostDecrementExpression_lf_postfixExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PostIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostIncrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PostIncrementExpression_lf_postfixExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostIncrementExpression_lf_postfixExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PostfixExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostfixExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PreDecrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PreDecrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PreIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PreIncrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryNoNewArray map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArrayContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryNoNewArray_lf_arrayAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryNoNewArray_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryNoNewArray_lfno_arrayAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryNoNewArray_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    PrimitiveType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimitiveTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ReceiverParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ReceiverParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ReferenceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ReferenceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    RelationalExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.RelationalExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Resource map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResourceContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ResourceList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResourceListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ResourceSpecification map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResourceSpecificationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Result map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResultContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ReturnStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ReturnStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ShiftExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ShiftExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SimpleTypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SimpleTypeNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SingleElementAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SingleElementAnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SingleStaticImportDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SingleStaticImportDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SingleTypeImportDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SingleTypeImportDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Statement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    StatementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    StatementExpressionList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementExpressionListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    StatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    StatementWithoutTrailingSubstatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementWithoutTrailingSubstatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    StaticImportOnDemandDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StaticImportOnDemandDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    StaticInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StaticInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Superclass map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SuperclassContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Superinterfaces map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SuperinterfacesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SwitchBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SwitchBlockStatementGroup map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchBlockStatementGroupContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SwitchLabel map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchLabelContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SwitchLabels map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchLabelsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SwitchStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    SynchronizedStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SynchronizedStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    ThrowStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ThrowStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Throws_ map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.Throws_Context parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TryStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TryStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TryWithResourcesStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TryWithResourcesStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArgument map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArguments map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeArgumentsOrDiamond map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentsOrDiamondContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeBound map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeBoundContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeImportOnDemandDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeImportOnDemandDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameterModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParameterModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    TypeVariable map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeVariableContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannArrayType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannArrayTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannClassType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannClassType_lf_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannClassType_lfno_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannInterfaceType_lf_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannInterfaceType_lfno_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannPrimitiveType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannPrimitiveTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannReferenceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannReferenceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnannTypeVariable map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannTypeVariableContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnaryExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnaryExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    UnaryExpressionNotPlusMinus map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnaryExpressionNotPlusMinusContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableDeclarator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableDeclaratorId map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorIdContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableDeclaratorList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableInitializerList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableInitializerListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VariableModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    VisibilityModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VisibilityModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    WhileStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WhileStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    WhileStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WhileStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    Wildcard map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WildcardContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", source = ".", qualifiedByName = "mapSourceCode")
    WildcardBounds map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WildcardBoundsContext parserContext);
}
