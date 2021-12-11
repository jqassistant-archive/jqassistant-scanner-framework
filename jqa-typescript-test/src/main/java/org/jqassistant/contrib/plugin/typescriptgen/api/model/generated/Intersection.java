//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class IntersectionContext extends UnionOrIntersectionOrPrimaryTypeContext {
 *
 *     public List<UnionOrIntersectionOrPrimaryTypeContext> unionOrIntersectionOrPrimaryType() {
 *         return getRuleContexts(UnionOrIntersectionOrPrimaryTypeContext.class);
 *     }
 *
 *     public UnionOrIntersectionOrPrimaryTypeContext unionOrIntersectionOrPrimaryType(int i) {
 *         return getRuleContext(UnionOrIntersectionOrPrimaryTypeContext.class, i);
 *     }
 *
 *     public TerminalNode BitAnd() {
 *         return getToken(TypeScriptParser.BitAnd, 0);
 *     }
 *
 *     public IntersectionContext(UnionOrIntersectionOrPrimaryTypeContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterIntersection(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitIntersection(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	comments = "REQUIRES_SPECIAL_MAPPING")
@Label("Intersection")
public interface Intersection extends UnionOrIntersectionOrPrimaryType {

    @Relation("HAS_UNION_OR_INTERSECTION_OR_PRIMARY_TYPE")
    List<UnionOrIntersectionOrPrimaryType> getUnionOrIntersectionOrPrimaryType();

    void setUnionOrIntersectionOrPrimaryType(List<UnionOrIntersectionOrPrimaryType> setUnionOrIntersectionOrPrimaryType);

    @Relation("HAS_BIT_AND")
    TerminalNodeStrings getBitAnd();

    void setBitAnd(TerminalNodeStrings setBitAnd);
}
