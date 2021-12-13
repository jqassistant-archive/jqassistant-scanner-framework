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
import org.antlr.v4.runtime.CharStream;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(uses = DescriptorFactory.class, unmappedTargetPolicy = ReportingPolicy.ERROR, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
public interface MainMapper {

    public static final MainMapper INSTANCE = Mappers.getMapper(MainMapper.class);

    public static final Logger LOGGER = LoggerFactory.getLogger(MainMapper.class);

    @AfterMapping()
    default void mapBaseDescriptor(@Context() FileResource item, ParserRuleContext parserContext, @MappingTarget() org.jqassistant.contrib.plugin.javagen.api.JavaGenAST target) {
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
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TerminalNodeStrings map(@Context() ScannerContext scannerContext, Token symbol);

    String map(CharStream value);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AdditionalBound map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AdditionalBoundContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AdditiveExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AdditiveExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AmbiguousName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AmbiguousNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AndExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Annotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AnnotationTypeBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AnnotationTypeDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AnnotationTypeElementDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeElementDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AnnotationTypeElementModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeElementModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AnnotationTypeMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AnnotationTypeMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArgumentListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ArrayAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayAccessContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ArrayAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayAccess_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ArrayAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayAccess_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ArrayCreationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayCreationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ArrayInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ArrayType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ArrayTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AssertStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssertStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Assignment map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssignmentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AssignmentExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssignmentExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    AssignmentOperator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.AssignmentOperatorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    BasicForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BasicForStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    BasicForStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BasicForStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Block map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    BlockStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BlockStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    BlockStatements map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BlockStatementsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    BreakStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.BreakStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    CastExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CastExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    CatchClause map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchClauseContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    CatchFormalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchFormalParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    CatchType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Catches map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CatchesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassBodyDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassBodyDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassInstanceCreationExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassInstanceCreationExpression_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpression_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassInstanceCreationExpression_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassType_lf_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassType_lf_classOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ClassType_lfno_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ClassType_lfno_classOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    CompilationUnit map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.CompilationUnitContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConditionalAndExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConditionalAndExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConditionalExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConditionalExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConditionalOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConditionalOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConstantDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstantDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConstantExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstantExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConstantModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstantModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConstructorBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConstructorDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConstructorDeclarator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorDeclaratorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ConstructorModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ConstructorModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ContinueStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ContinueStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    DefaultValue map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DefaultValueContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    DimExpr map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DimExprContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    DimExprs map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DimExprsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Dims map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DimsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    DoStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.DoStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ElementValue map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValueContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ElementValueArrayInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValueArrayInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ElementValueList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValueListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ElementValuePair map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValuePairContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ElementValuePairList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ElementValuePairListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EmptyStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EmptyStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EnhancedForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnhancedForStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EnhancedForStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnhancedForStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EnumBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EnumBodyDeclarations map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumBodyDeclarationsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EnumConstant map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EnumConstantList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EnumConstantModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EnumConstantName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumConstantNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EnumDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EnumDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    EqualityExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.EqualityExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ExceptionType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExceptionTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ExceptionTypeList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExceptionTypeListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ExclusiveOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExclusiveOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ExplicitConstructorInvocation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExplicitConstructorInvocationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Expression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ExpressionName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExpressionNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ExpressionStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExpressionStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ExtendsInterfaces map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ExtendsInterfacesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    FieldAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldAccessContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    FieldAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldAccess_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    FieldAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldAccess_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    FieldDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    FieldModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FieldModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Finally_ map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.Finally_Context parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    FloatingPointType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FloatingPointTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ForInit map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForInitContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ForStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ForStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ForUpdate map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ForUpdateContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    FormalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FormalParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    FormalParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FormalParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    FormalParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.FormalParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    IfThenElseStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IfThenElseStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    IfThenElseStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IfThenElseStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    IfThenStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IfThenStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ImportDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ImportDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InclusiveOrExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InclusiveOrExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InferredFormalParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InferredFormalParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InstanceInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InstanceInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    IntegralType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.IntegralTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceMemberDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceMemberDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceMethodDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceMethodDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceMethodModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceMethodModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceTypeList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceTypeListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceType_lf_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    InterfaceType_lfno_classOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    LabeledStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LabeledStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    LabeledStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LabeledStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    LambdaBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LambdaBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    LambdaExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LambdaExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    LambdaParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LambdaParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    LastFormalParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LastFormalParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    LeftHandSide map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LeftHandSideContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Literal map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LiteralContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    LocalVariableDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LocalVariableDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    LocalVariableDeclarationStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.LocalVariableDeclarationStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MarkerAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MarkerAnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodBody map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodBodyContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodDeclarator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodDeclaratorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodHeader map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodHeaderContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodInvocation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodInvocationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodInvocation_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodInvocation_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodInvocation_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodInvocation_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodReference map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodReferenceContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodReference_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodReference_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MethodReference_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MethodReference_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    MultiplicativeExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.MultiplicativeExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    NormalAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NormalAnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    NormalClassDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NormalClassDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    NormalInterfaceDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NormalInterfaceDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    NumericType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.NumericTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PackageDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PackageModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PackageName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PackageOrTypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PackageOrTypeNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PostDecrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostDecrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PostDecrementExpression_lf_postfixExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostDecrementExpression_lf_postfixExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PostIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostIncrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PostIncrementExpression_lf_postfixExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostIncrementExpression_lf_postfixExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PostfixExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PostfixExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PreDecrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PreDecrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PreIncrementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PreIncrementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimaryNoNewArray map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArrayContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimaryNoNewArray_lf_arrayAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimaryNoNewArray_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimaryNoNewArray_lfno_arrayAccess map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimaryNoNewArray_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    PrimitiveType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.PrimitiveTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ReceiverParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ReceiverParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ReferenceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ReferenceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    RelationalExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.RelationalExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Resource map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResourceContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ResourceList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResourceListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ResourceSpecification map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResourceSpecificationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Result map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ResultContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ReturnStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ReturnStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ShiftExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ShiftExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SimpleTypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SimpleTypeNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SingleElementAnnotation map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SingleElementAnnotationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SingleStaticImportDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SingleStaticImportDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SingleTypeImportDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SingleTypeImportDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Statement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    StatementExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    StatementExpressionList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementExpressionListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    StatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    StatementWithoutTrailingSubstatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StatementWithoutTrailingSubstatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    StaticImportOnDemandDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StaticImportOnDemandDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    StaticInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.StaticInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Superclass map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SuperclassContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Superinterfaces map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SuperinterfacesContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SwitchBlock map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchBlockContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SwitchBlockStatementGroup map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchBlockStatementGroupContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SwitchLabel map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchLabelContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SwitchLabels map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchLabelsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SwitchStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SwitchStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    SynchronizedStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.SynchronizedStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    ThrowStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.ThrowStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Throws_ map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.Throws_Context parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TryStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TryStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TryWithResourcesStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TryWithResourcesStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeArgument map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeArgumentList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeArguments map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentsContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeArgumentsOrDiamond map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeArgumentsOrDiamondContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeBound map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeBoundContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeImportOnDemandDeclaration map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeImportOnDemandDeclarationContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeName map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeNameContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeParameter map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParameterContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeParameterList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParameterListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeParameterModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParameterModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeParameters map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeParametersContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    TypeVariable map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.TypeVariableContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannArrayType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannArrayTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannClassType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannClassType_lf_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannClassType_lfno_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannInterfaceType_lf_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannInterfaceType_lfno_unannClassOrInterfaceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannPrimitiveType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannPrimitiveTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannReferenceType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannReferenceTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannType map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannTypeContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnannTypeVariable map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnannTypeVariableContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnaryExpression map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnaryExpressionContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    UnaryExpressionNotPlusMinus map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.UnaryExpressionNotPlusMinusContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    VariableDeclarator map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    VariableDeclaratorId map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorIdContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    VariableDeclaratorList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableDeclaratorListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    VariableInitializer map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableInitializerContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    VariableInitializerList map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableInitializerListContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    VariableModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VariableModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    VisibilityModifier map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.VisibilityModifierContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    WhileStatement map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WhileStatementContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    WhileStatementNoShortIf map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WhileStatementNoShortIfContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    Wildcard map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WildcardContext parserContext);

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    WildcardBounds map(@Context() FileResource item, @Context() ScannerContext scannerContext, Java8Parser.WildcardBoundsContext parserContext);
}
