//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("MethodHeader")
public interface MethodHeader extends JavaGen {

    // optional: throws_
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters typeParameters);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotations();

    void setAnnotations(List<Annotation> setAnnotations);

    @Relation("HAS_RESULT")
    List<Result> getResults();

    void setResults(List<Result> setResults);

    @Relation("HAS_METHOD_DECLARATOR")
    List<MethodDeclarator> getMethodDeclarators();

    void setMethodDeclarators(List<MethodDeclarator> setMethodDeclarators);

    // optional: throws_
    @Relation("HAS_THROWS_")
    List<Throws_> getThrows_s();

    void setThrows_s(List<Throws_> setThrows_s);
}
