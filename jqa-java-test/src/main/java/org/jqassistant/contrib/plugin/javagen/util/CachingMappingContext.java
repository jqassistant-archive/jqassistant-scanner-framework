//package org.jqassistant.contrib.plugin.javagen.util;
//
//import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
//import com.github.javaparser.JavaParser;
//import com.github.javaparser.ast.*;
//import com.github.javaparser.ast.body.TypeDeclaration;
//import com.github.javaparser.ast.expr.AnnotationExpr;
//import com.github.javaparser.ast.expr.FieldAccessExpr;
//import com.github.javaparser.ast.expr.MethodCallExpr;
//import com.github.javaparser.ast.type.Type;
//import com.github.javaparser.resolution.UnsolvedSymbolException;
//import com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration;
//import com.github.javaparser.resolution.declarations.ResolvedTypeDeclaration;
//import com.github.javaparser.resolution.declarations.ResolvedValueDeclaration;
//import com.github.javaparser.resolution.types.ResolvedType;
//import com.github.javaparser.resolution.types.ResolvedWildcard;
//import com.github.javaparser.symbolsolver.javaparsermodel.JavaParserFacade;
//import com.github.javaparser.symbolsolver.javaparsermodel.JavaParserFactory;
//import com.github.javaparser.symbolsolver.model.resolution.SymbolReference;
//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.misc.Interval;
//import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
//import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
//import org.jqassistant.contrib.plugin.javagen.api.model.generated.CompilationUnit;
//import org.jqassistant.contrib.plugin.javagen.api.model.generated.VariableDeclarator;
//import org.jqassistant.contrib.plugin.javasrc.impl.scanner.JavaSourceException;
//import org.jqassistant.contrib.plugin.javasrc.impl.scanner.JavaTypeSolver;
//import org.mapstruct.*;
//
//import java.util.IdentityHashMap;
//import java.util.Map;
//import java.util.Optional;
//
//public class CachingMappingContext {
//    private final JavaParser javaParser = new JavaParser();
//    private final Map<String, JavaGenAST> providesInstances = new IdentityHashMap<String, JavaGenAST>();
//    private final Map<String, JavaGenAST> requiresInstances = new IdentityHashMap<String, JavaGenAST>();
//
////    @BeforeMapping
////    public <T> T getMappedInstance(Object source, @TargetType Class<T> targetType) {
////        return (T) providesInstances.get( source );
////    }
////
////    @BeforeMapping
////    public void storeMappedInstance(Object source, @MappingTarget Object target) {
////        providesInstances.put( source, target );
////    }
//    String mapEntireSourceCode(ParserRuleContext parserContext) {
//        return parserContext.getStart().getInputStream().getText(new Interval(parserContext.getStart().getStartIndex(), parserContext.getStop().getStopIndex()));
//    }
//    Node getParserContextAsNode(ParserRuleContext parserContext) {
//        return javaParser.parse(mapEntireSourceCode(parserContext)).getResult().get();
//    }
//    @AfterMapping
//    public void storeCompilationUnit(@Context() ScannerContext scannerContext, Java8Parser.CompilationUnitContext parserRuleContext, @MappingTarget CompilationUnit target) {
//        providesInstances.put(scannerContext.getCurrentDescriptor().getId(), target );
//    }
//
//    @AfterMapping
//    public void storeTypeDeclaration(@Context() ScannerContext scannerContext, Java8Parser.TypeDeclarationContext parserRuleContext, @MappingTarget org.jqassistant.contrib.plugin.javagen.api.model.generated.TypeDeclaration  target) {
////        scannerContext.getCurrentDescriptor();
//        providesInstances.put( getQualifiedName(scannerContext, getParserContextAsNode(parserRuleContext)).orElseThrow(() -> new RuntimeException()), target );
////        providesInstances.put(scannerContext.getCurrentDescriptor().getId(), target );
//    }
//
////    protected String getQualifiedName(Java8Parser.TypeDeclarationContext parserRuleContext) {
////        return "parserRuleContext.get";
////    }
//
//    protected Optional<String> getQualifiedName(ScannerContext scannerContext, Node node) throws JavaSourceException {
//
//        JavaTypeSolver javaTypeSolver = scannerContext.peek(JavaTypeSolver.class);
//        JavaParserFacade facade = javaTypeSolver.getFacade();
//
//        try {
//            if (node instanceof TypeDeclaration<?>) {
//                // types such as class, enum, or annotation declaration
//                return Optional.of(facade.getTypeDeclaration(node).getQualifiedName());
//            } else if (node instanceof Type) {
//                // interfaces, super class, parameter types, exceptions
//                return Optional.of(getQualifiedName(facade.convertToUsage(((Type) node), node)));
//            } else if (node instanceof FieldAccessExpr) {
//                // field e.g. in annotations
//                FieldAccessExpr fieldAccessExpr = (FieldAccessExpr) node;
//                SymbolReference<ResolvedValueDeclaration> symbolReference = facade.solve(fieldAccessExpr);
//                if (symbolReference.isSolved()) {
//                    return Optional.of(getQualifiedName(symbolReference.getCorrespondingDeclaration().getType()));
//                } else {
//                    throw new UnsolvedSymbolException("Unsolved qualified name of field type.");
//                }
//            } else if (node instanceof AnnotationExpr) {
//                // annotations
//                AnnotationExpr annotationExpr = (AnnotationExpr) node;
//                com.github.javaparser.symbolsolver.core.resolution.Context context = JavaParserFactory.getContext(annotationExpr, javaTypeSolver.getTypeSolver());
////                SymbolReference<ResolvedTypeDeclaration> symbolReference = context.solveType(annotationExpr.getNameAsString(), javaTypeSolver);
//                SymbolReference<ResolvedTypeDeclaration> symbolReference = context.solveType(annotationExpr.getNameAsString());
//                if (symbolReference.isSolved()) {
//                    return Optional.of(symbolReference.getCorrespondingDeclaration().getQualifiedName());
//                } else {
//                    throw new UnsolvedSymbolException("Unsolved qualified name of annotation.");
//                }
//            } else if (node instanceof MethodCallExpr) {
//                // method call
//                MethodCallExpr methodCallExpr = (MethodCallExpr) node;
//                SymbolReference<ResolvedMethodDeclaration> symbolReference = SymbolReference.unsolved(ResolvedMethodDeclaration.class);
//                try {
//                    symbolReference = facade.solve(methodCallExpr);
//                } catch (RuntimeException re) {
//                    ResolvedMethodDeclaration resolvedInvokedMethodDeclaration = facade.solveMethodAsUsage(methodCallExpr).getDeclaration();
//                    if (resolvedInvokedMethodDeclaration != null) {
//                        symbolReference = SymbolReference.solved(resolvedInvokedMethodDeclaration);
//                    }
//                }
//                if (symbolReference.isSolved()) {
//                    ResolvedMethodDeclaration solvedInvokedMethod = symbolReference.getCorrespondingDeclaration();
//                    return Optional.of(solvedInvokedMethod.declaringType().getQualifiedName());
//                } else {
//                    throw new UnsolvedSymbolException("Unsolved qualified name of method call.");
//                }
//            } else if (node instanceof VariableDeclarator) {
//                // method variable
//                ResolvedType solvedVariable = facade.convertToUsageVariableType((com.github.javaparser.ast.body.VariableDeclarator) node);
//                return Optional.of(getQualifiedName(solvedVariable));
//            }
//            throw new JavaSourceException("Unexpected type of node for qualified name: " + node + " " + node.getClass());
//        } catch (UnsolvedSymbolException use) {
//            throw new JavaSourceException(
//                use.getClass().getSimpleName() + " " + use.getMessage() + "  Unsolved qualified name of node: " + node + " " + node.getClass());
//        } catch (UnsupportedOperationException uoe) {
//            throw new JavaSourceException(
//                uoe.getClass().getSimpleName() + " " + uoe.getMessage() + "  Unsolved qualified name of node: " + node + " " + node.getClass());
//        } catch (RuntimeException re) {
//            throw new JavaSourceException(
//                re.getClass().getSimpleName() + " " + re.getMessage() + "  Unsolved qualified name of node: " + node + " " + node.getClass());
//        }
//    }
//
//    private String getQualifiedName(com.github.javaparser.resolution.types.ResolvedType resolvedType) throws JavaSourceException {
//        if (resolvedType.isReferenceType()) {
//            return resolvedType.asReferenceType().getQualifiedName();
//        } else if (resolvedType.isPrimitive()) {
//            return resolvedType.asPrimitive().describe();
//        } else if (resolvedType.isVoid()) {
//            return resolvedType.describe();
//        } else if (resolvedType.isArray()) {
//            return resolvedType.asArrayType().describe();
//        } else if (resolvedType.isTypeVariable()) {
//            return resolvedType.asTypeVariable().qualifiedName();
//        } else if (resolvedType.isWildcard()) {
//            ResolvedWildcard wildcard = resolvedType.asWildcard();
//            if (wildcard.isBounded()) {
//                return wildcard.getBoundedType().describe();
//            } else {
//                return wildcard.describe();
//            }
//        }
//        throw new JavaSourceException("Unexpected type of resolved type for qualified name: " + resolvedType.getClass());
//    }
//}
