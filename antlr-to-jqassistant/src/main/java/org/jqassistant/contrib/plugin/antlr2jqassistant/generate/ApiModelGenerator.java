package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.google.common.base.CaseFormat;
import org.antlr.v4.tool.ast.*;
import org.jqassistant.contrib.plugin.antlr2jqassistant.Main;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;

import javax.lang.model.SourceVersion;
import java.util.*;

public class ApiModelGenerator {
    public final static String QUOTES = "\"";
    public final static String GET = "get";
    public final static String SET = "set";
    public final static String HAS = "HAS_";
    public final static String TERMINAL_NODE_CLASS = "TerminalNodeStrings";

    private final String packageName;
    private final BaseDescriptorGenerator baseDescriptorGenerator;

    private final Map<String, Map<String, Boolean>> interfaceHandledTypes = new HashMap<>();

    public ApiModelGenerator(String packageName, BaseDescriptorGenerator baseDescriptorGenerator) {
        this.packageName = packageName;
        this.baseDescriptorGenerator = baseDescriptorGenerator;
    }

    public Map<String, CompilationUnit> generateFromRules(GrammarAST ast) {
        System.out.println(new Date() + " Starting Api Model Generation");
        Map<String, CompilationUnit> interfaces = new TreeMap<>();
        interfaces.put(TERMINAL_NODE_CLASS, getTerminalNode());

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

        String name = TERMINAL_NODE_CLASS;
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        String nameString = QUOTES + nameUpperCamel + QUOTES;

        compilationUnit.addOrphanComment(new JavadocComment("@see org.antlr.v4.runtime.tree.TerminalNode\n" + "@see " + Main.mapperPackage + "." + MapperGenerator.getMapperName(name)));

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(nameUpperCamel)
                .addExtendedType(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, nameString);

        createGetterAndSetter(interfaceDeclaration, "Text");
        createGetterAndSetter(interfaceDeclaration, "Type");
        createGetterAndSetter(interfaceDeclaration, "Line");
        createGetterAndSetter(interfaceDeclaration, "CharPositionInLine");
        createGetterAndSetter(interfaceDeclaration, "TokenIndex");
        createGetterAndSetter(interfaceDeclaration, "StartIndex");
        createGetterAndSetter(interfaceDeclaration, "StopIndex");
//        createGetterAndSetter(interfaceDeclaration, "InputStream");

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
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, nameString);

        List<GrammarAST> children = (List<GrammarAST>) ast.getChildren();
        BlockAST blockAST = (BlockAST) children.get(1);

        handleAst(interfaceDeclaration, blockAST, false);

        createGetterAndSetter(interfaceDeclaration, "Text");

        return Collections.singletonMap(nameUpperCamel, compilationUnit);
    }

    private void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, GrammarAST ast, boolean isList) {
        if (ast instanceof List) {
            handleChildren(interfaceDeclaration, ast, isList);
        } else if (ast instanceof BlockAST) {
            handleAst(interfaceDeclaration, (BlockAST) ast, isList);
        } else if (ast instanceof PlusBlockAST) {
            handleAst(interfaceDeclaration, (PlusBlockAST) ast, isList);
        } else if (ast instanceof OptionalBlockAST) {
            handleAst(interfaceDeclaration, (OptionalBlockAST) ast, isList);
        } else if (ast instanceof TerminalAST) {
            handleAst(interfaceDeclaration, (TerminalAST) ast, isList);
        } else if (ast instanceof StarBlockAST) {
            handleAst(interfaceDeclaration, (StarBlockAST) ast, isList);
        } else if (ast instanceof AltAST) {
            handleAst(interfaceDeclaration, (AltAST) ast, isList);
        } else if (ast instanceof PredAST) {
            handleAst(interfaceDeclaration, (PredAST) ast, isList);
        } else if (ast instanceof RuleRefAST) {
            handleGenericAst(interfaceDeclaration, ast, isList);
        } else {
            interfaceDeclaration.addOrphanComment(new LineComment("unhandled AST type: " + ast.getType() + " - list: " + isList + " : " + ast.getText()));
            handleGenericAst(interfaceDeclaration, ast, isList);
        }
    }

    public void handleChildren(ClassOrInterfaceDeclaration interfaceDeclaration, GrammarAST ast, boolean isList) {
        List<GrammarAST> children = (List<GrammarAST>) ast.getChildren();
        if (children == null) {
            String name = ast.getText();
            interfaceDeclaration.addOrphanComment(new LineComment("unhandled StarBlockAST token: " + name + isList));
            return;
        }
        for (GrammarAST child : children) {
            boolean areMonozygotic = checkForTwins(child, children, isList);
            handleAst(interfaceDeclaration, child, areMonozygotic);
        }
    }

    private boolean checkForTwins(GrammarAST child, List<GrammarAST> children, boolean isList) {
        if (child instanceof TerminalAST || child instanceof RuleRefAST) {
            if (children.stream().filter(grammarAST -> grammarAST.getText().equals(child.getText())).count() > 1) {
                return true;
            }
        }
        
        return isList;
    }

    public void handleGenericAst(ClassOrInterfaceDeclaration interfaceDeclaration, GrammarAST ast, boolean isList) {
        String name = ast.getText();
        if (name.length() < 4) {
            interfaceDeclaration.addOrphanComment(new LineComment("unhandled ast: " + name));
            return;
        }
        if (name.toLowerCase().contains("epsilon")) {
            interfaceDeclaration.addOrphanComment(new LineComment("Avoided Token: " + name));
            return;
        }
        addMethodDeclaration(interfaceDeclaration, name, isList);
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, BlockAST ast, boolean isList) {
        handleChildren(interfaceDeclaration, ast, isList);
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, PlusBlockAST ast, boolean isList) {
        handleChildren(interfaceDeclaration, ast, true);
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, StarBlockAST ast, boolean isList) {
        handleChildren(interfaceDeclaration, ast, true);
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, OptionalBlockAST ast, boolean isList) {
        interfaceDeclaration.addOrphanComment(new LineComment("optional: " + ast.getText()));
        handleChildren(interfaceDeclaration, ast, isList);
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, TerminalAST ast, boolean isList) {
        String name = ast.getText();

        if (Character.isUpperCase((name.charAt(0)))) {  // Take a chance!
            addMethodDeclaration(interfaceDeclaration, name, TERMINAL_NODE_CLASS, isList);
        } else {
            interfaceDeclaration.addOrphanComment(new LineComment("unhandled TerminalAST token: " + name));
        }
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, AltAST ast, boolean isList) {
        handleChildren(interfaceDeclaration, ast, isList);
    }

    public void handleAst(ClassOrInterfaceDeclaration interfaceDeclaration, PredAST ast, boolean isList) {
        interfaceDeclaration.addOrphanComment(new LineComment("unhandled AST type: " + ast.getType() + " - list: " + isList + " : " + ast.getText()));
//        handleChildren(interfaceDeclaration, ast, isList);
    }

    private void addMethodDeclaration(ClassOrInterfaceDeclaration interfaceDeclaration, String name, boolean isList) {
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        addMethodDeclaration(interfaceDeclaration, name, nameUpperCamel, isList);
    }

    private void addMethodDeclaration(ClassOrInterfaceDeclaration interfaceDeclaration, String name, String type, boolean isList) {
        if (isDuplicateEvenAfterMitigation(interfaceDeclaration, name, type, isList)) return;

        if (isList) {
            createListGetterAndSetter(interfaceDeclaration, name, type);
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

        // not a list, but was supposed to be added twice. make into a list. Disable if wonky.
//        addMethodDeclaration(interfaceDeclaration, name, type, true);
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
//        return GET + nameUpperCamel + (isList ? "s" : ""); // ANTLR doesn't seem to follow JavaBeans naming-conventions, be careful
        return GET + (isReserved(nameUpperCamel) ? nameUpperCamel + "Descriptor" : nameUpperCamel);
    }

    public static String getSetterName(String nameUpperCamel, boolean isList) {
//        return SET + nameUpperCamel + (isList ? "s" : ""); // ANTLR doesn't seem to follow JavaBeans naming-conventions, be careful
        return SET + nameUpperCamel;
    }

    private static Boolean isReserved(String word) {
        return SourceVersion.isKeyword(word) || SourceVersion.isKeyword(word.toLowerCase());
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
                .addParameter(type, getSetterName(nameUpperCamel, false));
    }

    public static void createListGetterAndSetter(ClassOrInterfaceDeclaration interfaceDeclaration, String name, String type) {
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);
        String nameUpperUnderscore = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name);

        interfaceDeclaration.addMethod(getGetterName(nameUpperCamel, true))
                .removeBody()
                .setType("List<" + type + ">")
                .addSingleMemberAnnotation(Relation.class, QUOTES + HAS + nameUpperUnderscore + QUOTES)
                .tryAddImportToParentCompilationUnit(List.class);
        interfaceDeclaration.addMethod(getSetterName(nameUpperCamel, true))
                .removeBody()
                .addParameter("List<" + type + ">", getSetterName(nameUpperCamel, true));
    }

}