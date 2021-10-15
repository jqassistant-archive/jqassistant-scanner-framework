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
 * public static class ResourceListContext extends ParserRuleContext {
 *
 *     public List<ResourceContext> resource() {
 *         return getRuleContexts(ResourceContext.class);
 *     }
 *
 *     public ResourceContext resource(int i) {
 *         return getRuleContext(ResourceContext.class, i);
 *     }
 *
 *     public List<TerminalNode> SEMI() {
 *         return getTokens(Java8Parser.SEMI);
 *     }
 *
 *     public TerminalNode SEMI(int i) {
 *         return getToken(Java8Parser.SEMI, i);
 *     }
 *
 *     public ResourceListContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_resourceList;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterResourceList(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitResourceList(this);
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
@Label("ResourceList")
public interface ResourceList extends JavaGen {

    @Relation("HAS_RESOURCE")
    List<Resource> getResource();

    void setResource(List<Resource> setResource);

    @Relation("HAS_SEMI")
    List<TerminalNodeStrings> getSEMI();

    void setSEMI(List<TerminalNodeStrings> setSEMI);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
