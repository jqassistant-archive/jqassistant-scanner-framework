package org.jqassistant.contrib.plugin.javagen.impl.scanner.walker;

import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import lombok.AllArgsConstructor;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8ParserBaseListener;
import org.jqassistant.contrib.plugin.javagen.util.mapper.MethodNameMapper;
import org.mapstruct.factory.Mappers;

@AllArgsConstructor
public class Java8SourceWalker extends Java8ParserBaseListener {
    private ScannerContext scannerContext;

//    @Override
//    public void enterEveryRule(ParserRuleContext ctx) {
//        System.out.println(new Date() + " - entering new walker phase");
//        Mappers.getMapper(EveryRuleMapper.class).map(scannerContext, ctx);
//    }

//    @Override
//    public void enterLiteral(Java8Parser.LiteralContext ctx) {
//        Mappers.getMapper(LiteralMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimitiveType(Java8Parser.PrimitiveTypeContext ctx) {
//        Mappers.getMapper(PrimitiveTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterNumericType(Java8Parser.NumericTypeContext ctx) {
//        Mappers.getMapper(NumericTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterIntegralType(Java8Parser.IntegralTypeContext ctx) {
//        Mappers.getMapper(IntegralTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFloatingPointType(Java8Parser.FloatingPointTypeContext ctx) {
//        Mappers.getMapper(FloatingPointTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterReferenceType(Java8Parser.ReferenceTypeContext ctx) {
//        Mappers.getMapper(ReferenceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(ClassOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassType(Java8Parser.ClassTypeContext ctx) {
//        Mappers.getMapper(ClassTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassType_lf_classOrInterfaceType(Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(ClassType_lf_classOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassType_lfno_classOrInterfaceType(Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(ClassType_lfno_classOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceType(Java8Parser.InterfaceTypeContext ctx) {
//        Mappers.getMapper(InterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceType_lf_classOrInterfaceType(Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(InterfaceType_lf_classOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceType_lfno_classOrInterfaceType(Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(InterfaceType_lfno_classOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeVariable(Java8Parser.TypeVariableContext ctx) {
//        Mappers.getMapper(TypeVariableMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterArrayType(Java8Parser.ArrayTypeContext ctx) {
//        Mappers.getMapper(ArrayTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterDims(Java8Parser.DimsContext ctx) {
//        Mappers.getMapper(DimsMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeParameter(Java8Parser.TypeParameterContext ctx) {
//        Mappers.getMapper(TypeParameterMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeParameterModifier(Java8Parser.TypeParameterModifierContext ctx) {
//        Mappers.getMapper(TypeParameterModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeBound(Java8Parser.TypeBoundContext ctx) {
//        Mappers.getMapper(TypeBoundMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAdditionalBound(Java8Parser.AdditionalBoundContext ctx) {
//        Mappers.getMapper(AdditionalBoundMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeArguments(Java8Parser.TypeArgumentsContext ctx) {
//        Mappers.getMapper(TypeArgumentsMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeArgumentList(Java8Parser.TypeArgumentListContext ctx) {
//        Mappers.getMapper(TypeArgumentListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeArgument(Java8Parser.TypeArgumentContext ctx) {
//        Mappers.getMapper(TypeArgumentMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterWildcard(Java8Parser.WildcardContext ctx) {
//        Mappers.getMapper(WildcardMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterWildcardBounds(Java8Parser.WildcardBoundsContext ctx) {
//        Mappers.getMapper(WildcardBoundsMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPackageName(Java8Parser.PackageNameContext ctx) {
//        Mappers.getMapper(PackageNameMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeName(Java8Parser.TypeNameContext ctx) {
//        Mappers.getMapper(TypeNameMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx) {
//        Mappers.getMapper(PackageOrTypeNameMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterExpressionName(Java8Parser.ExpressionNameContext ctx) {
//        Mappers.getMapper(ExpressionNameMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodName(Java8Parser.MethodNameContext ctx) {
//        Mappers.getMapper(MethodNameMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAmbiguousName(Java8Parser.AmbiguousNameContext ctx) {
//        Mappers.getMapper(AmbiguousNameMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
//        Mappers.getMapper(CompilationUnitMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPackageDeclaration(Java8Parser.PackageDeclarationContext ctx) {
//        Mappers.getMapper(PackageDeclarationMapper.class).map(scannerContext, ctx);
//    }

//    @Override
//    public void enterPackageModifier(Java8Parser.PackageModifierContext ctx) {
//        Mappers.getMapper(PackageModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterImportDeclaration(Java8Parser.ImportDeclarationContext ctx) {
//        Mappers.getMapper(ImportDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSingleTypeImportDeclaration(Java8Parser.SingleTypeImportDeclarationContext ctx) {
//        Mappers.getMapper(SingleTypeImportDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeImportOnDemandDeclaration(Java8Parser.TypeImportOnDemandDeclarationContext ctx) {
//        Mappers.getMapper(TypeImportOnDemandDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSingleStaticImportDeclaration(Java8Parser.SingleStaticImportDeclarationContext ctx) {
//        Mappers.getMapper(SingleStaticImportDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterStaticImportOnDemandDeclaration(Java8Parser.StaticImportOnDemandDeclarationContext ctx) {
//        Mappers.getMapper(StaticImportOnDemandDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeDeclaration(Java8Parser.TypeDeclarationContext ctx) {
//        Mappers.getMapper(TypeDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
//        Mappers.getMapper(ClassDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
//        Mappers.getMapper(NormalClassDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassModifier(Java8Parser.ClassModifierContext ctx) {
//        Mappers.getMapper(ClassModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeParameters(Java8Parser.TypeParametersContext ctx) {
//        Mappers.getMapper(TypeParametersMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeParameterList(Java8Parser.TypeParameterListContext ctx) {
//        Mappers.getMapper(TypeParameterListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSuperclass(Java8Parser.SuperclassContext ctx) {
//        Mappers.getMapper(SuperclassMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
//        Mappers.getMapper(SuperinterfacesMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx) {
//        Mappers.getMapper(InterfaceTypeListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassBody(Java8Parser.ClassBodyContext ctx) {
//        Mappers.getMapper(ClassBodyMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx) {
//        Mappers.getMapper(ClassBodyDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
//        Mappers.getMapper(ClassMemberDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
//        Mappers.getMapper(FieldDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFieldModifier(Java8Parser.FieldModifierContext ctx) {
//        Mappers.getMapper(FieldModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx) {
//        Mappers.getMapper(VariableDeclaratorListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx) {
//        Mappers.getMapper(VariableDeclaratorMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
//        Mappers.getMapper(VariableDeclaratorIdMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterVariableInitializer(Java8Parser.VariableInitializerContext ctx) {
//        Mappers.getMapper(VariableInitializerMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannType(Java8Parser.UnannTypeContext ctx) {
//        Mappers.getMapper(UnannTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannPrimitiveType(Java8Parser.UnannPrimitiveTypeContext ctx) {
//        Mappers.getMapper(UnannPrimitiveTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannReferenceType(Java8Parser.UnannReferenceTypeContext ctx) {
//        Mappers.getMapper(UnannReferenceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannClassOrInterfaceType(Java8Parser.UnannClassOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(UnannClassOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannClassType(Java8Parser.UnannClassTypeContext ctx) {
//        Mappers.getMapper(UnannClassTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannClassType_lf_unannClassOrInterfaceType(Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(UnannClassType_lf_unannClassOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannClassType_lfno_unannClassOrInterfaceType(Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(UnannClassType_lfno_unannClassOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannInterfaceType(Java8Parser.UnannInterfaceTypeContext ctx) {
//        Mappers.getMapper(UnannInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannInterfaceType_lf_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(UnannInterfaceType_lf_unannClassOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
//        Mappers.getMapper(UnannInterfaceType_lfno_unannClassOrInterfaceTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannTypeVariable(Java8Parser.UnannTypeVariableContext ctx) {
//        Mappers.getMapper(UnannTypeVariableMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnannArrayType(Java8Parser.UnannArrayTypeContext ctx) {
//        Mappers.getMapper(UnannArrayTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
//        Mappers.getMapper(MethodDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodModifier(Java8Parser.MethodModifierContext ctx) {
//        Mappers.getMapper(MethodModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodHeader(Java8Parser.MethodHeaderContext ctx) {
//        Mappers.getMapper(MethodHeaderMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterResult(Java8Parser.ResultContext ctx) {
//        Mappers.getMapper(ResultMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
//        Mappers.getMapper(MethodDeclaratorMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFormalParameterList(Java8Parser.FormalParameterListContext ctx) {
//        Mappers.getMapper(FormalParameterListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFormalParameters(Java8Parser.FormalParametersContext ctx) {
//        Mappers.getMapper(FormalParametersMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFormalParameter(Java8Parser.FormalParameterContext ctx) {
//        Mappers.getMapper(FormalParameterMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterVariableModifier(Java8Parser.VariableModifierContext ctx) {
//        Mappers.getMapper(VariableModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterLastFormalParameter(Java8Parser.LastFormalParameterContext ctx) {
//        Mappers.getMapper(LastFormalParameterMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterReceiverParameter(Java8Parser.ReceiverParameterContext ctx) {
//        Mappers.getMapper(ReceiverParameterMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterThrows_(Java8Parser.Throws_Context ctx) {
//        Mappers.getMapper(Throws_Mapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterExceptionTypeList(Java8Parser.ExceptionTypeListContext ctx) {
//        Mappers.getMapper(ExceptionTypeListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterExceptionType(Java8Parser.ExceptionTypeContext ctx) {
//        Mappers.getMapper(ExceptionTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodBody(Java8Parser.MethodBodyContext ctx) {
//        Mappers.getMapper(MethodBodyMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInstanceInitializer(Java8Parser.InstanceInitializerContext ctx) {
//        Mappers.getMapper(InstanceInitializerMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterStaticInitializer(Java8Parser.StaticInitializerContext ctx) {
//        Mappers.getMapper(StaticInitializerMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
//        Mappers.getMapper(ConstructorDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConstructorModifier(Java8Parser.ConstructorModifierContext ctx) {
//        Mappers.getMapper(ConstructorModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx) {
//        Mappers.getMapper(ConstructorDeclaratorMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx) {
//        Mappers.getMapper(SimpleTypeNameMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConstructorBody(Java8Parser.ConstructorBodyContext ctx) {
//        Mappers.getMapper(ConstructorBodyMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterExplicitConstructorInvocation(Java8Parser.ExplicitConstructorInvocationContext ctx) {
//        Mappers.getMapper(ExplicitConstructorInvocationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
//        Mappers.getMapper(EnumDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEnumBody(Java8Parser.EnumBodyContext ctx) {
//        Mappers.getMapper(EnumBodyMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEnumConstantList(Java8Parser.EnumConstantListContext ctx) {
//        Mappers.getMapper(EnumConstantListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEnumConstant(Java8Parser.EnumConstantContext ctx) {
//        Mappers.getMapper(EnumConstantMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEnumConstantModifier(Java8Parser.EnumConstantModifierContext ctx) {
//        Mappers.getMapper(EnumConstantModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx) {
//        Mappers.getMapper(EnumBodyDeclarationsMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
//        Mappers.getMapper(InterfaceDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
//        Mappers.getMapper(NormalInterfaceDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceModifier(Java8Parser.InterfaceModifierContext ctx) {
//        Mappers.getMapper(InterfaceModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx) {
//        Mappers.getMapper(ExtendsInterfacesMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceBody(Java8Parser.InterfaceBodyContext ctx) {
//        Mappers.getMapper(InterfaceBodyMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
//        Mappers.getMapper(InterfaceMemberDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
//        Mappers.getMapper(ConstantDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConstantModifier(Java8Parser.ConstantModifierContext ctx) {
//        Mappers.getMapper(ConstantModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
//        Mappers.getMapper(InterfaceMethodDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx) {
//        Mappers.getMapper(InterfaceMethodModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx) {
//        Mappers.getMapper(AnnotationTypeDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx) {
//        Mappers.getMapper(AnnotationTypeBodyMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAnnotationTypeMemberDeclaration(Java8Parser.AnnotationTypeMemberDeclarationContext ctx) {
//        Mappers.getMapper(AnnotationTypeMemberDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx) {
//        Mappers.getMapper(AnnotationTypeElementDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAnnotationTypeElementModifier(Java8Parser.AnnotationTypeElementModifierContext ctx) {
//        Mappers.getMapper(AnnotationTypeElementModifierMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterDefaultValue(Java8Parser.DefaultValueContext ctx) {
//        Mappers.getMapper(DefaultValueMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAnnotation(Java8Parser.AnnotationContext ctx) {
//        Mappers.getMapper(AnnotationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterNormalAnnotation(Java8Parser.NormalAnnotationContext ctx) {
//        Mappers.getMapper(NormalAnnotationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterElementValuePairList(Java8Parser.ElementValuePairListContext ctx) {
//        Mappers.getMapper(ElementValuePairListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterElementValuePair(Java8Parser.ElementValuePairContext ctx) {
//        Mappers.getMapper(ElementValuePairMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterElementValue(Java8Parser.ElementValueContext ctx) {
//        Mappers.getMapper(ElementValueMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterElementValueArrayInitializer(Java8Parser.ElementValueArrayInitializerContext ctx) {
//        Mappers.getMapper(ElementValueArrayInitializerMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterElementValueList(Java8Parser.ElementValueListContext ctx) {
//        Mappers.getMapper(ElementValueListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMarkerAnnotation(Java8Parser.MarkerAnnotationContext ctx) {
//        Mappers.getMapper(MarkerAnnotationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSingleElementAnnotation(Java8Parser.SingleElementAnnotationContext ctx) {
//        Mappers.getMapper(SingleElementAnnotationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterArrayInitializer(Java8Parser.ArrayInitializerContext ctx) {
//        Mappers.getMapper(ArrayInitializerMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterVariableInitializerList(Java8Parser.VariableInitializerListContext ctx) {
//        Mappers.getMapper(VariableInitializerListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterBlock(Java8Parser.BlockContext ctx) {
//        Mappers.getMapper(BlockMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterBlockStatements(Java8Parser.BlockStatementsContext ctx) {
//        Mappers.getMapper(BlockStatementsMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterBlockStatement(Java8Parser.BlockStatementContext ctx) {
//        Mappers.getMapper(BlockStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx) {
//        Mappers.getMapper(LocalVariableDeclarationStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx) {
//        Mappers.getMapper(LocalVariableDeclarationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterStatement(Java8Parser.StatementContext ctx) {
//        Mappers.getMapper(StatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterStatementNoShortIf(Java8Parser.StatementNoShortIfContext ctx) {
//        Mappers.getMapper(StatementNoShortIfMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx) {
//        Mappers.getMapper(StatementWithoutTrailingSubstatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEmptyStatement(Java8Parser.EmptyStatementContext ctx) {
//        Mappers.getMapper(EmptyStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterLabeledStatement(Java8Parser.LabeledStatementContext ctx) {
//        Mappers.getMapper(LabeledStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterLabeledStatementNoShortIf(Java8Parser.LabeledStatementNoShortIfContext ctx) {
//        Mappers.getMapper(LabeledStatementNoShortIfMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterExpressionStatement(Java8Parser.ExpressionStatementContext ctx) {
//        Mappers.getMapper(ExpressionStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterStatementExpression(Java8Parser.StatementExpressionContext ctx) {
//        Mappers.getMapper(StatementExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
//        Mappers.getMapper(IfThenStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterIfThenElseStatement(Java8Parser.IfThenElseStatementContext ctx) {
//        Mappers.getMapper(IfThenElseStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterIfThenElseStatementNoShortIf(Java8Parser.IfThenElseStatementNoShortIfContext ctx) {
//        Mappers.getMapper(IfThenElseStatementNoShortIfMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAssertStatement(Java8Parser.AssertStatementContext ctx) {
//        Mappers.getMapper(AssertStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
//        Mappers.getMapper(SwitchStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSwitchBlock(Java8Parser.SwitchBlockContext ctx) {
//        Mappers.getMapper(SwitchBlockMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSwitchBlockStatementGroup(Java8Parser.SwitchBlockStatementGroupContext ctx) {
//        Mappers.getMapper(SwitchBlockStatementGroupMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSwitchLabels(Java8Parser.SwitchLabelsContext ctx) {
//        Mappers.getMapper(SwitchLabelsMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSwitchLabel(Java8Parser.SwitchLabelContext ctx) {
//        Mappers.getMapper(SwitchLabelMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEnumConstantName(Java8Parser.EnumConstantNameContext ctx) {
//        Mappers.getMapper(EnumConstantNameMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterWhileStatement(Java8Parser.WhileStatementContext ctx) {
//        Mappers.getMapper(WhileStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterWhileStatementNoShortIf(Java8Parser.WhileStatementNoShortIfContext ctx) {
//        Mappers.getMapper(WhileStatementNoShortIfMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterDoStatement(Java8Parser.DoStatementContext ctx) {
//        Mappers.getMapper(DoStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterForStatement(Java8Parser.ForStatementContext ctx) {
//        Mappers.getMapper(ForStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterForStatementNoShortIf(Java8Parser.ForStatementNoShortIfContext ctx) {
//        Mappers.getMapper(ForStatementNoShortIfMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterBasicForStatement(Java8Parser.BasicForStatementContext ctx) {
//        Mappers.getMapper(BasicForStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterBasicForStatementNoShortIf(Java8Parser.BasicForStatementNoShortIfContext ctx) {
//        Mappers.getMapper(BasicForStatementNoShortIfMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterForInit(Java8Parser.ForInitContext ctx) {
//        Mappers.getMapper(ForInitMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterForUpdate(Java8Parser.ForUpdateContext ctx) {
//        Mappers.getMapper(ForUpdateMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterStatementExpressionList(Java8Parser.StatementExpressionListContext ctx) {
//        Mappers.getMapper(StatementExpressionListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx) {
//        Mappers.getMapper(EnhancedForStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEnhancedForStatementNoShortIf(Java8Parser.EnhancedForStatementNoShortIfContext ctx) {
//        Mappers.getMapper(EnhancedForStatementNoShortIfMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterBreakStatement(Java8Parser.BreakStatementContext ctx) {
//        Mappers.getMapper(BreakStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterContinueStatement(Java8Parser.ContinueStatementContext ctx) {
//        Mappers.getMapper(ContinueStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterReturnStatement(Java8Parser.ReturnStatementContext ctx) {
//        Mappers.getMapper(ReturnStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterThrowStatement(Java8Parser.ThrowStatementContext ctx) {
//        Mappers.getMapper(ThrowStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterSynchronizedStatement(Java8Parser.SynchronizedStatementContext ctx) {
//        Mappers.getMapper(SynchronizedStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTryStatement(Java8Parser.TryStatementContext ctx) {
//        Mappers.getMapper(TryStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterCatches(Java8Parser.CatchesContext ctx) {
//        Mappers.getMapper(CatchesMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterCatchClause(Java8Parser.CatchClauseContext ctx) {
//        Mappers.getMapper(CatchClauseMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterCatchFormalParameter(Java8Parser.CatchFormalParameterContext ctx) {
//        Mappers.getMapper(CatchFormalParameterMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterCatchType(Java8Parser.CatchTypeContext ctx) {
//        Mappers.getMapper(CatchTypeMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFinally_(Java8Parser.Finally_Context ctx) {
//        Mappers.getMapper(Finally_Mapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTryWithResourcesStatement(Java8Parser.TryWithResourcesStatementContext ctx) {
//        Mappers.getMapper(TryWithResourcesStatementMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterResourceSpecification(Java8Parser.ResourceSpecificationContext ctx) {
//        Mappers.getMapper(ResourceSpecificationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterResourceList(Java8Parser.ResourceListContext ctx) {
//        Mappers.getMapper(ResourceListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterResource(Java8Parser.ResourceContext ctx) {
//        Mappers.getMapper(ResourceMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimary(Java8Parser.PrimaryContext ctx) {
//        Mappers.getMapper(PrimaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimaryNoNewArray(Java8Parser.PrimaryNoNewArrayContext ctx) {
//        Mappers.getMapper(PrimaryNoNewArrayMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimaryNoNewArray_lf_arrayAccess(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx) {
//        Mappers.getMapper(PrimaryNoNewArray_lf_arrayAccessMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimaryNoNewArray_lfno_arrayAccess(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
//        Mappers.getMapper(PrimaryNoNewArray_lfno_arrayAccessMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimaryNoNewArray_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx) {
//        Mappers.getMapper(PrimaryNoNewArray_lf_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
//        Mappers.getMapper(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
//        Mappers.getMapper(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
//        Mappers.getMapper(PrimaryNoNewArray_lfno_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
//        Mappers.getMapper(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
//        Mappers.getMapper(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx) {
//        Mappers.getMapper(ClassInstanceCreationExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassInstanceCreationExpression_lf_primary(Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx) {
//        Mappers.getMapper(ClassInstanceCreationExpression_lf_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
//        Mappers.getMapper(ClassInstanceCreationExpression_lfno_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx) {
//        Mappers.getMapper(TypeArgumentsOrDiamondMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFieldAccess(Java8Parser.FieldAccessContext ctx) {
//        Mappers.getMapper(FieldAccessMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFieldAccess_lf_primary(Java8Parser.FieldAccess_lf_primaryContext ctx) {
//        Mappers.getMapper(FieldAccess_lf_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterFieldAccess_lfno_primary(Java8Parser.FieldAccess_lfno_primaryContext ctx) {
//        Mappers.getMapper(FieldAccess_lfno_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterArrayAccess(Java8Parser.ArrayAccessContext ctx) {
//        Mappers.getMapper(ArrayAccessMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterArrayAccess_lf_primary(Java8Parser.ArrayAccess_lf_primaryContext ctx) {
//        Mappers.getMapper(ArrayAccess_lf_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterArrayAccess_lfno_primary(Java8Parser.ArrayAccess_lfno_primaryContext ctx) {
//        Mappers.getMapper(ArrayAccess_lfno_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
//        Mappers.getMapper(MethodInvocationMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodInvocation_lf_primary(Java8Parser.MethodInvocation_lf_primaryContext ctx) {
//        Mappers.getMapper(MethodInvocation_lf_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodInvocation_lfno_primary(Java8Parser.MethodInvocation_lfno_primaryContext ctx) {
//        Mappers.getMapper(MethodInvocation_lfno_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterArgumentList(Java8Parser.ArgumentListContext ctx) {
//        Mappers.getMapper(ArgumentListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodReference(Java8Parser.MethodReferenceContext ctx) {
//        Mappers.getMapper(MethodReferenceMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodReference_lf_primary(Java8Parser.MethodReference_lf_primaryContext ctx) {
//        Mappers.getMapper(MethodReference_lf_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMethodReference_lfno_primary(Java8Parser.MethodReference_lfno_primaryContext ctx) {
//        Mappers.getMapper(MethodReference_lfno_primaryMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx) {
//        Mappers.getMapper(ArrayCreationExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterDimExprs(Java8Parser.DimExprsContext ctx) {
//        Mappers.getMapper(DimExprsMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterDimExpr(Java8Parser.DimExprContext ctx) {
//        Mappers.getMapper(DimExprMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConstantExpression(Java8Parser.ConstantExpressionContext ctx) {
//        Mappers.getMapper(ConstantExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterExpression(Java8Parser.ExpressionContext ctx) {
//        Mappers.getMapper(ExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterLambdaExpression(Java8Parser.LambdaExpressionContext ctx) {
//        Mappers.getMapper(LambdaExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterLambdaParameters(Java8Parser.LambdaParametersContext ctx) {
//        Mappers.getMapper(LambdaParametersMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInferredFormalParameterList(Java8Parser.InferredFormalParameterListContext ctx) {
//        Mappers.getMapper(InferredFormalParameterListMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterLambdaBody(Java8Parser.LambdaBodyContext ctx) {
//        Mappers.getMapper(LambdaBodyMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAssignmentExpression(Java8Parser.AssignmentExpressionContext ctx) {
//        Mappers.getMapper(AssignmentExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAssignment(Java8Parser.AssignmentContext ctx) {
//        Mappers.getMapper(AssignmentMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterLeftHandSide(Java8Parser.LeftHandSideContext ctx) {
//        Mappers.getMapper(LeftHandSideMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx) {
//        Mappers.getMapper(AssignmentOperatorMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConditionalExpression(Java8Parser.ConditionalExpressionContext ctx) {
//        Mappers.getMapper(ConditionalExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConditionalOrExpression(Java8Parser.ConditionalOrExpressionContext ctx) {
//        Mappers.getMapper(ConditionalOrExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterConditionalAndExpression(Java8Parser.ConditionalAndExpressionContext ctx) {
//        Mappers.getMapper(ConditionalAndExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterInclusiveOrExpression(Java8Parser.InclusiveOrExpressionContext ctx) {
//        Mappers.getMapper(InclusiveOrExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterExclusiveOrExpression(Java8Parser.ExclusiveOrExpressionContext ctx) {
//        Mappers.getMapper(ExclusiveOrExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAndExpression(Java8Parser.AndExpressionContext ctx) {
//        Mappers.getMapper(AndExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterEqualityExpression(Java8Parser.EqualityExpressionContext ctx) {
//        Mappers.getMapper(EqualityExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterRelationalExpression(Java8Parser.RelationalExpressionContext ctx) {
//        Mappers.getMapper(RelationalExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterShiftExpression(Java8Parser.ShiftExpressionContext ctx) {
//        Mappers.getMapper(ShiftExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterAdditiveExpression(Java8Parser.AdditiveExpressionContext ctx) {
//        Mappers.getMapper(AdditiveExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterMultiplicativeExpression(Java8Parser.MultiplicativeExpressionContext ctx) {
//        Mappers.getMapper(MultiplicativeExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnaryExpression(Java8Parser.UnaryExpressionContext ctx) {
//        Mappers.getMapper(UnaryExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPreIncrementExpression(Java8Parser.PreIncrementExpressionContext ctx) {
//        Mappers.getMapper(PreIncrementExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPreDecrementExpression(Java8Parser.PreDecrementExpressionContext ctx) {
//        Mappers.getMapper(PreDecrementExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterUnaryExpressionNotPlusMinus(Java8Parser.UnaryExpressionNotPlusMinusContext ctx) {
//        Mappers.getMapper(UnaryExpressionNotPlusMinusMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPostfixExpression(Java8Parser.PostfixExpressionContext ctx) {
//        Mappers.getMapper(PostfixExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPostIncrementExpression(Java8Parser.PostIncrementExpressionContext ctx) {
//        Mappers.getMapper(PostIncrementExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPostIncrementExpression_lf_postfixExpression(Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx) {
//        Mappers.getMapper(PostIncrementExpression_lf_postfixExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPostDecrementExpression(Java8Parser.PostDecrementExpressionContext ctx) {
//        Mappers.getMapper(PostDecrementExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterPostDecrementExpression_lf_postfixExpression(Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx) {
//        Mappers.getMapper(PostDecrementExpression_lf_postfixExpressionMapper.class).map(scannerContext, ctx);
//    }
//
//    @Override
//    public void enterCastExpression(Java8Parser.CastExpressionContext ctx) {
//        Mappers.getMapper(CastExpressionMapper.class).map(scannerContext, ctx);
//    }
}
