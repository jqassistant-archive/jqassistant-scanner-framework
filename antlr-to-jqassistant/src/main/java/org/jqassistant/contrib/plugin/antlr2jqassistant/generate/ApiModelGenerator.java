package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import org.antlr.v4.tool.ast.*;
import org.jqassistant.contrib.plugin.antlr2jqassistant.Main;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;

import java.util.*;

public class ApiModelGenerator {
    public final static String TERMINAL_NODE_CLASS = "TerminalNodeStrings";

    private final String packageName;
    private final BaseDescriptorGenerator baseDescriptorGenerator;

    private final Map<String, Map<String, Boolean>> interfaceHandledTypes = new HashMap<>();

    public ApiModelGenerator(String packageName, BaseDescriptorGenerator baseDescriptorGenerator) {
        this.packageName = packageName;
        this.baseDescriptorGenerator = baseDescriptorGenerator;
    }

    public Map<AstName, CompilationUnit> generateFromRules(GrammarAST ast) {
        System.out.println(new Date() + " Starting Api Model Generation");
        Map<AstName, CompilationUnit> interfaces = new TreeMap<>(getTerminalNode());

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

    private Map<AstName, CompilationUnit> getTerminalNode() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(baseDescriptorGenerator.packageName + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);

        AstName name = new AstName(TERMINAL_NODE_CLASS);

        compilationUnit.addOrphanComment(new JavadocComment("@see org.antlr.v4.runtime.tree.TerminalNode\n" + "@see " + Main.mapperPackage + "." + MapperGenerator.getMapperName(name.getName())));

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(name.getName())
                .addExtendedType(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, name.withQuotes());

        createGetterAndSetter(interfaceDeclaration, new AstName("Text"));
        createGetterAndSetter(interfaceDeclaration, new AstName("Type"));
        createGetterAndSetter(interfaceDeclaration, new AstName("Line"));
        createGetterAndSetter(interfaceDeclaration, new AstName("CharPositionInLine"));
        createGetterAndSetter(interfaceDeclaration, new AstName("TokenIndex"));
        createGetterAndSetter(interfaceDeclaration, new AstName("StartIndex"));
        createGetterAndSetter(interfaceDeclaration, new AstName("StopIndex"));

        Map<AstName, CompilationUnit> map = new TreeMap<>();
        map.put(name, compilationUnit);
        return map;
    }

    public Map<AstName, CompilationUnit> generateInterface(RuleAST ast) {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(packageName);
        compilationUnit.addImport(baseDescriptorGenerator.packageName + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);

        compilationUnit.addOrphanComment(TreeHelper.generateComment(ast));

        AstName name = new AstName(ast);

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(name.getName())
                .addExtendedType(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME);
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, name.withQuotes());

        List<GrammarAST> children = (List<GrammarAST>) ast.getChildren();
        BlockAST blockAST = (BlockAST) children.get(1);

        handleAst(interfaceDeclaration, blockAST, false);

        createGetterAndSetter(interfaceDeclaration, new AstName("Text"));

        return Collections.singletonMap(name, compilationUnit);
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
        AstName name = new AstName(ast);
        if (name.getName().length() < 4) {
            interfaceDeclaration.addOrphanComment(new LineComment("unhandled ast: " + name));
            return;
        }
        if (name.getName().toLowerCase().contains("epsilon")) {
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
        AstName name = new AstName(ast);

        if (Character.isUpperCase((name.getName().charAt(0)))) {  // Take a chance!
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

    private void addMethodDeclaration(ClassOrInterfaceDeclaration interfaceDeclaration, AstName name, boolean isList) {
        addMethodDeclaration(interfaceDeclaration, name, name.getName(), isList);
    }

    private void addMethodDeclaration(ClassOrInterfaceDeclaration interfaceDeclaration, AstName name, String type, boolean isList) {
        if (isDuplicateEvenAfterMitigation(interfaceDeclaration, name, type, isList)) return;

        if (isList) {
            createListGetterAndSetter(interfaceDeclaration, name, type);
        } else {
            createGetterAndSetter(interfaceDeclaration, name, type);
        }
    }

    private boolean isDuplicateEvenAfterMitigation(ClassOrInterfaceDeclaration interfaceDeclaration, AstName name, String type, boolean shouldBeList) {
        Map<String, Boolean> handledTypes = interfaceHandledTypes.getOrDefault(interfaceDeclaration.getNameAsString(), new HashMap<>());
        Boolean isList = handledTypes.get(name.getName());

        if (isList == null) {
            handledTypes.put(name.getName(), shouldBeList);
            interfaceHandledTypes.put(interfaceDeclaration.getNameAsString(), handledTypes);
            return false;
        }

        if (isList) {
            return true;
        }

        // not a list, but should be a list, then remove existing methods
        if (shouldBeList) {
            removeMethodByName(interfaceDeclaration, name);

            handledTypes.put(name.getName(), true);
            interfaceHandledTypes.put(interfaceDeclaration.getNameAsString(), handledTypes);
            return false;
        }

        // not a list, but was supposed to be added twice. make into a list. Disable if wonky.
//        addMethodDeclaration(interfaceDeclaration, name, type, true);
        return true;
    }

    private void removeMethodByName(ClassOrInterfaceDeclaration interfaceDeclaration, AstName name) {
        List<MethodDeclaration> getters = interfaceDeclaration.getMethodsByName(name.getGetterName());
        List<MethodDeclaration> setters = interfaceDeclaration.getMethodsByName(name.getSetterName());

        getters.forEach(interfaceDeclaration::remove);
        setters.forEach(interfaceDeclaration::remove);
    }

    public static void createGetterAndSetter(ClassOrInterfaceDeclaration interfaceDeclaration, AstName name) {
        createGetterAndSetter(interfaceDeclaration, name, "String");
    }

    public static void createGetterAndSetter(ClassOrInterfaceDeclaration interfaceDeclaration, AstName name, String type) {

        interfaceDeclaration.addMethod(name.getGetterName())
                .removeBody()
                .setType(type)
                .addSingleMemberAnnotation(Relation.class, name.getRelationNameWithQuotes());
        interfaceDeclaration.addMethod(name.getSetterName())
                .removeBody()
                .addParameter(type, name.getSetterName());
    }

    public static void createListGetterAndSetter(ClassOrInterfaceDeclaration interfaceDeclaration, AstName name, String type) {

        interfaceDeclaration.addMethod(name.getGetterName())
                .removeBody()
                .setType("List<" + type + ">")
                .addSingleMemberAnnotation(Relation.class, name.getRelationNameWithQuotes())
                .tryAddImportToParentCompilationUnit(List.class);
        interfaceDeclaration.addMethod(name.getSetterName())
                .removeBody()
                .addParameter("List<" + type + ">", name.getSetterName());
    }

}