//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
 *
 *     public TerminalNode Identifier() {
 *         return getToken(Java8Parser.Identifier, 0);
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
 *     public TypeArgumentsContext typeArguments() {
 *         return getRuleContext(TypeArgumentsContext.class, 0);
 *     }
 *
 *     public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classType_lfno_classOrInterfaceType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterClassType_lfno_classOrInterfaceType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitClassType_lfno_classOrInterfaceType(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassType_lfno_classOrInterfaceType")
public interface ClassType_lfno_classOrInterfaceType extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments setTypeArguments);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
