//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class MethodHeaderContext extends ParserRuleContext {
 *
 *     public ResultContext result() {
 *         return getRuleContext(ResultContext.class, 0);
 *     }
 *
 *     public MethodDeclaratorContext methodDeclarator() {
 *         return getRuleContext(MethodDeclaratorContext.class, 0);
 *     }
 *
 *     public Throws_Context throws_() {
 *         return getRuleContext(Throws_Context.class, 0);
 *     }
 *
 *     public TypeParametersContext typeParameters() {
 *         return getRuleContext(TypeParametersContext.class, 0);
 *     }
 *
 *     public List<AnnotationContext> annotation() {
 *         return getRuleContexts(AnnotationContext.class);
 *     }
 *
 *     public AnnotationContext annotation(int i) {
 *         return getRuleContext(AnnotationContext.class, i);
 *     }
 *
 *     public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_methodHeader;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterMethodHeader(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitMethodHeader(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MethodHeaderMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MethodHeader")
public interface MethodHeader extends JavaGen {

    @Relation("HAS_RESULT")
    Result getResult();

    void setResult(Result setResult);

    @Relation("HAS_METHOD_DECLARATOR")
    MethodDeclarator getMethodDeclarator();

    void setMethodDeclarator(MethodDeclarator setMethodDeclarator);

    @Relation("HAS_THROWS")
    Throws_ getThrows_();

    void setThrows_(Throws_ setThrows_);

    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
