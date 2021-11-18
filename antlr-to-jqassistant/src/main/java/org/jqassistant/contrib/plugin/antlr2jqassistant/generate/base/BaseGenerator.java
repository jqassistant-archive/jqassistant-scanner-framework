package org.jqassistant.contrib.plugin.antlr2jqassistant.generate.base;

import com.buschmais.xo.neo4j.api.annotation.Relation;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;

@AllArgsConstructor
@Getter
public class BaseGenerator {
    final String packageName;
    final GenerationConfig config;

    public static void createGetterAndSetter(ClassOrInterfaceDeclaration interfaceDeclaration, FormattedName name, String type) {
        interfaceDeclaration.addMethod(name.getGetterName())
                .removeBody()
                .setType(new FormattedName(type).getName())
                .addSingleMemberAnnotation(Relation.class, name.getRelationNameWithQuotes());
        interfaceDeclaration.addMethod(name.getSetterName())
                .removeBody()
                .addParameter(new FormattedName(type).getName(), name.getSetterName());
    }
}
