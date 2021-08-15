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
 * (RULE methodHeader (BLOCK (ALT result methodDeclarator (? (BLOCK (ALT throws_)))) (ALT typeParameters (* (BLOCK (ALT annotation))) result methodDeclarator (? (BLOCK (ALT throws_))))))
 * </pre>
 *
 * <pre>
 * methodHeader
 * 	:	result methodDeclarator throws_?
 * 	|	typeParameters annotation* result methodDeclarator throws_?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1178-1203
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#methodHeader()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MethodHeaderMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MethodHeader")
public interface MethodHeader extends JavaGen {

    @Relation("HAS_RESULT")
    Result getResult();

    void setResult(Result result);

    @Relation("HAS_METHOD_DECLARATOR")
    MethodDeclarator getMethodDeclarator();

    void setMethodDeclarator(MethodDeclarator methodDeclarator);

    // optional: ?
    @Relation("HAS_THROWS_")
    Throws_ getThrows_();

    void setThrows_(Throws_ throws_);

    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters typeParameters);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    // optional: ?
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
