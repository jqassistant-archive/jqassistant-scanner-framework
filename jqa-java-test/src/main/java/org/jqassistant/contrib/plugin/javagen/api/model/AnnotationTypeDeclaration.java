//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE annotationTypeDeclaration (BLOCK (ALT (* (BLOCK (ALT interfaceModifier))) '@' 'interface' Identifier annotationTypeBody)))
 * </pre>
 *
 * <pre>
 * annotationTypeDeclaration
 * 	:	interfaceModifier* '@' 'interface' Identifier annotationTypeBody
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1854-1869
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#annotationTypeDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationTypeDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AnnotationTypeDeclaration")
public interface AnnotationTypeDeclaration extends JavaGen {

    @Relation("HAS_INTERFACE_MODIFIER")
    List<InterfaceModifier> getInterfaceModifier();

    void setInterfaceModifier(List<InterfaceModifier> setInterfaceModifier);

    // unhandled TerminalAST token: '@'
    // unhandled TerminalAST token: 'interface'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_ANNOTATION_TYPE_BODY")
    AnnotationTypeBody getAnnotationTypeBody();

    void setAnnotationTypeBody(AnnotationTypeBody setAnnotationTypeBody);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
