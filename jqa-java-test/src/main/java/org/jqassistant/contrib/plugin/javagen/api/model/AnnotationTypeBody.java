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
 * (RULE annotationTypeBody (BLOCK (ALT '{' (* (BLOCK (ALT annotationTypeMemberDeclaration))) '}')))
 * </pre>
 *
 * <pre>
 * annotationTypeBody
 * 	:	'{' annotationTypeMemberDeclaration* '}'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1871-1882
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#annotationTypeBody()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationTypeBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AnnotationTypeBody")
public interface AnnotationTypeBody extends JavaGen {

    // unhandled TerminalAST token: '{'
    @Relation("HAS_ANNOTATION_TYPE_MEMBER_DECLARATION")
    List<AnnotationTypeMemberDeclaration> getAnnotationTypeMemberDeclaration();

    void setAnnotationTypeMemberDeclaration(List<AnnotationTypeMemberDeclaration> setAnnotationTypeMemberDeclaration);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
