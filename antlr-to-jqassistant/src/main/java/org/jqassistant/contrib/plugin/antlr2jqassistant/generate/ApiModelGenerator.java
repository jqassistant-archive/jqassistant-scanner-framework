package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.google.common.base.CaseFormat;
import org.antlr.v4.tool.ast.*;
import org.jqassistant.contrib.plugin.antlr2jqassistant.Main;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;

import javax.annotation.Generated;
import java.beans.Introspector;
import java.util.*;

public class ApiModelGenerator {
    public final static String QUOTES = "\"";
    public final static String GET = "get";
    public final static String SET = "set";
    public final static String HAS = "HAS_";
    public final static String TERMINAL_NODE = "TerminalNodeStrings";

    private final String packageName;
    private final BaseDescriptorGenerator baseDescriptorGenerator;

    private final Map<String, Map<String, Boolean>> interfaceHandledTypes = new HashMap<>();

    public ApiModelGenerator(String packageName, BaseDescriptorGenerator baseDescriptorGenerator) {
        this.packageName = packageName;
        this.baseDescriptorGenerator = baseDescriptorGenerator;
    }

    private void addGeneratedAnnotation(ClassOrInterfaceDeclaration declaration) {
        NormalAnnotationExpr metadataAnnotation = declaration.addAndGetAnnotation(Generated.class);
        metadataAnnotation.addPair("\n\tvalue", QUOTES + this.getClass().getName() + QUOTES);
        metadataAnnotation.addPair("\n\tdate", QUOTES + new Date() + QUOTES + "\n");
    }

    public Map<String, CompilationUnit> generateFromRules(GrammarAST ast) {
        System.out.println(new Date() + " Starting Api Model Generation");
        Map<String, CompilationUnit> interfaces = new TreeMap<>();
        interfaces.put(TERMINAL_NODE, getTerminalNode());

        List<RuleAST> ruleAsts = (List<RuleAST>) ast.getChildren();

        for (RuleAST ruleAst : ruleAsts) {
            try {
                interfaces.putAll(generateInterface(ruleAst));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(new Date() + " Generation Done!");
        return interfaces;
    }

    private CompilationUnit getTerminalNode() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(baseDescriptorGenerator.packageName + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);

        String name = TERMINAL_NODE;
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        String nameString = QUOTES + nameUpperCamel + QUOTES;

        compilationUnit.addOrphanComment(new JavadocComment("@see org.antlr.v4.runtime.tree.TerminalNode\n" + "@see " + Main.mapperPackage + "." + MapperGenerator.getMapperName(name)));

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(nameUpperCamel)
                .addExtendedType(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);
        addGeneratedAnnotation(interfaceDeclaration);
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, nameString);

        createGetterAndSetter(interfaceDeclaration, "Text");
        createGetterAndSetter(interfaceDeclaration, "Type");
        createGetterAndSetter(interfaceDeclaration, "Line");
        createGetterAndSetter(interfaceDeclaration, "CharPositionInLine");
        createGetterAndSetter(interfaceDeclaration, "TokenIndex");
        createGetterAndSetter(interfaceDeclaration, "StartIndex");
        createGetterAndSetter(interfaceDeclaration, "StopIndex");
        createGetterAndSetter(interfaceDeclaration, "InputStream");

        return compilationUnit;
    }

    public Map<String, CompilationUnit> generateInterface(RuleAST ast) {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(baseDescriptorGenerator.packageName + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);

        compilationUnit.addOrphanComment(TreeHelper.generateComment(ast));

        String name = ast.getRuleName();
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        String nameString = QUOTES + nameUpperCamel + QUOTES;

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(nameUpperCamel)
                .addExtendedType(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);
        addGeneratedAnnotation(interfaceDeclaration);
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, nameString);

        List<GrammarAST> children = (List<GrammarAST>) ast.getChildren();
        BlockAST blockAST = (BlockAST) children.get(1);

        handleAst(interfaceDeclaration, blockAST);

//        deduplicate(interfaceDeclaration);

        return Collections.singletonMap(nameUpperCamel, compilationUnit);
    }

    private void deduplicate(ClassOrInterfaceDeclaration interfaceDeclaration) {
        List<MethodDeclaration> methods = interfaceDeclaration.getMethods();
//        Set<MethodDeclaration> duplicates = methods.stream()
//                .filter(methodDeclaration -> Collections.frequency(methods, methodDeclaration) > 1)
//                .collect(Collectors.toSet());
//
//        List<MethodDeclaration> duplicates = methods
//                .stream()
//                .filter(methodDeclaration -> methods
//                        .stream()
//                        .filter(method -> method.getNameAsString().equals(methodDeclaration.getNameAsString()))
//                        .count() > 1)
//                .collect(Collectors.toList());
//        duplicates.forEach(interfaceDeclaration::remove);

        Map<String, MethodDeclaration> methodMap = new HashMap<>();
        methods.forEach(methodDeclaration -> methodMap.put(methodDeclaration.getNameAsString(), methodDeclaration));

        interfaceDeclaration.getMethods().forEach(interfaceDeclaration::remove);
        methodMap.forEach((s, methodDeclaration) -> interfaceDeclaration.addMember(methodDeclaration));
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, BlockAST ast) {
        handleAst(interfaceDeclaration, (List<GrammarAST>) ast.getChildren());
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, PlusBlockAST ast) {
        handleAst(interfaceDeclaration, (List<GrammarAST>) ast.getChildren());
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, List<GrammarAST> astList) {
        for (GrammarAST altAst : astList) {
            List<GrammarAST> children = (List<GrammarAST>) altAst.getChildren();

            children.forEach(child -> handleChild(interfaceDeclaration, child));
        }
    }

    private void handleChild(ClassOrInterfaceDeclaration interfaceDeclaration, GrammarAST child) {
        if (child instanceof BlockAST) {
            handleAst(interfaceDeclaration, (BlockAST) child);
        } else if (child instanceof PlusBlockAST) {
            handleAst(interfaceDeclaration, (PlusBlockAST) child);
        } else if (child instanceof OptionalBlockAST) {
            handleAst(interfaceDeclaration, (OptionalBlockAST) child);
        } else if (child instanceof TerminalAST) {
            handleAst(interfaceDeclaration, (TerminalAST) child);
        } else if (child instanceof StarBlockAST) {
            handleAst(interfaceDeclaration, (StarBlockAST) child);
        } else if (child instanceof AltAST) {
            handleAst(interfaceDeclaration, (AltAST) child);
        } else if (child instanceof RuleRefAST) {
            handleAst(interfaceDeclaration, child);
        } else {
            handleAst(interfaceDeclaration, child);
        }
    }


//    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, StarBlockAST ast) { //TODO: better method overloading
//        GrammarAST ruleRef = TreeHelper.getRuleRefAst(ast);
//        if (ruleRef == null) {
//            System.out.println("ruleRef not found!" + ast.toStringTree());
//            return;
//        }
//        if (ruleRef instanceof TerminalAST) {
//            handleAst(interfaceDeclaration, (TerminalAST) ruleRef);
//        }
//
//        String name = ruleRef.getText();
//        if (name.contains("'")) {
//            interfaceDeclaration.addOrphanComment(new LineComment("unhandled StarBlockAST: " + name));
//            return;
//        }
//
//        addMethodDeclaration(interfaceDeclaration, name, true);
//    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, StarBlockAST ast) { //TODO: better method overloading
        List<GrammarAST> ruleRefs = TreeHelper.findChildren(ast);
        if (ruleRefs == null) {
            System.out.println("ruleRef not found!" + ast.toStringTree());
            return;
        }
        for (GrammarAST ruleRef : ruleRefs) {
            if (ruleRef instanceof TerminalAST) {
                handleAst(interfaceDeclaration, (TerminalAST) ruleRef);
            }

            String name = ruleRef.getText();
            if (name.length() < 4) {
                interfaceDeclaration.addOrphanComment(new LineComment("unhandled StarBlockAST: " + name));
            } else {
                addMethodDeclaration(interfaceDeclaration, name, true);
            }
        }
    }


    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, OptionalBlockAST ast) {
        GrammarAST ruleRef = TreeHelper.getRuleRefAst(ast);
        if (ruleRef instanceof TerminalAST) {
            handleAst(interfaceDeclaration, (TerminalAST) ruleRef);
            return;
        }
        interfaceDeclaration.addOrphanComment(new LineComment("optional: " + ruleRef.getText()));
        handleAst(interfaceDeclaration, ruleRef);
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, TerminalAST ast) {
        String name = ast.getText();

        if (Character.isUpperCase((name.charAt(0)))) {  // Take a chance!
            addMethodDeclaration(interfaceDeclaration, name, TERMINAL_NODE, false);
        } else {
            interfaceDeclaration.addOrphanComment(new LineComment("unhandled TerminalAST token: " + name));
        }
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, AltAST ast) {
        String name = ast.getText();
        interfaceDeclaration.addOrphanComment(new LineComment("unhandled AltAST token: " + name));
    }

    public boolean handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, GrammarAST ast) {
        String name = ast.getText();
        if (name.toLowerCase().contains("epsilon")) {
            interfaceDeclaration.addOrphanComment(new LineComment("Avoided Token: " + name));
            return false;
        }
        addMethodDeclaration(interfaceDeclaration, name, false);
        return true;
    }

    private void addMethodDeclaration(ClassOrInterfaceDeclaration interfaceDeclaration, String name, boolean isList) {
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        addMethodDeclaration(interfaceDeclaration, name, nameUpperCamel, isList);
    }

    private void addMethodDeclaration(ClassOrInterfaceDeclaration interfaceDeclaration, String name, String type, boolean isList) {
        if (isDuplicateEvenAfterMitigation(interfaceDeclaration, name, type, isList)) return;

        if (isList) {
            createGetterAndSetter(interfaceDeclaration, name, type, true);
        } else {
            createGetterAndSetter(interfaceDeclaration, name, type);
        }
    }

    private boolean isDuplicateEvenAfterMitigation(ClassOrInterfaceDeclaration interfaceDeclaration, String name, String type, boolean shouldBeList) {
        Map<String, Boolean> handledTypes = interfaceHandledTypes.getOrDefault(interfaceDeclaration.getNameAsString(), new HashMap<>());
        Boolean isList = handledTypes.get(name);

        if (isList == null) {
            handledTypes.put(name, shouldBeList);
            interfaceHandledTypes.put(interfaceDeclaration.getNameAsString(), handledTypes);
            return false;
        }

        if (isList) {
            return true;
        }

        // not a list, but should be a list, then remove existing methods
        if (shouldBeList) {
            removeMethodByName(interfaceDeclaration, name);

            handledTypes.put(name, true);
            interfaceHandledTypes.put(interfaceDeclaration.getNameAsString(), handledTypes);
            return false;
        }

        // not a list, but was supposed to be added twice. make into a list.
        addMethodDeclaration(interfaceDeclaration, name, type, true);
        return true;
    }

    private void removeMethodByName(ClassOrInterfaceDeclaration interfaceDeclaration, String name) {
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        List<MethodDeclaration> getters = interfaceDeclaration.getMethodsByName(getGetterName(nameUpperCamel, false));
        List<MethodDeclaration> setters = interfaceDeclaration.getMethodsByName(getSetterName(nameUpperCamel, false));

        getters.forEach(interfaceDeclaration::remove);
        setters.forEach(interfaceDeclaration::remove);
    }

    public static String getGetterName(String nameUpperCamel, boolean isList) {
        return GET + nameUpperCamel + (isList ? "s" : "");
    }

    public static String getSetterName(String nameUpperCamel, boolean isList) {
        return SET + nameUpperCamel + (isList ? "s" : "");
    }

    public static void createGetterAndSetter(ClassOrInterfaceDeclaration interfaceDeclaration, String name) {
        createGetterAndSetter(interfaceDeclaration, name, "String");
    }

    public static void createGetterAndSetter(ClassOrInterfaceDeclaration interfaceDeclaration, String name, String type) {
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        String nameUpperUnderscore = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name);

        interfaceDeclaration.addMethod(getGetterName(nameUpperCamel, false))
                .removeBody()
                .setType(type)
                .addSingleMemberAnnotation(Relation.class, QUOTES + HAS + nameUpperUnderscore + QUOTES);
        interfaceDeclaration.addMethod(getSetterName(nameUpperCamel, false))
                .removeBody()
                .addParameter(type, Introspector.decapitalize(name));
    }

    public static void createGetterAndSetter(ClassOrInterfaceDeclaration interfaceDeclaration, String name, String type, boolean isList) {
        if (!isList) {
            createGetterAndSetter(interfaceDeclaration, name, type);
            return;
        }

        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        String nameUpperUnderscore = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name);

        interfaceDeclaration.addMethod(getGetterName(nameUpperCamel, isList))
                .removeBody()
                .setType("List<" + type + ">")
                .addSingleMemberAnnotation(Relation.class, QUOTES + HAS + nameUpperUnderscore + QUOTES)
                .tryAddImportToParentCompilationUnit(List.class);
        interfaceDeclaration.addMethod(getSetterName(nameUpperCamel, isList))
                .removeBody()
                .addParameter("List<" + type + ">", getSetterName(nameUpperCamel, isList));
    }

}